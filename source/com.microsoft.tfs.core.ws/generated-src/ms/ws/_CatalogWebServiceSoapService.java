// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.ws._CatalogData;
import ms.ws._CatalogNode;
import ms.ws._CatalogNodeDependency;
import ms.ws._CatalogResource;
import ms.ws._CatalogResourceType;
import ms.ws._CatalogServiceReference;
import ms.ws._CatalogWebServiceSoap_QueryDependents;
import ms.ws._CatalogWebServiceSoap_QueryDependentsResponse;
import ms.ws._CatalogWebServiceSoap_QueryNodes;
import ms.ws._CatalogWebServiceSoap_QueryNodesResponse;
import ms.ws._CatalogWebServiceSoap_QueryParents;
import ms.ws._CatalogWebServiceSoap_QueryParentsResponse;
import ms.ws._CatalogWebServiceSoap_QueryResourceTypes;
import ms.ws._CatalogWebServiceSoap_QueryResourceTypesResponse;
import ms.ws._CatalogWebServiceSoap_QueryResources;
import ms.ws._CatalogWebServiceSoap_QueryResourcesByType;
import ms.ws._CatalogWebServiceSoap_QueryResourcesByTypeResponse;
import ms.ws._CatalogWebServiceSoap_QueryResourcesResponse;
import ms.ws._CatalogWebServiceSoap_SaveCatalogChanges;
import ms.ws._CatalogWebServiceSoap_SaveCatalogChangesResponse;
import ms.ws._KeyValueOfStringString;
import ms.ws._LocationMapping;
import ms.ws._ServiceDefinition;

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
 * {http://microsoft.com/webservices/}CatalogWebServiceSoapService
 */
public class _CatalogWebServiceSoapService
    extends SOAP11Service
    implements _CatalogWebServiceSoap
{
    private static final QName PORT_QNAME = new QName("http://microsoft.com/webservices/",
            "CatalogWebServiceSoapService");
    private static final String ENDPOINT_PATH = "/tfs/TeamFoundation/Administration/v3.0/CatalogService.asmx";

    public _CatalogWebServiceSoapService(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _CatalogWebServiceSoapService(
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
        return _CatalogWebServiceSoapService.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _CatalogWebServiceSoapService.ENDPOINT_PATH;
    }

    public _CatalogResourceType[] queryResourceTypes(final String[] resourceTypeIdentifiers)
        throws TransportException, SOAPFault
    {
        final _CatalogWebServiceSoap_QueryResourceTypes requestData = new _CatalogWebServiceSoap_QueryResourceTypes(
                    resourceTypeIdentifiers);

        final SOAPRequest request = createSOAPRequest(
                "QueryResourceTypes",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryResourceTypes");
                    }
                });

        final _CatalogWebServiceSoap_QueryResourceTypesResponse responseData = new _CatalogWebServiceSoap_QueryResourceTypesResponse();

        executeSOAPRequest(
            request,
            "QueryResourceTypesResponse",
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

        return responseData.getQueryResourceTypesResult();
    }

    public _CatalogData queryResources(
        final String[] resourceIdentifiers,
        final int queryOptions)
        throws TransportException, SOAPFault
    {
        final _CatalogWebServiceSoap_QueryResources requestData = new _CatalogWebServiceSoap_QueryResources(
                    resourceIdentifiers,
                    queryOptions);

        final SOAPRequest request = createSOAPRequest(
                "QueryResources",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryResources");
                    }
                });

        final _CatalogWebServiceSoap_QueryResourcesResponse responseData = new _CatalogWebServiceSoap_QueryResourcesResponse();

        executeSOAPRequest(
            request,
            "QueryResourcesResponse",
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

        return responseData.getQueryResourcesResult();
    }

    public _CatalogData queryResourcesByType(
        final String[] resourceTypes,
        final _KeyValueOfStringString[] propertyFilters,
        final int queryOptions)
        throws TransportException, SOAPFault
    {
        final _CatalogWebServiceSoap_QueryResourcesByType requestData = new _CatalogWebServiceSoap_QueryResourcesByType(
                    resourceTypes,
                    propertyFilters,
                    queryOptions);

        final SOAPRequest request = createSOAPRequest(
                "QueryResourcesByType",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryResourcesByType");
                    }
                });

        final _CatalogWebServiceSoap_QueryResourcesByTypeResponse responseData = new _CatalogWebServiceSoap_QueryResourcesByTypeResponse();

        executeSOAPRequest(
            request,
            "QueryResourcesByTypeResponse",
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

        return responseData.getQueryResourcesByTypeResult();
    }

    public _CatalogData queryNodes(
        final String[] pathSpecs,
        final String[] resourceTypeFilters,
        final _KeyValueOfStringString[] propertyFilters,
        final int queryOptions)
        throws TransportException, SOAPFault
    {
        final _CatalogWebServiceSoap_QueryNodes requestData = new _CatalogWebServiceSoap_QueryNodes(pathSpecs,
                resourceTypeFilters, propertyFilters, queryOptions);

        final SOAPRequest request = createSOAPRequest(
                "QueryNodes",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryNodes");
                    }
                });

        final _CatalogWebServiceSoap_QueryNodesResponse responseData = new _CatalogWebServiceSoap_QueryNodesResponse();

        executeSOAPRequest(
            request,
            "QueryNodesResponse",
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

        return responseData.getQueryNodesResult();
    }

    public _CatalogData queryParents(
        final String resourceIdentifier,
        final String[] pathFilters,
        final String[] resourceTypeFilters,
        final boolean recurseToRoot,
        final int queryOptions)
        throws TransportException, SOAPFault
    {
        final _CatalogWebServiceSoap_QueryParents requestData = new _CatalogWebServiceSoap_QueryParents(resourceIdentifier,
                pathFilters,
                resourceTypeFilters,
                recurseToRoot,
                queryOptions);

        final SOAPRequest request = createSOAPRequest(
                "QueryParents",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryParents");
                    }
                });

        final _CatalogWebServiceSoap_QueryParentsResponse responseData = new _CatalogWebServiceSoap_QueryParentsResponse();

        executeSOAPRequest(
            request,
            "QueryParentsResponse",
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

        return responseData.getQueryParentsResult();
    }

    public _CatalogData queryDependents(
        final String path,
        final int queryOptions)
        throws TransportException, SOAPFault
    {
        final _CatalogWebServiceSoap_QueryDependents requestData = new _CatalogWebServiceSoap_QueryDependents(path,
                queryOptions);

        final SOAPRequest request = createSOAPRequest(
                "QueryDependents",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryDependents");
                    }
                });

        final _CatalogWebServiceSoap_QueryDependentsResponse responseData = new _CatalogWebServiceSoap_QueryDependentsResponse();

        executeSOAPRequest(
            request,
            "QueryDependentsResponse",
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

        return responseData.getQueryDependentsResult();
    }

    public _CatalogData saveCatalogChanges(
        final _CatalogResource[] resources,
        final _CatalogNode[] nodes,
        final _KeyValueOfStringString[] nodeMoves,
        final int queryOptions,
        final boolean preview)
        throws TransportException, SOAPFault
    {
        final _CatalogWebServiceSoap_SaveCatalogChanges requestData = new _CatalogWebServiceSoap_SaveCatalogChanges(
                    resources,
                    nodes,
                    nodeMoves,
                    queryOptions,
                    preview);

        final SOAPRequest request = createSOAPRequest(
                "SaveCatalogChanges",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "SaveCatalogChanges");
                    }
                });

        final _CatalogWebServiceSoap_SaveCatalogChangesResponse responseData = new _CatalogWebServiceSoap_SaveCatalogChangesResponse();

        executeSOAPRequest(
            request,
            "SaveCatalogChangesResponse",
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

        return responseData.getSaveCatalogChangesResult();
    }
}
