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

package com.ecoit.mr.model.impl;

import com.ecoit.mr.model.Unit;
import com.ecoit.mr.model.UnitModel;
import com.ecoit.mr.model.UnitSoap;

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
 * The base model implementation for the Unit service. Represents a row in the &quot;ecoit_mr_Unit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>UnitModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UnitImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnitImpl
 * @generated
 */
@JSON(strict = true)
public class UnitModelImpl extends BaseModelImpl<Unit> implements UnitModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a unit model instance should use the <code>Unit</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_mr_Unit";

	public static final Object[][] TABLE_COLUMNS = {
		{"unitId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"createdByUser", Types.BIGINT},
		{"modifiedByUser", Types.BIGINT}, {"name", Types.VARCHAR},
		{"description", Types.VARCHAR}, {"language", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("unitId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdByUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedByUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("language", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_mr_Unit (unitId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,createdByUser LONG,modifiedByUser LONG,name VARCHAR(250) null,description VARCHAR(550) null,language VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table ecoit_mr_Unit";

	public static final String ORDER_BY_JPQL = " ORDER BY unit.unitId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_mr_Unit.unitId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

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
	public static Unit toModel(UnitSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Unit model = new UnitImpl();

		model.setUnitId(soapModel.getUnitId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setModifiedByUser(soapModel.getModifiedByUser());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setLanguage(soapModel.getLanguage());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Unit> toModels(UnitSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Unit> models = new ArrayList<Unit>(soapModels.length);

		for (UnitSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public UnitModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _unitId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUnitId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _unitId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Unit.class;
	}

	@Override
	public String getModelClassName() {
		return Unit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Unit, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Unit, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Unit, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Unit)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Unit, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Unit, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Unit)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Unit, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Unit, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Unit>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Unit.class.getClassLoader(), Unit.class, ModelWrapper.class);

		try {
			Constructor<Unit> constructor =
				(Constructor<Unit>)proxyClass.getConstructor(
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

	private static final Map<String, Function<Unit, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Unit, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Unit, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Unit, Object>>();
		Map<String, BiConsumer<Unit, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Unit, ?>>();

		attributeGetterFunctions.put("unitId", Unit::getUnitId);
		attributeSetterBiConsumers.put(
			"unitId", (BiConsumer<Unit, Long>)Unit::setUnitId);
		attributeGetterFunctions.put("groupId", Unit::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Unit, Long>)Unit::setGroupId);
		attributeGetterFunctions.put("companyId", Unit::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Unit, Long>)Unit::setCompanyId);
		attributeGetterFunctions.put("userId", Unit::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Unit, Long>)Unit::setUserId);
		attributeGetterFunctions.put("userName", Unit::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Unit, String>)Unit::setUserName);
		attributeGetterFunctions.put("createDate", Unit::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Unit, Date>)Unit::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Unit::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Unit, Date>)Unit::setModifiedDate);
		attributeGetterFunctions.put("createdByUser", Unit::getCreatedByUser);
		attributeSetterBiConsumers.put(
			"createdByUser", (BiConsumer<Unit, Long>)Unit::setCreatedByUser);
		attributeGetterFunctions.put("modifiedByUser", Unit::getModifiedByUser);
		attributeSetterBiConsumers.put(
			"modifiedByUser", (BiConsumer<Unit, Long>)Unit::setModifiedByUser);
		attributeGetterFunctions.put("name", Unit::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Unit, String>)Unit::setName);
		attributeGetterFunctions.put("description", Unit::getDescription);
		attributeSetterBiConsumers.put(
			"description", (BiConsumer<Unit, String>)Unit::setDescription);
		attributeGetterFunctions.put("language", Unit::getLanguage);
		attributeSetterBiConsumers.put(
			"language", (BiConsumer<Unit, String>)Unit::setLanguage);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getUnitId() {
		return _unitId;
	}

	@Override
	public void setUnitId(long unitId) {
		_unitId = unitId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
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
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
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
	public long getCreatedByUser() {
		return _createdByUser;
	}

	@Override
	public void setCreatedByUser(long createdByUser) {
		_createdByUser = createdByUser;
	}

	@JSON
	@Override
	public long getModifiedByUser() {
		return _modifiedByUser;
	}

	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Unit.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Unit toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Unit>
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
		UnitImpl unitImpl = new UnitImpl();

		unitImpl.setUnitId(getUnitId());
		unitImpl.setGroupId(getGroupId());
		unitImpl.setCompanyId(getCompanyId());
		unitImpl.setUserId(getUserId());
		unitImpl.setUserName(getUserName());
		unitImpl.setCreateDate(getCreateDate());
		unitImpl.setModifiedDate(getModifiedDate());
		unitImpl.setCreatedByUser(getCreatedByUser());
		unitImpl.setModifiedByUser(getModifiedByUser());
		unitImpl.setName(getName());
		unitImpl.setDescription(getDescription());
		unitImpl.setLanguage(getLanguage());

		unitImpl.resetOriginalValues();

		return unitImpl;
	}

	@Override
	public int compareTo(Unit unit) {
		long primaryKey = unit.getPrimaryKey();

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

		if (!(obj instanceof Unit)) {
			return false;
		}

		Unit unit = (Unit)obj;

		long primaryKey = unit.getPrimaryKey();

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
		UnitModelImpl unitModelImpl = this;

		unitModelImpl._setModifiedDate = false;
	}

	@Override
	public CacheModel<Unit> toCacheModel() {
		UnitCacheModel unitCacheModel = new UnitCacheModel();

		unitCacheModel.unitId = getUnitId();

		unitCacheModel.groupId = getGroupId();

		unitCacheModel.companyId = getCompanyId();

		unitCacheModel.userId = getUserId();

		unitCacheModel.userName = getUserName();

		String userName = unitCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			unitCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			unitCacheModel.createDate = createDate.getTime();
		}
		else {
			unitCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			unitCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			unitCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		unitCacheModel.createdByUser = getCreatedByUser();

		unitCacheModel.modifiedByUser = getModifiedByUser();

		unitCacheModel.name = getName();

		String name = unitCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			unitCacheModel.name = null;
		}

		unitCacheModel.description = getDescription();

		String description = unitCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			unitCacheModel.description = null;
		}

		unitCacheModel.language = getLanguage();

		String language = unitCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			unitCacheModel.language = null;
		}

		return unitCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Unit, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Unit, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Unit, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Unit)this));
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
		Map<String, Function<Unit, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Unit, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Unit, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Unit)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Unit>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _unitId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _createdByUser;
	private long _modifiedByUser;
	private String _name;
	private String _description;
	private String _language;
	private Unit _escapedModel;

}