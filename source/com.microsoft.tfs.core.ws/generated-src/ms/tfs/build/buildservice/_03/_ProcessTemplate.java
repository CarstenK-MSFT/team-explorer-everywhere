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

import ms.tfs.build.buildservice._03._BuildReason;
import ms.tfs.build.buildservice._03._ProcessTemplate;
import ms.tfs.build.buildservice._03._ProcessTemplateType;

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
public class _ProcessTemplate
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String teamProject;
    protected String serverPath;
    protected String description;
    protected _BuildReason supportedReasons = new _BuildReason(
                new _BuildReason._BuildReason_Flag[]
                {
                    _BuildReason._BuildReason_Flag.Manual, _BuildReason._BuildReason_Flag.IndividualCI,
                    _BuildReason._BuildReason_Flag.BatchedCI, _BuildReason._BuildReason_Flag.Schedule,
                    _BuildReason._BuildReason_Flag.ScheduleForced, _BuildReason._BuildReason_Flag.UserCreated
                });
    protected _ProcessTemplateType templateType = _ProcessTemplateType.Custom;
    protected int id = -1;

    // Elements
    protected String parameters;
    protected boolean fileExists;

    public _ProcessTemplate()
    {
        super();
    }

    public _ProcessTemplate(
        final String teamProject,
        final String serverPath,
        final String description,
        final _BuildReason supportedReasons,
        final _ProcessTemplateType templateType,
        final int id,
        final String parameters,
        final boolean fileExists)
    {
        // TODO : Call super() instead of setting all fields directly?
        setTeamProject(teamProject);
        setServerPath(serverPath);
        setDescription(description);
        setSupportedReasons(supportedReasons);
        setTemplateType(templateType);
        setId(id);
        setParameters(parameters);
        setFileExists(fileExists);
    }

    public String getTeamProject()
    {
        return this.teamProject;
    }

    public void setTeamProject(final String value)
    {
        this.teamProject = value;
    }

    public String getServerPath()
    {
        return this.serverPath;
    }

    public void setServerPath(final String value)
    {
        this.serverPath = value;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(final String value)
    {
        this.description = value;
    }

    public _BuildReason getSupportedReasons()
    {
        return this.supportedReasons;
    }

    public void setSupportedReasons(final _BuildReason value)
    {
        this.supportedReasons = value;
    }

    public _ProcessTemplateType getTemplateType()
    {
        return this.templateType;
    }

    public void setTemplateType(final _ProcessTemplateType value)
    {
        this.templateType = value;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(final int value)
    {
        this.id = value;
    }

    public String getParameters()
    {
        return this.parameters;
    }

    public void setParameters(String value)
    {
        this.parameters = value;
    }

    public boolean isFileExists()
    {
        return this.fileExists;
    }

    public void setFileExists(boolean value)
    {
        this.fileExists = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "TeamProject",
            this.teamProject);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ServerPath",
            this.serverPath);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Description",
            this.description);

        if (this.supportedReasons != null)
        {
            this.supportedReasons.writeAsAttribute(
                writer,
                "SupportedReasons");
        }

        if (this.templateType != null)
        {
            this.templateType.writeAsAttribute(
                writer,
                "TemplateType");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Id",
            this.id);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "Parameters",
            this.parameters);
        XMLStreamWriterHelper.writeElement(
            writer,
            "FileExists",
            this.fileExists);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("TeamProject"))
            {
                this.teamProject = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ServerPath"))
            {
                this.serverPath = attributeValue;
            }
            else if (localName.equalsIgnoreCase("Description"))
            {
                this.description = attributeValue;
            }
            else if (localName.equalsIgnoreCase("SupportedReasons"))
            {
                this.supportedReasons = new _BuildReason();
                this.supportedReasons.readFromAttribute(attributeValue);
            }
            else if (localName.equalsIgnoreCase("TemplateType"))
            {
                this.templateType = _ProcessTemplateType.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Id"))
            {
                this.id = XMLConvert.toInt(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Parameters"))
                {
                    this.parameters = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("FileExists"))
                {
                    this.fileExists = XMLConvert.toBoolean(reader.getElementText());
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
