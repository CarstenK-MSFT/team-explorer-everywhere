// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._AccessControlEntryData;
import ms.tfs.workitemtracking.clientservices._03._AccessControlEntryExtendedData;
import ms.tfs.workitemtracking.clientservices._03._AccessControlListMetadata;
import ms.tfs.workitemtracking.clientservices._03._ClientService3Soap_GetStoredQueryItemAccessControlListResponse;
import ms.tfs.workitemtracking.clientservices._03._ExtendedAccessControlListData;
import ms.tfs.workitemtracking.clientservices._03._IdentityDescriptorData;
import ms.tfs.workitemtracking.clientservices._03._RequiredPermissions;

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
public class _ClientService3Soap_GetStoredQueryItemAccessControlListResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ExtendedAccessControlListData getStoredQueryItemAccessControlListResult;

    public _ClientService3Soap_GetStoredQueryItemAccessControlListResponse()
    {
        super();
    }

    public _ClientService3Soap_GetStoredQueryItemAccessControlListResponse(
        final _ExtendedAccessControlListData getStoredQueryItemAccessControlListResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetStoredQueryItemAccessControlListResult(getStoredQueryItemAccessControlListResult);
    }

    public _ExtendedAccessControlListData getGetStoredQueryItemAccessControlListResult()
    {
        return this.getStoredQueryItemAccessControlListResult;
    }

    public void setGetStoredQueryItemAccessControlListResult(_ExtendedAccessControlListData value)
    {
        this.getStoredQueryItemAccessControlListResult = value;
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

                if (localName.equalsIgnoreCase("GetStoredQueryItemAccessControlListResult"))
                {
                    this.getStoredQueryItemAccessControlListResult = new _ExtendedAccessControlListData();
                    this.getStoredQueryItemAccessControlListResult.readFromElement(reader);
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
