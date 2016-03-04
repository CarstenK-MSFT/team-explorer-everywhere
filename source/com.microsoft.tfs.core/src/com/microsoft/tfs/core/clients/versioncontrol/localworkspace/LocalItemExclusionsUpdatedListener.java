// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.versioncontrol.localworkspace;

import com.microsoft.tfs.util.GUID;

public interface LocalItemExclusionsUpdatedListener {
    public void exclusionsUpdated(GUID collectionID);
}
