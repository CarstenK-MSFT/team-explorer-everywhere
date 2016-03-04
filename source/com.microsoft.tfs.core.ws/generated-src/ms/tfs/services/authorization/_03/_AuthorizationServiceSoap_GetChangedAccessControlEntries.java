// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.authorization._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.authorization._03._AuthorizationServiceSoap_GetChangedAccessControlEntries;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _AuthorizationServiceSoap_GetChangedAccessControlEntries
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected int sequence_id;

    public _AuthorizationServiceSoap_GetChangedAccessControlEntries()
    {
        super();
    }

    public _AuthorizationServiceSoap_GetChangedAccessControlEntries(final int sequence_id)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSequence_id(sequence_id);
    }

    public int getSequence_id()
    {
        return this.sequence_id;
    }

    public void setSequence_id(int value)
    {
        this.sequence_id = value;
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
            "sequence_id",
            this.sequence_id);

        writer.writeEndElement();
    }
}
