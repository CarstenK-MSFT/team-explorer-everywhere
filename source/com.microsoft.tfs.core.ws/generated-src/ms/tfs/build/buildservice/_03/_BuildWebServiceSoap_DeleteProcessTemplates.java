// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildWebServiceSoap_DeleteProcessTemplates;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildWebServiceSoap_DeleteProcessTemplates
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected int[] processTemplateIds;

    public _BuildWebServiceSoap_DeleteProcessTemplates()
    {
        super();
    }

    public _BuildWebServiceSoap_DeleteProcessTemplates(final int[] processTemplateIds)
    {
        // TODO : Call super() instead of setting all fields directly?
        setProcessTemplateIds(processTemplateIds);
    }

    public int[] getProcessTemplateIds()
    {
        return this.processTemplateIds;
    }

    public void setProcessTemplateIds(int[] value)
    {
        this.processTemplateIds = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.processTemplateIds != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("processTemplateIds");

            for (int iterator0 = 0; iterator0 < this.processTemplateIds.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "int",
                    this.processTemplateIds[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
