// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._IdentityManagementWebServiceSoap_RefreshIdentityResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _IdentityManagementWebServiceSoap_RefreshIdentityResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected boolean refreshIdentityResult;

    public _IdentityManagementWebServiceSoap_RefreshIdentityResponse()
    {
        super();
    }

    public _IdentityManagementWebServiceSoap_RefreshIdentityResponse(final boolean refreshIdentityResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setRefreshIdentityResult(refreshIdentityResult);
    }

    public boolean isRefreshIdentityResult()
    {
        return this.refreshIdentityResult;
    }

    public void setRefreshIdentityResult(boolean value)
    {
        this.refreshIdentityResult = value;
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

                if (localName.equalsIgnoreCase("RefreshIdentityResult"))
                {
                    this.refreshIdentityResult = XMLConvert.toBoolean(reader.getElementText());
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
