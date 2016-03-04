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
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._ClientService5Soap_GetStoredQuery;

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
public class _ClientService5Soap_GetStoredQuery
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String queryId;

    public _ClientService5Soap_GetStoredQuery()
    {
        super();
    }

    public _ClientService5Soap_GetStoredQuery(final String queryId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryId(queryId);
    }

    public String getQueryId()
    {
        return this.queryId;
    }

    public void setQueryId(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'queryId' is a required element, its value cannot be null");
        }

        this.queryId = value;
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
            "queryId",
            this.queryId);

        writer.writeEndElement();
    }
}
