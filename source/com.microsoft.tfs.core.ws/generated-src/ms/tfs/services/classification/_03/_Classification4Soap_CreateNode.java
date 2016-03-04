// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.classification._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.classification._03._Classification4Soap_CreateNode;

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
public class _Classification4Soap_CreateNode
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String nodeName;
    protected String parentNodeUri;

    public _Classification4Soap_CreateNode()
    {
        super();
    }

    public _Classification4Soap_CreateNode(
        final String nodeName,
        final String parentNodeUri)
    {
        // TODO : Call super() instead of setting all fields directly?
        setNodeName(nodeName);
        setParentNodeUri(parentNodeUri);
    }

    public String getNodeName()
    {
        return this.nodeName;
    }

    public void setNodeName(String value)
    {
        this.nodeName = value;
    }

    public String getParentNodeUri()
    {
        return this.parentNodeUri;
    }

    public void setParentNodeUri(String value)
    {
        this.parentNodeUri = value;
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
            "nodeName",
            this.nodeName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "parentNodeUri",
            this.parentNodeUri);

        writer.writeEndElement();
    }
}
