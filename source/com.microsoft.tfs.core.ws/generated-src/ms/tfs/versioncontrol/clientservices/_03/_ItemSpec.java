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
public class _ItemSpec
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String item;
    protected _RecursionType recurse = _RecursionType.None;
    protected int did = 0;

    // No elements    
    public _ItemSpec()
    {
        super();
    }

    public _ItemSpec(
        final String item,
        final _RecursionType recurse,
        final int did)
    {
        // TODO : Call super() instead of setting all fields directly?
        setItem(item);
        setRecurse(recurse);
        setDid(did);
    }

    public String getItem()
    {
        return this.item;
    }

    public void setItem(final String value)
    {
        this.item = value;
    }

    public _RecursionType getRecurse()
    {
        return this.recurse;
    }

    public void setRecurse(final _RecursionType value)
    {
        this.recurse = value;
    }

    public int getDid()
    {
        return this.did;
    }

    public void setDid(final int value)
    {
        this.did = value;
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
            "item",
            this.item);

        if (this.recurse != null)
        {
            this.recurse.writeAsAttribute(
                writer,
                "recurse");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "did",
            this.did);

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

            if (localName.equalsIgnoreCase("item"))
            {
                this.item = attributeValue;
            }
            else if (localName.equalsIgnoreCase("recurse"))
            {
                this.recurse = _RecursionType.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("did"))
            {
                this.did = XMLConvert.toInt(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
