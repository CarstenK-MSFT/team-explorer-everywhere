// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._CatalogNodeDependency;

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
public class _CatalogNodeDependency
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String fullPath;
    protected String associationKey;
    protected String requiredNodeFullPath;
    protected boolean isSingleton;

    // No elements    
    public _CatalogNodeDependency()
    {
        super();
    }

    public _CatalogNodeDependency(
        final String fullPath,
        final String associationKey,
        final String requiredNodeFullPath,
        final boolean isSingleton)
    {
        // TODO : Call super() instead of setting all fields directly?
        setFullPath(fullPath);
        setAssociationKey(associationKey);
        setRequiredNodeFullPath(requiredNodeFullPath);
        setIsSingleton(isSingleton);
    }

    public String getFullPath()
    {
        return this.fullPath;
    }

    public void setFullPath(final String value)
    {
        this.fullPath = value;
    }

    public String getAssociationKey()
    {
        return this.associationKey;
    }

    public void setAssociationKey(final String value)
    {
        this.associationKey = value;
    }

    public String getRequiredNodeFullPath()
    {
        return this.requiredNodeFullPath;
    }

    public void setRequiredNodeFullPath(final String value)
    {
        this.requiredNodeFullPath = value;
    }

    public boolean isIsSingleton()
    {
        return this.isSingleton;
    }

    public void setIsSingleton(final boolean value)
    {
        this.isSingleton = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "FullPath",
            this.fullPath);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "AssociationKey",
            this.associationKey);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "RequiredNodeFullPath",
            this.requiredNodeFullPath);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "IsSingleton",
            this.isSingleton);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("FullPath"))
            {
                this.fullPath = attributeValue;
            }
            else if (localName.equalsIgnoreCase("AssociationKey"))
            {
                this.associationKey = attributeValue;
            }
            else if (localName.equalsIgnoreCase("RequiredNodeFullPath"))
            {
                this.requiredNodeFullPath = attributeValue;
            }
            else if (localName.equalsIgnoreCase("IsSingleton"))
            {
                this.isSingleton = XMLConvert.toBoolean(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}
