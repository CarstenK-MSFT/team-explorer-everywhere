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
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryChangesForChangeset;

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
public class _RepositorySoap_QueryChangesForChangeset
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected int changesetId;
    protected boolean generateDownloadUrls;
    protected int pageSize;
    protected _ItemSpec lastItem;

    public _RepositorySoap_QueryChangesForChangeset()
    {
        super();
    }

    public _RepositorySoap_QueryChangesForChangeset(
        final int changesetId,
        final boolean generateDownloadUrls,
        final int pageSize,
        final _ItemSpec lastItem)
    {
        // TODO : Call super() instead of setting all fields directly?
        setChangesetId(changesetId);
        setGenerateDownloadUrls(generateDownloadUrls);
        setPageSize(pageSize);
        setLastItem(lastItem);
    }

    public int getChangesetId()
    {
        return this.changesetId;
    }

    public void setChangesetId(int value)
    {
        this.changesetId = value;
    }

    public boolean isGenerateDownloadUrls()
    {
        return this.generateDownloadUrls;
    }

    public void setGenerateDownloadUrls(boolean value)
    {
        this.generateDownloadUrls = value;
    }

    public int getPageSize()
    {
        return this.pageSize;
    }

    public void setPageSize(int value)
    {
        this.pageSize = value;
    }

    public _ItemSpec getLastItem()
    {
        return this.lastItem;
    }

    public void setLastItem(_ItemSpec value)
    {
        this.lastItem = value;
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
            "changesetId",
            this.changesetId);
        XMLStreamWriterHelper.writeElement(
            writer,
            "generateDownloadUrls",
            this.generateDownloadUrls);
        XMLStreamWriterHelper.writeElement(
            writer,
            "pageSize",
            this.pageSize);

        if (this.lastItem != null)
        {
            this.lastItem.writeAsElement(
                writer,
                "lastItem");
        }

        writer.writeEndElement();
    }
}
