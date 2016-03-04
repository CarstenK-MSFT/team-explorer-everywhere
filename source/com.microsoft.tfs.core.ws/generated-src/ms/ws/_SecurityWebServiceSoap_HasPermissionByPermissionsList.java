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
import ms.ws._SecurityWebServiceSoap_HasPermissionByPermissionsList;

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
public class _SecurityWebServiceSoap_HasPermissionByPermissionsList
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String namespaceId;
    protected String token;
    protected _IdentityDescriptor descriptor;
    protected int[] requestedPermissions;
    protected boolean alwaysAllowAdministrators;

    public _SecurityWebServiceSoap_HasPermissionByPermissionsList()
    {
        super();
    }

    public _SecurityWebServiceSoap_HasPermissionByPermissionsList(
        final String namespaceId,
        final String token,
        final _IdentityDescriptor descriptor,
        final int[] requestedPermissions,
        final boolean alwaysAllowAdministrators)
    {
        // TODO : Call super() instead of setting all fields directly?
        setNamespaceId(namespaceId);
        setToken(token);
        setDescriptor(descriptor);
        setRequestedPermissions(requestedPermissions);
        setAlwaysAllowAdministrators(alwaysAllowAdministrators);
    }

    public String getNamespaceId()
    {
        return this.namespaceId;
    }

    public void setNamespaceId(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'namespaceId' is a required element, its value cannot be null");
        }

        this.namespaceId = value;
    }

    public String getToken()
    {
        return this.token;
    }

    public void setToken(String value)
    {
        this.token = value;
    }

    public _IdentityDescriptor getDescriptor()
    {
        return this.descriptor;
    }

    public void setDescriptor(_IdentityDescriptor value)
    {
        this.descriptor = value;
    }

    public int[] getRequestedPermissions()
    {
        return this.requestedPermissions;
    }

    public void setRequestedPermissions(int[] value)
    {
        this.requestedPermissions = value;
    }

    public boolean isAlwaysAllowAdministrators()
    {
        return this.alwaysAllowAdministrators;
    }

    public void setAlwaysAllowAdministrators(boolean value)
    {
        this.alwaysAllowAdministrators = value;
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
            "namespaceId",
            this.namespaceId);
        XMLStreamWriterHelper.writeElement(
            writer,
            "token",
            this.token);

        if (this.descriptor != null)
        {
            this.descriptor.writeAsElement(
                writer,
                "descriptor");
        }

        if (this.requestedPermissions != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("requestedPermissions");

            for (int iterator0 = 0; iterator0 < this.requestedPermissions.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "int",
                    this.requestedPermissions[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "alwaysAllowAdministrators",
            this.alwaysAllowAdministrators);

        writer.writeEndElement();
    }
}
