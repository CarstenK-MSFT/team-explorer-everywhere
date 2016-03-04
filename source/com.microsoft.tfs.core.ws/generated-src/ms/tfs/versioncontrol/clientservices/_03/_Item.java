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
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;

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
public class _Item
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected int cs = 0;
    protected Calendar date;
    protected int did = 0;
    protected int enc = -2;
    protected _ItemType type = _ItemType.Any;
    protected int itemid = 0;
    protected String item;
    protected String tz;
    protected String tzo;
    protected byte[] hash;
    protected long len = 0;
    protected String durl;
    protected boolean isbranch = false;

    // Elements
    protected _PropertyValue[] properties;
    protected _PropertyValue[] propertyValues;

    public _Item()
    {
        super();
    }

    public _Item(
        final int cs,
        final Calendar date,
        final int did,
        final int enc,
        final _ItemType type,
        final int itemid,
        final String item,
        final String tz,
        final String tzo,
        final byte[] hash,
        final long len,
        final String durl,
        final boolean isbranch,
        final _PropertyValue[] properties,
        final _PropertyValue[] propertyValues)
    {
        // TODO : Call super() instead of setting all fields directly?
        setCs(cs);
        setDate(date);
        setDid(did);
        setEnc(enc);
        setType(type);
        setItemid(itemid);
        setItem(item);
        setTz(tz);
        setTzo(tzo);
        setHash(hash);
        setLen(len);
        setDurl(durl);
        setIsbranch(isbranch);
        setProperties(properties);
        setPropertyValues(propertyValues);
    }

    public int getCs()
    {
        return this.cs;
    }

    public void setCs(final int value)
    {
        this.cs = value;
    }

    public Calendar getDate()
    {
        return this.date;
    }

    public void setDate(final Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'date' is a required attribute, its value cannot be null");
        }

        this.date = value;
    }

    public int getDid()
    {
        return this.did;
    }

    public void setDid(final int value)
    {
        this.did = value;
    }

    public int getEnc()
    {
        return this.enc;
    }

    public void setEnc(final int value)
    {
        this.enc = value;
    }

    public _ItemType getType()
    {
        return this.type;
    }

    public void setType(final _ItemType value)
    {
        this.type = value;
    }

    public int getItemid()
    {
        return this.itemid;
    }

    public void setItemid(final int value)
    {
        this.itemid = value;
    }

    public String getItem()
    {
        return this.item;
    }

    public void setItem(final String value)
    {
        this.item = value;
    }

    public String getTz()
    {
        return this.tz;
    }

    public void setTz(final String value)
    {
        this.tz = value;
    }

    public String getTzo()
    {
        return this.tzo;
    }

    public void setTzo(final String value)
    {
        this.tzo = value;
    }

    public byte[] getHash()
    {
        return this.hash;
    }

    public void setHash(final byte[] value)
    {
        this.hash = value;
    }

    public long getLen()
    {
        return this.len;
    }

    public void setLen(final long value)
    {
        this.len = value;
    }

    public String getDurl()
    {
        return this.durl;
    }

    public void setDurl(final String value)
    {
        this.durl = value;
    }

    public boolean isIsbranch()
    {
        return this.isbranch;
    }

    public void setIsbranch(final boolean value)
    {
        this.isbranch = value;
    }

    public _PropertyValue[] getProperties()
    {
        return this.properties;
    }

    public void setProperties(_PropertyValue[] value)
    {
        this.properties = value;
    }

    public _PropertyValue[] getPropertyValues()
    {
        return this.propertyValues;
    }

    public void setPropertyValues(_PropertyValue[] value)
    {
        this.propertyValues = value;
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
            "cs",
            this.cs);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "date",
            this.date,
            true);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "did",
            this.did);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "enc",
            this.enc);

        if (this.type != null)
        {
            this.type.writeAsAttribute(
                writer,
                "type");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "itemid",
            this.itemid);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "item",
            this.item);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "tz",
            this.tz);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "tzo",
            this.tzo);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "hash",
            this.hash);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "len",
            this.len);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "durl",
            this.durl);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "isbranch",
            this.isbranch);

        // Elements
        if (this.properties != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Properties");

            for (int iterator0 = 0; iterator0 < this.properties.length; iterator0++)
            {
                this.properties[iterator0].writeAsElement(
                    writer,
                    "PropertyValue");
            }

            writer.writeEndElement();
        }

        if (this.propertyValues != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("PropertyValues");

            for (int iterator0 = 0; iterator0 < this.propertyValues.length; iterator0++)
            {
                this.propertyValues[iterator0].writeAsElement(
                    writer,
                    "PropertyValue");
            }

            writer.writeEndElement();
        }

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

            if (localName.equalsIgnoreCase("cs"))
            {
                this.cs = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("date"))
            {
                this.date = XMLConvert.toCalendar(
                        attributeValue,
                        true);
            }
            else if (localName.equalsIgnoreCase("did"))
            {
                this.did = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("enc"))
            {
                this.enc = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("type"))
            {
                this.type = _ItemType.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("itemid"))
            {
                this.itemid = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("item"))
            {
                this.item = attributeValue;
            }
            else if (localName.equalsIgnoreCase("tz"))
            {
                this.tz = attributeValue;
            }
            else if (localName.equalsIgnoreCase("tzo"))
            {
                this.tzo = attributeValue;
            }
            else if (localName.equalsIgnoreCase("hash"))
            {
                this.hash = XMLConvert.toByteArray(attributeValue);
            }
            else if (localName.equalsIgnoreCase("len"))
            {
                this.len = XMLConvert.toLong(attributeValue);
            }
            else if (localName.equalsIgnoreCase("durl"))
            {
                this.durl = attributeValue;
            }
            else if (localName.equalsIgnoreCase("isbranch"))
            {
                this.isbranch = XMLConvert.toBoolean(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Properties"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _PropertyValue complexObject0 = new _PropertyValue();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.properties = (_PropertyValue[]) list0.toArray(new _PropertyValue[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("PropertyValues"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _PropertyValue complexObject0 = new _PropertyValue();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.propertyValues = (_PropertyValue[]) list0.toArray(new _PropertyValue[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
