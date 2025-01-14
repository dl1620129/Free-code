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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.software.cms.model.MapCateLayout;
import com.software.cms.model.MapCateLayoutModel;
import com.software.cms.model.MapCateLayoutSoap;

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
 * The base model implementation for the MapCateLayout service. Represents a row in the &quot;soft_cms_MapCateLayout&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MapCateLayoutModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MapCateLayoutImpl}.
 * </p>
 *
 * @author DungNV
 * @see MapCateLayoutImpl
 * @generated
 */
@JSON(strict = true)
public class MapCateLayoutModelImpl
	extends BaseModelImpl<MapCateLayout> implements MapCateLayoutModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a map cate layout model instance should use the <code>MapCateLayout</code> interface instead.
	 */
	public static final String TABLE_NAME = "soft_cms_MapCateLayout";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"mapCateLayoutId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"categoryId", Types.BIGINT}, {"layoutId", Types.BIGINT},
		{"type_", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mapCateLayoutId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("categoryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("layoutId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("type_", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table soft_cms_MapCateLayout (uuid_ VARCHAR(75) null,mapCateLayoutId LONG not null primary key,companyId LONG,groupId LONG,categoryId LONG,layoutId LONG,type_ INTEGER)";

	public static final String TABLE_SQL_DROP =
		"drop table soft_cms_MapCateLayout";

	public static final String ORDER_BY_JPQL =
		" ORDER BY mapCateLayout.layoutId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY soft_cms_MapCateLayout.layoutId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long CATEGORYID_COLUMN_BITMASK = 1L;

	public static final long COMPANYID_COLUMN_BITMASK = 2L;

	public static final long GROUPID_COLUMN_BITMASK = 4L;

	public static final long LAYOUTID_COLUMN_BITMASK = 8L;

	public static final long TYPE_COLUMN_BITMASK = 16L;

	public static final long UUID_COLUMN_BITMASK = 32L;

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
	public static MapCateLayout toModel(MapCateLayoutSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		MapCateLayout model = new MapCateLayoutImpl();

		model.setUuid(soapModel.getUuid());
		model.setMapCateLayoutId(soapModel.getMapCateLayoutId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setCategoryId(soapModel.getCategoryId());
		model.setLayoutId(soapModel.getLayoutId());
		model.setType(soapModel.getType());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<MapCateLayout> toModels(MapCateLayoutSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<MapCateLayout> models = new ArrayList<MapCateLayout>(
			soapModels.length);

		for (MapCateLayoutSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public MapCateLayoutModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _mapCateLayoutId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMapCateLayoutId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mapCateLayoutId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MapCateLayout.class;
	}

	@Override
	public String getModelClassName() {
		return MapCateLayout.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<MapCateLayout, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<MapCateLayout, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MapCateLayout, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((MapCateLayout)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<MapCateLayout, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<MapCateLayout, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(MapCateLayout)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<MapCateLayout, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<MapCateLayout, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, MapCateLayout>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			MapCateLayout.class.getClassLoader(), MapCateLayout.class,
			ModelWrapper.class);

		try {
			Constructor<MapCateLayout> constructor =
				(Constructor<MapCateLayout>)proxyClass.getConstructor(
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

	private static final Map<String, Function<MapCateLayout, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<MapCateLayout, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<MapCateLayout, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<MapCateLayout, Object>>();
		Map<String, BiConsumer<MapCateLayout, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<MapCateLayout, ?>>();

		attributeGetterFunctions.put("uuid", MapCateLayout::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<MapCateLayout, String>)MapCateLayout::setUuid);
		attributeGetterFunctions.put(
			"mapCateLayoutId", MapCateLayout::getMapCateLayoutId);
		attributeSetterBiConsumers.put(
			"mapCateLayoutId",
			(BiConsumer<MapCateLayout, Long>)MapCateLayout::setMapCateLayoutId);
		attributeGetterFunctions.put("companyId", MapCateLayout::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<MapCateLayout, Long>)MapCateLayout::setCompanyId);
		attributeGetterFunctions.put("groupId", MapCateLayout::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<MapCateLayout, Long>)MapCateLayout::setGroupId);
		attributeGetterFunctions.put(
			"categoryId", MapCateLayout::getCategoryId);
		attributeSetterBiConsumers.put(
			"categoryId",
			(BiConsumer<MapCateLayout, Long>)MapCateLayout::setCategoryId);
		attributeGetterFunctions.put("layoutId", MapCateLayout::getLayoutId);
		attributeSetterBiConsumers.put(
			"layoutId",
			(BiConsumer<MapCateLayout, Long>)MapCateLayout::setLayoutId);
		attributeGetterFunctions.put("type", MapCateLayout::getType);
		attributeSetterBiConsumers.put(
			"type", (BiConsumer<MapCateLayout, Integer>)MapCateLayout::setType);

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
	public long getMapCateLayoutId() {
		return _mapCateLayoutId;
	}

	@Override
	public void setMapCateLayoutId(long mapCateLayoutId) {
		_mapCateLayoutId = mapCateLayoutId;
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
	public long getCategoryId() {
		return _categoryId;
	}

	@Override
	public void setCategoryId(long categoryId) {
		_columnBitmask |= CATEGORYID_COLUMN_BITMASK;

		if (!_setOriginalCategoryId) {
			_setOriginalCategoryId = true;

			_originalCategoryId = _categoryId;
		}

		_categoryId = categoryId;
	}

	public long getOriginalCategoryId() {
		return _originalCategoryId;
	}

	@JSON
	@Override
	public long getLayoutId() {
		return _layoutId;
	}

	@Override
	public void setLayoutId(long layoutId) {
		_columnBitmask = -1L;

		if (!_setOriginalLayoutId) {
			_setOriginalLayoutId = true;

			_originalLayoutId = _layoutId;
		}

		_layoutId = layoutId;
	}

	public long getOriginalLayoutId() {
		return _originalLayoutId;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), MapCateLayout.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MapCateLayout toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, MapCateLayout>
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
		MapCateLayoutImpl mapCateLayoutImpl = new MapCateLayoutImpl();

		mapCateLayoutImpl.setUuid(getUuid());
		mapCateLayoutImpl.setMapCateLayoutId(getMapCateLayoutId());
		mapCateLayoutImpl.setCompanyId(getCompanyId());
		mapCateLayoutImpl.setGroupId(getGroupId());
		mapCateLayoutImpl.setCategoryId(getCategoryId());
		mapCateLayoutImpl.setLayoutId(getLayoutId());
		mapCateLayoutImpl.setType(getType());

		mapCateLayoutImpl.resetOriginalValues();

		return mapCateLayoutImpl;
	}

	@Override
	public int compareTo(MapCateLayout mapCateLayout) {
		int value = 0;

		if (getLayoutId() < mapCateLayout.getLayoutId()) {
			value = -1;
		}
		else if (getLayoutId() > mapCateLayout.getLayoutId()) {
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

		if (!(obj instanceof MapCateLayout)) {
			return false;
		}

		MapCateLayout mapCateLayout = (MapCateLayout)obj;

		long primaryKey = mapCateLayout.getPrimaryKey();

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
		MapCateLayoutModelImpl mapCateLayoutModelImpl = this;

		mapCateLayoutModelImpl._originalUuid = mapCateLayoutModelImpl._uuid;

		mapCateLayoutModelImpl._originalCompanyId =
			mapCateLayoutModelImpl._companyId;

		mapCateLayoutModelImpl._setOriginalCompanyId = false;

		mapCateLayoutModelImpl._originalGroupId =
			mapCateLayoutModelImpl._groupId;

		mapCateLayoutModelImpl._setOriginalGroupId = false;

		mapCateLayoutModelImpl._originalCategoryId =
			mapCateLayoutModelImpl._categoryId;

		mapCateLayoutModelImpl._setOriginalCategoryId = false;

		mapCateLayoutModelImpl._originalLayoutId =
			mapCateLayoutModelImpl._layoutId;

		mapCateLayoutModelImpl._setOriginalLayoutId = false;

		mapCateLayoutModelImpl._originalType = mapCateLayoutModelImpl._type;

		mapCateLayoutModelImpl._setOriginalType = false;

		mapCateLayoutModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<MapCateLayout> toCacheModel() {
		MapCateLayoutCacheModel mapCateLayoutCacheModel =
			new MapCateLayoutCacheModel();

		mapCateLayoutCacheModel.uuid = getUuid();

		String uuid = mapCateLayoutCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			mapCateLayoutCacheModel.uuid = null;
		}

		mapCateLayoutCacheModel.mapCateLayoutId = getMapCateLayoutId();

		mapCateLayoutCacheModel.companyId = getCompanyId();

		mapCateLayoutCacheModel.groupId = getGroupId();

		mapCateLayoutCacheModel.categoryId = getCategoryId();

		mapCateLayoutCacheModel.layoutId = getLayoutId();

		mapCateLayoutCacheModel.type = getType();

		return mapCateLayoutCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<MapCateLayout, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<MapCateLayout, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MapCateLayout, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((MapCateLayout)this));
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
		Map<String, Function<MapCateLayout, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<MapCateLayout, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MapCateLayout, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((MapCateLayout)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, MapCateLayout>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _mapCateLayoutId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _categoryId;
	private long _originalCategoryId;
	private boolean _setOriginalCategoryId;
	private long _layoutId;
	private long _originalLayoutId;
	private boolean _setOriginalLayoutId;
	private int _type;
	private int _originalType;
	private boolean _setOriginalType;
	private long _columnBitmask;
	private MapCateLayout _escapedModel;

}