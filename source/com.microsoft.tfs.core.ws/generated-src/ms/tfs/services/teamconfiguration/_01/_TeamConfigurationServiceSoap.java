// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.services.teamconfiguration._01;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.services.teamconfiguration._01._TeamConfiguration;
import ms.tfs.services.teamconfiguration._01._TeamConfigurationServiceSoap_GetTeamConfigurationsForUser;
import ms.tfs.services.teamconfiguration._01._TeamConfigurationServiceSoap_GetTeamConfigurationsForUserResponse;
import ms.tfs.services.teamconfiguration._01._TeamConfigurationServiceSoap_SetTeamSettings;
import ms.tfs.services.teamconfiguration._01._TeamConfigurationServiceSoap_SetTeamSettingsResponse;
import ms.tfs.services.teamconfiguration._01._TeamFieldValue;
import ms.tfs.services.teamconfiguration._01._TeamSettings;

import java.lang.String;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Services/TeamConfiguration/01}TeamConfigurationServiceSoap
 */
public interface _TeamConfigurationServiceSoap
{
    public _TeamConfiguration[] getTeamConfigurationsForUser(final String[] projectUris)
        throws TransportException, SOAPFault;

    public void setTeamSettings(
        final String teamId,
        final _TeamSettings teamSettings)
        throws TransportException, SOAPFault;
}
