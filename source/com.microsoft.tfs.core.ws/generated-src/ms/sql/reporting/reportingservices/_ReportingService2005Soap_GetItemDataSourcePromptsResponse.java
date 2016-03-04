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

import ms.sql.reporting.reportingservices._DataSourcePrompt;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_GetItemDataSourcePromptsResponse;

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
public class _ReportingService2005Soap_GetItemDataSourcePromptsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _DataSourcePrompt[] dataSourcePrompts;

    public _ReportingService2005Soap_GetItemDataSourcePromptsResponse()
    {
        super();
    }

    public _ReportingService2005Soap_GetItemDataSourcePromptsResponse(final _DataSourcePrompt[] dataSourcePrompts)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDataSourcePrompts(dataSourcePrompts);
    }

    public _DataSourcePrompt[] getDataSourcePrompts()
    {
        return this.dataSourcePrompts;
    }

    public void setDataSourcePrompts(_DataSourcePrompt[] value)
    {
        this.dataSourcePrompts = value;
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

                if (localName.equalsIgnoreCase("DataSourcePrompts"))
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
                            _DataSourcePrompt complexObject0 = new _DataSourcePrompt();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.dataSourcePrompts = (_DataSourcePrompt[]) list0.toArray(new _DataSourcePrompt[list0.size()]);
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
