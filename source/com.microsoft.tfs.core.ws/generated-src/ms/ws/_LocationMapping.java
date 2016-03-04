// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._LocationMapping;

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
public class _LocationMapping
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String accessMappingMoniker;
    protected String location;

    // No elements    
    public _LocationMapping()
    {
        super();
    }

    public _LocationMapping(
        final String accessMappingMoniker,
        final String location)
    {
        // TODO : Call super() instead of setting all fields directly?
        setAccessMappingMoniker(accessMappingMoniker);
        setLocation(location);
    }

    public String getAccessMappingMoniker()
    {
        return this.accessMappingMoniker;
    }

    public void setAccessMappingMoniker(final String value)
    {
        this.accessMappingMoniker = value;
    }

    public String getLocation()
    {
        return this.location;
    }

    public void setLocation(final String value)
    {
        this.location = value;
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
            "accessMappingMoniker",
            this.accessMappingMoniker);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "location",
            this.location);

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

            if (localName.equalsIgnoreCase("accessMappingMoniker"))
            {
                this.accessMappingMoniker = attributeValue;
            }
            else if (localName.equalsIgnoreCase("location"))
            {
                this.location = attributeValue;
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
