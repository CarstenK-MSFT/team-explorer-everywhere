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
public final class _QueryOptions
    extends FlagSet
{
    /**
     * Constructs a _QueryOptions with no flags initially set.
     */
    public _QueryOptions()
    {
        super();
    }

    /**
     * Constructs a _QueryOptions with the given flags initially set.
     *
     * @param flags
     *        the flags initially contained in this set.
     */
    public _QueryOptions(final _QueryOptions_Flag[] flags)
    {
        super(flags);
    }

    /**
     * Constructs a _QueryOptions with the given flags initially set.
     *
     * @param flagStrings
     *        the flags initially contained in this set.
     */
    public _QueryOptions(final String[] flagStrings)
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
        return _QueryOptions_Flag.fromString(
            value,
            _QueryOptions_Flag.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the flags this flag set contains.
     *
     * @return the flags this flag set contains.
     */
    public _QueryOptions_Flag[] getFlags()
    {
        return (_QueryOptions_Flag[]) this.toArray(new _QueryOptions_Flag[this.size()]);
    }

    public boolean add(_QueryOptions_Flag o)
    {
        return super.add(o);
    }

    public boolean contains(_QueryOptions_Flag o)
    {
        return super.contains(o);
    }

    public boolean remove(_QueryOptions_Flag o)
    {
        return super.remove(o);
    }

    /**
     * Defines the valid flag values that can be contained in _QueryOptions.
     *
     * This class is non-final for the rare occasion where custom values must be
     * defined because the web service accepts values not publicly defined in its
     * web service definition.
     */
    public static class _QueryOptions_Flag
        extends Flag
    {
        /**
         * This map lets static methods in this class map strings to the correct
         * instance type at deserialization time.
         */
        private final static Map VALUES_TO_INSTANCES = new HashMap();
        public static final _QueryOptions_Flag None = new _QueryOptions_Flag("None");
        public static final _QueryOptions_Flag Definitions = new _QueryOptions_Flag("Definitions");
        public static final _QueryOptions_Flag Agents = new _QueryOptions_Flag("Agents");
        public static final _QueryOptions_Flag Workspaces = new _QueryOptions_Flag("Workspaces");
        public static final _QueryOptions_Flag Controllers = new _QueryOptions_Flag("Controllers");
        public static final _QueryOptions_Flag Process = new _QueryOptions_Flag("Process");
        public static final _QueryOptions_Flag BatchedRequests = new _QueryOptions_Flag("BatchedRequests");
        public static final _QueryOptions_Flag HistoricalBuilds = new _QueryOptions_Flag("HistoricalBuilds");
        public static final _QueryOptions_Flag All = new _QueryOptions_Flag("All");

        protected _QueryOptions_Flag(final String name)
        {
            super(name, _QueryOptions_Flag.VALUES_TO_INSTANCES);
        }
    }
}
