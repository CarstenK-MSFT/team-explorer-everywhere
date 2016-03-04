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

import ms.tfs.versioncontrol.clientservices._03._Item;
import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LabelChildOption;
import ms.tfs.versioncontrol.clientservices._03._LabelItemSpec;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_LabelItem;
import ms.tfs.versioncontrol.clientservices._03._VersionControlLabel;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;

import java.lang.Object;
import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _Repository5Soap_LabelItem
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String workspaceOwner;
    protected _VersionControlLabel label;
    protected _LabelItemSpec[] labelSpecs;
    protected _LabelChildOption children;
    protected int maxClientPathLength;

    public _Repository5Soap_LabelItem()
    {
        super();
    }

    public _Repository5Soap_LabelItem(
        final String workspaceName,
        final String workspaceOwner,
        final _VersionControlLabel label,
        final _LabelItemSpec[] labelSpecs,
        final _LabelChildOption children,
        final int maxClientPathLength)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setLabel(label);
        setLabelSpecs(labelSpecs);
        setChildren(children);
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

    public String getWorkspaceOwner()
    {
        return this.workspaceOwner;
    }

    public void setWorkspaceOwner(String value)
    {
        this.workspaceOwner = value;
    }

    public _VersionControlLabel getLabel()
    {
        return this.label;
    }

    public void setLabel(_VersionControlLabel value)
    {
        this.label = value;
    }

    public _LabelItemSpec[] getLabelSpecs()
    {
        return this.labelSpecs;
    }

    public void setLabelSpecs(_LabelItemSpec[] value)
    {
        this.labelSpecs = value;
    }

    public _LabelChildOption getChildren()
    {
        return this.children;
    }

    public void setChildren(_LabelChildOption value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'children' is a required element, its value cannot be null");
        }

        this.children = value;
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
            "workspaceOwner",
            this.workspaceOwner);

        if (this.label != null)
        {
            this.label.writeAsElement(
                writer,
                "label");
        }

        if (this.labelSpecs != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("labelSpecs");

            for (int iterator0 = 0; iterator0 < this.labelSpecs.length; iterator0++)
            {
                this.labelSpecs[iterator0].writeAsElement(
                    writer,
                    "LabelItemSpec");
            }

            writer.writeEndElement();
        }

        this.children.writeAsElement(
            writer,
            "children");
        XMLStreamWriterHelper.writeElement(
            writer,
            "maxClientPathLength",
            this.maxClientPathLength);

        writer.writeEndElement();
    }
}
