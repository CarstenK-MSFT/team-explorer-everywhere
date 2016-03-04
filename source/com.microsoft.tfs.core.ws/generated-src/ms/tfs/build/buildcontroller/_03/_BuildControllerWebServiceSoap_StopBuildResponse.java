// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildcontroller._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_StopBuildResponse;

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
public class _BuildControllerWebServiceSoap_StopBuildResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected boolean stopBuildResult;
    protected String failureMessage;

    public _BuildControllerWebServiceSoap_StopBuildResponse()
    {
        super();
    }

    public _BuildControllerWebServiceSoap_StopBuildResponse(
        final boolean stopBuildResult,
        final String failureMessage)
    {
        // TODO : Call super() instead of setting all fields directly?
        setStopBuildResult(stopBuildResult);
        setFailureMessage(failureMessage);
    }

    public boolean isStopBuildResult()
    {
        return this.stopBuildResult;
    }

    public void setStopBuildResult(boolean value)
    {
        this.stopBuildResult = value;
    }

    public String getFailureMessage()
    {
        return this.failureMessage;
    }

    public void setFailureMessage(String value)
    {
        this.failureMessage = value;
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

                if (localName.equalsIgnoreCase("StopBuildResult"))
                {
                    this.stopBuildResult = XMLConvert.toBoolean(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("failureMessage"))
                {
                    this.failureMessage = reader.getElementText();
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
