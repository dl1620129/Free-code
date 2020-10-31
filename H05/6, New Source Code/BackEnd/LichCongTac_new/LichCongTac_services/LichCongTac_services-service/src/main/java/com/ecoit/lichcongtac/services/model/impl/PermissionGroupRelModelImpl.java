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

import com.ecoit.lichcongtac.services.model.PermissionGroupRel;
import com.ecoit.lichcongtac.services.model.PermissionGroupRelModel;
import com.ecoit.lichcongtac.services.model.PermissionGroupRelSoap;
import com.ecoit.lichcongtac.services.service.persistence.PermissionGroupRelPK;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
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
 * The base model implementation for the PermissionGroupRel service. Represents a row in the &quot;ecoit_lich_PermissionGroupRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PermissionGroupRelModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PermissionGroupRelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PermissionGroupRelImpl
 * @generated
 */
@JSON(strict = true)
public class PermissionGroupRelModelImpl
	extends BaseModelImpl<PermissionGroupRel>
	implements PermissionGroupRelModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a permission group rel model instance should use the <code>PermissionGroupRel</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_lich_PermissionGroupRel";

	public static final Object[][] TABLE_COLUMNS = {
		{"userPermissionGroupId", Types.BIGINT}, {"permissionId", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("userPermissionGroupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("permissionId", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_lich_PermissionGroupRel (userPermissionGroupId LONG not null,permissionId INTEGER not null,primary key (userPermissionGroupId, permissionId))";

	public static final String TABLE_SQL_DROP =
		"drop table ecoit_lich_PermissionGroupRel";

	public static final String ORDER_BY_JPQL =
		" ORDER BY permissionGroupRel.id.userPermissionGroupId ASC, permissionGroupRel.id.permissionId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_lich_PermissionGroupRel.userPermissionGroupId ASC, ecoit_lich_PermissionGroupRel.permissionId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long USERPERMISSIONGROUPID_COLUMN_BITMASK = 1L;

	public static final long PERMISSIONID_COLUMN_BITMASK = 2L;

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
	public static PermissionGroupRel toModel(PermissionGroupRelSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		PermissionGroupRel model = new PermissionGroupRelImpl();

		model.setUserPermissionGroupId(soapModel.getUserPermissionGroupId());
		model.setPermissionId(soapModel.getPermissionId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<PermissionGroupRel> toModels(
		PermissionGroupRelSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<PermissionGroupRel> models = new ArrayList<PermissionGroupRel>(
			soapModels.length);

		for (PermissionGroupRelSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public PermissionGroupRelModelImpl() {
	}

	@Override
	public PermissionGroupRelPK getPrimaryKey() {
		return new PermissionGroupRelPK(_userPermissionGroupId, _permissionId);
	}

	@Override
	public void setPrimaryKey(PermissionGroupRelPK primaryKey) {
		setUserPermissionGroupId(primaryKey.userPermissionGroupId);
		setPermissionId(primaryKey.permissionId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new PermissionGroupRelPK(_userPermissionGroupId, _permissionId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((PermissionGroupRelPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return PermissionGroupRel.class;
	}

	@Override
	public String getModelClassName() {
		return PermissionGroupRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<PermissionGroupRel, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<PermissionGroupRel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PermissionGroupRel, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((PermissionGroupRel)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<PermissionGroupRel, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<PermissionGroupRel, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(PermissionGroupRel)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<PermissionGroupRel, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<PermissionGroupRel, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, PermissionGroupRel>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			PermissionGroupRel.class.getClassLoader(), PermissionGroupRel.class,
			ModelWrapper.class);

		try {
			Constructor<PermissionGroupRel> constructor =
				(Constructor<PermissionGroupRel>)proxyClass.getConstructor(
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

	private static final Map<String, Function<PermissionGroupRel, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<PermissionGroupRel, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<PermissionGroupRel, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<PermissionGroupRel, Object>>();
		Map<String, BiConsumer<PermissionGroupRel, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<PermissionGroupRel, ?>>();

		attributeGetterFunctions.put(
			"userPermissionGroupId",
			PermissionGroupRel::getUserPermissionGroupId);
		attributeSetterBiConsumers.put(
			"userPermissionGroupId",
			(BiConsumer<PermissionGroupRel, Long>)
				PermissionGroupRel::setUserPermissionGroupId);
		attributeGetterFunctions.put(
			"permissionId", PermissionGroupRel::getPermissionId);
		attributeSetterBiConsumers.put(
			"permissionId",
			(BiConsumer<PermissionGroupRel, Integer>)
				PermissionGroupRel::setPermissionId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
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

	@JSON
	@Override
	public int getPermissionId() {
		return _permissionId;
	}

	@Override
	public void setPermissionId(int permissionId) {
		_permissionId = permissionId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public PermissionGroupRel toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, PermissionGroupRel>
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
		PermissionGroupRelImpl permissionGroupRelImpl =
			new PermissionGroupRelImpl();

		permissionGroupRelImpl.setUserPermissionGroupId(
			getUserPermissionGroupId());
		permissionGroupRelImpl.setPermissionId(getPermissionId());

		permissionGroupRelImpl.resetOriginalValues();

		return permissionGroupRelImpl;
	}

	@Override
	public int compareTo(PermissionGroupRel permissionGroupRel) {
		PermissionGroupRelPK primaryKey = permissionGroupRel.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PermissionGroupRel)) {
			return false;
		}

		PermissionGroupRel permissionGroupRel = (PermissionGroupRel)obj;

		PermissionGroupRelPK primaryKey = permissionGroupRel.getPrimaryKey();

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
		PermissionGroupRelModelImpl permissionGroupRelModelImpl = this;

		permissionGroupRelModelImpl._originalUserPermissionGroupId =
			permissionGroupRelModelImpl._userPermissionGroupId;

		permissionGroupRelModelImpl._setOriginalUserPermissionGroupId = false;

		permissionGroupRelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<PermissionGroupRel> toCacheModel() {
		PermissionGroupRelCacheModel permissionGroupRelCacheModel =
			new PermissionGroupRelCacheModel();

		permissionGroupRelCacheModel.permissionGroupRelPK = getPrimaryKey();

		permissionGroupRelCacheModel.userPermissionGroupId =
			getUserPermissionGroupId();

		permissionGroupRelCacheModel.permissionId = getPermissionId();

		return permissionGroupRelCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<PermissionGroupRel, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<PermissionGroupRel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PermissionGroupRel, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((PermissionGroupRel)this));
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
		Map<String, Function<PermissionGroupRel, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<PermissionGroupRel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PermissionGroupRel, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((PermissionGroupRel)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, PermissionGroupRel>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _userPermissionGroupId;
	private long _originalUserPermissionGroupId;
	private boolean _setOriginalUserPermissionGroupId;
	private int _permissionId;
	private long _columnBitmask;
	private PermissionGroupRel _escapedModel;

}