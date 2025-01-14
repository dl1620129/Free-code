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

import com.ecoit.mr.model.UserGroup;
import com.ecoit.mr.model.UserGroupModel;
import com.ecoit.mr.model.UserGroupSoap;
import com.ecoit.mr.service.persistence.UserGroupPK;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
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
 * The base model implementation for the UserGroup service. Represents a row in the &quot;ecoit_mr_UserGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>UserGroupModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserGroupImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupImpl
 * @generated
 */
@JSON(strict = true)
public class UserGroupModelImpl
	extends BaseModelImpl<UserGroup> implements UserGroupModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user group model instance should use the <code>UserGroup</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_mr_UserGroup";

	public static final Object[][] TABLE_COLUMNS = {
		{"userId", Types.BIGINT}, {"userPermissionGroupId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userPermissionGroupId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_mr_UserGroup (userId LONG not null,userPermissionGroupId LONG not null,primary key (userId, userPermissionGroupId))";

	public static final String TABLE_SQL_DROP = "drop table ecoit_mr_UserGroup";

	public static final String ORDER_BY_JPQL =
		" ORDER BY userGroup.id.userId ASC, userGroup.id.userPermissionGroupId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_mr_UserGroup.userId ASC, ecoit_mr_UserGroup.userPermissionGroupId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long USERID_COLUMN_BITMASK = 1L;

	public static final long USERPERMISSIONGROUPID_COLUMN_BITMASK = 2L;

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
	public static UserGroup toModel(UserGroupSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UserGroup model = new UserGroupImpl();

		model.setUserId(soapModel.getUserId());
		model.setUserPermissionGroupId(soapModel.getUserPermissionGroupId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<UserGroup> toModels(UserGroupSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UserGroup> models = new ArrayList<UserGroup>(soapModels.length);

		for (UserGroupSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public UserGroupModelImpl() {
	}

	@Override
	public UserGroupPK getPrimaryKey() {
		return new UserGroupPK(_userId, _userPermissionGroupId);
	}

	@Override
	public void setPrimaryKey(UserGroupPK primaryKey) {
		setUserId(primaryKey.userId);
		setUserPermissionGroupId(primaryKey.userPermissionGroupId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new UserGroupPK(_userId, _userPermissionGroupId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((UserGroupPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return UserGroup.class;
	}

	@Override
	public String getModelClassName() {
		return UserGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<UserGroup, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<UserGroup, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserGroup, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((UserGroup)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<UserGroup, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<UserGroup, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(UserGroup)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<UserGroup, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<UserGroup, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, UserGroup>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			UserGroup.class.getClassLoader(), UserGroup.class,
			ModelWrapper.class);

		try {
			Constructor<UserGroup> constructor =
				(Constructor<UserGroup>)proxyClass.getConstructor(
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

	private static final Map<String, Function<UserGroup, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<UserGroup, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<UserGroup, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<UserGroup, Object>>();
		Map<String, BiConsumer<UserGroup, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<UserGroup, ?>>();

		attributeGetterFunctions.put("userId", UserGroup::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<UserGroup, Long>)UserGroup::setUserId);
		attributeGetterFunctions.put(
			"userPermissionGroupId", UserGroup::getUserPermissionGroupId);
		attributeSetterBiConsumers.put(
			"userPermissionGroupId",
			(BiConsumer<UserGroup, Long>)UserGroup::setUserPermissionGroupId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

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

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public long getUserPermissionGroupId() {
		return _userPermissionGroupId;
	}

	@Override
	public void setUserPermissionGroupId(long userPermissionGroupId) {
		_columnBitmask |= USERPERMISSIONGROUPID_COLUMN_BITMASK;

		if (!_setOriginalUserPermissionGroupId) {
			_setOriginalUserPermissionGroupId = true;

			_originalUserPermissionGroupId = _userPermissionGroupId;
		}

		_userPermissionGroupId = userPermissionGroupId;
	}

	public long getOriginalUserPermissionGroupId() {
		return _originalUserPermissionGroupId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public UserGroup toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, UserGroup>
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
		UserGroupImpl userGroupImpl = new UserGroupImpl();

		userGroupImpl.setUserId(getUserId());
		userGroupImpl.setUserPermissionGroupId(getUserPermissionGroupId());

		userGroupImpl.resetOriginalValues();

		return userGroupImpl;
	}

	@Override
	public int compareTo(UserGroup userGroup) {
		UserGroupPK primaryKey = userGroup.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserGroup)) {
			return false;
		}

		UserGroup userGroup = (UserGroup)obj;

		UserGroupPK primaryKey = userGroup.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
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
		UserGroupModelImpl userGroupModelImpl = this;

		userGroupModelImpl._originalUserId = userGroupModelImpl._userId;

		userGroupModelImpl._setOriginalUserId = false;

		userGroupModelImpl._originalUserPermissionGroupId =
			userGroupModelImpl._userPermissionGroupId;

		userGroupModelImpl._setOriginalUserPermissionGroupId = false;

		userGroupModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<UserGroup> toCacheModel() {
		UserGroupCacheModel userGroupCacheModel = new UserGroupCacheModel();

		userGroupCacheModel.userGroupPK = getPrimaryKey();

		userGroupCacheModel.userId = getUserId();

		userGroupCacheModel.userPermissionGroupId = getUserPermissionGroupId();

		return userGroupCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<UserGroup, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<UserGroup, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserGroup, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((UserGroup)this));
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
		Map<String, Function<UserGroup, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<UserGroup, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserGroup, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((UserGroup)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, UserGroup>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _userPermissionGroupId;
	private long _originalUserPermissionGroupId;
	private boolean _setOriginalUserPermissionGroupId;
	private long _columnBitmask;
	private UserGroup _escapedModel;

}