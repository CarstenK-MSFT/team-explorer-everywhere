// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildControllerUpdate;
import ms.tfs.build.buildservice._03._BuildControllerUpdateOptions;
import ms.tfs.build.buildservice._03._ControllerStatus;

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
public class _BuildControllerUpdateOptions
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String uri;
    protected _BuildControllerUpdate fields;
    protected String name;
    protected String description;
    protected String customAssemblyPath;
    protected int maxConcurrentBuilds;
    protected _ControllerStatus status;
    protected String statusMessage;
    protected boolean enabled;

    // No elements    
    public _BuildControllerUpdateOptions()
    {
        super();
    }

    public _BuildControllerUpdateOptions(
        final String uri,
        final _BuildControllerUpdate fields,
        final String name,
        final String description,
        final String customAssemblyPath,
        final int maxConcurrentBuilds,
        final _ControllerStatus status,
        final String statusMessage,
        final boolean enabled)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUri(uri);
        setFields(fields);
        setName(name);
        setDescription(description);
        setCustomAssemblyPath(customAssemblyPath);
        setMaxConcurrentBuilds(maxConcurrentBuilds);
        setStatus(status);
        setStatusMessage(statusMessage);
        setEnabled(enabled);
    }

    public String getUri()
    {
        return this.uri;
    }

    public void setUri(final String value)
    {
        this.uri = value;
    }

    public _BuildControllerUpdate getFields()
    {
        return this.fields;
    }

    public void setFields(final _BuildControllerUpdate value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'Fields' is a required attribute, its value cannot be null");
        }

        this.fields = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(final String value)
    {
        this.name = value;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(final String value)
    {
        this.description = value;
    }

    public String getCustomAssemblyPath()
    {
        return this.customAssemblyPath;
    }

    public void setCustomAssemblyPath(final String value)
    {
        this.customAssemblyPath = value;
    }

    public int getMaxConcurrentBuilds()
    {
        return this.maxConcurrentBuilds;
    }

    public void setMaxConcurrentBuilds(final int value)
    {
        this.maxConcurrentBuilds = value;
    }

    public _ControllerStatus getStatus()
    {
        return this.status;
    }

    public void setStatus(final _ControllerStatus value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'Status' is a required attribute, its value cannot be null");
        }

        this.status = value;
    }

    public String getStatusMessage()
    {
        return this.statusMessage;
    }

    public void setStatusMessage(final String value)
    {
        this.statusMessage = value;
    }

    public boolean isEnabled()
    {
        return this.enabled;
    }

    public void setEnabled(final boolean value)
    {
        this.enabled = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Uri",
            this.uri);
        this.fields.writeAsAttribute(
            writer,
            "Fields");
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Name",
            this.name);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Description",
            this.description);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "CustomAssemblyPath",
            this.customAssemblyPath);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "MaxConcurrentBuilds",
            this.maxConcurrentBuilds);
        this.status.writeAsAttribute(
            writer,
            "Status");
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "StatusMessage",
            this.statusMessage);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Enabled",
            this.enabled);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("Uri"))
            {
                this.uri = attributeValue;
            }
            else if (localName.equalsIgnoreCase("Fields"))
            {
                this.fields = new _BuildControllerUpdate();
                this.fields.readFromAttribute(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Name"))
            {
                this.name = attributeValue;
            }
            else if (localName.equalsIgnoreCase("Description"))
            {
                this.description = attributeValue;
            }
            else if (localName.equalsIgnoreCase("CustomAssemblyPath"))
            {
                this.customAssemblyPath = attributeValue;
            }
            else if (localName.equalsIgnoreCase("MaxConcurrentBuilds"))
            {
                this.maxConcurrentBuilds = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Status"))
            {
                this.status = _ControllerStatus.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("StatusMessage"))
            {
                this.statusMessage = attributeValue;
            }
            else if (localName.equalsIgnoreCase("Enabled"))
            {
                this.enabled = XMLConvert.toBoolean(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
