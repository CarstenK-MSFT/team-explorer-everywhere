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

import ms.tfs.build.buildservice._04._BuildServiceSoap_GetBuildQualities;

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
public class _BuildServiceSoap_GetBuildQualities
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String teamProject;

    public _BuildServiceSoap_GetBuildQualities()
    {
        super();
    }

    public _BuildServiceSoap_GetBuildQualities(final String teamProject)
    {
        // TODO : Call super() instead of setting all fields directly?
        setTeamProject(teamProject);
    }

    public String getTeamProject()
    {
        return this.teamProject;
    }

    public void setTeamProject(String value)
    {
        this.teamProject = value;
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
            "teamProject",
            this.teamProject);

        writer.writeEndElement();
    }
}
