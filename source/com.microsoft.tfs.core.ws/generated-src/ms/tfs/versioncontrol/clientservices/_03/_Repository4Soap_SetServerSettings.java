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

import ms.tfs.versioncontrol.clientservices._03._LocalItemExclusionSet;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_SetServerSettings;
import ms.tfs.versioncontrol.clientservices._03._ServerSettings;

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
public class _Repository4Soap_SetServerSettings
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _ServerSettings settings;

    public _Repository4Soap_SetServerSettings()
    {
        super();
    }

    public _Repository4Soap_SetServerSettings(final _ServerSettings settings)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSettings(settings);
    }

    public _ServerSettings getSettings()
    {
        return this.settings;
    }

    public void setSettings(_ServerSettings value)
    {
        this.settings = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.settings != null)
        {
            this.settings.writeAsElement(
                writer,
                "settings");
        }

        writer.writeEndElement();
    }
}
