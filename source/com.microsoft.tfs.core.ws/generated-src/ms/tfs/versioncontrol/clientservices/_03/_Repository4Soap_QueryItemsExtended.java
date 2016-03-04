// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._DeletedState;
import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryItemsExtended;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _Repository4Soap_QueryItemsExtended
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String workspaceOwner;
    protected _ItemSpec[] items;
    protected _DeletedState deletedState;
    protected _ItemType itemType;
    protected int options;
    protected String[] itemPropertyFilters;

    public _Repository4Soap_QueryItemsExtended()
    {
        super();
    }

    public _Repository4Soap_QueryItemsExtended(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final _DeletedState deletedState,
        final _ItemType itemType,
        final int options,
        final String[] itemPropertyFilters)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setItems(items);
        setDeletedState(deletedState);
        setItemType(itemType);
        setOptions(options);
        setItemPropertyFilters(itemPropertyFilters);
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getWorkspaceOwner()
    {
        return this.workspaceOwner;
    }

    public void setWorkspaceOwner(String value)
    {
        this.workspaceOwner = value;
    }

    public _ItemSpec[] getItems()
    {
        return this.items;
    }

    public void setItems(_ItemSpec[] value)
    {
        this.items = value;
    }

    public _DeletedState getDeletedState()
    {
        return this.deletedState;
    }

    public void setDeletedState(_DeletedState value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'deletedState' is a required element, its value cannot be null");
        }

        this.deletedState = value;
    }

    public _ItemType getItemType()
    {
        return this.itemType;
    }

    public void setItemType(_ItemType value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'itemType' is a required element, its value cannot be null");
        }

        this.itemType = value;
    }

    public int getOptions()
    {
        return this.options;
    }

    public void setOptions(int value)
    {
        this.options = value;
    }

    public String[] getItemPropertyFilters()
    {
        return this.itemPropertyFilters;
    }

    public void setItemPropertyFilters(String[] value)
    {
        this.itemPropertyFilters = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceName",
            this.workspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceOwner",
            this.workspaceOwner);

        if (this.items != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("items");

            for (int iterator0 = 0; iterator0 < this.items.length; iterator0++)
            {
                this.items[iterator0].writeAsElement(
                    writer,
                    "ItemSpec");
            }

            writer.writeEndElement();
        }

        this.deletedState.writeAsElement(
            writer,
            "deletedState");
        this.itemType.writeAsElement(
            writer,
            "itemType");
        XMLStreamWriterHelper.writeElement(
            writer,
            "options",
            this.options);

        if (this.itemPropertyFilters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("itemPropertyFilters");

            for (int iterator0 = 0; iterator0 < this.itemPropertyFilters.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.itemPropertyFilters[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
