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

import ms.ws._IdentityDescriptor;
import ms.ws._IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroup;

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
public class _IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroup
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _IdentityDescriptor groupDescriptor;
    protected _IdentityDescriptor descriptor;

    public _IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroup()
    {
        super();
    }

    public _IdentityManagementWebServiceSoap_RemoveMemberFromApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGroupDescriptor(groupDescriptor);
        setDescriptor(descriptor);
    }

    public _IdentityDescriptor getGroupDescriptor()
    {
        return this.groupDescriptor;
    }

    public void setGroupDescriptor(_IdentityDescriptor value)
    {
        this.groupDescriptor = value;
    }

    public _IdentityDescriptor getDescriptor()
    {
        return this.descriptor;
    }

    public void setDescriptor(_IdentityDescriptor value)
    {
        this.descriptor = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.groupDescriptor != null)
        {
            this.groupDescriptor.writeAsElement(
                writer,
                "groupDescriptor");
        }

        if (this.descriptor != null)
        {
            this.descriptor.writeAsElement(
                writer,
                "descriptor");
        }

        writer.writeEndElement();
    }
}
