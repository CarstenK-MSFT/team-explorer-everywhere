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

import ms.tfs.workitemtracking.clientservices._03._ClientService5Soap_DestroyAttachments;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ClientService5Soap_DestroyAttachments
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected int[] workItemIds;

    public _ClientService5Soap_DestroyAttachments()
    {
        super();
    }

    public _ClientService5Soap_DestroyAttachments(final int[] workItemIds)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkItemIds(workItemIds);
    }

    public int[] getWorkItemIds()
    {
        return this.workItemIds;
    }

    public void setWorkItemIds(int[] value)
    {
        this.workItemIds = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.workItemIds != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("workItemIds");

            for (int iterator0 = 0; iterator0 < this.workItemIds.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "int",
                    this.workItemIds[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
