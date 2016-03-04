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

import ms.tfs.workitemtracking.clientservices._03._ClientService2Soap_GetMetadata;
import ms.tfs.workitemtracking.clientservices._03._MetadataTableHaveEntry;

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
public class _ClientService2Soap_GetMetadata
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _MetadataTableHaveEntry[] metadataHave;
    protected boolean useMaster;

    public _ClientService2Soap_GetMetadata()
    {
        super();
    }

    public _ClientService2Soap_GetMetadata(
        final _MetadataTableHaveEntry[] metadataHave,
        final boolean useMaster)
    {
        // TODO : Call super() instead of setting all fields directly?
        setMetadataHave(metadataHave);
        setUseMaster(useMaster);
    }

    public _MetadataTableHaveEntry[] getMetadataHave()
    {
        return this.metadataHave;
    }

    public void setMetadataHave(_MetadataTableHaveEntry[] value)
    {
        this.metadataHave = value;
    }

    public boolean isUseMaster()
    {
        return this.useMaster;
    }

    public void setUseMaster(boolean value)
    {
        this.useMaster = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.metadataHave != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("metadataHave");

            for (int iterator0 = 0; iterator0 < this.metadataHave.length; iterator0++)
            {
                this.metadataHave[iterator0].writeAsElement(
                    writer,
                    "MetadataTableHaveEntry");
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "useMaster",
            this.useMaster);

        writer.writeEndElement();
    }
}
