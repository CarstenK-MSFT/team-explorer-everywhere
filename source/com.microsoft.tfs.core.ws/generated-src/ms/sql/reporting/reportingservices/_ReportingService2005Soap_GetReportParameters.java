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

import ms.sql.reporting.reportingservices._DataSourceCredentials;
import ms.sql.reporting.reportingservices._ParameterValue;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_GetReportParameters;

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
public class _ReportingService2005Soap_GetReportParameters
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String report;
    protected String historyID;
    protected boolean forRendering;
    protected _ParameterValue[] values;
    protected _DataSourceCredentials[] credentials;

    public _ReportingService2005Soap_GetReportParameters()
    {
        super();
    }

    public _ReportingService2005Soap_GetReportParameters(
        final String report,
        final String historyID,
        final boolean forRendering,
        final _ParameterValue[] values,
        final _DataSourceCredentials[] credentials)
    {
        // TODO : Call super() instead of setting all fields directly?
        setReport(report);
        setHistoryID(historyID);
        setForRendering(forRendering);
        setValues(values);
        setCredentials(credentials);
    }

    public String getReport()
    {
        return this.report;
    }

    public void setReport(String value)
    {
        this.report = value;
    }

    public String getHistoryID()
    {
        return this.historyID;
    }

    public void setHistoryID(String value)
    {
        this.historyID = value;
    }

    public boolean isForRendering()
    {
        return this.forRendering;
    }

    public void setForRendering(boolean value)
    {
        this.forRendering = value;
    }

    public _ParameterValue[] getValues()
    {
        return this.values;
    }

    public void setValues(_ParameterValue[] value)
    {
        this.values = value;
    }

    public _DataSourceCredentials[] getCredentials()
    {
        return this.credentials;
    }

    public void setCredentials(_DataSourceCredentials[] value)
    {
        this.credentials = value;
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
            "Report",
            this.report);
        XMLStreamWriterHelper.writeElement(
            writer,
            "HistoryID",
            this.historyID);
        XMLStreamWriterHelper.writeElement(
            writer,
            "ForRendering",
            this.forRendering);

        if (this.values != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Values");

            for (int iterator0 = 0; iterator0 < this.values.length; iterator0++)
            {
                this.values[iterator0].writeAsElement(
                    writer,
                    "ParameterValue");
            }

            writer.writeEndElement();
        }

        if (this.credentials != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Credentials");

            for (int iterator0 = 0; iterator0 < this.credentials.length; iterator0++)
            {
                this.credentials[iterator0].writeAsElement(
                    writer,
                    "DataSourceCredentials");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
