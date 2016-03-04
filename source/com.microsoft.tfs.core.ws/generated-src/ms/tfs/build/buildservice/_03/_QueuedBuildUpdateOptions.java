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

import ms.tfs.build.buildservice._03._QueuePriority;
import ms.tfs.build.buildservice._03._QueuedBuildUpdate;
import ms.tfs.build.buildservice._03._QueuedBuildUpdateOptions;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _QueuedBuildUpdateOptions
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected int queueId;
    protected _QueuedBuildUpdate fields;
    protected _QueuePriority priority = _QueuePriority.Normal;
    protected boolean postponed;

    // No elements    
    public _QueuedBuildUpdateOptions()
    {
        super();
    }

    public _QueuedBuildUpdateOptions(
        final int queueId,
        final _QueuedBuildUpdate fields,
        final _QueuePriority priority,
        final boolean postponed)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueueId(queueId);
        setFields(fields);
        setPriority(priority);
        setPostponed(postponed);
    }

    public int getQueueId()
    {
        return this.queueId;
    }

    public void setQueueId(final int value)
    {
        this.queueId = value;
    }

    public _QueuedBuildUpdate getFields()
    {
        return this.fields;
    }

    public void setFields(final _QueuedBuildUpdate value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'Fields' is a required attribute, its value cannot be null");
        }

        this.fields = value;
    }

    public _QueuePriority getPriority()
    {
        return this.priority;
    }

    public void setPriority(final _QueuePriority value)
    {
        this.priority = value;
    }

    public boolean isPostponed()
    {
        return this.postponed;
    }

    public void setPostponed(final boolean value)
    {
        this.postponed = value;
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
            "QueueId",
            this.queueId);
        this.fields.writeAsAttribute(
            writer,
            "Fields");

        if (this.priority != null)
        {
            this.priority.writeAsAttribute(
                writer,
                "Priority");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Postponed",
            this.postponed);

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

            if (localName.equalsIgnoreCase("QueueId"))
            {
                this.queueId = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Fields"))
            {
                this.fields = new _QueuedBuildUpdate();
                this.fields.readFromAttribute(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Priority"))
            {
                this.priority = _QueuePriority.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Postponed"))
            {
                this.postponed = XMLConvert.toBoolean(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
