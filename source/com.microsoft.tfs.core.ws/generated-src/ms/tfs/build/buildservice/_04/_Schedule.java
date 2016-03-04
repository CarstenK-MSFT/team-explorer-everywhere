// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._Schedule;
import ms.tfs.build.buildservice._04._ScheduleDays;

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
public class _Schedule
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String timeZoneId;
    protected int utcStartTime;
    protected _ScheduleDays utcDaysToBuild;

    // No elements    
    public _Schedule()
    {
        super();
    }

    public _Schedule(
        final String timeZoneId,
        final int utcStartTime,
        final _ScheduleDays utcDaysToBuild)
    {
        // TODO : Call super() instead of setting all fields directly?
        setTimeZoneId(timeZoneId);
        setUtcStartTime(utcStartTime);
        setUtcDaysToBuild(utcDaysToBuild);
    }

    public String getTimeZoneId()
    {
        return this.timeZoneId;
    }

    public void setTimeZoneId(final String value)
    {
        this.timeZoneId = value;
    }

    public int getUtcStartTime()
    {
        return this.utcStartTime;
    }

    public void setUtcStartTime(final int value)
    {
        this.utcStartTime = value;
    }

    public _ScheduleDays getUtcDaysToBuild()
    {
        return this.utcDaysToBuild;
    }

    public void setUtcDaysToBuild(final _ScheduleDays value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'UtcDaysToBuild' is a required attribute, its value cannot be null");
        }

        this.utcDaysToBuild = value;
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
            "TimeZoneId",
            this.timeZoneId);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "UtcStartTime",
            this.utcStartTime);
        this.utcDaysToBuild.writeAsAttribute(
            writer,
            "UtcDaysToBuild");

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

            if (localName.equalsIgnoreCase("TimeZoneId"))
            {
                this.timeZoneId = attributeValue;
            }
            else if (localName.equalsIgnoreCase("UtcStartTime"))
            {
                this.utcStartTime = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("UtcDaysToBuild"))
            {
                this.utcDaysToBuild = new _ScheduleDays();
                this.utcDaysToBuild.readFromAttribute(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
