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

import ms.tfs.versioncontrol.clientservices._03._CheckinNote;
import ms.tfs.versioncontrol.clientservices._03._CheckinNoteFieldValue;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._Shelveset;
import ms.tfs.versioncontrol.clientservices._03._VersionControlLink;

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
public class _Shelveset
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected Calendar date;
    protected String name;
    protected String owner;
    protected String ownerdisp;
    protected String owneruniq;
    protected boolean ce = false;

    // Elements
    protected String comment;
    protected String policyOverrideComment;
    protected _CheckinNote checkinNote;
    protected _VersionControlLink[] links;
    protected _PropertyValue[] properties;

    public _Shelveset()
    {
        super();
    }

    public _Shelveset(
        final Calendar date,
        final String name,
        final String owner,
        final String ownerdisp,
        final String owneruniq,
        final boolean ce,
        final String comment,
        final String policyOverrideComment,
        final _CheckinNote checkinNote,
        final _VersionControlLink[] links,
        final _PropertyValue[] properties)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDate(date);
        setName(name);
        setOwner(owner);
        setOwnerdisp(ownerdisp);
        setOwneruniq(owneruniq);
        setCe(ce);
        setComment(comment);
        setPolicyOverrideComment(policyOverrideComment);
        setCheckinNote(checkinNote);
        setLinks(links);
        setProperties(properties);
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

    public String getName()
    {
        return this.name;
    }

    public void setName(final String value)
    {
        this.name = value;
    }

    public String getOwner()
    {
        return this.owner;
    }

    public void setOwner(final String value)
    {
        this.owner = value;
    }

    public String getOwnerdisp()
    {
        return this.ownerdisp;
    }

    public void setOwnerdisp(final String value)
    {
        this.ownerdisp = value;
    }

    public String getOwneruniq()
    {
        return this.owneruniq;
    }

    public void setOwneruniq(final String value)
    {
        this.owneruniq = value;
    }

    public boolean isCe()
    {
        return this.ce;
    }

    public void setCe(final boolean value)
    {
        this.ce = value;
    }

    public String getComment()
    {
        return this.comment;
    }

    public void setComment(String value)
    {
        this.comment = value;
    }

    public String getPolicyOverrideComment()
    {
        return this.policyOverrideComment;
    }

    public void setPolicyOverrideComment(String value)
    {
        this.policyOverrideComment = value;
    }

    public _CheckinNote getCheckinNote()
    {
        return this.checkinNote;
    }

    public void setCheckinNote(_CheckinNote value)
    {
        this.checkinNote = value;
    }

    public _VersionControlLink[] getLinks()
    {
        return this.links;
    }

    public void setLinks(_VersionControlLink[] value)
    {
        this.links = value;
    }

    public _PropertyValue[] getProperties()
    {
        return this.properties;
    }

    public void setProperties(_PropertyValue[] value)
    {
        this.properties = value;
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
            "date",
            this.date,
            true);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "name",
            this.name);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "owner",
            this.owner);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ownerdisp",
            this.ownerdisp);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "owneruniq",
            this.owneruniq);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ce",
            this.ce);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "Comment",
            this.comment);
        XMLStreamWriterHelper.writeElement(
            writer,
            "PolicyOverrideComment",
            this.policyOverrideComment);

        if (this.checkinNote != null)
        {
            this.checkinNote.writeAsElement(
                writer,
                "CheckinNote");
        }

        if (this.links != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Links");

            for (int iterator0 = 0; iterator0 < this.links.length; iterator0++)
            {
                this.links[iterator0].writeAsElement(
                    writer,
                    "VersionControlLink");
            }

            writer.writeEndElement();
        }

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

            if (localName.equalsIgnoreCase("date"))
            {
                this.date = XMLConvert.toCalendar(
                        attributeValue,
                        true);
            }
            else if (localName.equalsIgnoreCase("name"))
            {
                this.name = attributeValue;
            }
            else if (localName.equalsIgnoreCase("owner"))
            {
                this.owner = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ownerdisp"))
            {
                this.ownerdisp = attributeValue;
            }
            else if (localName.equalsIgnoreCase("owneruniq"))
            {
                this.owneruniq = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ce"))
            {
                this.ce = XMLConvert.toBoolean(attributeValue);
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

                if (localName.equalsIgnoreCase("Comment"))
                {
                    this.comment = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("PolicyOverrideComment"))
                {
                    this.policyOverrideComment = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("CheckinNote"))
                {
                    this.checkinNote = new _CheckinNote();
                    this.checkinNote.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("Links"))
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
                            _VersionControlLink complexObject0 = new _VersionControlLink();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.links = (_VersionControlLink[]) list0.toArray(new _VersionControlLink[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Properties"))
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
