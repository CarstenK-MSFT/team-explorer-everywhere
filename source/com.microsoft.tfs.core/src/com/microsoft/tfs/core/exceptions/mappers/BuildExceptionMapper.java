// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.exceptions.mappers;

/**
 * Maps exceptions for the build client.
 *
 * @since TEE-SDK-10.1
 * @threadsafety immutable
 */
public final class BuildExceptionMapper extends TECoreExceptionMapper {
    /**
     * @see TECoreExceptionMapper#map(RuntimeException)
     */
    public static RuntimeException map(final RuntimeException e) {
        // Defer to the basic core mapper.
        return TECoreExceptionMapper.map(e);
    }
}
