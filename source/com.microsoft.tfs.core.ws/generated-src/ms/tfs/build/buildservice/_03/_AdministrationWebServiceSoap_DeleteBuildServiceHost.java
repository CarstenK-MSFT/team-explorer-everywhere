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

import ms.tfs.build.buildservice._03._AdministrationWebServiceSoap_DeleteBuildServiceHost;

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
public class _AdministrationWebServiceSoap_DeleteBuildServiceHost
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String serviceHostUri;

    public _AdministrationWebServiceSoap_DeleteBuildServiceHost()
    {
        super();
    }

    public _AdministrationWebServiceSoap_DeleteBuildServiceHost(final String serviceHostUri)
    {
        // TODO : Call super() instead of setting all fields directly?
        setServiceHostUri(serviceHostUri);
    }

    public String getServiceHostUri()
    {
        return this.serviceHostUri;
    }

    public void setServiceHostUri(String value)
    {
        this.serviceHostUri = value;
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
            "serviceHostUri",
            this.serviceHostUri);

        writer.writeEndElement();
    }
}
