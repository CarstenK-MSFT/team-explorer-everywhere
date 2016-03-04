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

import ms.tfs.build.buildservice._03._AdministrationWebServiceSoap_UpdateBuildServiceHost;
import ms.tfs.build.buildservice._03._BuildServiceHostUpdate;
import ms.tfs.build.buildservice._03._BuildServiceHostUpdateOptions;

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
public class _AdministrationWebServiceSoap_UpdateBuildServiceHost
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _BuildServiceHostUpdateOptions update;

    public _AdministrationWebServiceSoap_UpdateBuildServiceHost()
    {
        super();
    }

    public _AdministrationWebServiceSoap_UpdateBuildServiceHost(final _BuildServiceHostUpdateOptions update)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUpdate(update);
    }

    public _BuildServiceHostUpdateOptions getUpdate()
    {
        return this.update;
    }

    public void setUpdate(_BuildServiceHostUpdateOptions value)
    {
        this.update = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.update != null)
        {
            this.update.writeAsElement(
                writer,
                "update");
        }

        writer.writeEndElement();
    }
}
