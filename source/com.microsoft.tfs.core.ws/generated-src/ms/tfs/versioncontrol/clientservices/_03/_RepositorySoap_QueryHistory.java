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
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryHistory;
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
public class _RepositorySoap_QueryHistory
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String workspaceOwner;
    protected _ItemSpec itemSpec;
    protected _VersionSpec versionItem;
    protected String user;
    protected _VersionSpec versionFrom;
    protected _VersionSpec versionTo;
    protected int maxCount;
    protected boolean includeFiles;
    protected boolean generateDownloadUrls;
    protected boolean slotMode;
    protected boolean sortAscending;

    public _RepositorySoap_QueryHistory()
    {
        super();
    }

    public _RepositorySoap_QueryHistory(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec itemSpec,
        final _VersionSpec versionItem,
        final String user,
        final _VersionSpec versionFrom,
        final _VersionSpec versionTo,
        final int maxCount,
        final boolean includeFiles,
        final boolean generateDownloadUrls,
        final boolean slotMode,
        final boolean sortAscending)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setItemSpec(itemSpec);
        setVersionItem(versionItem);
        setUser(user);
        setVersionFrom(versionFrom);
        setVersionTo(versionTo);
        setMaxCount(maxCount);
        setIncludeFiles(includeFiles);
        setGenerateDownloadUrls(generateDownloadUrls);
        setSlotMode(slotMode);
        setSortAscending(sortAscending);
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

    public _ItemSpec getItemSpec()
    {
        return this.itemSpec;
    }

    public void setItemSpec(_ItemSpec value)
    {
        this.itemSpec = value;
    }

    public _VersionSpec getVersionItem()
    {
        return this.versionItem;
    }

    public void setVersionItem(_VersionSpec value)
    {
        this.versionItem = value;
    }

    public String getUser()
    {
        return this.user;
    }

    public void setUser(String value)
    {
        this.user = value;
    }

    public _VersionSpec getVersionFrom()
    {
        return this.versionFrom;
    }

    public void setVersionFrom(_VersionSpec value)
    {
        this.versionFrom = value;
    }

    public _VersionSpec getVersionTo()
    {
        return this.versionTo;
    }

    public void setVersionTo(_VersionSpec value)
    {
        this.versionTo = value;
    }

    public int getMaxCount()
    {
        return this.maxCount;
    }

    public void setMaxCount(int value)
    {
        this.maxCount = value;
    }

    public boolean isIncludeFiles()
    {
        return this.includeFiles;
    }

    public void setIncludeFiles(boolean value)
    {
        this.includeFiles = value;
    }

    public boolean isGenerateDownloadUrls()
    {
        return this.generateDownloadUrls;
    }

    public void setGenerateDownloadUrls(boolean value)
    {
        this.generateDownloadUrls = value;
    }

    public boolean isSlotMode()
    {
        return this.slotMode;
    }

    public void setSlotMode(boolean value)
    {
        this.slotMode = value;
    }

    public boolean isSortAscending()
    {
        return this.sortAscending;
    }

    public void setSortAscending(boolean value)
    {
        this.sortAscending = value;
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

        if (this.itemSpec != null)
        {
            this.itemSpec.writeAsElement(
                writer,
                "itemSpec");
        }

        if (this.versionItem != null)
        {
            this.versionItem.writeAsElement(
                writer,
                "versionItem");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "user",
            this.user);

        if (this.versionFrom != null)
        {
            this.versionFrom.writeAsElement(
                writer,
                "versionFrom");
        }

        if (this.versionTo != null)
        {
            this.versionTo.writeAsElement(
                writer,
                "versionTo");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "maxCount",
            this.maxCount);
        XMLStreamWriterHelper.writeElement(
            writer,
            "includeFiles",
            this.includeFiles);
        XMLStreamWriterHelper.writeElement(
            writer,
            "generateDownloadUrls",
            this.generateDownloadUrls);
        XMLStreamWriterHelper.writeElement(
            writer,
            "slotMode",
            this.slotMode);
        XMLStreamWriterHelper.writeElement(
            writer,
            "sortAscending",
            this.sortAscending);

        writer.writeEndElement();
    }
}
