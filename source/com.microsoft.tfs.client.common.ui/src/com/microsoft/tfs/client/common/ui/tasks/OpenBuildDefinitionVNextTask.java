// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.client.common.ui.tasks;

import java.net.URI;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Shell;

import com.microsoft.teamfoundation.build.webapi.model.DefinitionReference;
import com.microsoft.tfs.core.TFSTeamProjectCollection;

public class OpenBuildDefinitionVNextTask extends BuildDefinitionVNextTask {
    public OpenBuildDefinitionVNextTask(
        final Shell shell,
        final TFSTeamProjectCollection connection,
        final DefinitionReference definition) {
        super(shell, connection, definition);
    }

    @Override
    public IStatus run() {
        final URI uri = getActionUri(OPEN_DEFINITION_ACTION);
        openBrowser(uri);
        return Status.OK_STATUS;
    }
}
