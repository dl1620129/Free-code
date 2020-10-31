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

package adv.model.impl;

import adv.model.QuangCao;
import adv.model.QuangCaoModel;
import adv.model.QuangCaoSoap;

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
 * The base model implementation for the QuangCao service. Represents a row in the &quot;soft_adv_QuangCao&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>QuangCaoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuangCaoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuangCaoImpl
 * @generated
 */
@JSON(strict = true)
public class QuangCaoModelImpl
	extends BaseModelImpl<QuangCao> implements QuangCaoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a quang cao model instance should use the <code>QuangCao</code> interface instead.
	 */
	public static final String TABLE_NAME = "soft_adv_QuangCao";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"quangCaoId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"language", Types.VARCHAR},
		{"userId", Types.BIGINT}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"tenQuangCao", Types.VARCHAR},
		{"moTa", Types.VARCHAR}, {"target", Types.BOOLEAN},
		{"imageId", Types.BIGINT}, {"url", Types.VARCHAR},
		{"type_", Types.INTEGER}, {"status", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("quangCaoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("language", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("tenQuangCao", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("moTa", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("target", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("imageId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("url", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("type_", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table soft_adv_QuangCao (uuid_ VARCHAR(75) null,quangCaoId LONG not null primary key,groupId LONG,language VARCHAR(75) null,userId LONG,createDate DATE null,modifiedDate DATE null,tenQuangCao VARCHAR(75) null,moTa VARCHAR(75) null,target BOOLEAN,imageId LONG,url VARCHAR(75) null,type_ INTEGER,status INTEGER)";

	public static final String TABLE_SQL_DROP = "drop table soft_adv_QuangCao";

	public static final String ORDER_BY_JPQL =
		" ORDER BY quangCao.quangCaoId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY soft_adv_QuangCao.quangCaoId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long GROUPID_COLUMN_BITMASK = 1L;

	public static final long QUANGCAOID_COLUMN_BITMASK = 2L;

	public static final long STATUS_COLUMN_BITMASK = 4L;

	public static final long TYPE_COLUMN_BITMASK = 8L;

	public static final long UUID_COLUMN_BITMASK = 16L;

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
	public static QuangCao toModel(QuangCaoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QuangCao model = new QuangCaoImpl();

		model.setUuid(soapModel.getUuid());
		model.setQuangCaoId(soapModel.getQuangCaoId());
		model.setGroupId(soapModel.getGroupId());
		model.setLanguage(soapModel.getLanguage());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTenQuangCao(soapModel.getTenQuangCao());
		model.setMoTa(soapModel.getMoTa());
		model.setTarget(soapModel.getTarget());
		model.setImageId(soapModel.getImageId());
		model.setUrl(soapModel.getUrl());
		model.setType(soapModel.getType());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QuangCao> toModels(QuangCaoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QuangCao> models = new ArrayList<QuangCao>(soapModels.length);

		for (QuangCaoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public QuangCaoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _quangCaoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setQuangCaoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _quangCaoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QuangCao.class;
	}

	@Override
	public String getModelClassName() {
		return QuangCao.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<QuangCao, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<QuangCao, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuangCao, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((QuangCao)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<QuangCao, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<QuangCao, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(QuangCao)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<QuangCao, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<QuangCao, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, QuangCao>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			QuangCao.class.getClassLoader(), QuangCao.class,
			ModelWrapper.class);

		try {
			Constructor<QuangCao> constructor =
				(Constructor<QuangCao>)proxyClass.getConstructor(
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

	private static final Map<String, Function<QuangCao, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<QuangCao, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<QuangCao, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<QuangCao, Object>>();
		Map<String, BiConsumer<QuangCao, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<QuangCao, ?>>();

		attributeGetterFunctions.put("uuid", QuangCao::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<QuangCao, String>)QuangCao::setUuid);
		attributeGetterFunctions.put("quangCaoId", QuangCao::getQuangCaoId);
		attributeSetterBiConsumers.put(
			"quangCaoId", (BiConsumer<QuangCao, Long>)QuangCao::setQuangCaoId);
		attributeGetterFunctions.put("groupId", QuangCao::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<QuangCao, Long>)QuangCao::setGroupId);
		attributeGetterFunctions.put("language", QuangCao::getLanguage);
		attributeSetterBiConsumers.put(
			"language", (BiConsumer<QuangCao, String>)QuangCao::setLanguage);
		attributeGetterFunctions.put("userId", QuangCao::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<QuangCao, Long>)QuangCao::setUserId);
		attributeGetterFunctions.put("createDate", QuangCao::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<QuangCao, Date>)QuangCao::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", QuangCao::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<QuangCao, Date>)QuangCao::setModifiedDate);
		attributeGetterFunctions.put("tenQuangCao", QuangCao::getTenQuangCao);
		attributeSetterBiConsumers.put(
			"tenQuangCao",
			(BiConsumer<QuangCao, String>)QuangCao::setTenQuangCao);
		attributeGetterFunctions.put("moTa", QuangCao::getMoTa);
		attributeSetterBiConsumers.put(
			"moTa", (BiConsumer<QuangCao, String>)QuangCao::setMoTa);
		attributeGetterFunctions.put("target", QuangCao::getTarget);
		attributeSetterBiConsumers.put(
			"target", (BiConsumer<QuangCao, Boolean>)QuangCao::setTarget);
		attributeGetterFunctions.put("imageId", QuangCao::getImageId);
		attributeSetterBiConsumers.put(
			"imageId", (BiConsumer<QuangCao, Long>)QuangCao::setImageId);
		attributeGetterFunctions.put("url", QuangCao::getUrl);
		attributeSetterBiConsumers.put(
			"url", (BiConsumer<QuangCao, String>)QuangCao::setUrl);
		attributeGetterFunctions.put("type", QuangCao::getType);
		attributeSetterBiConsumers.put(
			"type", (BiConsumer<QuangCao, Integer>)QuangCao::setType);
		attributeGetterFunctions.put("status", QuangCao::getStatus);
		attributeSetterBiConsumers.put(
			"status", (BiConsumer<QuangCao, Integer>)QuangCao::setStatus);

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
	public String getLanguage() {
		if (_language == null) {
			return "";
		}
		else {
			return _language;
		}
	}

	@Override
	public void setLanguage(String language) {
		_language = language;
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
		catch (PortalException portalException) {
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
	public long getImageId() {
		return _imageId;
	}

	@Override
	public void setImageId(long imageId) {
		_imageId = imageId;
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
		_columnBitmask |= TYPE_COLUMN_BITMASK;

		if (!_setOriginalType) {
			_setOriginalType = true;

			_originalType = _type;
		}

		_type = type;
	}

	public int getOriginalType() {
		return _originalType;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, QuangCao.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QuangCao toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, QuangCao>
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
		QuangCaoImpl quangCaoImpl = new QuangCaoImpl();

		quangCaoImpl.setUuid(getUuid());
		quangCaoImpl.setQuangCaoId(getQuangCaoId());
		quangCaoImpl.setGroupId(getGroupId());
		quangCaoImpl.setLanguage(getLanguage());
		quangCaoImpl.setUserId(getUserId());
		quangCaoImpl.setCreateDate(getCreateDate());
		quangCaoImpl.setModifiedDate(getModifiedDate());
		quangCaoImpl.setTenQuangCao(getTenQuangCao());
		quangCaoImpl.setMoTa(getMoTa());
		quangCaoImpl.setTarget(getTarget());
		quangCaoImpl.setImageId(getImageId());
		quangCaoImpl.setUrl(getUrl());
		quangCaoImpl.setType(getType());
		quangCaoImpl.setStatus(getStatus());

		quangCaoImpl.resetOriginalValues();

		return quangCaoImpl;
	}

	@Override
	public int compareTo(QuangCao quangCao) {
		long primaryKey = quangCao.getPrimaryKey();

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

		if (!(obj instanceof QuangCao)) {
			return false;
		}

		QuangCao quangCao = (QuangCao)obj;

		long primaryKey = quangCao.getPrimaryKey();

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
		QuangCaoModelImpl quangCaoModelImpl = this;

		quangCaoModelImpl._originalUuid = quangCaoModelImpl._uuid;

		quangCaoModelImpl._originalQuangCaoId = quangCaoModelImpl._quangCaoId;

		quangCaoModelImpl._setOriginalQuangCaoId = false;

		quangCaoModelImpl._originalGroupId = quangCaoModelImpl._groupId;

		quangCaoModelImpl._setOriginalGroupId = false;

		quangCaoModelImpl._setModifiedDate = false;

		quangCaoModelImpl._originalType = quangCaoModelImpl._type;

		quangCaoModelImpl._setOriginalType = false;

		quangCaoModelImpl._originalStatus = quangCaoModelImpl._status;

		quangCaoModelImpl._setOriginalStatus = false;

		quangCaoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QuangCao> toCacheModel() {
		QuangCaoCacheModel quangCaoCacheModel = new QuangCaoCacheModel();

		quangCaoCacheModel.uuid = getUuid();

		String uuid = quangCaoCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			quangCaoCacheModel.uuid = null;
		}

		quangCaoCacheModel.quangCaoId = getQuangCaoId();

		quangCaoCacheModel.groupId = getGroupId();

		quangCaoCacheModel.language = getLanguage();

		String language = quangCaoCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			quangCaoCacheModel.language = null;
		}

		quangCaoCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			quangCaoCacheModel.createDate = createDate.getTime();
		}
		else {
			quangCaoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			quangCaoCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			quangCaoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		quangCaoCacheModel.tenQuangCao = getTenQuangCao();

		String tenQuangCao = quangCaoCacheModel.tenQuangCao;

		if ((tenQuangCao != null) && (tenQuangCao.length() == 0)) {
			quangCaoCacheModel.tenQuangCao = null;
		}

		quangCaoCacheModel.moTa = getMoTa();

		String moTa = quangCaoCacheModel.moTa;

		if ((moTa != null) && (moTa.length() == 0)) {
			quangCaoCacheModel.moTa = null;
		}

		quangCaoCacheModel.target = getTarget();

		quangCaoCacheModel.imageId = getImageId();

		quangCaoCacheModel.url = getUrl();

		String url = quangCaoCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			quangCaoCacheModel.url = null;
		}

		quangCaoCacheModel.type = getType();

		quangCaoCacheModel.status = getStatus();

		return quangCaoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<QuangCao, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<QuangCao, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuangCao, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((QuangCao)this));
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
		Map<String, Function<QuangCao, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<QuangCao, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuangCao, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((QuangCao)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, QuangCao>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _quangCaoId;
	private long _originalQuangCaoId;
	private boolean _setOriginalQuangCaoId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private String _language;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _tenQuangCao;
	private String _moTa;
	private Boolean _target;
	private long _imageId;
	private String _url;
	private int _type;
	private int _originalType;
	private boolean _setOriginalType;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _columnBitmask;
	private QuangCao _escapedModel;

}