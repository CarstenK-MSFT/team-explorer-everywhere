// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._AccessMapping;
import ms.ws._LocationWebServiceSoap_RemoveAccessMapping;

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
public class _LocationWebServiceSoap_RemoveAccessMapping
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _AccessMapping accessMapping;
    protected int lastChangeId;

    public _LocationWebServiceSoap_RemoveAccessMapping()
    {
        super();
    }

    public _LocationWebServiceSoap_RemoveAccessMapping(
        final _AccessMapping accessMapping,
        final int lastChangeId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setAccessMapping(accessMapping);
        setLastChangeId(lastChangeId);
    }

    public _AccessMapping getAccessMapping()
    {
        return this.accessMapping;
    }

    public void setAccessMapping(_AccessMapping value)
    {
        this.accessMapping = value;
    }

    public int getLastChangeId()
    {
        return this.lastChangeId;
    }

    public void setLastChangeId(int value)
    {
        this.lastChangeId = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.accessMapping != null)
        {
            this.accessMapping.writeAsElement(
                writer,
                "accessMapping");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "lastChangeId",
            this.lastChangeId);

        writer.writeEndElement();
    }
}
