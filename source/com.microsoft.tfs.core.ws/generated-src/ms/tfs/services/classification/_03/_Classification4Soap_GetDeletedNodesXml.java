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

import ms.tfs.services.classification._03._Classification4Soap_GetDeletedNodesXml;

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
public class _Classification4Soap_GetDeletedNodesXml
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String projectUri;
    protected Calendar since;

    public _Classification4Soap_GetDeletedNodesXml()
    {
        super();
    }

    public _Classification4Soap_GetDeletedNodesXml(
        final String projectUri,
        final Calendar since)
    {
        // TODO : Call super() instead of setting all fields directly?
        setProjectUri(projectUri);
        setSince(since);
    }

    public String getProjectUri()
    {
        return this.projectUri;
    }

    public void setProjectUri(String value)
    {
        this.projectUri = value;
    }

    public Calendar getSince()
    {
        return this.since;
    }

    public void setSince(Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'since' is a required element, its value cannot be null");
        }

        this.since = value;
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
            "projectUri",
            this.projectUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "since",
            this.since,
            true);

        writer.writeEndElement();
    }
}
