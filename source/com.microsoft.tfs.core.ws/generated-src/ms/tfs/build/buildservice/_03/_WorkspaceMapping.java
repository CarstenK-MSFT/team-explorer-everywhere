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

import ms.tfs.build.buildservice._03._WorkspaceMapping;
import ms.tfs.build.buildservice._03._WorkspaceMappingType;

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
public class _WorkspaceMapping
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String serverItem;
    protected String localItem;
    protected _WorkspaceMappingType mappingType = _WorkspaceMappingType.Map;
    protected int depth = 120;

    // No elements    
    public _WorkspaceMapping()
    {
        super();
    }

    public _WorkspaceMapping(
        final String serverItem,
        final String localItem,
        final _WorkspaceMappingType mappingType,
        final int depth)
    {
        // TODO : Call super() instead of setting all fields directly?
        setServerItem(serverItem);
        setLocalItem(localItem);
        setMappingType(mappingType);
        setDepth(depth);
    }

    public String getServerItem()
    {
        return this.serverItem;
    }

    public void setServerItem(final String value)
    {
        this.serverItem = value;
    }

    public String getLocalItem()
    {
        return this.localItem;
    }

    public void setLocalItem(final String value)
    {
        this.localItem = value;
    }

    public _WorkspaceMappingType getMappingType()
    {
        return this.mappingType;
    }

    public void setMappingType(final _WorkspaceMappingType value)
    {
        this.mappingType = value;
    }

    public int getDepth()
    {
        return this.depth;
    }

    public void setDepth(final int value)
    {
        this.depth = value;
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
            "ServerItem",
            this.serverItem);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "LocalItem",
            this.localItem);

        if (this.mappingType != null)
        {
            this.mappingType.writeAsAttribute(
                writer,
                "MappingType");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Depth",
            this.depth);

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

            if (localName.equalsIgnoreCase("ServerItem"))
            {
                this.serverItem = attributeValue;
            }
            else if (localName.equalsIgnoreCase("LocalItem"))
            {
                this.localItem = attributeValue;
            }
            else if (localName.equalsIgnoreCase("MappingType"))
            {
                this.mappingType = _WorkspaceMappingType.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Depth"))
            {
                this.depth = XMLConvert.toInt(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
