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

import ms.tfs.versioncontrol.clientservices._03._CheckinNote;
import ms.tfs.versioncontrol.clientservices._03._CheckinNoteFieldValue;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryShelvesetsResponse;
import ms.tfs.versioncontrol.clientservices._03._Shelveset;
import ms.tfs.versioncontrol.clientservices._03._VersionControlLink;

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
public class _Repository4Soap_QueryShelvesetsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _Shelveset[] queryShelvesetsResult;

    public _Repository4Soap_QueryShelvesetsResponse()
    {
        super();
    }

    public _Repository4Soap_QueryShelvesetsResponse(final _Shelveset[] queryShelvesetsResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryShelvesetsResult(queryShelvesetsResult);
    }

    public _Shelveset[] getQueryShelvesetsResult()
    {
        return this.queryShelvesetsResult;
    }

    public void setQueryShelvesetsResult(_Shelveset[] value)
    {
        this.queryShelvesetsResult = value;
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

                if (localName.equalsIgnoreCase("QueryShelvesetsResult"))
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
                            _Shelveset complexObject0 = new _Shelveset();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.queryShelvesetsResult = (_Shelveset[]) list0.toArray(new _Shelveset[list0.size()]);
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
