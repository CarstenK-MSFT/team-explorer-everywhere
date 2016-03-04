// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.build.flags;

import com.microsoft.tfs.core.internal.wrappers.EnumerationWrapper;

import ms.tfs.build.buildservice._03._ControllerStatus;

/**
 * Describes the controller status.
 *
 * @since TEE-SDK-10.1
 */
public class ControllerStatus2010 extends EnumerationWrapper {
    public static final ControllerStatus2010 UNAVAILABLE = new ControllerStatus2010(_ControllerStatus.Unavailable);
    public static final ControllerStatus2010 AVAILABLE = new ControllerStatus2010(_ControllerStatus.Available);
    public static final ControllerStatus2010 OFFLINE = new ControllerStatus2010(_ControllerStatus.Offline);

    private ControllerStatus2010(final _ControllerStatus type) {
        super(type);
    }

    /**
     * Gets the correct wrapper type for the given web service object.
     *
     * @param webServiceObject
     *        the web service object (must not be <code>null</code>)
     * @return the correct wrapper type for the given web service object
     * @throws RuntimeException
     *         if no wrapper type is known for the given web service object
     */
    public static ControllerStatus2010 fromWebServiceObject(final _ControllerStatus webServiceObject) {
        if (webServiceObject == null) {
            return null;
        }
        return (ControllerStatus2010) EnumerationWrapper.fromWebServiceObject(webServiceObject);
    }

    /**
     * Gets the web service object this class wraps. The returned object should
     * not be modified.
     *
     * @return the web service object this class wraps.
     */
    public _ControllerStatus getWebServiceObject() {
        return (_ControllerStatus) webServiceObject;
    }

    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
