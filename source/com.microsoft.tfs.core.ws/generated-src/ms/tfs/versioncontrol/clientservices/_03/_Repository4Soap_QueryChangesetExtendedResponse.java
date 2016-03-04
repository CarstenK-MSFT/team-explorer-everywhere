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

import ms.tfs.versioncontrol.clientservices._03._Change;
import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._Changeset;
import ms.tfs.versioncontrol.clientservices._03._CheckinNote;
import ms.tfs.versioncontrol.clientservices._03._CheckinNoteFieldValue;
import ms.tfs.versioncontrol.clientservices._03._Item;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._MergeSource;
import ms.tfs.versioncontrol.clientservices._03._PolicyFailureInfo;
import ms.tfs.versioncontrol.clientservices._03._PolicyOverrideInfo;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._Repository4Soap_QueryChangesetExtendedResponse;

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
public class _Repository4Soap_QueryChangesetExtendedResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _Changeset queryChangesetExtendedResult;

    public _Repository4Soap_QueryChangesetExtendedResponse()
    {
        super();
    }

    public _Repository4Soap_QueryChangesetExtendedResponse(final _Changeset queryChangesetExtendedResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryChangesetExtendedResult(queryChangesetExtendedResult);
    }

    public _Changeset getQueryChangesetExtendedResult()
    {
        return this.queryChangesetExtendedResult;
    }

    public void setQueryChangesetExtendedResult(_Changeset value)
    {
        this.queryChangesetExtendedResult = value;
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

                if (localName.equalsIgnoreCase("QueryChangesetExtendedResult"))
                {
                    this.queryChangesetExtendedResult = new _Changeset();
                    this.queryChangesetExtendedResult.readFromElement(reader);
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
