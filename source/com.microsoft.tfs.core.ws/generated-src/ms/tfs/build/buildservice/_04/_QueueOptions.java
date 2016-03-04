// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /flagSet.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated flag set class.
 */
public final class _QueueOptions
    extends FlagSet
{
    /**
     * Constructs a _QueueOptions with no flags initially set.
     */
    public _QueueOptions()
    {
        super();
    }

    /**
     * Constructs a _QueueOptions with the given flags initially set.
     *
     * @param flags
     *        the flags initially contained in this set.
     */
    public _QueueOptions(final _QueueOptions_Flag[] flags)
    {
        super(flags);
    }

    /**
     * Constructs a _QueueOptions with the given flags initially set.
     *
     * @param flagStrings
     *        the flags initially contained in this set.
     */
    public _QueueOptions(final String[] flagStrings)
    {
        super(flagStrings);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.microsoft.tfs.core.ws.runtime.types.FlagSet\#findFlagInstance(java.lang
     * .String)
     */
    protected Flag findFlagInstance(final String value)
        throws SOAPSerializationException
    {
        return _QueueOptions_Flag.fromString(
            value,
            _QueueOptions_Flag.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the flags this flag set contains.
     *
     * @return the flags this flag set contains.
     */
    public _QueueOptions_Flag[] getFlags()
    {
        return (_QueueOptions_Flag[]) this.toArray(new _QueueOptions_Flag[this.size()]);
    }

    public boolean add(_QueueOptions_Flag o)
    {
        return super.add(o);
    }

    public boolean contains(_QueueOptions_Flag o)
    {
        return super.contains(o);
    }

    public boolean remove(_QueueOptions_Flag o)
    {
        return super.remove(o);
    }

    /**
     * Defines the valid flag values that can be contained in _QueueOptions.
     *
     * This class is non-final for the rare occasion where custom values must be
     * defined because the web service accepts values not publicly defined in its
     * web service definition.
     */
    public static class _QueueOptions_Flag
        extends Flag
    {
        /**
         * This map lets static methods in this class map strings to the correct
         * instance type at deserialization time.
         */
        private final static Map VALUES_TO_INSTANCES = new HashMap();
        public static final _QueueOptions_Flag None = new _QueueOptions_Flag("None");
        public static final _QueueOptions_Flag Preview = new _QueueOptions_Flag("Preview");

        protected _QueueOptions_Flag(final String name)
        {
            super(name, _QueueOptions_Flag.VALUES_TO_INSTANCES);
        }
    }
}
