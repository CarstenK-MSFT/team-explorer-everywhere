// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._ProxyInfo;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_AddProxy;

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
public class _RepositoryExtensionsSoap_AddProxy
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _ProxyInfo proxy;

    public _RepositoryExtensionsSoap_AddProxy()
    {
        super();
    }

    public _RepositoryExtensionsSoap_AddProxy(final _ProxyInfo proxy)
    {
        // TODO : Call super() instead of setting all fields directly?
        setProxy(proxy);
    }

    public _ProxyInfo getProxy()
    {
        return this.proxy;
    }

    public void setProxy(_ProxyInfo value)
    {
        this.proxy = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.proxy != null)
        {
            this.proxy.writeAsElement(
                writer,
                "proxy");
        }

        writer.writeEndElement();
    }
}
