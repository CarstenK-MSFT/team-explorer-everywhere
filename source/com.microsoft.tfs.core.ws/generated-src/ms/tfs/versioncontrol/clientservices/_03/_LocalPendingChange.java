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

import ms.tfs.versioncontrol.clientservices._03._LocalPendingChange;

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
public class _LocalPendingChange
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String tsi;
    protected String csi;
    protected String bfi;
    protected int v;
    protected int bfv;
    protected int c;
    protected byte it;
    protected int e;
    protected byte l;
    protected int iid;
    protected Calendar cd;
    protected byte[] hv;
    protected int di;
    protected byte fl;

    // No elements    
    public _LocalPendingChange()
    {
        super();
    }

    public _LocalPendingChange(
        final String tsi,
        final String csi,
        final String bfi,
        final int v,
        final int bfv,
        final int c,
        final byte it,
        final int e,
        final byte l,
        final int iid,
        final Calendar cd,
        final byte[] hv,
        final int di,
        final byte fl)
    {
        // TODO : Call super() instead of setting all fields directly?
        setTsi(tsi);
        setCsi(csi);
        setBfi(bfi);
        setV(v);
        setBfv(bfv);
        setC(c);
        setIt(it);
        setE(e);
        setL(l);
        setIid(iid);
        setCd(cd);
        setHv(hv);
        setDi(di);
        setFl(fl);
    }

    public String getTsi()
    {
        return this.tsi;
    }

    public void setTsi(final String value)
    {
        this.tsi = value;
    }

    public String getCsi()
    {
        return this.csi;
    }

    public void setCsi(final String value)
    {
        this.csi = value;
    }

    public String getBfi()
    {
        return this.bfi;
    }

    public void setBfi(final String value)
    {
        this.bfi = value;
    }

    public int getV()
    {
        return this.v;
    }

    public void setV(final int value)
    {
        this.v = value;
    }

    public int getBfv()
    {
        return this.bfv;
    }

    public void setBfv(final int value)
    {
        this.bfv = value;
    }

    public int getC()
    {
        return this.c;
    }

    public void setC(final int value)
    {
        this.c = value;
    }

    public byte getIt()
    {
        return this.it;
    }

    public void setIt(final byte value)
    {
        this.it = value;
    }

    public int getE()
    {
        return this.e;
    }

    public void setE(final int value)
    {
        this.e = value;
    }

    public byte getL()
    {
        return this.l;
    }

    public void setL(final byte value)
    {
        this.l = value;
    }

    public int getIid()
    {
        return this.iid;
    }

    public void setIid(final int value)
    {
        this.iid = value;
    }

    public Calendar getCd()
    {
        return this.cd;
    }

    public void setCd(final Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'cd' is a required attribute, its value cannot be null");
        }

        this.cd = value;
    }

    public byte[] getHv()
    {
        return this.hv;
    }

    public void setHv(final byte[] value)
    {
        this.hv = value;
    }

    public int getDi()
    {
        return this.di;
    }

    public void setDi(final int value)
    {
        this.di = value;
    }

    public byte getFl()
    {
        return this.fl;
    }

    public void setFl(final byte value)
    {
        this.fl = value;
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
            "tsi",
            this.tsi);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "csi",
            this.csi);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "bfi",
            this.bfi);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "v",
            this.v);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "bfv",
            this.bfv);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "c",
            this.c);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "it",
            this.it);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "e",
            this.e);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "l",
            this.l);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "iid",
            this.iid);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "cd",
            this.cd,
            true);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "hv",
            this.hv);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "di",
            this.di);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "fl",
            this.fl);

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

            if (localName.equalsIgnoreCase("tsi"))
            {
                this.tsi = attributeValue;
            }
            else if (localName.equalsIgnoreCase("csi"))
            {
                this.csi = attributeValue;
            }
            else if (localName.equalsIgnoreCase("bfi"))
            {
                this.bfi = attributeValue;
            }
            else if (localName.equalsIgnoreCase("v"))
            {
                this.v = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("bfv"))
            {
                this.bfv = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("c"))
            {
                this.c = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("it"))
            {
                this.it = XMLConvert.toByte(attributeValue);
            }
            else if (localName.equalsIgnoreCase("e"))
            {
                this.e = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("l"))
            {
                this.l = XMLConvert.toByte(attributeValue);
            }
            else if (localName.equalsIgnoreCase("iid"))
            {
                this.iid = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("cd"))
            {
                this.cd = XMLConvert.toCalendar(
                        attributeValue,
                        true);
            }
            else if (localName.equalsIgnoreCase("hv"))
            {
                this.hv = XMLConvert.toByteArray(attributeValue);
            }
            else if (localName.equalsIgnoreCase("di"))
            {
                this.di = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("fl"))
            {
                this.fl = XMLConvert.toByte(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
