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

import ms.ws._FilteredIdentitiesList;
import ms.ws._IdentityDescriptor;
import ms.ws._IdentityManagementWebService2Soap_AddMemberToApplicationGroup;
import ms.ws._IdentityManagementWebService2Soap_AddMemberToApplicationGroupResponse;
import ms.ws._IdentityManagementWebService2Soap_AddRecentUser;
import ms.ws._IdentityManagementWebService2Soap_AddRecentUserResponse;
import ms.ws._IdentityManagementWebService2Soap_CreateApplicationGroup;
import ms.ws._IdentityManagementWebService2Soap_CreateApplicationGroupResponse;
import ms.ws._IdentityManagementWebService2Soap_DeleteApplicationGroup;
import ms.ws._IdentityManagementWebService2Soap_DeleteApplicationGroupResponse;
import ms.ws._IdentityManagementWebService2Soap_GetMostRecentlyUsedUsers;
import ms.ws._IdentityManagementWebService2Soap_GetMostRecentlyUsedUsersResponse;
import ms.ws._IdentityManagementWebService2Soap_GetScopeName;
import ms.ws._IdentityManagementWebService2Soap_GetScopeNameResponse;
import ms.ws._IdentityManagementWebService2Soap_IsMember;
import ms.ws._IdentityManagementWebService2Soap_IsMemberResponse;
import ms.ws._IdentityManagementWebService2Soap_ListApplicationGroups;
import ms.ws._IdentityManagementWebService2Soap_ListApplicationGroupsResponse;
import ms.ws._IdentityManagementWebService2Soap_ReadFilteredIdentities;
import ms.ws._IdentityManagementWebService2Soap_ReadFilteredIdentitiesResponse;
import ms.ws._IdentityManagementWebService2Soap_ReadIdentities;
import ms.ws._IdentityManagementWebService2Soap_ReadIdentitiesByDescriptor;
import ms.ws._IdentityManagementWebService2Soap_ReadIdentitiesByDescriptorResponse;
import ms.ws._IdentityManagementWebService2Soap_ReadIdentitiesById;
import ms.ws._IdentityManagementWebService2Soap_ReadIdentitiesByIdResponse;
import ms.ws._IdentityManagementWebService2Soap_ReadIdentitiesResponse;
import ms.ws._IdentityManagementWebService2Soap_RefreshIdentity;
import ms.ws._IdentityManagementWebService2Soap_RefreshIdentityResponse;
import ms.ws._IdentityManagementWebService2Soap_RemoveMemberFromApplicationGroup;
import ms.ws._IdentityManagementWebService2Soap_RemoveMemberFromApplicationGroupResponse;
import ms.ws._IdentityManagementWebService2Soap_SetCustomDisplayName;
import ms.ws._IdentityManagementWebService2Soap_SetCustomDisplayNameResponse;
import ms.ws._IdentityManagementWebService2Soap_UpdateApplicationGroup;
import ms.ws._IdentityManagementWebService2Soap_UpdateApplicationGroupResponse;
import ms.ws._IdentityManagementWebService2Soap_UpdateIdentityExtendedProperties;
import ms.ws._IdentityManagementWebService2Soap_UpdateIdentityExtendedPropertiesResponse;
import ms.ws._KeyValueOfStringString;
import ms.ws._PropertyValue;
import ms.ws._TeamFoundationIdentity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.Object;
import java.lang.String;

import java.net.URI;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://microsoft.com/webservices/}IdentityManagementWebService2Soap12Service
 */
