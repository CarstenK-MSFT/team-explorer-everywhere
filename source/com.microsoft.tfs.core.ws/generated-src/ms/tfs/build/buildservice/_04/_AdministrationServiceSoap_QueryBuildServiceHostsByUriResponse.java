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

import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildServiceHostsByUriResponse;
import ms.tfs.build.buildservice._04._AgentStatus;
import ms.tfs.build.buildservice._04._BuildAgent;
import ms.tfs.build.buildservice._04._BuildController;
import ms.tfs.build.buildservice._04._BuildServiceHost;
import ms.tfs.build.buildservice._04._BuildServiceHostQueryResult;
import ms.tfs.build.buildservice._04._ControllerStatus;
import ms.tfs.build.buildservice._04._PropertyValue;
import ms.tfs.build.buildservice._04._ServiceHostStatus;

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
public class _AdministrationServiceSoap_QueryBuildServiceHostsByUriResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _BuildServiceHostQueryResult queryBuildServiceHostsByUriResult;

    public _AdministrationServiceSoap_QueryBuildServiceHostsByUriResponse()
    {
        super();
    }

    public _AdministrationServiceSoap_QueryBuildServiceHostsByUriResponse(
        final _BuildServiceHostQueryResult queryBuildServiceHostsByUriResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryBuildServiceHostsByUriResult(queryBuildServiceHostsByUriResult);
    }

    public _BuildServiceHostQueryResult getQueryBuildServiceHostsByUriResult()
    {
        return this.queryBuildServiceHostsByUriResult;
    }

    public void setQueryBuildServiceHostsByUriResult(_BuildServiceHostQueryResult value)
    {
        this.queryBuildServiceHostsByUriResult = value;
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

                if (localName.equalsIgnoreCase("QueryBuildServiceHostsByUriResult"))
                {
                    this.queryBuildServiceHostsByUriResult = new _BuildServiceHostQueryResult();
                    this.queryBuildServiceHostsByUriResult.readFromElement(reader);
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
