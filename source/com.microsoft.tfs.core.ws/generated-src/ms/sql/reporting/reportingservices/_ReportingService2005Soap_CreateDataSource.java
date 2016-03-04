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
import ms.sql.reporting.reportingservices._DataSourceDefinition;
import ms.sql.reporting.reportingservices._Property;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_CreateDataSource;

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
public class _ReportingService2005Soap_CreateDataSource
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String dataSource;
    protected String parent;
    protected boolean overwrite;
    protected _DataSourceDefinition definition;
    protected _Property[] properties;

    public _ReportingService2005Soap_CreateDataSource()
    {
        super();
    }

    public _ReportingService2005Soap_CreateDataSource(
        final String dataSource,
        final String parent,
        final boolean overwrite,
        final _DataSourceDefinition definition,
        final _Property[] properties)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDataSource(dataSource);
        setParent(parent);
        setOverwrite(overwrite);
        setDefinition(definition);
        setProperties(properties);
    }

    public String getDataSource()
    {
        return this.dataSource;
    }

    public void setDataSource(String value)
    {
        this.dataSource = value;
    }

    public String getParent()
    {
        return this.parent;
    }

    public void setParent(String value)
    {
        this.parent = value;
    }

    public boolean isOverwrite()
    {
        return this.overwrite;
    }

    public void setOverwrite(boolean value)
    {
        this.overwrite = value;
    }

    public _DataSourceDefinition getDefinition()
    {
        return this.definition;
    }

    public void setDefinition(_DataSourceDefinition value)
    {
        this.definition = value;
    }

    public _Property[] getProperties()
    {
        return this.properties;
    }

    public void setProperties(_Property[] value)
    {
        this.properties = value;
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
            "DataSource",
            this.dataSource);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Parent",
            this.parent);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Overwrite",
            this.overwrite);

        if (this.definition != null)
        {
            this.definition.writeAsElement(
                writer,
                "Definition");
        }

        if (this.properties != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Properties");

            for (int iterator0 = 0; iterator0 < this.properties.length; iterator0++)
            {
                this.properties[iterator0].writeAsElement(
                    writer,
                    "Property");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
