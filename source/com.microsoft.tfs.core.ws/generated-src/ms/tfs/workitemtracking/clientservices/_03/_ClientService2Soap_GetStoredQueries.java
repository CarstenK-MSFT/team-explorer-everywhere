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

import ms.tfs.workitemtracking.clientservices._03._ClientService2Soap_GetStoredQueries;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ClientService2Soap_GetStoredQueries
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected long rowVersion;
    protected int projectId;

    public _ClientService2Soap_GetStoredQueries()
    {
        super();
    }

    public _ClientService2Soap_GetStoredQueries(
        final long rowVersion,
        final int projectId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setRowVersion(rowVersion);
        setProjectId(projectId);
    }

    public long getRowVersion()
    {
        return this.rowVersion;
    }

    public void setRowVersion(long value)
    {
        this.rowVersion = value;
    }

    public int getProjectId()
    {
        return this.projectId;
    }

    public void setProjectId(int value)
    {
        this.projectId = value;
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
            "rowVersion",
            this.rowVersion);
        XMLStreamWriterHelper.writeElement(
            writer,
            "projectId",
            this.projectId);

        writer.writeEndElement();
    }
}
