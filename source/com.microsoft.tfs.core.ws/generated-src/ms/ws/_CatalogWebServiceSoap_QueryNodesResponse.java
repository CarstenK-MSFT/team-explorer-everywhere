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

import ms.ws._CatalogData;
import ms.ws._CatalogNode;
import ms.ws._CatalogNodeDependency;
import ms.ws._CatalogResource;
import ms.ws._CatalogResourceType;
import ms.ws._CatalogServiceReference;
import ms.ws._CatalogWebServiceSoap_QueryNodesResponse;
import ms.ws._KeyValueOfStringString;
import ms.ws._LocationMapping;
import ms.ws._ServiceDefinition;

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
public class _CatalogWebServiceSoap_QueryNodesResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _CatalogData queryNodesResult;

    public _CatalogWebServiceSoap_QueryNodesResponse()
    {
        super();
    }

    public _CatalogWebServiceSoap_QueryNodesResponse(final _CatalogData queryNodesResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryNodesResult(queryNodesResult);
    }

    public _CatalogData getQueryNodesResult()
    {
        return this.queryNodesResult;
    }

    public void setQueryNodesResult(_CatalogData value)
    {
        this.queryNodesResult = value;
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

                if (localName.equalsIgnoreCase("QueryNodesResult"))
                {
                    this.queryNodesResult = new _CatalogData();
                    this.queryNodesResult.readFromElement(reader);
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
