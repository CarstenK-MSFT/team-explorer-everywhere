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

import ms.sql.reporting.reportingservices._CredentialRetrievalEnum;
import ms.sql.reporting.reportingservices._DataSource;
import ms.sql.reporting.reportingservices._DataSourceDefinition;
import ms.sql.reporting.reportingservices._DataSourceReference;
import ms.sql.reporting.reportingservices._InvalidDataSourceReference;

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
public class _DataSource
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String name;

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>InvalidDataSourceReference</code></li>
     * <li><code>DataSourceReference</code></li>
     * <li><code>DataSourceDefinition</code></li>
     * </ul>
     * </p>
     */
    protected _InvalidDataSourceReference invalidDataSourceReference;

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>InvalidDataSourceReference</code></li>
     * <li><code>DataSourceReference</code></li>
     * <li><code>DataSourceDefinition</code></li>
     * </ul>
     * </p>
     */
    protected _DataSourceReference dataSourceReference;

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>InvalidDataSourceReference</code></li>
     * <li><code>DataSourceReference</code></li>
     * <li><code>DataSourceDefinition</code></li>
     * </ul>
     * </p>
     */
    protected _DataSourceDefinition dataSourceDefinition;

    public _DataSource()
    {
        super();
    }

    public _DataSource(
        final String name,
        final _InvalidDataSourceReference invalidDataSourceReference,
        final _DataSourceReference dataSourceReference,
        final _DataSourceDefinition dataSourceDefinition)
    {
        // TODO : Call super() instead of setting all fields directly?
        setName(name);
        setInvalidDataSourceReference(invalidDataSourceReference);
        setDataSourceReference(dataSourceReference);
        setDataSourceDefinition(dataSourceDefinition);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String value)
    {
        this.name = value;
    }

    public _InvalidDataSourceReference getInvalidDataSourceReference()
    {
        return this.invalidDataSourceReference;
    }

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>InvalidDataSourceReference</code></li>
     * <li><code>DataSourceReference</code></li>
     * <li><code>DataSourceDefinition</code></li>
     * </ul>
     * </p>
     */
    public void setInvalidDataSourceReference(_InvalidDataSourceReference value)
    {
        this.invalidDataSourceReference = value;
    }

    public _DataSourceReference getDataSourceReference()
    {
        return this.dataSourceReference;
    }

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>InvalidDataSourceReference</code></li>
     * <li><code>DataSourceReference</code></li>
     * <li><code>DataSourceDefinition</code></li>
     * </ul>
     * </p>
     */
    public void setDataSourceReference(_DataSourceReference value)
    {
        this.dataSourceReference = value;
    }

    public _DataSourceDefinition getDataSourceDefinition()
    {
        return this.dataSourceDefinition;
    }

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>InvalidDataSourceReference</code></li>
     * <li><code>DataSourceReference</code></li>
     * <li><code>DataSourceDefinition</code></li>
     * </ul>
     * </p>
     */
    public void setDataSourceDefinition(_DataSourceDefinition value)
    {
        this.dataSourceDefinition = value;
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
            "Name",
            this.name);

        if (this.invalidDataSourceReference != null)
        {
            this.invalidDataSourceReference.writeAsElement(
                writer,
                "InvalidDataSourceReference");
        }

        if (this.dataSourceReference != null)
        {
            this.dataSourceReference.writeAsElement(
                writer,
                "DataSourceReference");
        }

        if (this.dataSourceDefinition != null)
        {
            this.dataSourceDefinition.writeAsElement(
                writer,
                "DataSourceDefinition");
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

                if (localName.equalsIgnoreCase("Name"))
                {
                    this.name = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("InvalidDataSourceReference"))
                {
                    this.invalidDataSourceReference = new _InvalidDataSourceReference();
                    this.invalidDataSourceReference.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("DataSourceReference"))
                {
                    this.dataSourceReference = new _DataSourceReference();
                    this.dataSourceReference.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("DataSourceDefinition"))
                {
                    this.dataSourceDefinition = new _DataSourceDefinition();
                    this.dataSourceDefinition.readFromElement(reader);
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
