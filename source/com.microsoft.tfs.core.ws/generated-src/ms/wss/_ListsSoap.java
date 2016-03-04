// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.wss;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.types.AnyContentType;

import ms.wss._ListsSoap_AddAttachment;
import ms.wss._ListsSoap_AddAttachmentResponse;
import ms.wss._ListsSoap_AddDiscussionBoardItem;
import ms.wss._ListsSoap_AddDiscussionBoardItemResponse;
import ms.wss._ListsSoap_AddList;
import ms.wss._ListsSoap_AddListFromFeature;
import ms.wss._ListsSoap_AddListFromFeatureResponse;
import ms.wss._ListsSoap_AddListResponse;
import ms.wss._ListsSoap_AddWikiPage;
import ms.wss._ListsSoap_AddWikiPageResponse;
import ms.wss._ListsSoap_ApplyContentTypeToList;
import ms.wss._ListsSoap_ApplyContentTypeToListResponse;
import ms.wss._ListsSoap_CheckInFile;
import ms.wss._ListsSoap_CheckInFileResponse;
import ms.wss._ListsSoap_CheckOutFile;
import ms.wss._ListsSoap_CheckOutFileResponse;
import ms.wss._ListsSoap_CreateContentType;
import ms.wss._ListsSoap_CreateContentTypeResponse;
import ms.wss._ListsSoap_DeleteAttachment;
import ms.wss._ListsSoap_DeleteAttachmentResponse;
import ms.wss._ListsSoap_DeleteContentType;
import ms.wss._ListsSoap_DeleteContentTypeResponse;
import ms.wss._ListsSoap_DeleteContentTypeXmlDocument;
import ms.wss._ListsSoap_DeleteContentTypeXmlDocumentResponse;
import ms.wss._ListsSoap_DeleteList;
import ms.wss._ListsSoap_DeleteListResponse;
import ms.wss._ListsSoap_GetAttachmentCollection;
import ms.wss._ListsSoap_GetAttachmentCollectionResponse;
import ms.wss._ListsSoap_GetList;
import ms.wss._ListsSoap_GetListAndView;
import ms.wss._ListsSoap_GetListAndViewResponse;
import ms.wss._ListsSoap_GetListCollection;
import ms.wss._ListsSoap_GetListCollectionResponse;
import ms.wss._ListsSoap_GetListContentType;
import ms.wss._ListsSoap_GetListContentTypeResponse;
import ms.wss._ListsSoap_GetListContentTypes;
import ms.wss._ListsSoap_GetListContentTypesAndProperties;
import ms.wss._ListsSoap_GetListContentTypesAndPropertiesResponse;
import ms.wss._ListsSoap_GetListContentTypesResponse;
import ms.wss._ListsSoap_GetListItemChanges;
import ms.wss._ListsSoap_GetListItemChangesResponse;
import ms.wss._ListsSoap_GetListItemChangesSinceToken;
import ms.wss._ListsSoap_GetListItemChangesSinceTokenResponse;
import ms.wss._ListsSoap_GetListItemChangesWithKnowledge;
import ms.wss._ListsSoap_GetListItemChangesWithKnowledgeResponse;
import ms.wss._ListsSoap_GetListItems;
import ms.wss._ListsSoap_GetListItemsResponse;
import ms.wss._ListsSoap_GetListResponse;
import ms.wss._ListsSoap_GetVersionCollection;
import ms.wss._ListsSoap_GetVersionCollectionResponse;
import ms.wss._ListsSoap_UndoCheckOut;
import ms.wss._ListsSoap_UndoCheckOutResponse;
import ms.wss._ListsSoap_UpdateContentType;
import ms.wss._ListsSoap_UpdateContentTypeResponse;
import ms.wss._ListsSoap_UpdateContentTypeXmlDocument;
import ms.wss._ListsSoap_UpdateContentTypeXmlDocumentResponse;
import ms.wss._ListsSoap_UpdateContentTypesXmlDocument;
import ms.wss._ListsSoap_UpdateContentTypesXmlDocumentResponse;
import ms.wss._ListsSoap_UpdateList;
import ms.wss._ListsSoap_UpdateListItems;
import ms.wss._ListsSoap_UpdateListItemsResponse;
import ms.wss._ListsSoap_UpdateListItemsWithKnowledge;
import ms.wss._ListsSoap_UpdateListItemsWithKnowledgeResponse;
import ms.wss._ListsSoap_UpdateListResponse;

import java.lang.String;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/sharepoint/soap/}ListsSoap
 */
public interface _ListsSoap
{
    public AnyContentType getList(
        final String listName,
        final AnyContentType _out_getListResult)
        throws TransportException, SOAPFault;

    public AnyContentType getListAndView(
        final String listName,
        final String viewName,
        final AnyContentType _out_getListAndViewResult)
        throws TransportException, SOAPFault;

    public void deleteList(final String listName)
        throws TransportException, SOAPFault;

    public AnyContentType addList(
        final String listName,
        final String description,
        final int templateID,
        final AnyContentType _out_addListResult)
        throws TransportException, SOAPFault;

    public AnyContentType addListFromFeature(
        final String listName,
        final String description,
        final String featureID,
        final int templateID,
        final AnyContentType _out_addListFromFeatureResult)
        throws TransportException, SOAPFault;

    public AnyContentType updateList(
        final String listName,
        final AnyContentType listProperties,
        final AnyContentType newFields,
        final AnyContentType updateFields,
        final AnyContentType deleteFields,
        final String listVersion,
        final AnyContentType _out_updateListResult)
        throws TransportException, SOAPFault;

    public AnyContentType getListCollection(final AnyContentType _out_getListCollectionResult)
        throws TransportException, SOAPFault;

