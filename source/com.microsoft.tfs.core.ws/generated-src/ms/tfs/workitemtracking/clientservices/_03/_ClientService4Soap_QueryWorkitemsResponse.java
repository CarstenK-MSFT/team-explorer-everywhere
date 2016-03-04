// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.types.AnyContentType;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_QueryWorkitemsResponse;

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
public class _ClientService4Soap_QueryWorkitemsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected AnyContentType resultIds;
    protected Calendar asOfDate;
    protected String dbStamp;
    protected AnyContentType metadata;

    public _ClientService4Soap_QueryWorkitemsResponse()
    {
        super();
    }

    public _ClientService4Soap_QueryWorkitemsResponse(
        final AnyContentType resultIds,
        final Calendar asOfDate,
        final String dbStamp,
        final AnyContentType metadata)
    {
        // TODO : Call super() instead of setting all fields directly?
        setResultIds(resultIds);
        setAsOfDate(asOfDate);
        setDbStamp(dbStamp);
        setMetadata(metadata);
    }

    public AnyContentType getResultIds()
    {
        return this.resultIds;
    }

    public void setResultIds(AnyContentType value)
    {
        this.resultIds = value;
    }

    public Calendar getAsOfDate()
    {
        return this.asOfDate;
    }

    public void setAsOfDate(Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'asOfDate' is a required element, its value cannot be null");
        }

        this.asOfDate = value;
    }

    public String getDbStamp()
    {
        return this.dbStamp;
    }

    public void setDbStamp(String value)
    {
        this.dbStamp = value;
    }

    public AnyContentType getMetadata()
    {
        return this.metadata;
    }

    public void setMetadata(AnyContentType value)
    {
        this.metadata = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("resultIds"))
                {
                    if (this.resultIds == null)
                    {
                        throw new XMLStreamException(
                                "An AnyContentType implementation must be supplied by the caller "
                                + "for the 'resultIds' field before deserialization can occur.");
                    }

                    this.resultIds.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("asOfDate"))
                {
                    this.asOfDate = XMLConvert.toCalendar(
                            reader.getElementText(),
                            true);
                }
                else if (localName.equalsIgnoreCase("dbStamp"))
                {
                    this.dbStamp = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("metadata"))
                {
                    if (this.metadata == null)
                    {
                        throw new XMLStreamException(
                                "An AnyContentType implementation must be supplied by the caller "
                                + "for the 'metadata' field before deserialization can occur.");
                    }

                    this.metadata.readFromElement(reader);
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
