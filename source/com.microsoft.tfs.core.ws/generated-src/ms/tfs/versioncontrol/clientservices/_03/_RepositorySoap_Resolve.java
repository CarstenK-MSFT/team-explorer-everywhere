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

import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_Resolve;
import ms.tfs.versioncontrol.clientservices._03._Resolution;

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
public class _RepositorySoap_Resolve
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String ownerName;
    protected int conflictId;
    protected _Resolution resolution;
    protected String newPath;
    protected int encoding;
    protected _LockLevel lockLevel;

    public _RepositorySoap_Resolve()
    {
        super();
    }

    public _RepositorySoap_Resolve(
        final String workspaceName,
        final String ownerName,
        final int conflictId,
        final _Resolution resolution,
        final String newPath,
        final int encoding,
        final _LockLevel lockLevel)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setOwnerName(ownerName);
        setConflictId(conflictId);
        setResolution(resolution);
        setNewPath(newPath);
        setEncoding(encoding);
        setLockLevel(lockLevel);
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public void setOwnerName(String value)
    {
        this.ownerName = value;
    }

    public int getConflictId()
    {
        return this.conflictId;
    }

    public void setConflictId(int value)
    {
        this.conflictId = value;
    }

    public _Resolution getResolution()
    {
        return this.resolution;
    }

    public void setResolution(_Resolution value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'resolution' is a required element, its value cannot be null");
        }

        this.resolution = value;
    }

    public String getNewPath()
    {
        return this.newPath;
    }

    public void setNewPath(String value)
    {
        this.newPath = value;
    }

    public int getEncoding()
    {
        return this.encoding;
    }

    public void setEncoding(int value)
    {
        this.encoding = value;
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
            "ownerName",
            this.ownerName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "conflictId",
            this.conflictId);
        this.resolution.writeAsElement(
            writer,
            "resolution");
        XMLStreamWriterHelper.writeElement(
            writer,
            "newPath",
            this.newPath);
        XMLStreamWriterHelper.writeElement(
            writer,
            "encoding",
            this.encoding);
        this.lockLevel.writeAsElement(
            writer,
            "lockLevel");

        writer.writeEndElement();
    }
}
