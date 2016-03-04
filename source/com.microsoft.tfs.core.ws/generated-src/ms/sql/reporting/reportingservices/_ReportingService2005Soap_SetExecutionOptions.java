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

import ms.sql.reporting.reportingservices._DailyRecurrence;
import ms.sql.reporting.reportingservices._DaysOfWeekSelector;
import ms.sql.reporting.reportingservices._ExecutionSettingEnum;
import ms.sql.reporting.reportingservices._MinuteRecurrence;
import ms.sql.reporting.reportingservices._MonthlyDOWRecurrence;
import ms.sql.reporting.reportingservices._MonthlyRecurrence;
import ms.sql.reporting.reportingservices._MonthsOfYearSelector;
import ms.sql.reporting.reportingservices._NoSchedule;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_SetExecutionOptions;
import ms.sql.reporting.reportingservices._ScheduleDefinition;
import ms.sql.reporting.reportingservices._ScheduleReference;
import ms.sql.reporting.reportingservices._WeekNumberEnum;
import ms.sql.reporting.reportingservices._WeeklyRecurrence;

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
public class _ReportingService2005Soap_SetExecutionOptions
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String report;
    protected _ExecutionSettingEnum executionSetting;

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>ScheduleReference</code></li>
     * <li><code>NoSchedule</code></li>
     * <li><code>ScheduleDefinition</code></li>
     * </ul>
     * </p>
     */
    protected _ScheduleReference scheduleReference;

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>ScheduleReference</code></li>
     * <li><code>NoSchedule</code></li>
     * <li><code>ScheduleDefinition</code></li>
     * </ul>
     * </p>
     */
    protected _NoSchedule noSchedule;

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>ScheduleReference</code></li>
     * <li><code>NoSchedule</code></li>
     * <li><code>ScheduleDefinition</code></li>
     * </ul>
     * </p>
     */
    protected _ScheduleDefinition scheduleDefinition;

    public _ReportingService2005Soap_SetExecutionOptions()
    {
        super();
    }

    public _ReportingService2005Soap_SetExecutionOptions(
        final String report,
        final _ExecutionSettingEnum executionSetting,
        final _ScheduleReference scheduleReference,
        final _NoSchedule noSchedule,
        final _ScheduleDefinition scheduleDefinition)
    {
        // TODO : Call super() instead of setting all fields directly?
        setReport(report);
        setExecutionSetting(executionSetting);
        setScheduleReference(scheduleReference);
        setNoSchedule(noSchedule);
        setScheduleDefinition(scheduleDefinition);
    }

    public String getReport()
    {
        return this.report;
    }

    public void setReport(String value)
    {
        this.report = value;
    }

    public _ExecutionSettingEnum getExecutionSetting()
    {
        return this.executionSetting;
    }

    public void setExecutionSetting(_ExecutionSettingEnum value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'ExecutionSetting' is a required element, its value cannot be null");
        }

        this.executionSetting = value;
    }

    public _ScheduleReference getScheduleReference()
    {
        return this.scheduleReference;
    }

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>ScheduleReference</code></li>
     * <li><code>NoSchedule</code></li>
     * <li><code>ScheduleDefinition</code></li>
     * </ul>
     * </p>
     */
    public void setScheduleReference(_ScheduleReference value)
    {
        this.scheduleReference = value;
    }

    public _NoSchedule getNoSchedule()
    {
        return this.noSchedule;
    }

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>ScheduleReference</code></li>
     * <li><code>NoSchedule</code></li>
     * <li><code>ScheduleDefinition</code></li>
     * </ul>
     * </p>
     */
    public void setNoSchedule(_NoSchedule value)
    {
        this.noSchedule = value;
    }

    public _ScheduleDefinition getScheduleDefinition()
    {
        return this.scheduleDefinition;
    }

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>ScheduleReference</code></li>
     * <li><code>NoSchedule</code></li>
     * <li><code>ScheduleDefinition</code></li>
     * </ul>
     * </p>
     */
    public void setScheduleDefinition(_ScheduleDefinition value)
    {
        this.scheduleDefinition = value;
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
        this.executionSetting.writeAsElement(
            writer,
            "ExecutionSetting");

        if (this.scheduleReference != null)
        {
            this.scheduleReference.writeAsElement(
                writer,
                "ScheduleReference");
        }

        if (this.noSchedule != null)
        {
            this.noSchedule.writeAsElement(
                writer,
                "NoSchedule");
        }

        if (this.scheduleDefinition != null)
        {
            this.scheduleDefinition.writeAsElement(
                writer,
                "ScheduleDefinition");
        }

        writer.writeEndElement();
    }
}
