// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.client.common.ui.dialogs.vc;

import org.eclipse.swt.widgets.Shell;

import com.microsoft.tfs.client.common.ui.Messages;
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.Workspace;

public class RemoveFolderMappingDialog extends ModifyFolderMappingDialog {
    public RemoveFolderMappingDialog(
        final Shell parentShell,
        final Workspace workspace,
        final String repositoryFolder,
        final String localFolder) {
        super(parentShell, workspace, repositoryFolder, localFolder);
    }

    @Override
    public String getPurposeText() {
        return Messages.getString("RemoveFolderMappingDialog.RemoveMappingPurpose"); //$NON-NLS-1$
    }

    @Override
    public String getOkButtonText() {
        return Messages.getString("RemoveFolderMappingDialog.RemoveMapping"); //$NON-NLS-1$
    }

    @Override
    public String getTitleText() {
        return Messages.getString("RemoveFolderMappingDialog.RemoveMapping"); //$NON-NLS-1$
    }
}
