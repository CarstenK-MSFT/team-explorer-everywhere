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

import ms.tfs.build.buildservice._04._BuildDefinitionSourceProvider;
import ms.tfs.build.buildservice._04._DefinitionTriggerType;
import ms.tfs.build.buildservice._04._NameValueField;

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
public class _BuildDefinitionSourceProvider
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String name;
    protected _DefinitionTriggerType supportedTriggerTypes;

    // Elements
    protected _NameValueField[] fields;

    public _BuildDefinitionSourceProvider()
    {
        super();
    }

    public _BuildDefinitionSourceProvider(
        final String name,
        final _DefinitionTriggerType supportedTriggerTypes,
        final _NameValueField[] fields)
    {
        // TODO : Call super() instead of setting all fields directly?
        setName(name);
        setSupportedTriggerTypes(supportedTriggerTypes);
        setFields(fields);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(final String value)
    {
        this.name = value;
    }

    public _DefinitionTriggerType getSupportedTriggerTypes()
    {
        return this.supportedTriggerTypes;
    }

    public void setSupportedTriggerTypes(final _DefinitionTriggerType value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException(
                    "'SupportedTriggerTypes' is a required attribute, its value cannot be null");
        }

        this.supportedTriggerTypes = value;
    }

    public _NameValueField[] getFields()
    {
        return this.fields;
    }

    public void setFields(_NameValueField[] value)
    {
        this.fields = value;
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
            "Name",
            this.name);
        this.supportedTriggerTypes.writeAsAttribute(
            writer,
            "SupportedTriggerTypes");

        // Elements
        if (this.fields != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Fields");

            for (int iterator0 = 0; iterator0 < this.fields.length; iterator0++)
            {
                this.fields[iterator0].writeAsElement(
                    writer,
                    "NameValueField");
            }

            writer.writeEndElement();
        }

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

            if (localName.equalsIgnoreCase("Name"))
            {
                this.name = attributeValue;
            }
            else if (localName.equalsIgnoreCase("SupportedTriggerTypes"))
            {
                this.supportedTriggerTypes = new _DefinitionTriggerType();
                this.supportedTriggerTypes.readFromAttribute(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Fields"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _NameValueField complexObject0 = new _NameValueField();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.fields = (_NameValueField[]) list0.toArray(new _NameValueField[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
