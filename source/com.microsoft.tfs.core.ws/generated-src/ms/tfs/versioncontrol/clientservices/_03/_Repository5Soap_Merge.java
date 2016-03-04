// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_Merge;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _Repository5Soap_Merge
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String workspaceOwner;
    protected _ItemSpec source;
    protected _ItemSpec target;
    protected _VersionSpec from;
    protected _VersionSpec to;
    protected _LockLevel lockLevel;
    protected int optionsEx;
    protected String[] itemPropertyFilters;
    protected String[] itemAttributeFilters;
    protected int maxClientPathLength;

    public _Repository5Soap_Merge()
    {
        super();
    }

    public _Repository5Soap_Merge(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec source,
        final _ItemSpec target,
        final _VersionSpec from,
        final _VersionSpec to,
        final _LockLevel lockLevel,
        final int optionsEx,
        final String[] itemPropertyFilters,
        final String[] itemAttributeFilters,
        final int maxClientPathLength)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setSource(source);
        setTarget(target);
        setFrom(from);
        setTo(to);
        setLockLevel(lockLevel);
        setOptionsEx(optionsEx);
        setItemPropertyFilters(itemPropertyFilters);
        setItemAttributeFilters(itemAttributeFilters);
        setMaxClientPathLength(maxClientPathLength);
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getWorkspaceOwner()
    {
        return this.workspaceOwner;
    }

    public void setWorkspaceOwner(String value)
    {
        this.workspaceOwner = value;
    }

    public _ItemSpec getSource()
    {
        return this.source;
    }

    public void setSource(_ItemSpec value)
    {
        this.source = value;
    }

    public _ItemSpec getTarget()
    {
        return this.target;
    }

    public void setTarget(_ItemSpec value)
    {
        this.target = value;
    }

    public _VersionSpec getFrom()
    {
        return this.from;
    }

    public void setFrom(_VersionSpec value)
    {
        this.from = value;
    }

    public _VersionSpec getTo()
    {
        return this.to;
    }

    public void setTo(_VersionSpec value)
    {
        this.to = value;
    }

    public _LockLevel getLockLevel()
    {
        return this.lockLevel;
    }

    public void setLockLevel(_LockLevel value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'lockLevel' is a required element, its value cannot be null");
        }

        this.lockLevel = value;
    }

    public int getOptionsEx()
    {
        return this.optionsEx;
    }

    public void setOptionsEx(int value)
    {
        this.optionsEx = value;
    }

    public String[] getItemPropertyFilters()
    {
        return this.itemPropertyFilters;
    }

    public void setItemPropertyFilters(String[] value)
    {
        this.itemPropertyFilters = value;
    }

    public String[] getItemAttributeFilters()
    {
        return this.itemAttributeFilters;
    }

    public void setItemAttributeFilters(String[] value)
    {
        this.itemAttributeFilters = value;
    }

    public int getMaxClientPathLength()
    {
        return this.maxClientPathLength;
    }

    public void setMaxClientPathLength(int value)
    {
        this.maxClientPathLength = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceName",
            this.workspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceOwner",
            this.workspaceOwner);

        if (this.source != null)
        {
            this.source.writeAsElement(
                writer,
                "source");
        }

        if (this.target != null)
        {
            this.target.writeAsElement(
                writer,
                "target");
        }

        if (this.from != null)
        {
            this.from.writeAsElement(
                writer,
                "from");
        }

        if (this.to != null)
        {
            this.to.writeAsElement(
                writer,
                "to");
        }

        this.lockLevel.writeAsElement(
            writer,
            "lockLevel");
        XMLStreamWriterHelper.writeElement(
            writer,
            "optionsEx",
            this.optionsEx);

        if (this.itemPropertyFilters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("itemPropertyFilters");

            for (int iterator0 = 0; iterator0 < this.itemPropertyFilters.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.itemPropertyFilters[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.itemAttributeFilters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("itemAttributeFilters");

            for (int iterator0 = 0; iterator0 < this.itemAttributeFilters.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.itemAttributeFilters[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "maxClientPathLength",
            this.maxClientPathLength);

        writer.writeEndElement();
    }
}
