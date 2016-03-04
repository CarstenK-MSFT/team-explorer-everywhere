// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.linking._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.linking._03._IntegrationServiceSoap_GetReferencingArtifacts;

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
public class _IntegrationServiceSoap_GetReferencingArtifacts
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String[] uriList;

    public _IntegrationServiceSoap_GetReferencingArtifacts()
    {
        super();
    }

    public _IntegrationServiceSoap_GetReferencingArtifacts(final String[] uriList)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUriList(uriList);
    }

    public String[] getUriList()
    {
        return this.uriList;
    }

    public void setUriList(String[] value)
    {
        this.uriList = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.uriList != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("uriList");

            for (int iterator0 = 0; iterator0 < this.uriList.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.uriList[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
