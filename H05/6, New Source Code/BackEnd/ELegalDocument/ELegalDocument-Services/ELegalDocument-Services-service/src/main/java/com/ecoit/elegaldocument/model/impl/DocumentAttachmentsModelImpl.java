/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ecoit.elegaldocument.model.impl;

import com.ecoit.elegaldocument.model.DocumentAttachments;
import com.ecoit.elegaldocument.model.DocumentAttachmentsModel;
import com.ecoit.elegaldocument.model.DocumentAttachmentsSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the DocumentAttachments service. Represents a row in the &quot;ecoit_doc_DocumentAttachments&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>DocumentAttachmentsModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocumentAttachmentsImpl}.
 * </p>
 *
 * @author Liverpool
 * @see DocumentAttachmentsImpl
 * @generated
 */
@JSON(strict = true)
public class DocumentAttachmentsModelImpl
	extends BaseModelImpl<DocumentAttachments>
	implements DocumentAttachmentsModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a document attachments model instance should use the <code>DocumentAttachments</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_doc_DocumentAttachments";

	public static final Object[][] TABLE_COLUMNS = {
		{"attachmentId", Types.BIGINT}, {"docId", Types.BIGINT},
		{"view", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("attachmentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("docId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("view", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_doc_DocumentAttachments (attachmentId LONG not null primary key,docId LONG,view LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table ecoit_doc_DocumentAttachments";

	public static final String ORDER_BY_JPQL =
		" ORDER BY documentAttachments.view DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_doc_DocumentAttachments.view DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long ATTACHMENTID_COLUMN_BITMASK = 1L;

	public static final long DOCID_COLUMN_BITMASK = 2L;

	public static final long VIEW_COLUMN_BITMASK = 4L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DocumentAttachments toModel(
		DocumentAttachmentsSoap soapModel) {

		if (soapModel == null) {
			return null;
		}

		DocumentAttachments model = new DocumentAttachmentsImpl();

		model.setAttachmentId(soapModel.getAttachmentId());
		model.setDocId(soapModel.getDocId());
		model.setView(soapModel.getView());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DocumentAttachments> toModels(
		DocumentAttachmentsSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<DocumentAttachments> models = new ArrayList<DocumentAttachments>(
			soapModels.length);

		for (DocumentAttachmentsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public DocumentAttachmentsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _attachmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAttachmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _attachmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DocumentAttachments.class;
	}

	@Override
	public String getModelClassName() {
		return DocumentAttachments.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<DocumentAttachments, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<DocumentAttachments, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DocumentAttachments, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((DocumentAttachments)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<DocumentAttachments, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<DocumentAttachments, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(DocumentAttachments)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<DocumentAttachments, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<DocumentAttachments, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, DocumentAttachments>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			DocumentAttachments.class.getClassLoader(),
			DocumentAttachments.class, ModelWrapper.class);

		try {
			Constructor<DocumentAttachments> constructor =
				(Constructor<DocumentAttachments>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<DocumentAttachments, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<DocumentAttachments, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<DocumentAttachments, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<DocumentAttachments, Object>>();
		Map<String, BiConsumer<DocumentAttachments, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<DocumentAttachments, ?>>();

		attributeGetterFunctions.put(
			"attachmentId", DocumentAttachments::getAttachmentId);
		attributeSetterBiConsumers.put(
			"attachmentId",
			(BiConsumer<DocumentAttachments, Long>)
				DocumentAttachments::setAttachmentId);
		attributeGetterFunctions.put("docId", DocumentAttachments::getDocId);
		attributeSetterBiConsumers.put(
			"docId",
			(BiConsumer<DocumentAttachments, Long>)
				DocumentAttachments::setDocId);
		attributeGetterFunctions.put("view", DocumentAttachments::getView);
		attributeSetterBiConsumers.put(
			"view",
			(BiConsumer<DocumentAttachments, Long>)
				DocumentAttachments::setView);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getAttachmentId() {
		return _attachmentId;
	}

	@Override
	public void setAttachmentId(long attachmentId) {
		_columnBitmask |= ATTACHMENTID_COLUMN_BITMASK;

		if (!_setOriginalAttachmentId) {
			_setOriginalAttachmentId = true;

			_originalAttachmentId = _attachmentId;
		}

		_attachmentId = attachmentId;
	}

	public long getOriginalAttachmentId() {
		return _originalAttachmentId;
	}

	@JSON
	@Override
	public long getDocId() {
		return _docId;
	}

	@Override
	public void setDocId(long docId) {
		_columnBitmask |= DOCID_COLUMN_BITMASK;

		if (!_setOriginalDocId) {
			_setOriginalDocId = true;

			_originalDocId = _docId;
		}

		_docId = docId;
	}

	public long getOriginalDocId() {
		return _originalDocId;
	}

	@JSON
	@Override
	public long getView() {
		return _view;
	}

	@Override
	public void setView(long view) {
		_columnBitmask = -1L;

		_view = view;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, DocumentAttachments.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DocumentAttachments toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, DocumentAttachments>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DocumentAttachmentsImpl documentAttachmentsImpl =
			new DocumentAttachmentsImpl();

		documentAttachmentsImpl.setAttachmentId(getAttachmentId());
		documentAttachmentsImpl.setDocId(getDocId());
		documentAttachmentsImpl.setView(getView());

		documentAttachmentsImpl.resetOriginalValues();

		return documentAttachmentsImpl;
	}

	@Override
	public int compareTo(DocumentAttachments documentAttachments) {
		int value = 0;

		if (getView() < documentAttachments.getView()) {
			value = -1;
		}
		else if (getView() > documentAttachments.getView()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentAttachments)) {
			return false;
		}

		DocumentAttachments documentAttachments = (DocumentAttachments)obj;

		long primaryKey = documentAttachments.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		DocumentAttachmentsModelImpl documentAttachmentsModelImpl = this;

		documentAttachmentsModelImpl._originalAttachmentId =
			documentAttachmentsModelImpl._attachmentId;

		documentAttachmentsModelImpl._setOriginalAttachmentId = false;

		documentAttachmentsModelImpl._originalDocId =
			documentAttachmentsModelImpl._docId;

		documentAttachmentsModelImpl._setOriginalDocId = false;

		documentAttachmentsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DocumentAttachments> toCacheModel() {
		DocumentAttachmentsCacheModel documentAttachmentsCacheModel =
			new DocumentAttachmentsCacheModel();

		documentAttachmentsCacheModel.attachmentId = getAttachmentId();

		documentAttachmentsCacheModel.docId = getDocId();

		documentAttachmentsCacheModel.view = getView();

		return documentAttachmentsCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<DocumentAttachments, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<DocumentAttachments, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DocumentAttachments, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((DocumentAttachments)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<DocumentAttachments, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<DocumentAttachments, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DocumentAttachments, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((DocumentAttachments)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, DocumentAttachments>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _attachmentId;
	private long _originalAttachmentId;
	private boolean _setOriginalAttachmentId;
	private long _docId;
	private long _originalDocId;
	private boolean _setOriginalDocId;
	private long _view;
	private long _columnBitmask;
	private DocumentAttachments _escapedModel;

}