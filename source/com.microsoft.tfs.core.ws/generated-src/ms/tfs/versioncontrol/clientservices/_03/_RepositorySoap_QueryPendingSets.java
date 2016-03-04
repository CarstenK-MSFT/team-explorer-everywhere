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
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryPendingSets;

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
public class _RepositorySoap_QueryPendingSets
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String localWorkspaceName;
    protected String localWorkspaceOwner;
    protected String queryWorkspaceName;
    protected String ownerName;
    protected _ItemSpec[] itemSpecs;
    protected boolean generateDownloadUrls;

    public _RepositorySoap_QueryPendingSets()
    {
        super();
    }

    public _RepositorySoap_QueryPendingSets(
        final String localWorkspaceName,
        final String localWorkspaceOwner,
        final String queryWorkspaceName,
        final String ownerName,
        final _ItemSpec[] itemSpecs,
        final boolean generateDownloadUrls)
    {
        // TODO : Call super() instead of setting all fields directly?
        setLocalWorkspaceName(localWorkspaceName);
        setLocalWorkspaceOwner(localWorkspaceOwner);
        setQueryWorkspaceName(queryWorkspaceName);
        setOwnerName(ownerName);
        setItemSpecs(itemSpecs);
        setGenerateDownloadUrls(generateDownloadUrls);
    }

    public String getLocalWorkspaceName()
    {
        return this.localWorkspaceName;
    }

    public void setLocalWorkspaceName(String value)
    {
        this.localWorkspaceName = value;
    }

    public String getLocalWorkspaceOwner()
    {
        return this.localWorkspaceOwner;
    }

    public void setLocalWorkspaceOwner(String value)
    {
        this.localWorkspaceOwner = value;
    }

    public String getQueryWorkspaceName()
    {
        return this.queryWorkspaceName;
    }

    public void setQueryWorkspaceName(String value)
    {
        this.queryWorkspaceName = value;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public void setOwnerName(String value)
    {
        this.ownerName = value;
    }

    public _ItemSpec[] getItemSpecs()
    {
        return this.itemSpecs;
    }

    public void setItemSpecs(_ItemSpec[] value)
    {
        this.itemSpecs = value;
    }

    public boolean isGenerateDownloadUrls()
    {
        return this.generateDownloadUrls;
    }

    public void setGenerateDownloadUrls(boolean value)
    {
        this.generateDownloadUrls = value;
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
            "localWorkspaceName",
            this.localWorkspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "localWorkspaceOwner",
            this.localWorkspaceOwner);
        XMLStreamWriterHelper.writeElement(
            writer,
            "queryWorkspaceName",
            this.queryWorkspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "ownerName",
            this.ownerName);

        if (this.itemSpecs != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("itemSpecs");

            for (int iterator0 = 0; iterator0 < this.itemSpecs.length; iterator0++)
            {
                this.itemSpecs[iterator0].writeAsElement(
                    writer,
                    "ItemSpec");
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "generateDownloadUrls",
            this.generateDownloadUrls);

        writer.writeEndElement();
    }
}
