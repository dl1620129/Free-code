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

import com.ecoit.elegaldocument.model.DraftAttachments;
import com.ecoit.elegaldocument.model.DraftAttachmentsModel;
import com.ecoit.elegaldocument.model.DraftAttachmentsSoap;

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
 * The base model implementation for the DraftAttachments service. Represents a row in the &quot;ecoit_doc_DraftAttachments&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>DraftAttachmentsModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DraftAttachmentsImpl}.
 * </p>
 *
 * @author Liverpool
 * @see DraftAttachmentsImpl
 * @generated
 */
@JSON(strict = true)
public class DraftAttachmentsModelImpl
	extends BaseModelImpl<DraftAttachments> implements DraftAttachmentsModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a draft attachments model instance should use the <code>DraftAttachments</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_doc_DraftAttachments";

	public static final Object[][] TABLE_COLUMNS = {
		{"attachmentId", Types.BIGINT}, {"draftId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("attachmentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("draftId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_doc_DraftAttachments (attachmentId LONG not null primary key,draftId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table ecoit_doc_DraftAttachments";

	public static final String ORDER_BY_JPQL =
		" ORDER BY draftAttachments.draftId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_doc_DraftAttachments.draftId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long ATTACHMENTID_COLUMN_BITMASK = 1L;

	public static final long DRAFTID_COLUMN_BITMASK = 2L;

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
	public static DraftAttachments toModel(DraftAttachmentsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DraftAttachments model = new DraftAttachmentsImpl();

		model.setAttachmentId(soapModel.getAttachmentId());
		model.setDraftId(soapModel.getDraftId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DraftAttachments> toModels(
		DraftAttachmentsSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<DraftAttachments> models = new ArrayList<DraftAttachments>(
			soapModels.length);

		for (DraftAttachmentsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public DraftAttachmentsModelImpl() {
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
		return DraftAttachments.class;
	}

	@Override
	public String getModelClassName() {
		return DraftAttachments.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<DraftAttachments, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<DraftAttachments, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DraftAttachments, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((DraftAttachments)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<DraftAttachments, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<DraftAttachments, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(DraftAttachments)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<DraftAttachments, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<DraftAttachments, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, DraftAttachments>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			DraftAttachments.class.getClassLoader(), DraftAttachments.class,
			ModelWrapper.class);

		try {
			Constructor<DraftAttachments> constructor =
				(Constructor<DraftAttachments>)proxyClass.getConstructor(
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

	private static final Map<String, Function<DraftAttachments, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<DraftAttachments, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<DraftAttachments, Object>>
			attributeGetterFunctions =
				new LinkedHashMap<String, Function<DraftAttachments, Object>>();
		Map<String, BiConsumer<DraftAttachments, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<DraftAttachments, ?>>();

		attributeGetterFunctions.put(
			"attachmentId", DraftAttachments::getAttachmentId);
		attributeSetterBiConsumers.put(
			"attachmentId",
			(BiConsumer<DraftAttachments, Long>)
				DraftAttachments::setAttachmentId);
		attributeGetterFunctions.put("draftId", DraftAttachments::getDraftId);
		attributeSetterBiConsumers.put(
			"draftId",
			(BiConsumer<DraftAttachments, Long>)DraftAttachments::setDraftId);

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
	public long getDraftId() {
		return _draftId;
	}

	@Override
	public void setDraftId(long draftId) {
		_columnBitmask = -1L;

		if (!_setOriginalDraftId) {
			_setOriginalDraftId = true;

			_originalDraftId = _draftId;
		}

		_draftId = draftId;
	}

	public long getOriginalDraftId() {
		return _originalDraftId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, DraftAttachments.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DraftAttachments toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, DraftAttachments>
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
		DraftAttachmentsImpl draftAttachmentsImpl = new DraftAttachmentsImpl();

		draftAttachmentsImpl.setAttachmentId(getAttachmentId());
		draftAttachmentsImpl.setDraftId(getDraftId());

		draftAttachmentsImpl.resetOriginalValues();

		return draftAttachmentsImpl;
	}

	@Override
	public int compareTo(DraftAttachments draftAttachments) {
		int value = 0;

		if (getDraftId() < draftAttachments.getDraftId()) {
			value = -1;
		}
		else if (getDraftId() > draftAttachments.getDraftId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof DraftAttachments)) {
			return false;
		}

		DraftAttachments draftAttachments = (DraftAttachments)obj;

		long primaryKey = draftAttachments.getPrimaryKey();

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
		DraftAttachmentsModelImpl draftAttachmentsModelImpl = this;

		draftAttachmentsModelImpl._originalAttachmentId =
			draftAttachmentsModelImpl._attachmentId;

		draftAttachmentsModelImpl._setOriginalAttachmentId = false;

		draftAttachmentsModelImpl._originalDraftId =
			draftAttachmentsModelImpl._draftId;

		draftAttachmentsModelImpl._setOriginalDraftId = false;

		draftAttachmentsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DraftAttachments> toCacheModel() {
		DraftAttachmentsCacheModel draftAttachmentsCacheModel =
			new DraftAttachmentsCacheModel();

		draftAttachmentsCacheModel.attachmentId = getAttachmentId();

		draftAttachmentsCacheModel.draftId = getDraftId();

		return draftAttachmentsCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<DraftAttachments, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<DraftAttachments, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DraftAttachments, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((DraftAttachments)this));
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
		Map<String, Function<DraftAttachments, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<DraftAttachments, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DraftAttachments, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((DraftAttachments)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, DraftAttachments>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _attachmentId;
	private long _originalAttachmentId;
	private boolean _setOriginalAttachmentId;
	private long _draftId;
	private long _originalDraftId;
	private boolean _setOriginalDraftId;
	private long _columnBitmask;
	private DraftAttachments _escapedModel;

}