// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.tfs.versioncontrol.admin._03;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.versioncontrol.admin._03._AdminRepositoryInfo;
import ms.tfs.versioncontrol.admin._03._AdminSoap_GenerateRepositoryKey;
import ms.tfs.versioncontrol.admin._03._AdminSoap_GenerateRepositoryKeyResponse;
import ms.tfs.versioncontrol.admin._03._AdminSoap_OptimizeDatabase;
import ms.tfs.versioncontrol.admin._03._AdminSoap_OptimizeDatabaseResponse;
import ms.tfs.versioncontrol.admin._03._AdminSoap_QueryRepositoryInformation;
import ms.tfs.versioncontrol.admin._03._AdminSoap_QueryRepositoryInformationResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.URI;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/VersionControl/Admin/03}AdminSoapService
 */
public class _AdminSoapService
    extends SOAP11Service
    implements _AdminSoap
{
    private static final QName PORT_QNAME = new QName(
                "http://schemas.microsoft.com/TeamFoundation/2005/06/VersionControl/Admin/03",
                "AdminSoapService");
    private static final String ENDPOINT_PATH = "/tfs/DefaultCollection/VersionControl/v1.0/Administration.asmx";

    public _AdminSoapService(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _AdminSoapService(
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
        return _AdminSoapService.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _AdminSoapService.ENDPOINT_PATH;
    }

    public _AdminRepositoryInfo queryRepositoryInformation()
        throws TransportException, SOAPFault
    {
        final _AdminSoap_QueryRepositoryInformation requestData = new _AdminSoap_QueryRepositoryInformation();

        final SOAPRequest request = createSOAPRequest(
                "QueryRepositoryInformation",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryRepositoryInformation");
                    }
                });

        final _AdminSoap_QueryRepositoryInformationResponse responseData = new _AdminSoap_QueryRepositoryInformationResponse();

        executeSOAPRequest(
            request,
            "QueryRepositoryInformationResponse",
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

        return responseData.getQueryRepositoryInformationResult();
    }

    public void optimizeDatabase(final int optimizationFlags)
        throws TransportException, SOAPFault
    {
        final _AdminSoap_OptimizeDatabase requestData = new _AdminSoap_OptimizeDatabase(optimizationFlags);

        final SOAPRequest request = createSOAPRequest(
                "OptimizeDatabase",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "OptimizeDatabase");
                    }
                });

        final _AdminSoap_OptimizeDatabaseResponse responseData = new _AdminSoap_OptimizeDatabaseResponse();

        executeSOAPRequest(
            request,
            "OptimizeDatabaseResponse",
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

    public void generateRepositoryKey()
        throws TransportException, SOAPFault
    {
        final _AdminSoap_GenerateRepositoryKey requestData = new _AdminSoap_GenerateRepositoryKey();

        final SOAPRequest request = createSOAPRequest(
                "GenerateRepositoryKey",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "GenerateRepositoryKey");
                    }
                });

        final _AdminSoap_GenerateRepositoryKeyResponse responseData = new _AdminSoap_GenerateRepositoryKeyResponse();

        executeSOAPRequest(
            request,
            "GenerateRepositoryKeyResponse",
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
}
