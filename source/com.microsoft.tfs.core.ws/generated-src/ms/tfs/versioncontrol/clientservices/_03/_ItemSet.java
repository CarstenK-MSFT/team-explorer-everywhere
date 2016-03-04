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

import ms.tfs.versioncontrol.clientservices._03._Item;
import ms.tfs.versioncontrol.clientservices._03._ItemSet;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;

import java.lang.Object;
import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ItemSet
    extends _BaseItemSetOfItem
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // No elements    
    public _ItemSet()
    {
        super();
    }

    public _ItemSet(
        final String queryPath,
        final String pattern,
        final _Item[] items)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryPath(queryPath);
        setPattern(pattern);
        setItems(items);
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Declare our type
        writer.writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "ItemSet");

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "QueryPath",
            this.queryPath);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Pattern",
            this.pattern);

        if (this.items != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Items");

            for (int iterator0 = 0; iterator0 < this.items.length; iterator0++)
            {
                this.items[iterator0].writeAsElement(
                    writer,
                    "Item");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("QueryPath"))
                {
                    this.queryPath = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Pattern"))
                {
                    this.pattern = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Items"))
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
                            _Item complexObject0 = new _Item();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.items = (_Item[]) list0.toArray(new _Item[list0.size()]);
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
