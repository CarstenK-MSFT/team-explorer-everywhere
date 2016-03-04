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

import ms.ws._IdentityManagementWebService2Soap_SetCustomDisplayName;

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
public class _IdentityManagementWebService2Soap_SetCustomDisplayName
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String customDisplayName;

    public _IdentityManagementWebService2Soap_SetCustomDisplayName()
    {
        super();
    }

    public _IdentityManagementWebService2Soap_SetCustomDisplayName(final String customDisplayName)
    {
        // TODO : Call super() instead of setting all fields directly?
        setCustomDisplayName(customDisplayName);
    }

    public String getCustomDisplayName()
    {
        return this.customDisplayName;
    }

    public void setCustomDisplayName(String value)
    {
        this.customDisplayName = value;
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
            "customDisplayName",
            this.customDisplayName);

        writer.writeEndElement();
    }
}
