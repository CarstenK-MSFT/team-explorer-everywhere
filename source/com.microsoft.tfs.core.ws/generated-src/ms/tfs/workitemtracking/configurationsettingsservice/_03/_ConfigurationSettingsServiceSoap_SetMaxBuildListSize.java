// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.configurationsettingsservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.configurationsettingsservice._03._ConfigurationSettingsServiceSoap_SetMaxBuildListSize;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ConfigurationSettingsServiceSoap_SetMaxBuildListSize
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected int maxBuildListSize;

    public _ConfigurationSettingsServiceSoap_SetMaxBuildListSize()
    {
        super();
    }

    public _ConfigurationSettingsServiceSoap_SetMaxBuildListSize(final int maxBuildListSize)
    {
        // TODO : Call super() instead of setting all fields directly?
        setMaxBuildListSize(maxBuildListSize);
    }

    public int getMaxBuildListSize()
    {
        return this.maxBuildListSize;
    }

    public void setMaxBuildListSize(int value)
    {
        this.maxBuildListSize = value;
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
            "maxBuildListSize",
            this.maxBuildListSize);

        writer.writeEndElement();
    }
}
