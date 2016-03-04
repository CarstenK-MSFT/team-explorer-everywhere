// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.services.linking._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.services.linking._03._Artifact;
import ms.tfs.services.linking._03._ExtendedAttribute;
import ms.tfs.services.linking._03._FilterType;
import ms.tfs.services.linking._03._IntegrationServiceSoap_GetArtifacts;
import ms.tfs.services.linking._03._IntegrationServiceSoap_GetArtifactsResponse;
import ms.tfs.services.linking._03._IntegrationServiceSoap_GetReferencingArtifacts;
import ms.tfs.services.linking._03._IntegrationServiceSoap_GetReferencingArtifactsResponse;
import ms.tfs.services.linking._03._IntegrationServiceSoap_GetReferencingArtifactsWithFilter;
import ms.tfs.services.linking._03._IntegrationServiceSoap_GetReferencingArtifactsWithFilterResponse;
import ms.tfs.services.linking._03._IntegrationServiceSoap_NotifyResponse;
import ms.tfs.services.linking._03._LinkFilter;
import ms.tfs.services.linking._03._OutboundLink;
import ms.tfs.services.notification._03._IntegrationServiceSoap_Notify;

import java.lang.String;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Services/Linking/03}IntegrationServiceSoap
 */
public interface _IntegrationServiceSoap
{
    public _Artifact[] getReferencingArtifacts(final String[] uriList)
        throws TransportException, SOAPFault;

    public _Artifact[] getReferencingArtifactsWithFilter(
        final String[] uriList,
        final _LinkFilter[] filters)
        throws TransportException, SOAPFault;

    public _Artifact[] getArtifacts(final String[] artifactUris)
        throws TransportException, SOAPFault;

    public void notify(
        final String eventXml,
        final String tfsIdentityXml)
        throws TransportException, SOAPFault;
}
