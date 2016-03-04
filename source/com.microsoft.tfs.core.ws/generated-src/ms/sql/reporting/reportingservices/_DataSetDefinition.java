// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._DataSetDefinition;
import ms.sql.reporting.reportingservices._Field;
import ms.sql.reporting.reportingservices._QueryDefinition;
import ms.sql.reporting.reportingservices._SensitivityEnum;

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
public class _DataSetDefinition
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected _Field[] fields;
    protected _QueryDefinition query;
    protected _SensitivityEnum caseSensitivity;
    protected String collation;
    protected _SensitivityEnum accentSensitivity;
    protected _SensitivityEnum kanatypeSensitivity;
    protected _SensitivityEnum widthSensitivity;
    protected String name;

    public _DataSetDefinition()
    {
        super();
    }

    public _DataSetDefinition(
        final _Field[] fields,
        final _QueryDefinition query,
        final _SensitivityEnum caseSensitivity,
        final String collation,
        final _SensitivityEnum accentSensitivity,
        final _SensitivityEnum kanatypeSensitivity,
        final _SensitivityEnum widthSensitivity,
        final String name)
    {
        // TODO : Call super() instead of setting all fields directly?
        setFields(fields);
        setQuery(query);
        setCaseSensitivity(caseSensitivity);
        setCollation(collation);
        setAccentSensitivity(accentSensitivity);
        setKanatypeSensitivity(kanatypeSensitivity);
        setWidthSensitivity(widthSensitivity);
        setName(name);
    }

    public _Field[] getFields()
    {
        return this.fields;
    }

    public void setFields(_Field[] value)
    {
        this.fields = value;
    }

    public _QueryDefinition getQuery()
    {
        return this.query;
    }

    public void setQuery(_QueryDefinition value)
    {
        this.query = value;
    }

    public _SensitivityEnum getCaseSensitivity()
    {
        return this.caseSensitivity;
    }

    public void setCaseSensitivity(_SensitivityEnum value)
    {
        this.caseSensitivity = value;
    }

    public String getCollation()
    {
        return this.collation;
    }

    public void setCollation(String value)
    {
        this.collation = value;
    }

    public _SensitivityEnum getAccentSensitivity()
    {
        return this.accentSensitivity;
    }

    public void setAccentSensitivity(_SensitivityEnum value)
    {
        this.accentSensitivity = value;
    }

    public _SensitivityEnum getKanatypeSensitivity()
    {
        return this.kanatypeSensitivity;
    }

    public void setKanatypeSensitivity(_SensitivityEnum value)
    {
        this.kanatypeSensitivity = value;
    }

    public _SensitivityEnum getWidthSensitivity()
    {
        return this.widthSensitivity;
    }

    public void setWidthSensitivity(_SensitivityEnum value)
    {
        this.widthSensitivity = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String value)
    {
        this.name = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

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
                    "Field");
            }

            writer.writeEndElement();
        }

        if (this.query != null)
        {
            this.query.writeAsElement(
                writer,
                "Query");
        }

        if (this.caseSensitivity != null)
        {
            this.caseSensitivity.writeAsElement(
                writer,
                "CaseSensitivity");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "Collation",
            this.collation);

        if (this.accentSensitivity != null)
        {
            this.accentSensitivity.writeAsElement(
                writer,
                "AccentSensitivity");
        }

        if (this.kanatypeSensitivity != null)
        {
            this.kanatypeSensitivity.writeAsElement(
                writer,
                "KanatypeSensitivity");
        }

        if (this.widthSensitivity != null)
        {
            this.widthSensitivity.writeAsElement(
                writer,
                "WidthSensitivity");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "Name",
            this.name);

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
                            _Field complexObject0 = new _Field();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.fields = (_Field[]) list0.toArray(new _Field[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("Query"))
                {
                    this.query = new _QueryDefinition();
                    this.query.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("CaseSensitivity"))
                {
                    this.caseSensitivity = _SensitivityEnum.fromString(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("Collation"))
                {
                    this.collation = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("AccentSensitivity"))
                {
                    this.accentSensitivity = _SensitivityEnum.fromString(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("KanatypeSensitivity"))
                {
                    this.kanatypeSensitivity = _SensitivityEnum.fromString(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("WidthSensitivity"))
                {
                    this.widthSensitivity = _SensitivityEnum.fromString(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("Name"))
                {
                    this.name = reader.getElementText();
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
