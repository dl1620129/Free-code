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

package com.ecoit.lichcongtac.services.model.impl;

import com.ecoit.lichcongtac.services.model.LichChiTiet;
import com.ecoit.lichcongtac.services.model.LichChiTietModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
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

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the LichChiTiet service. Represents a row in the &quot;ecoit_lich_LichChiTiet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>LichChiTietModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LichChiTietImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LichChiTietImpl
 * @generated
 */
public class LichChiTietModelImpl
	extends BaseModelImpl<LichChiTiet> implements LichChiTietModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lich chi tiet model instance should use the <code>LichChiTiet</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_lich_LichChiTiet";

	public static final Object[][] TABLE_COLUMNS = {
		{"lichChiTietId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"language", Types.VARCHAR}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"createdByUser", Types.BIGINT},
		{"modifiedDate", Types.TIMESTAMP}, {"modifiedByUser", Types.BIGINT},
		{"gioBatDau", Types.TIMESTAMP}, {"moTa", Types.VARCHAR},
		{"nguoiThamDu", Types.VARCHAR}, {"nguoiChuTri", Types.VARCHAR},
		{"selectedDate", Types.TIMESTAMP}, {"trangthaiChiTiet", Types.INTEGER},
		{"lichCongTacId", Types.BIGINT}, {"address", Types.VARCHAR},
		{"note", Types.VARCHAR}, {"lydoTraVe", Types.VARCHAR},
		{"organizationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("lichChiTietId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("language", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdByUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedByUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("gioBatDau", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("moTa", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nguoiThamDu", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nguoiChuTri", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("selectedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("trangthaiChiTiet", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("lichCongTacId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("note", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lydoTraVe", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("organizationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_lich_LichChiTiet (lichChiTietId LONG not null primary key,groupId LONG,language VARCHAR(75) null,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,createdByUser LONG,modifiedDate DATE null,modifiedByUser LONG,gioBatDau DATE null,moTa VARCHAR(550) null,nguoiThamDu STRING null,nguoiChuTri STRING null,selectedDate DATE null,trangthaiChiTiet INTEGER,lichCongTacId LONG,address VARCHAR(250) null,note VARCHAR(250) null,lydoTraVe STRING null,organizationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table ecoit_lich_LichChiTiet";

	public static final String ORDER_BY_JPQL =
		" ORDER BY lichChiTiet.lichChiTietId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_lich_LichChiTiet.lichChiTietId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long LICHCONGTACID_COLUMN_BITMASK = 1L;

	public static final long LICHCHITIETID_COLUMN_BITMASK = 2L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	public LichChiTietModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _lichChiTietId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLichChiTietId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lichChiTietId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LichChiTiet.class;
	}

	@Override
	public String getModelClassName() {
		return LichChiTiet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<LichChiTiet, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<LichChiTiet, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LichChiTiet, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((LichChiTiet)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<LichChiTiet, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<LichChiTiet, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(LichChiTiet)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<LichChiTiet, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<LichChiTiet, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, LichChiTiet>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			LichChiTiet.class.getClassLoader(), LichChiTiet.class,
			ModelWrapper.class);

		try {
			Constructor<LichChiTiet> constructor =
				(Constructor<LichChiTiet>)proxyClass.getConstructor(
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

	private static final Map<String, Function<LichChiTiet, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<LichChiTiet, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<LichChiTiet, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<LichChiTiet, Object>>();
		Map<String, BiConsumer<LichChiTiet, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<LichChiTiet, ?>>();

		attributeGetterFunctions.put(
			"lichChiTietId", LichChiTiet::getLichChiTietId);
		attributeSetterBiConsumers.put(
			"lichChiTietId",
			(BiConsumer<LichChiTiet, Long>)LichChiTiet::setLichChiTietId);
		attributeGetterFunctions.put("groupId", LichChiTiet::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<LichChiTiet, Long>)LichChiTiet::setGroupId);
		attributeGetterFunctions.put("language", LichChiTiet::getLanguage);
		attributeSetterBiConsumers.put(
			"language",
			(BiConsumer<LichChiTiet, String>)LichChiTiet::setLanguage);
		attributeGetterFunctions.put("companyId", LichChiTiet::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<LichChiTiet, Long>)LichChiTiet::setCompanyId);
		attributeGetterFunctions.put("userId", LichChiTiet::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<LichChiTiet, Long>)LichChiTiet::setUserId);
		attributeGetterFunctions.put("userName", LichChiTiet::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<LichChiTiet, String>)LichChiTiet::setUserName);
		attributeGetterFunctions.put("createDate", LichChiTiet::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<LichChiTiet, Date>)LichChiTiet::setCreateDate);
		attributeGetterFunctions.put(
			"createdByUser", LichChiTiet::getCreatedByUser);
		attributeSetterBiConsumers.put(
			"createdByUser",
			(BiConsumer<LichChiTiet, Long>)LichChiTiet::setCreatedByUser);
		attributeGetterFunctions.put(
			"modifiedDate", LichChiTiet::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<LichChiTiet, Date>)LichChiTiet::setModifiedDate);
		attributeGetterFunctions.put(
			"modifiedByUser", LichChiTiet::getModifiedByUser);
		attributeSetterBiConsumers.put(
			"modifiedByUser",
			(BiConsumer<LichChiTiet, Long>)LichChiTiet::setModifiedByUser);
		attributeGetterFunctions.put("gioBatDau", LichChiTiet::getGioBatDau);
		attributeSetterBiConsumers.put(
			"gioBatDau",
			(BiConsumer<LichChiTiet, Date>)LichChiTiet::setGioBatDau);
		attributeGetterFunctions.put("moTa", LichChiTiet::getMoTa);
		attributeSetterBiConsumers.put(
			"moTa", (BiConsumer<LichChiTiet, String>)LichChiTiet::setMoTa);
		attributeGetterFunctions.put(
			"nguoiThamDu", LichChiTiet::getNguoiThamDu);
		attributeSetterBiConsumers.put(
			"nguoiThamDu",
			(BiConsumer<LichChiTiet, String>)LichChiTiet::setNguoiThamDu);
		attributeGetterFunctions.put(
			"nguoiChuTri", LichChiTiet::getNguoiChuTri);
		attributeSetterBiConsumers.put(
			"nguoiChuTri",
			(BiConsumer<LichChiTiet, String>)LichChiTiet::setNguoiChuTri);
		attributeGetterFunctions.put(
			"selectedDate", LichChiTiet::getSelectedDate);
		attributeSetterBiConsumers.put(
			"selectedDate",
			(BiConsumer<LichChiTiet, Date>)LichChiTiet::setSelectedDate);
		attributeGetterFunctions.put(
			"trangthaiChiTiet", LichChiTiet::getTrangthaiChiTiet);
		attributeSetterBiConsumers.put(
			"trangthaiChiTiet",
			(BiConsumer<LichChiTiet, Integer>)LichChiTiet::setTrangthaiChiTiet);
		attributeGetterFunctions.put(
			"lichCongTacId", LichChiTiet::getLichCongTacId);
		attributeSetterBiConsumers.put(
			"lichCongTacId",
			(BiConsumer<LichChiTiet, Long>)LichChiTiet::setLichCongTacId);
		attributeGetterFunctions.put("address", LichChiTiet::getAddress);
		attributeSetterBiConsumers.put(
			"address",
			(BiConsumer<LichChiTiet, String>)LichChiTiet::setAddress);
		attributeGetterFunctions.put("note", LichChiTiet::getNote);
		attributeSetterBiConsumers.put(
			"note", (BiConsumer<LichChiTiet, String>)LichChiTiet::setNote);
		attributeGetterFunctions.put("lydoTraVe", LichChiTiet::getLydoTraVe);
		attributeSetterBiConsumers.put(
			"lydoTraVe",
			(BiConsumer<LichChiTiet, String>)LichChiTiet::setLydoTraVe);
		attributeGetterFunctions.put(
			"organizationId", LichChiTiet::getOrganizationId);
		attributeSetterBiConsumers.put(
			"organizationId",
			(BiConsumer<LichChiTiet, Long>)LichChiTiet::setOrganizationId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getLichChiTietId() {
		return _lichChiTietId;
	}

	@Override
	public void setLichChiTietId(long lichChiTietId) {
		_lichChiTietId = lichChiTietId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

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
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

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

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public long getCreatedByUser() {
		return _createdByUser;
	}

	@Override
	public void setCreatedByUser(long createdByUser) {
		_createdByUser = createdByUser;
	}

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

	@Override
	public long getModifiedByUser() {
		return _modifiedByUser;
	}

	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	@Override
	public Date getGioBatDau() {
		return _gioBatDau;
	}

	@Override
	public void setGioBatDau(Date gioBatDau) {
		_gioBatDau = gioBatDau;
	}

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

	@Override
	public String getNguoiThamDu() {
		if (_nguoiThamDu == null) {
			return "";
		}
		else {
			return _nguoiThamDu;
		}
	}

	@Override
	public void setNguoiThamDu(String nguoiThamDu) {
		_nguoiThamDu = nguoiThamDu;
	}

	@Override
	public String getNguoiChuTri() {
		if (_nguoiChuTri == null) {
			return "";
		}
		else {
			return _nguoiChuTri;
		}
	}

	@Override
	public void setNguoiChuTri(String nguoiChuTri) {
		_nguoiChuTri = nguoiChuTri;
	}

	@Override
	public Date getSelectedDate() {
		return _selectedDate;
	}

	@Override
	public void setSelectedDate(Date selectedDate) {
		_selectedDate = selectedDate;
	}

	@Override
	public int getTrangthaiChiTiet() {
		return _trangthaiChiTiet;
	}

	@Override
	public void setTrangthaiChiTiet(int trangthaiChiTiet) {
		_trangthaiChiTiet = trangthaiChiTiet;
	}

	@Override
	public long getLichCongTacId() {
		return _lichCongTacId;
	}

	@Override
	public void setLichCongTacId(long lichCongTacId) {
		_columnBitmask |= LICHCONGTACID_COLUMN_BITMASK;

		if (!_setOriginalLichCongTacId) {
			_setOriginalLichCongTacId = true;

			_originalLichCongTacId = _lichCongTacId;
		}

		_lichCongTacId = lichCongTacId;
	}

	public long getOriginalLichCongTacId() {
		return _originalLichCongTacId;
	}

	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@Override
	public String getNote() {
		if (_note == null) {
			return "";
		}
		else {
			return _note;
		}
	}

	@Override
	public void setNote(String note) {
		_note = note;
	}

	@Override
	public String getLydoTraVe() {
		if (_lydoTraVe == null) {
			return "";
		}
		else {
			return _lydoTraVe;
		}
	}

	@Override
	public void setLydoTraVe(String lydoTraVe) {
		_lydoTraVe = lydoTraVe;
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), LichChiTiet.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LichChiTiet toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, LichChiTiet>
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
		LichChiTietImpl lichChiTietImpl = new LichChiTietImpl();

		lichChiTietImpl.setLichChiTietId(getLichChiTietId());
		lichChiTietImpl.setGroupId(getGroupId());
		lichChiTietImpl.setLanguage(getLanguage());
		lichChiTietImpl.setCompanyId(getCompanyId());
		lichChiTietImpl.setUserId(getUserId());
		lichChiTietImpl.setUserName(getUserName());
		lichChiTietImpl.setCreateDate(getCreateDate());
		lichChiTietImpl.setCreatedByUser(getCreatedByUser());
		lichChiTietImpl.setModifiedDate(getModifiedDate());
		lichChiTietImpl.setModifiedByUser(getModifiedByUser());
		lichChiTietImpl.setGioBatDau(getGioBatDau());
		lichChiTietImpl.setMoTa(getMoTa());
		lichChiTietImpl.setNguoiThamDu(getNguoiThamDu());
		lichChiTietImpl.setNguoiChuTri(getNguoiChuTri());
		lichChiTietImpl.setSelectedDate(getSelectedDate());
		lichChiTietImpl.setTrangthaiChiTiet(getTrangthaiChiTiet());
		lichChiTietImpl.setLichCongTacId(getLichCongTacId());
		lichChiTietImpl.setAddress(getAddress());
		lichChiTietImpl.setNote(getNote());
		lichChiTietImpl.setLydoTraVe(getLydoTraVe());
		lichChiTietImpl.setOrganizationId(getOrganizationId());

		lichChiTietImpl.resetOriginalValues();

		return lichChiTietImpl;
	}

	@Override
	public int compareTo(LichChiTiet lichChiTiet) {
		long primaryKey = lichChiTiet.getPrimaryKey();

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

		if (!(obj instanceof LichChiTiet)) {
			return false;
		}

		LichChiTiet lichChiTiet = (LichChiTiet)obj;

		long primaryKey = lichChiTiet.getPrimaryKey();

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
		LichChiTietModelImpl lichChiTietModelImpl = this;

		lichChiTietModelImpl._setModifiedDate = false;

		lichChiTietModelImpl._originalLichCongTacId =
			lichChiTietModelImpl._lichCongTacId;

		lichChiTietModelImpl._setOriginalLichCongTacId = false;

		lichChiTietModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LichChiTiet> toCacheModel() {
		LichChiTietCacheModel lichChiTietCacheModel =
			new LichChiTietCacheModel();

		lichChiTietCacheModel.lichChiTietId = getLichChiTietId();

		lichChiTietCacheModel.groupId = getGroupId();

		lichChiTietCacheModel.language = getLanguage();

		String language = lichChiTietCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			lichChiTietCacheModel.language = null;
		}

		lichChiTietCacheModel.companyId = getCompanyId();

		lichChiTietCacheModel.userId = getUserId();

		lichChiTietCacheModel.userName = getUserName();

		String userName = lichChiTietCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			lichChiTietCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			lichChiTietCacheModel.createDate = createDate.getTime();
		}
		else {
			lichChiTietCacheModel.createDate = Long.MIN_VALUE;
		}

		lichChiTietCacheModel.createdByUser = getCreatedByUser();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			lichChiTietCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			lichChiTietCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		lichChiTietCacheModel.modifiedByUser = getModifiedByUser();

		Date gioBatDau = getGioBatDau();

		if (gioBatDau != null) {
			lichChiTietCacheModel.gioBatDau = gioBatDau.getTime();
		}
		else {
			lichChiTietCacheModel.gioBatDau = Long.MIN_VALUE;
		}

		lichChiTietCacheModel.moTa = getMoTa();

		String moTa = lichChiTietCacheModel.moTa;

		if ((moTa != null) && (moTa.length() == 0)) {
			lichChiTietCacheModel.moTa = null;
		}

		lichChiTietCacheModel.nguoiThamDu = getNguoiThamDu();

		String nguoiThamDu = lichChiTietCacheModel.nguoiThamDu;

		if ((nguoiThamDu != null) && (nguoiThamDu.length() == 0)) {
			lichChiTietCacheModel.nguoiThamDu = null;
		}

		lichChiTietCacheModel.nguoiChuTri = getNguoiChuTri();

		String nguoiChuTri = lichChiTietCacheModel.nguoiChuTri;

		if ((nguoiChuTri != null) && (nguoiChuTri.length() == 0)) {
			lichChiTietCacheModel.nguoiChuTri = null;
		}

		Date selectedDate = getSelectedDate();

		if (selectedDate != null) {
			lichChiTietCacheModel.selectedDate = selectedDate.getTime();
		}
		else {
			lichChiTietCacheModel.selectedDate = Long.MIN_VALUE;
		}

		lichChiTietCacheModel.trangthaiChiTiet = getTrangthaiChiTiet();

		lichChiTietCacheModel.lichCongTacId = getLichCongTacId();

		lichChiTietCacheModel.address = getAddress();

		String address = lichChiTietCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			lichChiTietCacheModel.address = null;
		}

		lichChiTietCacheModel.note = getNote();

		String note = lichChiTietCacheModel.note;

		if ((note != null) && (note.length() == 0)) {
			lichChiTietCacheModel.note = null;
		}

		lichChiTietCacheModel.lydoTraVe = getLydoTraVe();

		String lydoTraVe = lichChiTietCacheModel.lydoTraVe;

		if ((lydoTraVe != null) && (lydoTraVe.length() == 0)) {
			lichChiTietCacheModel.lydoTraVe = null;
		}

		lichChiTietCacheModel.organizationId = getOrganizationId();

		return lichChiTietCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<LichChiTiet, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<LichChiTiet, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LichChiTiet, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((LichChiTiet)this));
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
		Map<String, Function<LichChiTiet, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<LichChiTiet, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LichChiTiet, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((LichChiTiet)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, LichChiTiet>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _lichChiTietId;
	private long _groupId;
	private String _language;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private long _createdByUser;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _modifiedByUser;
	private Date _gioBatDau;
	private String _moTa;
	private String _nguoiThamDu;
	private String _nguoiChuTri;
	private Date _selectedDate;
	private int _trangthaiChiTiet;
	private long _lichCongTacId;
	private long _originalLichCongTacId;
	private boolean _setOriginalLichCongTacId;
	private String _address;
	private String _note;
	private String _lydoTraVe;
	private long _organizationId;
	private long _columnBitmask;
	private LichChiTiet _escapedModel;

}