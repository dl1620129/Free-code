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

package com.software.cms.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.software.cms.model.ArticleMessage;
import com.software.cms.model.ArticleMessageModel;
import com.software.cms.model.ArticleMessageSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the ArticleMessage service. Represents a row in the &quot;soft_cms_ArticleMessage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ArticleMessageModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ArticleMessageImpl}.
 * </p>
 *
 * @author DungNV
 * @see ArticleMessageImpl
 * @generated
 */
@JSON(strict = true)
public class ArticleMessageModelImpl
	extends BaseModelImpl<ArticleMessage> implements ArticleMessageModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a article message model instance should use the <code>ArticleMessage</code> interface instead.
	 */
	public static final String TABLE_NAME = "soft_cms_ArticleMessage";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"messageId", Types.BIGINT},
		{"content", Types.VARCHAR}, {"articleId", Types.BIGINT},
		{"createdByUser", Types.BIGINT}, {"createdDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("messageId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("content", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("articleId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdByUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table soft_cms_ArticleMessage (uuid_ VARCHAR(75) null,messageId LONG not null primary key,content VARCHAR(75) null,articleId LONG,createdByUser LONG,createdDate DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table soft_cms_ArticleMessage";

	public static final String ORDER_BY_JPQL =
		" ORDER BY articleMessage.createdDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY soft_cms_ArticleMessage.createdDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long ARTICLEID_COLUMN_BITMASK = 1L;

	public static final long UUID_COLUMN_BITMASK = 2L;

	public static final long CREATEDDATE_COLUMN_BITMASK = 4L;

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
	public static ArticleMessage toModel(ArticleMessageSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ArticleMessage model = new ArticleMessageImpl();

		model.setUuid(soapModel.getUuid());
		model.setMessageId(soapModel.getMessageId());
		model.setContent(soapModel.getContent());
		model.setArticleId(soapModel.getArticleId());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setCreatedDate(soapModel.getCreatedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ArticleMessage> toModels(
		ArticleMessageSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<ArticleMessage> models = new ArrayList<ArticleMessage>(
			soapModels.length);

		for (ArticleMessageSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public ArticleMessageModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _messageId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMessageId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _messageId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ArticleMessage.class;
	}

	@Override
	public String getModelClassName() {
		return ArticleMessage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<ArticleMessage, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<ArticleMessage, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ArticleMessage, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((ArticleMessage)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<ArticleMessage, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<ArticleMessage, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(ArticleMessage)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<ArticleMessage, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<ArticleMessage, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, ArticleMessage>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			ArticleMessage.class.getClassLoader(), ArticleMessage.class,
			ModelWrapper.class);

		try {
			Constructor<ArticleMessage> constructor =
				(Constructor<ArticleMessage>)proxyClass.getConstructor(
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

	private static final Map<String, Function<ArticleMessage, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<ArticleMessage, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<ArticleMessage, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<ArticleMessage, Object>>();
		Map<String, BiConsumer<ArticleMessage, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<ArticleMessage, ?>>();

		attributeGetterFunctions.put("uuid", ArticleMessage::getUuid);
		attributeSetterBiConsumers.put(
			"uuid",
			(BiConsumer<ArticleMessage, String>)ArticleMessage::setUuid);
		attributeGetterFunctions.put("messageId", ArticleMessage::getMessageId);
		attributeSetterBiConsumers.put(
			"messageId",
			(BiConsumer<ArticleMessage, Long>)ArticleMessage::setMessageId);
		attributeGetterFunctions.put("content", ArticleMessage::getContent);
		attributeSetterBiConsumers.put(
			"content",
			(BiConsumer<ArticleMessage, String>)ArticleMessage::setContent);
		attributeGetterFunctions.put("articleId", ArticleMessage::getArticleId);
		attributeSetterBiConsumers.put(
			"articleId",
			(BiConsumer<ArticleMessage, Long>)ArticleMessage::setArticleId);
		attributeGetterFunctions.put(
			"createdByUser", ArticleMessage::getCreatedByUser);
		attributeSetterBiConsumers.put(
			"createdByUser",
			(BiConsumer<ArticleMessage, Long>)ArticleMessage::setCreatedByUser);
		attributeGetterFunctions.put(
			"createdDate", ArticleMessage::getCreatedDate);
		attributeSetterBiConsumers.put(
			"createdDate",
			(BiConsumer<ArticleMessage, Date>)ArticleMessage::setCreatedDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getMessageId() {
		return _messageId;
	}

	@Override
	public void setMessageId(long messageId) {
		_messageId = messageId;
	}

	@JSON
	@Override
	public String getContent() {
		if (_content == null) {
			return "";
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@JSON
	@Override
	public long getArticleId() {
		return _articleId;
	}

	@Override
	public void setArticleId(long articleId) {
		_columnBitmask |= ARTICLEID_COLUMN_BITMASK;

		if (!_setOriginalArticleId) {
			_setOriginalArticleId = true;

			_originalArticleId = _articleId;
		}

		_articleId = articleId;
	}

	public long getOriginalArticleId() {
		return _originalArticleId;
	}

	@JSON
	@Override
	public long getCreatedByUser() {
		return _createdByUser;
	}

	@Override
	public void setCreatedByUser(long createdByUser) {
		_createdByUser = createdByUser;
	}

	@JSON
	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_columnBitmask = -1L;

		_createdDate = createdDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, ArticleMessage.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ArticleMessage toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, ArticleMessage>
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
		ArticleMessageImpl articleMessageImpl = new ArticleMessageImpl();

		articleMessageImpl.setUuid(getUuid());
		articleMessageImpl.setMessageId(getMessageId());
		articleMessageImpl.setContent(getContent());
		articleMessageImpl.setArticleId(getArticleId());
		articleMessageImpl.setCreatedByUser(getCreatedByUser());
		articleMessageImpl.setCreatedDate(getCreatedDate());

		articleMessageImpl.resetOriginalValues();

		return articleMessageImpl;
	}

	@Override
	public int compareTo(ArticleMessage articleMessage) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreatedDate(), articleMessage.getCreatedDate());

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

		if (!(obj instanceof ArticleMessage)) {
			return false;
		}

		ArticleMessage articleMessage = (ArticleMessage)obj;

		long primaryKey = articleMessage.getPrimaryKey();

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
		ArticleMessageModelImpl articleMessageModelImpl = this;

		articleMessageModelImpl._originalUuid = articleMessageModelImpl._uuid;

		articleMessageModelImpl._originalArticleId =
			articleMessageModelImpl._articleId;

		articleMessageModelImpl._setOriginalArticleId = false;

		articleMessageModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ArticleMessage> toCacheModel() {
		ArticleMessageCacheModel articleMessageCacheModel =
			new ArticleMessageCacheModel();

		articleMessageCacheModel.uuid = getUuid();

		String uuid = articleMessageCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			articleMessageCacheModel.uuid = null;
		}

		articleMessageCacheModel.messageId = getMessageId();

		articleMessageCacheModel.content = getContent();

		String content = articleMessageCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			articleMessageCacheModel.content = null;
		}

		articleMessageCacheModel.articleId = getArticleId();

		articleMessageCacheModel.createdByUser = getCreatedByUser();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			articleMessageCacheModel.createdDate = createdDate.getTime();
		}
		else {
			articleMessageCacheModel.createdDate = Long.MIN_VALUE;
		}

		return articleMessageCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<ArticleMessage, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<ArticleMessage, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ArticleMessage, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((ArticleMessage)this));
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
		Map<String, Function<ArticleMessage, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<ArticleMessage, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ArticleMessage, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((ArticleMessage)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, ArticleMessage>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _messageId;
	private String _content;
	private long _articleId;
	private long _originalArticleId;
	private boolean _setOriginalArticleId;
	private long _createdByUser;
	private Date _createdDate;
	private long _columnBitmask;
	private ArticleMessage _escapedModel;

}