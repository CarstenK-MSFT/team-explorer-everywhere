// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_GetCodeCoverageForBuild;

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
public class _BuildStoreWebServiceSoap_GetCodeCoverageForBuild
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String buildUri;
    protected String platform;
    protected String flavor;

    public _BuildStoreWebServiceSoap_GetCodeCoverageForBuild()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_GetCodeCoverageForBuild(
        final String buildUri,
        final String platform,
        final String flavor)
    {
        // TODO : Call super() instead of setting all fields directly?
        setBuildUri(buildUri);
        setPlatform(platform);
        setFlavor(flavor);
    }

    public String getBuildUri()
    {
        return this.buildUri;
    }

    public void setBuildUri(String value)
    {
        this.buildUri = value;
    }

    public String getPlatform()
    {
        return this.platform;
    }

    public void setPlatform(String value)
    {
        this.platform = value;
    }

    public String getFlavor()
    {
        return this.flavor;
    }

    public void setFlavor(String value)
    {
        this.flavor = value;
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
            "buildUri",
            this.buildUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "platform",
            this.platform);
        XMLStreamWriterHelper.writeElement(
            writer,
            "flavor",
            this.flavor);

        writer.writeEndElement();
    }
}
