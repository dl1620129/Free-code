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

package com.ecoit.cms.config.model.impl;

import com.ecoit.cms.config.model.PortletConfig;
import com.ecoit.cms.config.model.PortletConfigModel;
import com.ecoit.cms.config.model.PortletConfigSoap;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
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
 * The base model implementation for the PortletConfig service. Represents a row in the &quot;ecoit_config_PortletConfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PortletConfigModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PortletConfigImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PortletConfigImpl
 * @generated
 */
@JSON(strict = true)
public class PortletConfigModelImpl
	extends BaseModelImpl<PortletConfig> implements PortletConfigModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a portlet config model instance should use the <code>PortletConfig</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_config_PortletConfig";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"portletId", Types.VARCHAR},
		{"catgoryId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("portletId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("catgoryId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_config_PortletConfig (uuid_ VARCHAR(75) null,portletId VARCHAR(75) not null primary key,catgoryId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table ecoit_config_PortletConfig";

	public static final String ORDER_BY_JPQL =
		" ORDER BY portletConfig.portletId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_config_PortletConfig.portletId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long UUID_COLUMN_BITMASK = 1L;

	public static final long PORTLETID_COLUMN_BITMASK = 2L;

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
	public static PortletConfig toModel(PortletConfigSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		PortletConfig model = new PortletConfigImpl();

		model.setUuid(soapModel.getUuid());
		model.setPortletId(soapModel.getPortletId());
		model.setCatgoryId(soapModel.getCatgoryId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<PortletConfig> toModels(PortletConfigSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<PortletConfig> models = new ArrayList<PortletConfig>(
			soapModels.length);

		for (PortletConfigSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public PortletConfigModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _portletId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setPortletId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _portletId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return PortletConfig.class;
	}

	@Override
	public String getModelClassName() {
		return PortletConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<PortletConfig, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<PortletConfig, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PortletConfig, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((PortletConfig)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<PortletConfig, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<PortletConfig, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(PortletConfig)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<PortletConfig, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<PortletConfig, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, PortletConfig>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			PortletConfig.class.getClassLoader(), PortletConfig.class,
			ModelWrapper.class);

		try {
			Constructor<PortletConfig> constructor =
				(Constructor<PortletConfig>)proxyClass.getConstructor(
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

	private static final Map<String, Function<PortletConfig, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<PortletConfig, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<PortletConfig, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<PortletConfig, Object>>();
		Map<String, BiConsumer<PortletConfig, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<PortletConfig, ?>>();

		attributeGetterFunctions.put("uuid", PortletConfig::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<PortletConfig, String>)PortletConfig::setUuid);
		attributeGetterFunctions.put("portletId", PortletConfig::getPortletId);
		attributeSetterBiConsumers.put(
			"portletId",
			(BiConsumer<PortletConfig, String>)PortletConfig::setPortletId);
		attributeGetterFunctions.put("catgoryId", PortletConfig::getCatgoryId);
		attributeSetterBiConsumers.put(
			"catgoryId",
			(BiConsumer<PortletConfig, Long>)PortletConfig::setCatgoryId);

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
	public String getPortletId() {
		if (_portletId == null) {
			return "";
		}
		else {
			return _portletId;
		}
	}

	@Override
	public void setPortletId(String portletId) {
		_portletId = portletId;
	}

	@JSON
	@Override
	public long getCatgoryId() {
		return _catgoryId;
	}

	@Override
	public void setCatgoryId(long catgoryId) {
		_catgoryId = catgoryId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public PortletConfig toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, PortletConfig>
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
		PortletConfigImpl portletConfigImpl = new PortletConfigImpl();

		portletConfigImpl.setUuid(getUuid());
		portletConfigImpl.setPortletId(getPortletId());
		portletConfigImpl.setCatgoryId(getCatgoryId());

		portletConfigImpl.resetOriginalValues();

		return portletConfigImpl;
	}

	@Override
	public int compareTo(PortletConfig portletConfig) {
		String primaryKey = portletConfig.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PortletConfig)) {
			return false;
		}

		PortletConfig portletConfig = (PortletConfig)obj;

		String primaryKey = portletConfig.getPrimaryKey();

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
		PortletConfigModelImpl portletConfigModelImpl = this;

		portletConfigModelImpl._originalUuid = portletConfigModelImpl._uuid;

		portletConfigModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<PortletConfig> toCacheModel() {
		PortletConfigCacheModel portletConfigCacheModel =
			new PortletConfigCacheModel();

		portletConfigCacheModel.uuid = getUuid();

		String uuid = portletConfigCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			portletConfigCacheModel.uuid = null;
		}

		portletConfigCacheModel.portletId = getPortletId();

		String portletId = portletConfigCacheModel.portletId;

		if ((portletId != null) && (portletId.length() == 0)) {
			portletConfigCacheModel.portletId = null;
		}

		portletConfigCacheModel.catgoryId = getCatgoryId();

		return portletConfigCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<PortletConfig, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<PortletConfig, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PortletConfig, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((PortletConfig)this));
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
		Map<String, Function<PortletConfig, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<PortletConfig, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PortletConfig, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((PortletConfig)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, PortletConfig>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private String _portletId;
	private long _catgoryId;
	private long _columnBitmask;
	private PortletConfig _escapedModel;

}