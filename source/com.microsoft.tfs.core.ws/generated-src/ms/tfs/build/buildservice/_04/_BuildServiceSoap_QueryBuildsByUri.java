// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._BuildServiceSoap_QueryBuildsByUri;
import ms.tfs.build.buildservice._04._QueryDeletedOption;
import ms.tfs.build.buildservice._04._QueryOptions;

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
public class _BuildServiceSoap_QueryBuildsByUri
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String[] uris;
    protected String[] informationTypes;
    protected _QueryOptions options;
    protected _QueryDeletedOption deletedOption;

    public _BuildServiceSoap_QueryBuildsByUri()
    {
        super();
    }

    public _BuildServiceSoap_QueryBuildsByUri(
        final String[] uris,
        final String[] informationTypes,
        final _QueryOptions options,
        final _QueryDeletedOption deletedOption)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUris(uris);
        setInformationTypes(informationTypes);
        setOptions(options);
        setDeletedOption(deletedOption);
    }

    public String[] getUris()
    {
        return this.uris;
    }

    public void setUris(String[] value)
    {
        this.uris = value;
    }

    public String[] getInformationTypes()
    {
        return this.informationTypes;
    }

    public void setInformationTypes(String[] value)
    {
        this.informationTypes = value;
    }

    public _QueryOptions getOptions()
    {
        return this.options;
    }

    public void setOptions(_QueryOptions value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'options' is a required element, its value cannot be null");
        }

        this.options = value;
    }

    public _QueryDeletedOption getDeletedOption()
    {
        return this.deletedOption;
    }

    public void setDeletedOption(_QueryDeletedOption value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'deletedOption' is a required element, its value cannot be null");
        }

        this.deletedOption = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.uris != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("uris");

            for (int iterator0 = 0; iterator0 < this.uris.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.uris[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.informationTypes != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("informationTypes");

            for (int iterator0 = 0; iterator0 < this.informationTypes.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.informationTypes[iterator0]);
            }

            writer.writeEndElement();
        }

        this.options.writeAsElement(
            writer,
            "options");
        this.deletedOption.writeAsElement(
            writer,
            "deletedOption");

        writer.writeEndElement();
    }
}
