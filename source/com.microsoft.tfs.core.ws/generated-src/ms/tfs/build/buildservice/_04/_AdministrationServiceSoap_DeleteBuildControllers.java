// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildControllers;

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
public class _AdministrationServiceSoap_DeleteBuildControllers
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String[] controllerUris;

    public _AdministrationServiceSoap_DeleteBuildControllers()
    {
        super();
    }

    public _AdministrationServiceSoap_DeleteBuildControllers(final String[] controllerUris)
    {
        // TODO : Call super() instead of setting all fields directly?
        setControllerUris(controllerUris);
    }

    public String[] getControllerUris()
    {
        return this.controllerUris;
    }

    public void setControllerUris(String[] value)
    {
        this.controllerUris = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.controllerUris != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("controllerUris");

            for (int iterator0 = 0; iterator0 < this.controllerUris.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.controllerUris[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
