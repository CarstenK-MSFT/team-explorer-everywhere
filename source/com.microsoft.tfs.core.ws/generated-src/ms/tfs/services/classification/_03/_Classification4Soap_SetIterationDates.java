// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.classification._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.classification._03._Classification4Soap_SetIterationDates;

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
public class _Classification4Soap_SetIterationDates
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String nodeUri;
    protected Calendar startDate;
    protected Calendar finishDate;

    public _Classification4Soap_SetIterationDates()
    {
        super();
    }

    public _Classification4Soap_SetIterationDates(
        final String nodeUri,
        final Calendar startDate,
        final Calendar finishDate)
    {
        // TODO : Call super() instead of setting all fields directly?
        setNodeUri(nodeUri);
        setStartDate(startDate);
        setFinishDate(finishDate);
    }

    public String getNodeUri()
    {
        return this.nodeUri;
    }

    public void setNodeUri(String value)
    {
        this.nodeUri = value;
    }

    public Calendar getStartDate()
    {
        return this.startDate;
    }

    public void setStartDate(Calendar value)
    {
        this.startDate = value;
    }

    public Calendar getFinishDate()
    {
        return this.finishDate;
    }

    public void setFinishDate(Calendar value)
    {
        this.finishDate = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "nodeUri",
            this.nodeUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "startDate",
            this.startDate,
            false);
        XMLStreamWriterHelper.writeElement(
            writer,
            "finishDate",
            this.finishDate,
            false);

        writer.writeEndElement();
    }
}
