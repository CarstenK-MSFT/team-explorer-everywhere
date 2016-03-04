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

import ms.tfs.build.buildservice._03._AgentStatus;
import ms.tfs.build.buildservice._03._BuildAgent;
import ms.tfs.build.buildservice._03._BuildController;
import ms.tfs.build.buildservice._03._BuildDefinition;
import ms.tfs.build.buildservice._03._BuildDetail;
import ms.tfs.build.buildservice._03._BuildInformationNode;
import ms.tfs.build.buildservice._03._BuildPhaseStatus;
import ms.tfs.build.buildservice._03._BuildQueueQueryResult;
import ms.tfs.build.buildservice._03._BuildReason;
import ms.tfs.build.buildservice._03._BuildServiceHost;
import ms.tfs.build.buildservice._03._BuildStatus;
import ms.tfs.build.buildservice._03._ContinuousIntegrationType;
import ms.tfs.build.buildservice._03._ControllerStatus;
import ms.tfs.build.buildservice._03._DeleteOptions;
import ms.tfs.build.buildservice._03._Failure;
import ms.tfs.build.buildservice._03._GetOption;
import ms.tfs.build.buildservice._03._InformationField;
import ms.tfs.build.buildservice._03._ProcessTemplate;
import ms.tfs.build.buildservice._03._ProcessTemplateType;
import ms.tfs.build.buildservice._03._QueuePriority;
import ms.tfs.build.buildservice._03._QueueStatus;
import ms.tfs.build.buildservice._03._QueuedBuild;
import ms.tfs.build.buildservice._03._RetentionPolicy;
import ms.tfs.build.buildservice._03._Schedule;
import ms.tfs.build.buildservice._03._ScheduleDays;
import ms.tfs.build.buildservice._03._WorkspaceMapping;
import ms.tfs.build.buildservice._03._WorkspaceMappingType;
import ms.tfs.build.buildservice._03._WorkspaceTemplate;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildQueueQueryResult
    extends _BuildAdministrationQueryResult
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected _QueuedBuild[] builds;
    protected _BuildDefinition[] definitions;

    public _BuildQueueQueryResult()
    {
        super();
    }

    public _BuildQueueQueryResult(
        final _Failure[] failures,
        final _BuildAgent[] agents,
        final _BuildController[] controllers,
        final _BuildServiceHost[] serviceHosts,
        final _QueuedBuild[] builds,
        final _BuildDefinition[] definitions)
    {
        // TODO : Call super() instead of setting all fields directly?
        setFailures(failures);
        setAgents(agents);
        setControllers(controllers);
        setServiceHosts(serviceHosts);
        setBuilds(builds);
        setDefinitions(definitions);
    }

    public _QueuedBuild[] getBuilds()
    {
        return this.builds;
    }

    public void setBuilds(_QueuedBuild[] value)
    {
        this.builds = value;
    }

    public _BuildDefinition[] getDefinitions()
    {
        return this.definitions;
    }

    public void setDefinitions(_BuildDefinition[] value)
    {
        this.definitions = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Declare our type
        writer.writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "BuildQueueQueryResult");

        // Elements
        if (this.failures != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Failures");

            for (int iterator0 = 0; iterator0 < this.failures.length; iterator0++)
            {
                this.failures[iterator0].writeAsElement(
                    writer,
                    "Failure");
            }

            writer.writeEndElement();
        }

        if (this.agents != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Agents");

            for (int iterator0 = 0; iterator0 < this.agents.length; iterator0++)
            {
                this.agents[iterator0].writeAsElement(
                    writer,
                    "BuildAgent");
            }

            writer.writeEndElement();
        }

        if (this.controllers != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Controllers");

            for (int iterator0 = 0; iterator0 < this.controllers.length; iterator0++)
            {
                this.controllers[iterator0].writeAsElement(
                    writer,
                    "BuildController");
            }

            writer.writeEndElement();
        }

        if (this.serviceHosts != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("ServiceHosts");

            for (int iterator0 = 0; iterator0 < this.serviceHosts.length; iterator0++)
            {
                this.serviceHosts[iterator0].writeAsElement(
                    writer,
                    "BuildServiceHost");
            }

            writer.writeEndElement();
        }

        if (this.builds != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Builds");

            for (int iterator0 = 0; iterator0 < this.builds.length; iterator0++)
            {
                this.builds[iterator0].writeAsElement(
                    writer,
                    "QueuedBuild");
            }

            writer.writeEndElement();
        }

        if (this.definitions != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Definitions");

            for (int iterator0 = 0; iterator0 < this.definitions.length; iterator0++)
            {
                this.definitions[iterator0].writeAsElement(
                    writer,
                    "BuildDefinition");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Failures"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _Failure complexObject0 = new _Failure();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.failures = (_Failure[]) list0.toArray(new _Failure[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Agents"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _BuildAgent complexObject0 = new _BuildAgent();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.agents = (_BuildAgent[]) list0.toArray(new _BuildAgent[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Controllers"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _BuildController complexObject0 = new _BuildController();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.controllers = (_BuildController[]) list0.toArray(new _BuildController[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("ServiceHosts"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _BuildServiceHost complexObject0 = new _BuildServiceHost();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.serviceHosts = (_BuildServiceHost[]) list0.toArray(new _BuildServiceHost[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Builds"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _QueuedBuild complexObject0 = new _QueuedBuild();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.builds = (_QueuedBuild[]) list0.toArray(new _QueuedBuild[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Definitions"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _BuildDefinition complexObject0 = new _BuildDefinition();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.definitions = (_BuildDefinition[]) list0.toArray(new _BuildDefinition[list0.size()]);
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
