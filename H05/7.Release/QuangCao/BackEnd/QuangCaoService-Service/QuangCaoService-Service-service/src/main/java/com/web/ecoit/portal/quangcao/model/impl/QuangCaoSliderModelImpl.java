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

package com.web.ecoit.portal.quangcao.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.web.ecoit.portal.quangcao.model.QuangCaoSlider;
import com.web.ecoit.portal.quangcao.model.QuangCaoSliderModel;
import com.web.ecoit.portal.quangcao.model.QuangCaoSliderSoap;

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

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the QuangCaoSlider service. Represents a row in the &quot;soft_adv_QuangCaoSlider&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>QuangCaoSliderModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuangCaoSliderImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuangCaoSliderImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class QuangCaoSliderModelImpl
	extends BaseModelImpl<QuangCaoSlider> implements QuangCaoSliderModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a quang cao slider model instance should use the <code>QuangCaoSlider</code> interface instead.
	 */
	public static final String TABLE_NAME = "soft_adv_QuangCaoSlider";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"quangCaoSliderId", Types.BIGINT},
		{"quangCaoId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"tenQuangCao", Types.VARCHAR},
		{"moTa", Types.VARCHAR}, {"target", Types.BOOLEAN},
		{"url", Types.VARCHAR}, {"type_", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("quangCaoSliderId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("quangCaoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("tenQuangCao", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("moTa", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("target", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("url", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("type_", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table soft_adv_QuangCaoSlider (uuid_ VARCHAR(75) null,quangCaoSliderId LONG not null primary key,quangCaoId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,tenQuangCao VARCHAR(1000) null,moTa VARCHAR(1000) null,target BOOLEAN,url VARCHAR(1000) null,type_ INTEGER)";

	public static final String TABLE_SQL_DROP =
		"drop table soft_adv_QuangCaoSlider";

	public static final String ORDER_BY_JPQL =
		" ORDER BY quangCaoSlider.quangCaoSliderId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY soft_adv_QuangCaoSlider.quangCaoSliderId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long GROUPID_COLUMN_BITMASK = 1L;

	public static final long QUANGCAOID_COLUMN_BITMASK = 2L;

	public static final long QUANGCAOSLIDERID_COLUMN_BITMASK = 4L;

	public static final long UUID_COLUMN_BITMASK = 8L;

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
	public static QuangCaoSlider toModel(QuangCaoSliderSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QuangCaoSlider model = new QuangCaoSliderImpl();

		model.setUuid(soapModel.getUuid());
		model.setQuangCaoSliderId(soapModel.getQuangCaoSliderId());
		model.setQuangCaoId(soapModel.getQuangCaoId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTenQuangCao(soapModel.getTenQuangCao());
		model.setMoTa(soapModel.getMoTa());
		model.setTarget(soapModel.getTarget());
		model.setUrl(soapModel.getUrl());
		model.setType(soapModel.getType());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QuangCaoSlider> toModels(
		QuangCaoSliderSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<QuangCaoSlider> models = new ArrayList<QuangCaoSlider>(
			soapModels.length);

		for (QuangCaoSliderSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public QuangCaoSliderModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _quangCaoSliderId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setQuangCaoSliderId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _quangCaoSliderId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QuangCaoSlider.class;
	}

	@Override
	public String getModelClassName() {
		return QuangCaoSlider.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<QuangCaoSlider, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<QuangCaoSlider, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuangCaoSlider, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((QuangCaoSlider)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<QuangCaoSlider, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<QuangCaoSlider, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(QuangCaoSlider)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<QuangCaoSlider, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<QuangCaoSlider, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, QuangCaoSlider>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			QuangCaoSlider.class.getClassLoader(), QuangCaoSlider.class,
			ModelWrapper.class);

		try {
			Constructor<QuangCaoSlider> constructor =
				(Constructor<QuangCaoSlider>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<QuangCaoSlider, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<QuangCaoSlider, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<QuangCaoSlider, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<QuangCaoSlider, Object>>();
		Map<String, BiConsumer<QuangCaoSlider, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<QuangCaoSlider, ?>>();

		attributeGetterFunctions.put("uuid", QuangCaoSlider::getUuid);
		attributeSetterBiConsumers.put(
			"uuid",
			(BiConsumer<QuangCaoSlider, String>)QuangCaoSlider::setUuid);
		attributeGetterFunctions.put(
			"quangCaoSliderId", QuangCaoSlider::getQuangCaoSliderId);
		attributeSetterBiConsumers.put(
			"quangCaoSliderId",
			(BiConsumer<QuangCaoSlider, Long>)
				QuangCaoSlider::setQuangCaoSliderId);
		attributeGetterFunctions.put(
			"quangCaoId", QuangCaoSlider::getQuangCaoId);
		attributeSetterBiConsumers.put(
			"quangCaoId",
			(BiConsumer<QuangCaoSlider, Long>)QuangCaoSlider::setQuangCaoId);
		attributeGetterFunctions.put("groupId", QuangCaoSlider::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<QuangCaoSlider, Long>)QuangCaoSlider::setGroupId);
		attributeGetterFunctions.put("userId", QuangCaoSlider::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<QuangCaoSlider, Long>)QuangCaoSlider::setUserId);
		attributeGetterFunctions.put(
			"createDate", QuangCaoSlider::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<QuangCaoSlider, Date>)QuangCaoSlider::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", QuangCaoSlider::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<QuangCaoSlider, Date>)QuangCaoSlider::setModifiedDate);
		attributeGetterFunctions.put(
			"tenQuangCao", QuangCaoSlider::getTenQuangCao);
		attributeSetterBiConsumers.put(
			"tenQuangCao",
			(BiConsumer<QuangCaoSlider, String>)QuangCaoSlider::setTenQuangCao);
		attributeGetterFunctions.put("moTa", QuangCaoSlider::getMoTa);
		attributeSetterBiConsumers.put(
			"moTa",
			(BiConsumer<QuangCaoSlider, String>)QuangCaoSlider::setMoTa);
		attributeGetterFunctions.put("target", QuangCaoSlider::getTarget);
		attributeSetterBiConsumers.put(
			"target",
			(BiConsumer<QuangCaoSlider, Boolean>)QuangCaoSlider::setTarget);
		attributeGetterFunctions.put("url", QuangCaoSlider::getUrl);
		attributeSetterBiConsumers.put(
			"url", (BiConsumer<QuangCaoSlider, String>)QuangCaoSlider::setUrl);
		attributeGetterFunctions.put("type", QuangCaoSlider::getType);
		attributeSetterBiConsumers.put(
			"type",
			(BiConsumer<QuangCaoSlider, Integer>)QuangCaoSlider::setType);

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
	public long getQuangCaoSliderId() {
		return _quangCaoSliderId;
	}

	@Override
	public void setQuangCaoSliderId(long quangCaoSliderId) {
		_columnBitmask |= QUANGCAOSLIDERID_COLUMN_BITMASK;

		if (!_setOriginalQuangCaoSliderId) {
			_setOriginalQuangCaoSliderId = true;

			_originalQuangCaoSliderId = _quangCaoSliderId;
		}

		_quangCaoSliderId = quangCaoSliderId;
	}

	public long getOriginalQuangCaoSliderId() {
		return _originalQuangCaoSliderId;
	}

	@JSON
	@Override
	public long getQuangCaoId() {
		return _quangCaoId;
	}

	@Override
	public void setQuangCaoId(long quangCaoId) {
		_columnBitmask |= QUANGCAOID_COLUMN_BITMASK;

		if (!_setOriginalQuangCaoId) {
			_setOriginalQuangCaoId = true;

			_originalQuangCaoId = _quangCaoId;
		}

		_quangCaoId = quangCaoId;
	}

	public long getOriginalQuangCaoId() {
		return _originalQuangCaoId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getTenQuangCao() {
		if (_tenQuangCao == null) {
			return "";
		}
		else {
			return _tenQuangCao;
		}
	}

	@Override
	public void setTenQuangCao(String tenQuangCao) {
		_tenQuangCao = tenQuangCao;
	}

	@JSON
	@Override
	public String getMoTa() {
		if (_moTa == null) {
			return "";
		}
		else {
			return _moTa;
		}
	}

	@Override
	public void setMoTa(String moTa) {
		_moTa = moTa;
	}

	@JSON
	@Override
	public Boolean getTarget() {
		return _target;
	}

	@Override
	public void setTarget(Boolean target) {
		_target = target;
	}

	@JSON
	@Override
	public String getUrl() {
		if (_url == null) {
			return "";
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
	}

	@JSON
	@Override
	public int getType() {
		return _type;
	}

	@Override
	public void setType(int type) {
		_type = type;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, QuangCaoSlider.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QuangCaoSlider toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, QuangCaoSlider>
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
		QuangCaoSliderImpl quangCaoSliderImpl = new QuangCaoSliderImpl();

		quangCaoSliderImpl.setUuid(getUuid());
		quangCaoSliderImpl.setQuangCaoSliderId(getQuangCaoSliderId());
		quangCaoSliderImpl.setQuangCaoId(getQuangCaoId());
		quangCaoSliderImpl.setGroupId(getGroupId());
		quangCaoSliderImpl.setUserId(getUserId());
		quangCaoSliderImpl.setCreateDate(getCreateDate());
		quangCaoSliderImpl.setModifiedDate(getModifiedDate());
		quangCaoSliderImpl.setTenQuangCao(getTenQuangCao());
		quangCaoSliderImpl.setMoTa(getMoTa());
		quangCaoSliderImpl.setTarget(getTarget());
		quangCaoSliderImpl.setUrl(getUrl());
		quangCaoSliderImpl.setType(getType());

		quangCaoSliderImpl.resetOriginalValues();

		return quangCaoSliderImpl;
	}

	@Override
	public int compareTo(QuangCaoSlider quangCaoSlider) {
		long primaryKey = quangCaoSlider.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QuangCaoSlider)) {
			return false;
		}

		QuangCaoSlider quangCaoSlider = (QuangCaoSlider)obj;

		long primaryKey = quangCaoSlider.getPrimaryKey();

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
		QuangCaoSliderModelImpl quangCaoSliderModelImpl = this;

		quangCaoSliderModelImpl._originalUuid = quangCaoSliderModelImpl._uuid;

		quangCaoSliderModelImpl._originalQuangCaoSliderId =
			quangCaoSliderModelImpl._quangCaoSliderId;

		quangCaoSliderModelImpl._setOriginalQuangCaoSliderId = false;

		quangCaoSliderModelImpl._originalQuangCaoId =
			quangCaoSliderModelImpl._quangCaoId;

		quangCaoSliderModelImpl._setOriginalQuangCaoId = false;

		quangCaoSliderModelImpl._originalGroupId =
			quangCaoSliderModelImpl._groupId;

		quangCaoSliderModelImpl._setOriginalGroupId = false;

		quangCaoSliderModelImpl._setModifiedDate = false;

		quangCaoSliderModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QuangCaoSlider> toCacheModel() {
		QuangCaoSliderCacheModel quangCaoSliderCacheModel =
			new QuangCaoSliderCacheModel();

		quangCaoSliderCacheModel.uuid = getUuid();

		String uuid = quangCaoSliderCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			quangCaoSliderCacheModel.uuid = null;
		}

		quangCaoSliderCacheModel.quangCaoSliderId = getQuangCaoSliderId();

		quangCaoSliderCacheModel.quangCaoId = getQuangCaoId();

		quangCaoSliderCacheModel.groupId = getGroupId();

		quangCaoSliderCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			quangCaoSliderCacheModel.createDate = createDate.getTime();
		}
		else {
			quangCaoSliderCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			quangCaoSliderCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			quangCaoSliderCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		quangCaoSliderCacheModel.tenQuangCao = getTenQuangCao();

		String tenQuangCao = quangCaoSliderCacheModel.tenQuangCao;

		if ((tenQuangCao != null) && (tenQuangCao.length() == 0)) {
			quangCaoSliderCacheModel.tenQuangCao = null;
		}

		quangCaoSliderCacheModel.moTa = getMoTa();

		String moTa = quangCaoSliderCacheModel.moTa;

		if ((moTa != null) && (moTa.length() == 0)) {
			quangCaoSliderCacheModel.moTa = null;
		}

		quangCaoSliderCacheModel.target = getTarget();

		quangCaoSliderCacheModel.url = getUrl();

		String url = quangCaoSliderCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			quangCaoSliderCacheModel.url = null;
		}

		quangCaoSliderCacheModel.type = getType();

		return quangCaoSliderCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<QuangCaoSlider, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<QuangCaoSlider, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuangCaoSlider, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((QuangCaoSlider)this));
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
		Map<String, Function<QuangCaoSlider, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<QuangCaoSlider, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuangCaoSlider, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((QuangCaoSlider)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, QuangCaoSlider>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _quangCaoSliderId;
	private long _originalQuangCaoSliderId;
	private boolean _setOriginalQuangCaoSliderId;
	private long _quangCaoId;
	private long _originalQuangCaoId;
	private boolean _setOriginalQuangCaoId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _tenQuangCao;
	private String _moTa;
	private Boolean _target;
	private String _url;
	private int _type;
	private long _columnBitmask;
	private QuangCaoSlider _escapedModel;

}