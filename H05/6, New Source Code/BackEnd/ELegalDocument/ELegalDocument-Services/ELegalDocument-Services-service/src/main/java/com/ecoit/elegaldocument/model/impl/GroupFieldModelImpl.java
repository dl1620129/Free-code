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

import com.ecoit.elegaldocument.model.GroupField;
import com.ecoit.elegaldocument.model.GroupFieldModel;
import com.ecoit.elegaldocument.model.GroupFieldSoap;
import com.ecoit.elegaldocument.service.persistence.GroupFieldPK;

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
 * The base model implementation for the GroupField service. Represents a row in the &quot;ecoit_doc_GroupField&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>GroupFieldModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GroupFieldImpl}.
 * </p>
 *
 * @author Liverpool
 * @see GroupFieldImpl
 * @generated
 */
@JSON(strict = true)
public class GroupFieldModelImpl
	extends BaseModelImpl<GroupField> implements GroupFieldModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a group field model instance should use the <code>GroupField</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_doc_GroupField";

	public static final Object[][] TABLE_COLUMNS = {
		{"groupUserId", Types.BIGINT}, {"fieldid", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("groupUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fieldid", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_doc_GroupField (groupUserId LONG not null,fieldid LONG not null,primary key (groupUserId, fieldid))";

	public static final String TABLE_SQL_DROP =
		"drop table ecoit_doc_GroupField";

	public static final String ORDER_BY_JPQL =
		" ORDER BY groupField.id.groupUserId ASC, groupField.id.fieldid ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_doc_GroupField.groupUserId ASC, ecoit_doc_GroupField.fieldid ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long FIELDID_COLUMN_BITMASK = 1L;

	public static final long GROUPUSERID_COLUMN_BITMASK = 2L;

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
	public static GroupField toModel(GroupFieldSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		GroupField model = new GroupFieldImpl();

		model.setGroupUserId(soapModel.getGroupUserId());
		model.setFieldid(soapModel.getFieldid());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<GroupField> toModels(GroupFieldSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<GroupField> models = new ArrayList<GroupField>(soapModels.length);

		for (GroupFieldSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public GroupFieldModelImpl() {
	}

	@Override
	public GroupFieldPK getPrimaryKey() {
		return new GroupFieldPK(_groupUserId, _fieldid);
	}

	@Override
	public void setPrimaryKey(GroupFieldPK primaryKey) {
		setGroupUserId(primaryKey.groupUserId);
		setFieldid(primaryKey.fieldid);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new GroupFieldPK(_groupUserId, _fieldid);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((GroupFieldPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return GroupField.class;
	}

	@Override
	public String getModelClassName() {
		return GroupField.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<GroupField, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<GroupField, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<GroupField, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((GroupField)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<GroupField, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<GroupField, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(GroupField)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<GroupField, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<GroupField, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, GroupField>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			GroupField.class.getClassLoader(), GroupField.class,
			ModelWrapper.class);

		try {
			Constructor<GroupField> constructor =
				(Constructor<GroupField>)proxyClass.getConstructor(
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

	private static final Map<String, Function<GroupField, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<GroupField, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<GroupField, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<GroupField, Object>>();
		Map<String, BiConsumer<GroupField, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<GroupField, ?>>();

		attributeGetterFunctions.put("groupUserId", GroupField::getGroupUserId);
		attributeSetterBiConsumers.put(
			"groupUserId",
			(BiConsumer<GroupField, Long>)GroupField::setGroupUserId);
		attributeGetterFunctions.put("fieldid", GroupField::getFieldid);
		attributeSetterBiConsumers.put(
			"fieldid", (BiConsumer<GroupField, Long>)GroupField::setFieldid);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getGroupUserId() {
		return _groupUserId;
	}

	@Override
	public void setGroupUserId(long groupUserId) {
		_columnBitmask |= GROUPUSERID_COLUMN_BITMASK;

		if (!_setOriginalGroupUserId) {
			_setOriginalGroupUserId = true;

			_originalGroupUserId = _groupUserId;
		}

		_groupUserId = groupUserId;
	}

	@Override
	public String getGroupUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getGroupUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setGroupUserUuid(String groupUserUuid) {
	}

	public long getOriginalGroupUserId() {
		return _originalGroupUserId;
	}

	@JSON
	@Override
	public long getFieldid() {
		return _fieldid;
	}

	@Override
	public void setFieldid(long fieldid) {
		_columnBitmask |= FIELDID_COLUMN_BITMASK;

		if (!_setOriginalFieldid) {
			_setOriginalFieldid = true;

			_originalFieldid = _fieldid;
		}

		_fieldid = fieldid;
	}

	public long getOriginalFieldid() {
		return _originalFieldid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public GroupField toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, GroupField>
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
		GroupFieldImpl groupFieldImpl = new GroupFieldImpl();

		groupFieldImpl.setGroupUserId(getGroupUserId());
		groupFieldImpl.setFieldid(getFieldid());

		groupFieldImpl.resetOriginalValues();

		return groupFieldImpl;
	}

	@Override
	public int compareTo(GroupField groupField) {
		GroupFieldPK primaryKey = groupField.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GroupField)) {
			return false;
		}

		GroupField groupField = (GroupField)obj;

		GroupFieldPK primaryKey = groupField.getPrimaryKey();

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
		GroupFieldModelImpl groupFieldModelImpl = this;

		groupFieldModelImpl._originalGroupUserId =
			groupFieldModelImpl._groupUserId;

		groupFieldModelImpl._setOriginalGroupUserId = false;

		groupFieldModelImpl._originalFieldid = groupFieldModelImpl._fieldid;

		groupFieldModelImpl._setOriginalFieldid = false;

		groupFieldModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<GroupField> toCacheModel() {
		GroupFieldCacheModel groupFieldCacheModel = new GroupFieldCacheModel();

		groupFieldCacheModel.groupFieldPK = getPrimaryKey();

		groupFieldCacheModel.groupUserId = getGroupUserId();

		groupFieldCacheModel.fieldid = getFieldid();

		return groupFieldCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<GroupField, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<GroupField, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<GroupField, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((GroupField)this));
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
		Map<String, Function<GroupField, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<GroupField, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<GroupField, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((GroupField)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, GroupField>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _groupUserId;
	private long _originalGroupUserId;
	private boolean _setOriginalGroupUserId;
	private long _fieldid;
	private long _originalFieldid;
	private boolean _setOriginalFieldid;
	private long _columnBitmask;
	private GroupField _escapedModel;

}