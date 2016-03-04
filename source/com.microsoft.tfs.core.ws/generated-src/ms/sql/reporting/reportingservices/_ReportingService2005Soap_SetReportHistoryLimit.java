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

import ms.sql.reporting.reportingservices._ReportingService2005Soap_SetReportHistoryLimit;

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
public class _ReportingService2005Soap_SetReportHistoryLimit
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String report;
    protected boolean useSystem;
    protected int historyLimit;

    public _ReportingService2005Soap_SetReportHistoryLimit()
    {
        super();
    }

    public _ReportingService2005Soap_SetReportHistoryLimit(
        final String report,
        final boolean useSystem,
        final int historyLimit)
    {
        // TODO : Call super() instead of setting all fields directly?
        setReport(report);
        setUseSystem(useSystem);
        setHistoryLimit(historyLimit);
    }

    public String getReport()
    {
        return this.report;
    }

    public void setReport(String value)
    {
        this.report = value;
    }

    public boolean isUseSystem()
    {
        return this.useSystem;
    }

    public void setUseSystem(boolean value)
    {
        this.useSystem = value;
    }

    public int getHistoryLimit()
    {
        return this.historyLimit;
    }

    public void setHistoryLimit(int value)
    {
        this.historyLimit = value;
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
            "UseSystem",
            this.useSystem);
        XMLStreamWriterHelper.writeElement(
            writer,
            "HistoryLimit",
            this.historyLimit);

        writer.writeEndElement();
    }
}
