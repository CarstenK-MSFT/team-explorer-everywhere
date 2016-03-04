// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.tfs.build.buildcontroller._03;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_BuildCompleted;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_BuildCompletedResponse;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_DeleteBuild;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_DeleteBuildResponse;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_InsertBuildQuality;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_InsertBuildQualityResponse;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_RemoveBuildQuality;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_RemoveBuildQualityResponse;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_RemoveRun;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_RemoveRunResponse;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_ReportBuildError;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_ReportBuildErrorResponse;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_StartBuild;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_StartBuildResponse;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_StopBuild;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_StopBuildResponse;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_ValidateBuildStart;
import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_ValidateBuildStartResponse;
import ms.tfs.build.buildcontroller._03._BuildParameters;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.String;

import java.net.URI;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Build/BuildController/03}BuildControllerWebServiceSoap12Service
 */
public class _BuildControllerWebServiceSoap12Service
    extends SOAP12Service
    implements _BuildControllerWebServiceSoap
{
    private static final QName PORT_QNAME = new QName(
                "http://schemas.microsoft.com/TeamFoundation/2005/06/Build/BuildController/03",
                "BuildControllerWebServiceSoap12Service");
    private static final String ENDPOINT_PATH = "/tfs/DefaultCollection/Build/v1.0/BuildController.asmx";

    public _BuildControllerWebServiceSoap12Service(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _BuildControllerWebServiceSoap12Service(
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
        return _BuildControllerWebServiceSoap12Service.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _BuildControllerWebServiceSoap12Service.ENDPOINT_PATH;
    }

    public _BuildControllerWebServiceSoap_DeleteBuildResponse deleteBuild(final String buildUri)
        throws TransportException, SOAPFault
    {
        final _BuildControllerWebServiceSoap_DeleteBuild requestData = new _BuildControllerWebServiceSoap_DeleteBuild(
                    buildUri);

        final SOAPRequest request = createSOAPRequest(
                "DeleteBuild",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "DeleteBuild");
                    }
                });

        final _BuildControllerWebServiceSoap_DeleteBuildResponse responseData = new _BuildControllerWebServiceSoap_DeleteBuildResponse();

        executeSOAPRequest(
            request,
            "DeleteBuildResponse",
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

        return responseData;
    }

    public void insertBuildQuality(
        final String teamProject,
        final String buildQuality)
        throws TransportException, SOAPFault
    {
        final _BuildControllerWebServiceSoap_InsertBuildQuality requestData = new _BuildControllerWebServiceSoap_InsertBuildQuality(
                    teamProject,
                    buildQuality);

        final SOAPRequest request = createSOAPRequest(
                "InsertBuildQuality",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "InsertBuildQuality");
                    }
                });

        final _BuildControllerWebServiceSoap_InsertBuildQualityResponse responseData = new _BuildControllerWebServiceSoap_InsertBuildQualityResponse();

        executeSOAPRequest(
            request,
            "InsertBuildQualityResponse",
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

    public void removeBuildQuality(
        final String teamProject,
        final String buildQuality)
        throws TransportException, SOAPFault
    {
        final _BuildControllerWebServiceSoap_RemoveBuildQuality requestData = new _BuildControllerWebServiceSoap_RemoveBuildQuality(
                    teamProject,
                    buildQuality);

        final SOAPRequest request = createSOAPRequest(
                "RemoveBuildQuality",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RemoveBuildQuality");
                    }
                });

        final _BuildControllerWebServiceSoap_RemoveBuildQualityResponse responseData = new _BuildControllerWebServiceSoap_RemoveBuildQualityResponse();

        executeSOAPRequest(
            request,
            "RemoveBuildQualityResponse",
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

    public boolean removeRun(
        final String buildUri,
        final String runId)
        throws TransportException, SOAPFault
    {
        final _BuildControllerWebServiceSoap_RemoveRun requestData = new _BuildControllerWebServiceSoap_RemoveRun(buildUri,
                runId);

        final SOAPRequest request = createSOAPRequest(
                "RemoveRun",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RemoveRun");
                    }
                });

        final _BuildControllerWebServiceSoap_RemoveRunResponse responseData = new _BuildControllerWebServiceSoap_RemoveRunResponse();

        executeSOAPRequest(
            request,
            "RemoveRunResponse",
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

        return responseData.isRemoveRunResult();
    }

    public String startBuild(final _BuildParameters buildParameters)
        throws TransportException, SOAPFault
    {
        final _BuildControllerWebServiceSoap_StartBuild requestData = new _BuildControllerWebServiceSoap_StartBuild(
                    buildParameters);

        final SOAPRequest request = createSOAPRequest(
                "StartBuild",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "StartBuild");
                    }
                });

        final _BuildControllerWebServiceSoap_StartBuildResponse responseData = new _BuildControllerWebServiceSoap_StartBuildResponse();

        executeSOAPRequest(
            request,
            "StartBuildResponse",
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

        return responseData.getStartBuildResult();
    }

    public _BuildControllerWebServiceSoap_StopBuildResponse stopBuild(final String buildUri)
        throws TransportException, SOAPFault
    {
        final _BuildControllerWebServiceSoap_StopBuild requestData = new _BuildControllerWebServiceSoap_StopBuild(buildUri);

        final SOAPRequest request = createSOAPRequest(
                "StopBuild",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "StopBuild");
                    }
                });

        final _BuildControllerWebServiceSoap_StopBuildResponse responseData = new _BuildControllerWebServiceSoap_StopBuildResponse();

        executeSOAPRequest(
            request,
            "StopBuildResponse",
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

        return responseData;
    }

    public void buildCompleted(final String buildUri)
        throws TransportException, SOAPFault
    {
        final _BuildControllerWebServiceSoap_BuildCompleted requestData = new _BuildControllerWebServiceSoap_BuildCompleted(
                    buildUri);

        final SOAPRequest request = createSOAPRequest(
                "BuildCompleted",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "BuildCompleted");
                    }
                });

        final _BuildControllerWebServiceSoap_BuildCompletedResponse responseData = new _BuildControllerWebServiceSoap_BuildCompletedResponse();

        executeSOAPRequest(
            request,
            "BuildCompletedResponse",
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

    public void reportBuildError(
        final String buildUri,
        final int exitCode)
        throws TransportException, SOAPFault
    {
        final _BuildControllerWebServiceSoap_ReportBuildError requestData = new _BuildControllerWebServiceSoap_ReportBuildError(
                    buildUri,
                    exitCode);

        final SOAPRequest request = createSOAPRequest(
                "ReportBuildError",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ReportBuildError");
                    }
                });

        final _BuildControllerWebServiceSoap_ReportBuildErrorResponse responseData = new _BuildControllerWebServiceSoap_ReportBuildErrorResponse();

        executeSOAPRequest(
            request,
            "ReportBuildErrorResponse",
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

    public boolean validateBuildStart(
        final String teamProject,
        final String buildType,
        final String buildMachine)
        throws TransportException, SOAPFault
    {
        final _BuildControllerWebServiceSoap_ValidateBuildStart requestData = new _BuildControllerWebServiceSoap_ValidateBuildStart(
                    teamProject,
                    buildType,
                    buildMachine);

        final SOAPRequest request = createSOAPRequest(
                "ValidateBuildStart",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ValidateBuildStart");
                    }
                });

        final _BuildControllerWebServiceSoap_ValidateBuildStartResponse responseData = new _BuildControllerWebServiceSoap_ValidateBuildStartResponse();

        executeSOAPRequest(
            request,
            "ValidateBuildStartResponse",
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

        return responseData.isValidateBuildStartResult();
    }
}
