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

import com.ecoit.elegaldocument.model.LegalOrg;
import com.ecoit.elegaldocument.model.LegalOrgModel;
import com.ecoit.elegaldocument.model.LegalOrgSoap;

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
 * The base model implementation for the LegalOrg service. Represents a row in the &quot;ecoit_doc_LegalOrg&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>LegalOrgModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegalOrgImpl}.
 * </p>
 *
 * @author Liverpool
 * @see LegalOrgImpl
 * @generated
 */
@JSON(strict = true)
public class LegalOrgModelImpl
	extends BaseModelImpl<LegalOrg> implements LegalOrgModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a legal org model instance should use the <code>LegalOrg</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_doc_LegalOrg";

	public static final Object[][] TABLE_COLUMNS = {
		{"organizationId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"createdDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"createdByUser", Types.BIGINT}, {"modifiedByUser", Types.BIGINT},
		{"name", Types.VARCHAR}, {"description", Types.VARCHAR},
		{"language", Types.VARCHAR}, {"statusOrg", Types.BOOLEAN},
		{"rssable", Types.BOOLEAN}, {"position", Types.INTEGER},
		{"parentId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("organizationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdByUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedByUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("language", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusOrg", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("rssable", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("position", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("parentId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_doc_LegalOrg (organizationId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,createdDate DATE null,modifiedDate DATE null,createdByUser LONG,modifiedByUser LONG,name VARCHAR(250) null,description VARCHAR(550) null,language VARCHAR(75) null,statusOrg BOOLEAN,rssable BOOLEAN,position INTEGER,parentId LONG)";

	public static final String TABLE_SQL_DROP = "drop table ecoit_doc_LegalOrg";

	public static final String ORDER_BY_JPQL =
		" ORDER BY legalOrg.position ASC, legalOrg.name ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_doc_LegalOrg.position ASC, ecoit_doc_LegalOrg.name ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long LANGUAGE_COLUMN_BITMASK = 4L;

	public static final long ORGANIZATIONID_COLUMN_BITMASK = 8L;

	public static final long PARENTID_COLUMN_BITMASK = 16L;

	public static final long RSSABLE_COLUMN_BITMASK = 32L;

	public static final long STATUSORG_COLUMN_BITMASK = 64L;

	public static final long POSITION_COLUMN_BITMASK = 128L;

	public static final long NAME_COLUMN_BITMASK = 256L;

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
	public static LegalOrg toModel(LegalOrgSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		LegalOrg model = new LegalOrgImpl();

		model.setOrganizationId(soapModel.getOrganizationId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setModifiedByUser(soapModel.getModifiedByUser());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setLanguage(soapModel.getLanguage());
		model.setStatusOrg(soapModel.isStatusOrg());
		model.setRssable(soapModel.isRssable());
		model.setPosition(soapModel.getPosition());
		model.setParentId(soapModel.getParentId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<LegalOrg> toModels(LegalOrgSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<LegalOrg> models = new ArrayList<LegalOrg>(soapModels.length);

		for (LegalOrgSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public LegalOrgModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _organizationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOrganizationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _organizationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LegalOrg.class;
	}

	@Override
	public String getModelClassName() {
		return LegalOrg.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<LegalOrg, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<LegalOrg, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LegalOrg, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((LegalOrg)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<LegalOrg, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<LegalOrg, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(LegalOrg)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<LegalOrg, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<LegalOrg, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, LegalOrg>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			LegalOrg.class.getClassLoader(), LegalOrg.class,
			ModelWrapper.class);

		try {
			Constructor<LegalOrg> constructor =
				(Constructor<LegalOrg>)proxyClass.getConstructor(
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

	private static final Map<String, Function<LegalOrg, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<LegalOrg, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<LegalOrg, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<LegalOrg, Object>>();
		Map<String, BiConsumer<LegalOrg, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<LegalOrg, ?>>();

		attributeGetterFunctions.put(
			"organizationId", LegalOrg::getOrganizationId);
		attributeSetterBiConsumers.put(
			"organizationId",
			(BiConsumer<LegalOrg, Long>)LegalOrg::setOrganizationId);
		attributeGetterFunctions.put("groupId", LegalOrg::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<LegalOrg, Long>)LegalOrg::setGroupId);
		attributeGetterFunctions.put("companyId", LegalOrg::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<LegalOrg, Long>)LegalOrg::setCompanyId);
		attributeGetterFunctions.put("userId", LegalOrg::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<LegalOrg, Long>)LegalOrg::setUserId);
		attributeGetterFunctions.put("createdDate", LegalOrg::getCreatedDate);
		attributeSetterBiConsumers.put(
			"createdDate",
			(BiConsumer<LegalOrg, Date>)LegalOrg::setCreatedDate);
		attributeGetterFunctions.put("modifiedDate", LegalOrg::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<LegalOrg, Date>)LegalOrg::setModifiedDate);
		attributeGetterFunctions.put(
			"createdByUser", LegalOrg::getCreatedByUser);
		attributeSetterBiConsumers.put(
			"createdByUser",
			(BiConsumer<LegalOrg, Long>)LegalOrg::setCreatedByUser);
		attributeGetterFunctions.put(
			"modifiedByUser", LegalOrg::getModifiedByUser);
		attributeSetterBiConsumers.put(
			"modifiedByUser",
			(BiConsumer<LegalOrg, Long>)LegalOrg::setModifiedByUser);
		attributeGetterFunctions.put("name", LegalOrg::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<LegalOrg, String>)LegalOrg::setName);
		attributeGetterFunctions.put("description", LegalOrg::getDescription);
		attributeSetterBiConsumers.put(
			"description",
			(BiConsumer<LegalOrg, String>)LegalOrg::setDescription);
		attributeGetterFunctions.put("language", LegalOrg::getLanguage);
		attributeSetterBiConsumers.put(
			"language", (BiConsumer<LegalOrg, String>)LegalOrg::setLanguage);
		attributeGetterFunctions.put("statusOrg", LegalOrg::getStatusOrg);
		attributeSetterBiConsumers.put(
			"statusOrg", (BiConsumer<LegalOrg, Boolean>)LegalOrg::setStatusOrg);
		attributeGetterFunctions.put("rssable", LegalOrg::getRssable);
		attributeSetterBiConsumers.put(
			"rssable", (BiConsumer<LegalOrg, Boolean>)LegalOrg::setRssable);
		attributeGetterFunctions.put("position", LegalOrg::getPosition);
		attributeSetterBiConsumers.put(
			"position", (BiConsumer<LegalOrg, Integer>)LegalOrg::setPosition);
		attributeGetterFunctions.put("parentId", LegalOrg::getParentId);
		attributeSetterBiConsumers.put(
			"parentId", (BiConsumer<LegalOrg, Long>)LegalOrg::setParentId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_columnBitmask |= ORGANIZATIONID_COLUMN_BITMASK;

		if (!_setOriginalOrganizationId) {
			_setOriginalOrganizationId = true;

			_originalOrganizationId = _organizationId;
		}

		_organizationId = organizationId;
	}

	public long getOriginalOrganizationId() {
		return _originalOrganizationId;
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
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
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
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
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
		_columnBitmask = -1L;

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
		_columnBitmask |= LANGUAGE_COLUMN_BITMASK;

		if (_originalLanguage == null) {
			_originalLanguage = _language;
		}

		_language = language;
	}

	public String getOriginalLanguage() {
		return GetterUtil.getString(_originalLanguage);
	}

	@JSON
	@Override
	public boolean getStatusOrg() {
		return _statusOrg;
	}

	@JSON
	@Override
	public boolean isStatusOrg() {
		return _statusOrg;
	}

	@Override
	public void setStatusOrg(boolean statusOrg) {
		_columnBitmask |= STATUSORG_COLUMN_BITMASK;

		if (!_setOriginalStatusOrg) {
			_setOriginalStatusOrg = true;

			_originalStatusOrg = _statusOrg;
		}

		_statusOrg = statusOrg;
	}

	public boolean getOriginalStatusOrg() {
		return _originalStatusOrg;
	}

	@JSON
	@Override
	public boolean getRssable() {
		return _rssable;
	}

	@JSON
	@Override
	public boolean isRssable() {
		return _rssable;
	}

	@Override
	public void setRssable(boolean rssable) {
		_columnBitmask |= RSSABLE_COLUMN_BITMASK;

		if (!_setOriginalRssable) {
			_setOriginalRssable = true;

			_originalRssable = _rssable;
		}

		_rssable = rssable;
	}

	public boolean getOriginalRssable() {
		return _originalRssable;
	}

	@JSON
	@Override
	public int getPosition() {
		return _position;
	}

	@Override
	public void setPosition(int position) {
		_columnBitmask = -1L;

		_position = position;
	}

	@JSON
	@Override
	public long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(long parentId) {
		_columnBitmask |= PARENTID_COLUMN_BITMASK;

		if (!_setOriginalParentId) {
			_setOriginalParentId = true;

			_originalParentId = _parentId;
		}

		_parentId = parentId;
	}

	public long getOriginalParentId() {
		return _originalParentId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), LegalOrg.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LegalOrg toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, LegalOrg>
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
		LegalOrgImpl legalOrgImpl = new LegalOrgImpl();

		legalOrgImpl.setOrganizationId(getOrganizationId());
		legalOrgImpl.setGroupId(getGroupId());
		legalOrgImpl.setCompanyId(getCompanyId());
		legalOrgImpl.setUserId(getUserId());
		legalOrgImpl.setCreatedDate(getCreatedDate());
		legalOrgImpl.setModifiedDate(getModifiedDate());
		legalOrgImpl.setCreatedByUser(getCreatedByUser());
		legalOrgImpl.setModifiedByUser(getModifiedByUser());
		legalOrgImpl.setName(getName());
		legalOrgImpl.setDescription(getDescription());
		legalOrgImpl.setLanguage(getLanguage());
		legalOrgImpl.setStatusOrg(isStatusOrg());
		legalOrgImpl.setRssable(isRssable());
		legalOrgImpl.setPosition(getPosition());
		legalOrgImpl.setParentId(getParentId());

		legalOrgImpl.resetOriginalValues();

		return legalOrgImpl;
	}

	@Override
	public int compareTo(LegalOrg legalOrg) {
		int value = 0;

		if (getPosition() < legalOrg.getPosition()) {
			value = -1;
		}
		else if (getPosition() > legalOrg.getPosition()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = getName().compareToIgnoreCase(legalOrg.getName());

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

		if (!(obj instanceof LegalOrg)) {
			return false;
		}

		LegalOrg legalOrg = (LegalOrg)obj;

		long primaryKey = legalOrg.getPrimaryKey();

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
		LegalOrgModelImpl legalOrgModelImpl = this;

		legalOrgModelImpl._originalOrganizationId =
			legalOrgModelImpl._organizationId;

		legalOrgModelImpl._setOriginalOrganizationId = false;

		legalOrgModelImpl._originalGroupId = legalOrgModelImpl._groupId;

		legalOrgModelImpl._setOriginalGroupId = false;

		legalOrgModelImpl._originalCompanyId = legalOrgModelImpl._companyId;

		legalOrgModelImpl._setOriginalCompanyId = false;

		legalOrgModelImpl._originalLanguage = legalOrgModelImpl._language;

		legalOrgModelImpl._originalStatusOrg = legalOrgModelImpl._statusOrg;

		legalOrgModelImpl._setOriginalStatusOrg = false;

		legalOrgModelImpl._originalRssable = legalOrgModelImpl._rssable;

		legalOrgModelImpl._setOriginalRssable = false;

		legalOrgModelImpl._originalParentId = legalOrgModelImpl._parentId;

		legalOrgModelImpl._setOriginalParentId = false;

		legalOrgModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LegalOrg> toCacheModel() {
		LegalOrgCacheModel legalOrgCacheModel = new LegalOrgCacheModel();

		legalOrgCacheModel.organizationId = getOrganizationId();

		legalOrgCacheModel.groupId = getGroupId();

		legalOrgCacheModel.companyId = getCompanyId();

		legalOrgCacheModel.userId = getUserId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			legalOrgCacheModel.createdDate = createdDate.getTime();
		}
		else {
			legalOrgCacheModel.createdDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			legalOrgCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			legalOrgCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		legalOrgCacheModel.createdByUser = getCreatedByUser();

		legalOrgCacheModel.modifiedByUser = getModifiedByUser();

		legalOrgCacheModel.name = getName();

		String name = legalOrgCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			legalOrgCacheModel.name = null;
		}

		legalOrgCacheModel.description = getDescription();

		String description = legalOrgCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			legalOrgCacheModel.description = null;
		}

		legalOrgCacheModel.language = getLanguage();

		String language = legalOrgCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			legalOrgCacheModel.language = null;
		}

		legalOrgCacheModel.statusOrg = isStatusOrg();

		legalOrgCacheModel.rssable = isRssable();

		legalOrgCacheModel.position = getPosition();

		legalOrgCacheModel.parentId = getParentId();

		return legalOrgCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<LegalOrg, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<LegalOrg, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LegalOrg, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((LegalOrg)this));
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
		Map<String, Function<LegalOrg, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<LegalOrg, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LegalOrg, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((LegalOrg)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, LegalOrg>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _organizationId;
	private long _originalOrganizationId;
	private boolean _setOriginalOrganizationId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private Date _createdDate;
	private Date _modifiedDate;
	private long _createdByUser;
	private long _modifiedByUser;
	private String _name;
	private String _description;
	private String _language;
	private String _originalLanguage;
	private boolean _statusOrg;
	private boolean _originalStatusOrg;
	private boolean _setOriginalStatusOrg;
	private boolean _rssable;
	private boolean _originalRssable;
	private boolean _setOriginalRssable;
	private int _position;
	private long _parentId;
	private long _originalParentId;
	private boolean _setOriginalParentId;
	private long _columnBitmask;
	private LegalOrg _escapedModel;

}