public class _IdentityManagementWebService2Soap12Service
    extends SOAP12Service
    implements _IdentityManagementWebService2Soap
{
    private static final QName PORT_QNAME = new QName("http://microsoft.com/webservices/",
            "IdentityManagementWebService2Soap12Service");
    private static final String ENDPOINT_PATH = "/tfs/TeamFoundation/Administration/v4.0/IdentityManagementService2.asmx";

    public _IdentityManagementWebService2Soap12Service(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _IdentityManagementWebService2Soap12Service(
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
        return _IdentityManagementWebService2Soap12Service.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _IdentityManagementWebService2Soap12Service.ENDPOINT_PATH;
    }

    public void addRecentUser(final String teamFoundationId)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_AddRecentUser requestData = new _IdentityManagementWebService2Soap_AddRecentUser(
                    teamFoundationId);

        final SOAPRequest request = createSOAPRequest(
                "AddRecentUser",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "AddRecentUser");
                    }
                });

        final _IdentityManagementWebService2Soap_AddRecentUserResponse responseData = new _IdentityManagementWebService2Soap_AddRecentUserResponse();

        executeSOAPRequest(
            request,
            "AddRecentUserResponse",
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

    public _TeamFoundationIdentity[] getMostRecentlyUsedUsers(final int features)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_GetMostRecentlyUsedUsers requestData = new _IdentityManagementWebService2Soap_GetMostRecentlyUsedUsers(
                    features);

        final SOAPRequest request = createSOAPRequest(
                "GetMostRecentlyUsedUsers",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "GetMostRecentlyUsedUsers");
                    }
                });

        final _IdentityManagementWebService2Soap_GetMostRecentlyUsedUsersResponse responseData = new _IdentityManagementWebService2Soap_GetMostRecentlyUsedUsersResponse();

        executeSOAPRequest(
            request,
            "GetMostRecentlyUsedUsersResponse",
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

        return responseData.getGetMostRecentlyUsedUsersResult();
    }

    public _FilteredIdentitiesList readFilteredIdentities(
        final String expression,
        final int suggestedPageSize,
        final String lastSearchResult,
        final boolean lookForward,
        final int queryMembership,
        final int features)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_ReadFilteredIdentities requestData = new _IdentityManagementWebService2Soap_ReadFilteredIdentities(
                    expression,
                    suggestedPageSize,
                    lastSearchResult,
                    lookForward,
                    queryMembership,
                    features);

        final SOAPRequest request = createSOAPRequest(
                "ReadFilteredIdentities",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ReadFilteredIdentities");
                    }
                });

        final _IdentityManagementWebService2Soap_ReadFilteredIdentitiesResponse responseData = new _IdentityManagementWebService2Soap_ReadFilteredIdentitiesResponse();

        executeSOAPRequest(
            request,
            "ReadFilteredIdentitiesResponse",
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

        return responseData.getReadFilteredIdentitiesResult();
    }

    public void setCustomDisplayName(final String customDisplayName)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_SetCustomDisplayName requestData = new _IdentityManagementWebService2Soap_SetCustomDisplayName(
                    customDisplayName);

        final SOAPRequest request = createSOAPRequest(
                "SetCustomDisplayName",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "SetCustomDisplayName");
                    }
                });

        final _IdentityManagementWebService2Soap_SetCustomDisplayNameResponse responseData = new _IdentityManagementWebService2Soap_SetCustomDisplayNameResponse();

        executeSOAPRequest(
            request,
            "SetCustomDisplayNameResponse",
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

    public void updateIdentityExtendedProperties(
        final _IdentityDescriptor descriptor,
        final _PropertyValue[] updates,
        final _PropertyValue[] localUpdates)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_UpdateIdentityExtendedProperties requestData = new _IdentityManagementWebService2Soap_UpdateIdentityExtendedProperties(
                    descriptor,
                    updates,
                    localUpdates);

        final SOAPRequest request = createSOAPRequest(
                "UpdateIdentityExtendedProperties",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "UpdateIdentityExtendedProperties");
                    }
                });

        final _IdentityManagementWebService2Soap_UpdateIdentityExtendedPropertiesResponse responseData = new _IdentityManagementWebService2Soap_UpdateIdentityExtendedPropertiesResponse();

        executeSOAPRequest(
            request,
            "UpdateIdentityExtendedPropertiesResponse",
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

    public _TeamFoundationIdentity[] readIdentitiesByDescriptor(
        final _IdentityDescriptor[] descriptors,
        final int queryMembership,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_ReadIdentitiesByDescriptor requestData = new _IdentityManagementWebService2Soap_ReadIdentitiesByDescriptor(
                    descriptors,
                    queryMembership,
                    options,
                    features,
                    propertyNameFilters,
                    propertyScope);

        final SOAPRequest request = createSOAPRequest(
                "ReadIdentitiesByDescriptor",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ReadIdentitiesByDescriptor");
                    }
                });

        final _IdentityManagementWebService2Soap_ReadIdentitiesByDescriptorResponse responseData = new _IdentityManagementWebService2Soap_ReadIdentitiesByDescriptorResponse();

        executeSOAPRequest(
            request,
            "ReadIdentitiesByDescriptorResponse",
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

        return responseData.getReadIdentitiesByDescriptorResult();
    }

    public _TeamFoundationIdentity[] readIdentitiesById(
        final String[] teamFoundationIds,
        final int queryMembership,
        final int features,
        final int options,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_ReadIdentitiesById requestData = new _IdentityManagementWebService2Soap_ReadIdentitiesById(
                    teamFoundationIds,
                    queryMembership,
                    features,
                    options,
                    propertyNameFilters,
                    propertyScope);

        final SOAPRequest request = createSOAPRequest(
                "ReadIdentitiesById",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ReadIdentitiesById");
                    }
                });

        final _IdentityManagementWebService2Soap_ReadIdentitiesByIdResponse responseData = new _IdentityManagementWebService2Soap_ReadIdentitiesByIdResponse();

        executeSOAPRequest(
            request,
            "ReadIdentitiesByIdResponse",
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

        return responseData.getReadIdentitiesByIdResult();
    }

    public _TeamFoundationIdentity[][] readIdentities(
        final int searchFactor,
        final String[] factorValues,
        final int queryMembership,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_ReadIdentities requestData = new _IdentityManagementWebService2Soap_ReadIdentities(
                    searchFactor,
                    factorValues,
                    queryMembership,
                    options,
                    features,
                    propertyNameFilters,
                    propertyScope);

        final SOAPRequest request = createSOAPRequest(
                "ReadIdentities",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ReadIdentities");
                    }
                });

        final _IdentityManagementWebService2Soap_ReadIdentitiesResponse responseData = new _IdentityManagementWebService2Soap_ReadIdentitiesResponse();

        executeSOAPRequest(
            request,
            "ReadIdentitiesResponse",
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

        return responseData.getReadIdentitiesResult();
    }

    public _IdentityDescriptor createApplicationGroup(
        final String projectUri,
        final String groupName,
        final String groupDescription)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_CreateApplicationGroup requestData = new _IdentityManagementWebService2Soap_CreateApplicationGroup(
                    projectUri,
                    groupName,
                    groupDescription);

        final SOAPRequest request = createSOAPRequest(
                "CreateApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "CreateApplicationGroup");
                    }
                });

        final _IdentityManagementWebService2Soap_CreateApplicationGroupResponse responseData = new _IdentityManagementWebService2Soap_CreateApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "CreateApplicationGroupResponse",
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

        return responseData.getCreateApplicationGroupResult();
    }

    public _TeamFoundationIdentity[] listApplicationGroups(
        final String projectUri,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_ListApplicationGroups requestData = new _IdentityManagementWebService2Soap_ListApplicationGroups(
                    projectUri,
                    options,
                    features,
                    propertyNameFilters,
                    propertyScope);

        final SOAPRequest request = createSOAPRequest(
                "ListApplicationGroups",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ListApplicationGroups");
                    }
                });

        final _IdentityManagementWebService2Soap_ListApplicationGroupsResponse responseData = new _IdentityManagementWebService2Soap_ListApplicationGroupsResponse();

        executeSOAPRequest(
            request,
            "ListApplicationGroupsResponse",
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

        return responseData.getListApplicationGroupsResult();
    }

    public void updateApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final int groupProperty,
        final String newValue)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_UpdateApplicationGroup requestData = new _IdentityManagementWebService2Soap_UpdateApplicationGroup(
                    groupDescriptor,
                    groupProperty,
                    newValue);

        final SOAPRequest request = createSOAPRequest(
                "UpdateApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "UpdateApplicationGroup");
                    }
                });

        final _IdentityManagementWebService2Soap_UpdateApplicationGroupResponse responseData = new _IdentityManagementWebService2Soap_UpdateApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "UpdateApplicationGroupResponse",
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

    public void deleteApplicationGroup(final _IdentityDescriptor groupDescriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_DeleteApplicationGroup requestData = new _IdentityManagementWebService2Soap_DeleteApplicationGroup(
                    groupDescriptor);

        final SOAPRequest request = createSOAPRequest(
                "DeleteApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "DeleteApplicationGroup");
                    }
                });

        final _IdentityManagementWebService2Soap_DeleteApplicationGroupResponse responseData = new _IdentityManagementWebService2Soap_DeleteApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "DeleteApplicationGroupResponse",
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

    public void addMemberToApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_AddMemberToApplicationGroup requestData = new _IdentityManagementWebService2Soap_AddMemberToApplicationGroup(
                    groupDescriptor,
                    descriptor);

        final SOAPRequest request = createSOAPRequest(
                "AddMemberToApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "AddMemberToApplicationGroup");
                    }
                });

        final _IdentityManagementWebService2Soap_AddMemberToApplicationGroupResponse responseData = new _IdentityManagementWebService2Soap_AddMemberToApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "AddMemberToApplicationGroupResponse",
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

    public void removeMemberFromApplicationGroup(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_RemoveMemberFromApplicationGroup requestData = new _IdentityManagementWebService2Soap_RemoveMemberFromApplicationGroup(
                    groupDescriptor,
                    descriptor);

        final SOAPRequest request = createSOAPRequest(
                "RemoveMemberFromApplicationGroup",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RemoveMemberFromApplicationGroup");
                    }
                });

        final _IdentityManagementWebService2Soap_RemoveMemberFromApplicationGroupResponse responseData = new _IdentityManagementWebService2Soap_RemoveMemberFromApplicationGroupResponse();

        executeSOAPRequest(
            request,
            "RemoveMemberFromApplicationGroupResponse",
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

    public boolean isMember(
        final _IdentityDescriptor groupDescriptor,
        final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_IsMember requestData = new _IdentityManagementWebService2Soap_IsMember(
                    groupDescriptor,
                    descriptor);

        final SOAPRequest request = createSOAPRequest(
                "IsMember",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "IsMember");
                    }
                });

        final _IdentityManagementWebService2Soap_IsMemberResponse responseData = new _IdentityManagementWebService2Soap_IsMemberResponse();

        executeSOAPRequest(
            request,
            "IsMemberResponse",
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

        return responseData.isIsMemberResult();
    }

    public boolean refreshIdentity(final _IdentityDescriptor descriptor)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_RefreshIdentity requestData = new _IdentityManagementWebService2Soap_RefreshIdentity(
                    descriptor);

        final SOAPRequest request = createSOAPRequest(
                "RefreshIdentity",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RefreshIdentity");
                    }
                });

        final _IdentityManagementWebService2Soap_RefreshIdentityResponse responseData = new _IdentityManagementWebService2Soap_RefreshIdentityResponse();

        executeSOAPRequest(
            request,
            "RefreshIdentityResponse",
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

        return responseData.isRefreshIdentityResult();
    }

    public String getScopeName(final String scopeId)
        throws TransportException, SOAPFault
    {
        final _IdentityManagementWebService2Soap_GetScopeName requestData = new _IdentityManagementWebService2Soap_GetScopeName(
                    scopeId);

        final SOAPRequest request = createSOAPRequest(
                "GetScopeName",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "GetScopeName");
                    }
                });

        final _IdentityManagementWebService2Soap_GetScopeNameResponse responseData = new _IdentityManagementWebService2Soap_GetScopeNameResponse();

        executeSOAPRequest(
            request,
            "GetScopeNameResponse",
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

        return responseData.getGetScopeNameResult();
    }
}
