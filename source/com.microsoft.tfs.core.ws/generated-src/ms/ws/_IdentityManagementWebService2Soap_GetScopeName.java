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

import ms.ws._IdentityManagementWebService2Soap_GetScopeName;

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
public class _IdentityManagementWebService2Soap_GetScopeName
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String scopeId;

    public _IdentityManagementWebService2Soap_GetScopeName()
    {
        super();
    }

    public _IdentityManagementWebService2Soap_GetScopeName(final String scopeId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setScopeId(scopeId);
    }

    public String getScopeId()
    {
        return this.scopeId;
    }

    public void setScopeId(String value)
    {
        this.scopeId = value;
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
            "scopeId",
            this.scopeId);

        writer.writeEndElement();
    }
}