    public AnyContentType getListItems(
        final String listName,
        final String viewName,
        final AnyContentType query,
        final AnyContentType viewFields,
        final String rowLimit,
        final AnyContentType queryOptions,
        final String webID,
        final AnyContentType _out_getListItemsResult)
        throws TransportException, SOAPFault;

    public AnyContentType getListItemChanges(
        final String listName,
        final AnyContentType viewFields,
        final String since,
        final AnyContentType contains,
        final AnyContentType _out_getListItemChangesResult)
        throws TransportException, SOAPFault;

    public AnyContentType getListItemChangesWithKnowledge(
        final String listName,
        final String viewName,
        final AnyContentType query,
        final AnyContentType viewFields,
        final String rowLimit,
        final AnyContentType queryOptions,
        final String syncScope,
        final AnyContentType knowledge,
        final AnyContentType contains,
        final AnyContentType _out_getListItemChangesWithKnowledgeResult)
        throws TransportException, SOAPFault;

    public AnyContentType getListItemChangesSinceToken(
        final String listName,
        final String viewName,
        final AnyContentType query,
        final AnyContentType viewFields,
        final String rowLimit,
        final AnyContentType queryOptions,
        final String changeToken,
        final AnyContentType contains,
        final AnyContentType _out_getListItemChangesSinceTokenResult)
        throws TransportException, SOAPFault;

    public AnyContentType updateListItems(
        final String listName,
        final AnyContentType updates,
        final AnyContentType _out_updateListItemsResult)
        throws TransportException, SOAPFault;

    public AnyContentType updateListItemsWithKnowledge(
        final String listName,
        final AnyContentType updates,
        final String syncScope,
        final AnyContentType knowledge,
        final AnyContentType _out_updateListItemsWithKnowledgeResult)
        throws TransportException, SOAPFault;

    public AnyContentType addDiscussionBoardItem(
        final String listName,
        final byte[] message,
        final AnyContentType _out_addDiscussionBoardItemResult)
        throws TransportException, SOAPFault;

    public AnyContentType addWikiPage(
        final String strListName,
        final String listRelPageUrl,
        final String wikiContent,
        final AnyContentType _out_addWikiPageResult)
        throws TransportException, SOAPFault;

    public AnyContentType getVersionCollection(
        final String strlistID,
        final String strlistItemID,
        final String strFieldName,
        final AnyContentType _out_getVersionCollectionResult)
        throws TransportException, SOAPFault;

    public String addAttachment(
        final String listName,
        final String listItemID,
        final String fileName,
        final byte[] attachment)
        throws TransportException, SOAPFault;

    public AnyContentType getAttachmentCollection(
        final String listName,
        final String listItemID,
        final AnyContentType _out_getAttachmentCollectionResult)
        throws TransportException, SOAPFault;

    public void deleteAttachment(
        final String listName,
        final String listItemID,
        final String url)
        throws TransportException, SOAPFault;

    public boolean checkOutFile(
        final String pageUrl,
        final String checkoutToLocal,
        final String lastmodified)
        throws TransportException, SOAPFault;

    public boolean undoCheckOut(final String pageUrl)
        throws TransportException, SOAPFault;

    public boolean checkInFile(
        final String pageUrl,
        final String comment,
        final String checkinType)
        throws TransportException, SOAPFault;

    public AnyContentType getListContentTypes(
        final String listName,
        final String contentTypeId,
        final AnyContentType _out_getListContentTypesResult)
        throws TransportException, SOAPFault;

    public AnyContentType getListContentTypesAndProperties(
        final String listName,
        final String contentTypeId,
        final String propertyPrefix,
        final boolean includeWebProperties,
        final AnyContentType _out_getListContentTypesAndPropertiesResult)
        throws TransportException, SOAPFault;

    public AnyContentType getListContentType(
        final String listName,
        final String contentTypeId,
        final AnyContentType _out_getListContentTypeResult)
        throws TransportException, SOAPFault;

    public String createContentType(
        final String listName,
        final String displayName,
        final String parentType,
        final AnyContentType fields,
        final AnyContentType contentTypeProperties,
        final String addToView)
        throws TransportException, SOAPFault;

    public AnyContentType updateContentType(
        final String listName,
        final String contentTypeId,
        final AnyContentType contentTypeProperties,
        final AnyContentType newFields,
        final AnyContentType updateFields,
        final AnyContentType deleteFields,
        final String addToView,
        final AnyContentType _out_updateContentTypeResult)
        throws TransportException, SOAPFault;

    public AnyContentType deleteContentType(
        final String listName,
        final String contentTypeId,
        final AnyContentType _out_deleteContentTypeResult)
        throws TransportException, SOAPFault;

    public AnyContentType updateContentTypeXmlDocument(
        final String listName,
        final String contentTypeId,
        final AnyContentType newDocument,
        final AnyContentType _out_updateContentTypeXmlDocumentResult)
        throws TransportException, SOAPFault;

    public AnyContentType updateContentTypesXmlDocument(
        final String listName,
        final AnyContentType newDocument,
        final AnyContentType _out_updateContentTypesXmlDocumentResult)
        throws TransportException, SOAPFault;

    public AnyContentType deleteContentTypeXmlDocument(
        final String listName,
        final String contentTypeId,
        final String documentUri,
        final AnyContentType _out_deleteContentTypeXmlDocumentResult)
        throws TransportException, SOAPFault;

    public AnyContentType applyContentTypeToList(
        final String webUrl,
        final String contentTypeId,
        final String listName,
        final AnyContentType _out_applyContentTypeToListResult)
        throws TransportException, SOAPFault;
}
