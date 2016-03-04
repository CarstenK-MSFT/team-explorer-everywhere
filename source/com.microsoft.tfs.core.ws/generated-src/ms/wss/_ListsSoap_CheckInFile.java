// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.wss;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.wss._ListsSoap_CheckInFile;

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
public class _ListsSoap_CheckInFile
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String pageUrl;
    protected String comment;
    protected String checkinType;

    public _ListsSoap_CheckInFile()
    {
        super();
    }

    public _ListsSoap_CheckInFile(
        final String pageUrl,
        final String comment,
        final String checkinType)
    {
        // TODO : Call super() instead of setting all fields directly?
        setPageUrl(pageUrl);
        setComment(comment);
        setCheckinType(checkinType);
    }

    public String getPageUrl()
    {
        return this.pageUrl;
    }

    public void setPageUrl(String value)
    {
        this.pageUrl = value;
    }

    public String getComment()
    {
        return this.comment;
    }

    public void setComment(String value)
    {
        this.comment = value;
    }

    public String getCheckinType()
    {
        return this.checkinType;
    }

    public void setCheckinType(String value)
    {
        this.checkinType = value;
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
            "pageUrl",
            this.pageUrl);
        XMLStreamWriterHelper.writeElement(
            writer,
            "comment",
            this.comment);
        XMLStreamWriterHelper.writeElement(
            writer,
            "CheckinType",
            this.checkinType);

        writer.writeEndElement();
    }
}
