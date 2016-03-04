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

import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_UndoPendingChangesInLocalWorkspace;

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
public class _Repository5Soap_UndoPendingChangesInLocalWorkspace
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String ownerName;
    protected _ItemSpec[] items;
    protected String[] itemPropertyFilters;
    protected String[] itemAttributeFilters;
    protected int maxClientPathLength;

    public _Repository5Soap_UndoPendingChangesInLocalWorkspace()
    {
        super();
    }

    public _Repository5Soap_UndoPendingChangesInLocalWorkspace(
        final String workspaceName,
        final String ownerName,
        final _ItemSpec[] items,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters,
        final int maxClientPathLength)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setOwnerName(ownerName);
        setItems(items);
        setItemPropertyFilters(itemPropertyFilters);
        setItemAttributeFilters(itemAttributeFilters);
        setMaxClientPathLength(maxClientPathLength);
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public void setOwnerName(String value)
    {
        this.ownerName = value;
    }

    public _ItemSpec[] getItems()
    {
        return this.items;
    }

    public void setItems(_ItemSpec[] value)
    {
        this.items = value;
    }

    public String[] getItemPropertyFilters()
    {
        return this.itemPropertyFilters;
    }

    public void setItemPropertyFilters(String[] value)
    {
        this.itemPropertyFilters = value;
    }

    public String[] getItemAttributeFilters()
    {
        return this.itemAttributeFilters;
    }

    public void setItemAttributeFilters(String[] value)
    {
        this.itemAttributeFilters = value;
    }

    public int getMaxClientPathLength()
    {
        return this.maxClientPathLength;
    }

    public void setMaxClientPathLength(int value)
    {
        this.maxClientPathLength = value;
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
            "ownerName",
            this.ownerName);

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

        if (this.itemAttributeFilters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("itemAttributeFilters");

            for (int iterator0 = 0; iterator0 < this.itemAttributeFilters.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.itemAttributeFilters[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "maxClientPathLength",
            this.maxClientPathLength);

        writer.writeEndElement();
    }
}
