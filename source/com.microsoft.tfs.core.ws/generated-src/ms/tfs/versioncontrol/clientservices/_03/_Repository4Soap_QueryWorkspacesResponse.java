// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryWorkspacesResponse;
import ms.tfs.versioncontrol.clientservices._03._WorkingFolder;
import ms.tfs.versioncontrol.clientservices._03._WorkingFolderType;
import ms.tfs.versioncontrol.clientservices._03._Workspace;

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
public class _Repository4Soap_QueryWorkspacesResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _Workspace[] queryWorkspacesResult;

    public _Repository4Soap_QueryWorkspacesResponse()
    {
        super();
    }

    public _Repository4Soap_QueryWorkspacesResponse(final _Workspace[] queryWorkspacesResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryWorkspacesResult(queryWorkspacesResult);
    }

    public _Workspace[] getQueryWorkspacesResult()
    {
        return this.queryWorkspacesResult;
    }

    public void setQueryWorkspacesResult(_Workspace[] value)
    {
        this.queryWorkspacesResult = value;
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

                if (localName.equalsIgnoreCase("QueryWorkspacesResult"))
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
                            _Workspace complexObject0 = new _Workspace();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.queryWorkspacesResult = (_Workspace[]) list0.toArray(new _Workspace[list0.size()]);
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
