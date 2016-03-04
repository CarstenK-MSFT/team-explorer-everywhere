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

import ms.tfs.build.buildservice._03._BuildServiceSoap_AddBuildQualities;

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
public class _BuildServiceSoap_AddBuildQualities
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String teamProject;
    protected String[] qualities;

    public _BuildServiceSoap_AddBuildQualities()
    {
        super();
    }

    public _BuildServiceSoap_AddBuildQualities(
        final String teamProject,
        final String[] qualities)
    {
        // TODO : Call super() instead of setting all fields directly?
        setTeamProject(teamProject);
        setQualities(qualities);
    }

    public String getTeamProject()
    {
        return this.teamProject;
    }

    public void setTeamProject(String value)
    {
        this.teamProject = value;
    }

    public String[] getQualities()
    {
        return this.qualities;
    }

    public void setQualities(String[] value)
    {
        this.qualities = value;
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

        if (this.qualities != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("qualities");

            for (int iterator0 = 0; iterator0 < this.qualities.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.qualities[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
