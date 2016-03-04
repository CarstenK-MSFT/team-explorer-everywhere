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

import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_QueryLabels;
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
public class _Repository5Soap_QueryLabels
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String workspaceOwner;
    protected String labelName;
    protected String labelScope;
    protected String owner;
    protected String filterItem;
    protected _VersionSpec versionFilterItem;
    protected boolean includeItems;
    protected boolean generateDownloadUrls;
    protected int maxClientPathLength;

    public _Repository5Soap_QueryLabels()
    {
        super();
    }

    public _Repository5Soap_QueryLabels(
        final String workspaceName,
        final String workspaceOwner,
        final String labelName,
        final String labelScope,
        final String owner,
        final String filterItem,
        final _VersionSpec versionFilterItem,
        final boolean includeItems,
        final boolean generateDownloadUrls,
        final int maxClientPathLength)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setLabelName(labelName);
        setLabelScope(labelScope);
        setOwner(owner);
        setFilterItem(filterItem);
        setVersionFilterItem(versionFilterItem);
        setIncludeItems(includeItems);
        setGenerateDownloadUrls(generateDownloadUrls);
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

    public String getLabelName()
    {
        return this.labelName;
    }

    public void setLabelName(String value)
    {
        this.labelName = value;
    }

    public String getLabelScope()
    {
        return this.labelScope;
    }

    public void setLabelScope(String value)
    {
        this.labelScope = value;
    }

    public String getOwner()
    {
        return this.owner;
    }

    public void setOwner(String value)
    {
        this.owner = value;
    }

    public String getFilterItem()
    {
        return this.filterItem;
    }

    public void setFilterItem(String value)
    {
        this.filterItem = value;
    }

    public _VersionSpec getVersionFilterItem()
    {
        return this.versionFilterItem;
    }

    public void setVersionFilterItem(_VersionSpec value)
    {
        this.versionFilterItem = value;
    }

    public boolean isIncludeItems()
    {
        return this.includeItems;
    }

    public void setIncludeItems(boolean value)
    {
        this.includeItems = value;
    }

    public boolean isGenerateDownloadUrls()
    {
        return this.generateDownloadUrls;
    }

    public void setGenerateDownloadUrls(boolean value)
    {
        this.generateDownloadUrls = value;
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
        XMLStreamWriterHelper.writeElement(
            writer,
            "labelName",
            this.labelName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "labelScope",
            this.labelScope);
        XMLStreamWriterHelper.writeElement(
            writer,
            "owner",
            this.owner);
        XMLStreamWriterHelper.writeElement(
            writer,
            "filterItem",
            this.filterItem);

        if (this.versionFilterItem != null)
        {
            this.versionFilterItem.writeAsElement(
                writer,
                "versionFilterItem");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "includeItems",
            this.includeItems);
        XMLStreamWriterHelper.writeElement(
            writer,
            "generateDownloadUrls",
            this.generateDownloadUrls);
        XMLStreamWriterHelper.writeElement(
            writer,
            "maxClientPathLength",
            this.maxClientPathLength);

        writer.writeEndElement();
    }
}
