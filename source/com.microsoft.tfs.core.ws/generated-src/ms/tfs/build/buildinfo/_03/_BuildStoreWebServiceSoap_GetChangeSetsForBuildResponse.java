// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_GetChangeSetsForBuildResponse;
import ms.tfs.build.buildinfo._03._ChangeSetData;

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
public class _BuildStoreWebServiceSoap_GetChangeSetsForBuildResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ChangeSetData[] getChangeSetsForBuildResult;

    public _BuildStoreWebServiceSoap_GetChangeSetsForBuildResponse()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_GetChangeSetsForBuildResponse(final _ChangeSetData[] getChangeSetsForBuildResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetChangeSetsForBuildResult(getChangeSetsForBuildResult);
    }

    public _ChangeSetData[] getGetChangeSetsForBuildResult()
    {
        return this.getChangeSetsForBuildResult;
    }

    public void setGetChangeSetsForBuildResult(_ChangeSetData[] value)
    {
        this.getChangeSetsForBuildResult = value;
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

                if (localName.equalsIgnoreCase("GetChangeSetsForBuildResult"))
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
                            _ChangeSetData complexObject0 = new _ChangeSetData();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.getChangeSetsForBuildResult = (_ChangeSetData[]) list0.toArray(
                            new _ChangeSetData[list0.size()]);
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
