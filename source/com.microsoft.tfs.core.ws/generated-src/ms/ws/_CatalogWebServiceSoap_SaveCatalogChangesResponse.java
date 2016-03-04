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
import ms.ws._CatalogWebServiceSoap_SaveCatalogChangesResponse;
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
public class _CatalogWebServiceSoap_SaveCatalogChangesResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _CatalogData saveCatalogChangesResult;

    public _CatalogWebServiceSoap_SaveCatalogChangesResponse()
    {
        super();
    }

    public _CatalogWebServiceSoap_SaveCatalogChangesResponse(final _CatalogData saveCatalogChangesResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSaveCatalogChangesResult(saveCatalogChangesResult);
    }

    public _CatalogData getSaveCatalogChangesResult()
    {
        return this.saveCatalogChangesResult;
    }

    public void setSaveCatalogChangesResult(_CatalogData value)
    {
        this.saveCatalogChangesResult = value;
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

                if (localName.equalsIgnoreCase("SaveCatalogChangesResult"))
                {
                    this.saveCatalogChangesResult = new _CatalogData();
                    this.saveCatalogChangesResult.readFromElement(reader);
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
