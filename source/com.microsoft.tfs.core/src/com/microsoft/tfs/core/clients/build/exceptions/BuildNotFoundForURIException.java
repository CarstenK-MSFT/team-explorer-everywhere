// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.build.exceptions;

import java.text.MessageFormat;

import com.microsoft.tfs.core.Messages;

/**
 * Exception that is thrown when a build was not found at the specified uniform
 * resource identifier (URI).
 *
 * @since TEE-SDK-10.1
 */
public class BuildNotFoundForURIException extends BuildException {
    private final String buildURI;
    private final String userName;

    public BuildNotFoundForURIException(final String buildURI, final String userName) {
        super(MessageFormat.format(
            Messages.getString("BuildNotFoundForUriException.MessageFormat"), //$NON-NLS-1$
            buildURI,
            userName));

        this.buildURI = buildURI;
        this.userName = userName;
    }

    /**
     * @return the buildUri
     */
    public String getBuildURI() {
        return buildURI;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

}
