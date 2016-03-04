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

import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._GetOperation;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_GetResponse;

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
public class _RepositorySoap_GetResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _GetOperation[][] getResult;

    public _RepositorySoap_GetResponse()
    {
        super();
    }

    public _RepositorySoap_GetResponse(final _GetOperation[][] getResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetResult(getResult);
    }

    public _GetOperation[][] getGetResult()
    {
        return this.getResult;
    }

    public void setGetResult(_GetOperation[][] value)
    {
        this.getResult = value;
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

                if (localName.equalsIgnoreCase("GetResult"))
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
                            /*
                             * The content type of this array is an array, so start another loop.
                             */
                            _GetOperation[] array0 = null;

                            int event1;
                            final List list1 = new ArrayList();

                            do
                            {
                                event1 = reader.nextTag();

                                if (event1 == XMLStreamConstants.START_ELEMENT)
                                {
                                    _GetOperation complexObject1 = new _GetOperation();
                                    complexObject1.readFromElement(reader);
                                    list1.add(complexObject1);
                                }
                            }
                            while (event1 != XMLStreamConstants.END_ELEMENT);

                            array0 = (_GetOperation[]) list1.toArray(new _GetOperation[list1.size()]);

                            list0.add(array0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    /*
                     * The correct size for multi-dimensional arrays is hard to calculate in the generator because
                     * of its recursive nature, so let Java do it for us.
                     */
                    this.getResult = (_GetOperation[][]) list0.toArray(new _GetOperation[0][0]);
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
