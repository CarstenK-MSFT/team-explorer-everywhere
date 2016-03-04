// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /flagSet.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated flag set class.
 */
public final class _ScheduleDays
    extends FlagSet
{
    /**
     * Constructs a _ScheduleDays with no flags initially set.
     */
    public _ScheduleDays()
    {
        super();
    }

    /**
     * Constructs a _ScheduleDays with the given flags initially set.
     *
     * @param flags
     *        the flags initially contained in this set.
     */
    public _ScheduleDays(final _ScheduleDays_Flag[] flags)
    {
        super(flags);
    }

    /**
     * Constructs a _ScheduleDays with the given flags initially set.
     *
     * @param flagStrings
     *        the flags initially contained in this set.
     */
    public _ScheduleDays(final String[] flagStrings)
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
        return _ScheduleDays_Flag.fromString(
            value,
            _ScheduleDays_Flag.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the flags this flag set contains.
     *
     * @return the flags this flag set contains.
     */
    public _ScheduleDays_Flag[] getFlags()
    {
        return (_ScheduleDays_Flag[]) this.toArray(new _ScheduleDays_Flag[this.size()]);
    }

    public boolean add(_ScheduleDays_Flag o)
    {
        return super.add(o);
    }

    public boolean contains(_ScheduleDays_Flag o)
    {
        return super.contains(o);
    }

    public boolean remove(_ScheduleDays_Flag o)
    {
        return super.remove(o);
    }

    /**
     * Defines the valid flag values that can be contained in _ScheduleDays.
     *
     * This class is non-final for the rare occasion where custom values must be
     * defined because the web service accepts values not publicly defined in its
     * web service definition.
     */
    public static class _ScheduleDays_Flag
        extends Flag
    {
        /**
         * This map lets static methods in this class map strings to the correct
         * instance type at deserialization time.
         */
        private final static Map VALUES_TO_INSTANCES = new HashMap();
        public static final _ScheduleDays_Flag None = new _ScheduleDays_Flag("None");
        public static final _ScheduleDays_Flag Monday = new _ScheduleDays_Flag("Monday");
        public static final _ScheduleDays_Flag Tuesday = new _ScheduleDays_Flag("Tuesday");
        public static final _ScheduleDays_Flag Wednesday = new _ScheduleDays_Flag("Wednesday");
        public static final _ScheduleDays_Flag Thursday = new _ScheduleDays_Flag("Thursday");
        public static final _ScheduleDays_Flag Friday = new _ScheduleDays_Flag("Friday");
        public static final _ScheduleDays_Flag Saturday = new _ScheduleDays_Flag("Saturday");
        public static final _ScheduleDays_Flag Sunday = new _ScheduleDays_Flag("Sunday");
        public static final _ScheduleDays_Flag All = new _ScheduleDays_Flag("All");

        protected _ScheduleDays_Flag(final String name)
        {
            super(name, _ScheduleDays_Flag.VALUES_TO_INSTANCES);
        }
    }
}
