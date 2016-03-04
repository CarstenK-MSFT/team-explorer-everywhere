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

import ms.tfs.versioncontrol.clientservices._03._RepositoryProperties;

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
public class _RepositoryProperties
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String id;
    protected String name;
    protected int lcset;
    protected String ver;
    protected byte[] dkey;
    protected int features;

    // No elements    
    public _RepositoryProperties()
    {
        super();
    }

    public _RepositoryProperties(
        final String id,
        final String name,
        final int lcset,
        final String ver,
        final byte[] dkey,
        final int features)
    {
        // TODO : Call super() instead of setting all fields directly?
        setId(id);
        setName(name);
        setLcset(lcset);
        setVer(ver);
        setDkey(dkey);
        setFeatures(features);
    }

    public String getId()
    {
        return this.id;
    }

    public void setId(final String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'id' is a required attribute, its value cannot be null");
        }

        this.id = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(final String value)
    {
        this.name = value;
    }

    public int getLcset()
    {
        return this.lcset;
    }

    public void setLcset(final int value)
    {
        this.lcset = value;
    }

    public String getVer()
    {
        return this.ver;
    }

    public void setVer(final String value)
    {
        this.ver = value;
    }

    public byte[] getDkey()
    {
        return this.dkey;
    }

    public void setDkey(final byte[] value)
    {
        this.dkey = value;
    }

    public int getFeatures()
    {
        return this.features;
    }

    public void setFeatures(final int value)
    {
        this.features = value;
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
            "id",
            this.id);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "name",
            this.name);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "lcset",
            this.lcset);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ver",
            this.ver);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "dkey",
            this.dkey);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "features",
            this.features);

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

            if (localName.equalsIgnoreCase("id"))
            {
                this.id = attributeValue;
            }
            else if (localName.equalsIgnoreCase("name"))
            {
                this.name = attributeValue;
            }
            else if (localName.equalsIgnoreCase("lcset"))
            {
                this.lcset = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("ver"))
            {
                this.ver = attributeValue;
            }
            else if (localName.equalsIgnoreCase("dkey"))
            {
                this.dkey = XMLConvert.toByteArray(attributeValue);
            }
            else if (localName.equalsIgnoreCase("features"))
            {
                this.features = XMLConvert.toInt(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
