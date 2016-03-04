// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.build.buildservice._03._AgentStatus;
import ms.tfs.build.buildservice._03._BuildAgent;
import ms.tfs.build.buildservice._03._BuildController;
import ms.tfs.build.buildservice._03._BuildControllerSpec;
import ms.tfs.build.buildservice._03._BuildDefinition;
import ms.tfs.build.buildservice._03._BuildDefinitionSpec;
import ms.tfs.build.buildservice._03._BuildDetail;
import ms.tfs.build.buildservice._03._BuildInformationNode;
import ms.tfs.build.buildservice._03._BuildPhaseStatus;
import ms.tfs.build.buildservice._03._BuildQueueQueryResult;
import ms.tfs.build.buildservice._03._BuildQueueSpec;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_CancelBuilds;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_CancelBuildsResponse;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_QueryBuilds;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_QueryBuildsById;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_QueryBuildsByIdResponse;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_QueryBuildsResponse;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_QueueBuilds;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_QueueBuildsResponse;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_UpdateBuilds;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_UpdateBuildsResponse;
import ms.tfs.build.buildservice._03._BuildReason;
import ms.tfs.build.buildservice._03._BuildRequest;
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
import ms.tfs.build.buildservice._03._QueryOptions;
import ms.tfs.build.buildservice._03._QueueOptions;
import ms.tfs.build.buildservice._03._QueuePriority;
import ms.tfs.build.buildservice._03._QueueStatus;
import ms.tfs.build.buildservice._03._QueuedBuild;
import ms.tfs.build.buildservice._03._QueuedBuildUpdate;
import ms.tfs.build.buildservice._03._QueuedBuildUpdateOptions;
import ms.tfs.build.buildservice._03._RetentionPolicy;
import ms.tfs.build.buildservice._03._Schedule;
import ms.tfs.build.buildservice._03._ScheduleDays;
import ms.tfs.build.buildservice._03._WorkspaceMapping;
import ms.tfs.build.buildservice._03._WorkspaceMappingType;
import ms.tfs.build.buildservice._03._WorkspaceTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.String;

import java.net.URI;

import java.util.Calendar;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://tempuri.org/}BuildQueueWebServiceSoap12Service
 */
public class _BuildQueueWebServiceSoap12Service
    extends SOAP12Service
    implements _BuildQueueWebServiceSoap
{
    private static final QName PORT_QNAME = new QName("http://tempuri.org/", "BuildQueueWebServiceSoap12Service");
    private static final String ENDPOINT_PATH = "/tfs/DefaultCollection/Build/v3.0/BuildQueueService.asmx";

    public _BuildQueueWebServiceSoap12Service(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _BuildQueueWebServiceSoap12Service(
        final HttpClient client,
        URI endpoint,
        QName port)
    {
        super(client, endpoint, port);
    }

    /**
     * @return the qualified name of the WSDL port this service implementation can be used with
     */
    public static QName getPortQName()
    {
        return _BuildQueueWebServiceSoap12Service.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _BuildQueueWebServiceSoap12Service.ENDPOINT_PATH;
    }

    public void cancelBuilds(final int[] queueIds)
        throws TransportException, SOAPFault
    {
        final _BuildQueueWebServiceSoap_CancelBuilds requestData = new _BuildQueueWebServiceSoap_CancelBuilds(queueIds);

        final SOAPRequest request = createSOAPRequest(
                "CancelBuilds",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "CancelBuilds");
                    }
                });

        final _BuildQueueWebServiceSoap_CancelBuildsResponse responseData = new _BuildQueueWebServiceSoap_CancelBuildsResponse();

        executeSOAPRequest(
            request,
            "CancelBuildsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });
    }

    public _BuildQueueQueryResult[] queryBuilds(final _BuildQueueSpec[] specs)
        throws TransportException, SOAPFault
    {
        final _BuildQueueWebServiceSoap_QueryBuilds requestData = new _BuildQueueWebServiceSoap_QueryBuilds(specs);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuilds",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuilds");
                    }
                });

        final _BuildQueueWebServiceSoap_QueryBuildsResponse responseData = new _BuildQueueWebServiceSoap_QueryBuildsResponse();

        executeSOAPRequest(
            request,
            "QueryBuildsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getQueryBuildsResult();
    }

    public _BuildQueueQueryResult queryBuildsById(
        final int[] ids,
        final _QueryOptions options)
        throws TransportException, SOAPFault
    {
        final _BuildQueueWebServiceSoap_QueryBuildsById requestData = new _BuildQueueWebServiceSoap_QueryBuildsById(ids,
                options);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuildsById",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuildsById");
                    }
                });

        final _BuildQueueWebServiceSoap_QueryBuildsByIdResponse responseData = new _BuildQueueWebServiceSoap_QueryBuildsByIdResponse();

        executeSOAPRequest(
            request,
            "QueryBuildsByIdResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getQueryBuildsByIdResult();
    }

    public _QueuedBuild[] queueBuilds(
        final _BuildRequest[] requests,
        final _QueueOptions options)
        throws TransportException, SOAPFault
    {
        final _BuildQueueWebServiceSoap_QueueBuilds requestData = new _BuildQueueWebServiceSoap_QueueBuilds(requests,
                options);

        final SOAPRequest request = createSOAPRequest(
                "QueueBuilds",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueueBuilds");
                    }
                });

        final _BuildQueueWebServiceSoap_QueueBuildsResponse responseData = new _BuildQueueWebServiceSoap_QueueBuildsResponse();

        executeSOAPRequest(
            request,
            "QueueBuildsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getQueueBuildsResult();
    }

    public _QueuedBuild[] updateBuilds(final _QueuedBuildUpdateOptions[] updates)
        throws TransportException, SOAPFault
    {
        final _BuildQueueWebServiceSoap_UpdateBuilds requestData = new _BuildQueueWebServiceSoap_UpdateBuilds(updates);

        final SOAPRequest request = createSOAPRequest(
                "UpdateBuilds",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "UpdateBuilds");
                    }
                });

        final _BuildQueueWebServiceSoap_UpdateBuildsResponse responseData = new _BuildQueueWebServiceSoap_UpdateBuildsResponse();

        executeSOAPRequest(
            request,
            "UpdateBuildsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getUpdateBuildsResult();
    }
}
