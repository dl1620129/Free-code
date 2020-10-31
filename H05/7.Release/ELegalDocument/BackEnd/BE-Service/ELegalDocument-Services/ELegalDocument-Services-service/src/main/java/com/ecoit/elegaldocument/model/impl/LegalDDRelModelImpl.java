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

import com.ecoit.elegaldocument.model.LegalDDRel;
import com.ecoit.elegaldocument.model.LegalDDRelModel;
import com.ecoit.elegaldocument.model.LegalDDRelSoap;
import com.ecoit.elegaldocument.service.persistence.LegalDDRelPK;

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
 * The base model implementation for the LegalDDRel service. Represents a row in the &quot;ecoit_doc_LegalDDRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>LegalDDRelModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegalDDRelImpl}.
 * </p>
 *
 * @author Liverpool
 * @see LegalDDRelImpl
 * @generated
 */
@JSON(strict = true)
public class LegalDDRelModelImpl
	extends BaseModelImpl<LegalDDRel> implements LegalDDRelModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a legal dd rel model instance should use the <code>LegalDDRel</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_doc_LegalDDRel";

	public static final Object[][] TABLE_COLUMNS = {
		{"departmentId", Types.BIGINT}, {"docId", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("departmentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("docId", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_doc_LegalDDRel (departmentId LONG not null,docId VARCHAR(75) not null,primary key (departmentId, docId))";

	public static final String TABLE_SQL_DROP =
		"drop table ecoit_doc_LegalDDRel";

	public static final String ORDER_BY_JPQL =
		" ORDER BY legalDDRel.id.departmentId DESC, legalDDRel.id.docId DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_doc_LegalDDRel.departmentId DESC, ecoit_doc_LegalDDRel.docId DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long DEPARTMENTID_COLUMN_BITMASK = 1L;

	public static final long DOCID_COLUMN_BITMASK = 2L;

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
	public static LegalDDRel toModel(LegalDDRelSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		LegalDDRel model = new LegalDDRelImpl();

		model.setDepartmentId(soapModel.getDepartmentId());
		model.setDocId(soapModel.getDocId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<LegalDDRel> toModels(LegalDDRelSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<LegalDDRel> models = new ArrayList<LegalDDRel>(soapModels.length);

		for (LegalDDRelSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public LegalDDRelModelImpl() {
	}

	@Override
	public LegalDDRelPK getPrimaryKey() {
		return new LegalDDRelPK(_departmentId, _docId);
	}

	@Override
	public void setPrimaryKey(LegalDDRelPK primaryKey) {
		setDepartmentId(primaryKey.departmentId);
		setDocId(primaryKey.docId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new LegalDDRelPK(_departmentId, _docId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((LegalDDRelPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return LegalDDRel.class;
	}

	@Override
	public String getModelClassName() {
		return LegalDDRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<LegalDDRel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<LegalDDRel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LegalDDRel, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((LegalDDRel)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<LegalDDRel, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<LegalDDRel, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(LegalDDRel)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<LegalDDRel, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<LegalDDRel, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, LegalDDRel>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			LegalDDRel.class.getClassLoader(), LegalDDRel.class,
			ModelWrapper.class);

		try {
			Constructor<LegalDDRel> constructor =
				(Constructor<LegalDDRel>)proxyClass.getConstructor(
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

	private static final Map<String, Function<LegalDDRel, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<LegalDDRel, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<LegalDDRel, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<LegalDDRel, Object>>();
		Map<String, BiConsumer<LegalDDRel, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<LegalDDRel, ?>>();

		attributeGetterFunctions.put(
			"departmentId", LegalDDRel::getDepartmentId);
		attributeSetterBiConsumers.put(
			"departmentId",
			(BiConsumer<LegalDDRel, Long>)LegalDDRel::setDepartmentId);
		attributeGetterFunctions.put("docId", LegalDDRel::getDocId);
		attributeSetterBiConsumers.put(
			"docId", (BiConsumer<LegalDDRel, String>)LegalDDRel::setDocId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getDepartmentId() {
		return _departmentId;
	}

	@Override
	public void setDepartmentId(long departmentId) {
		_columnBitmask = -1L;

		if (!_setOriginalDepartmentId) {
			_setOriginalDepartmentId = true;

			_originalDepartmentId = _departmentId;
		}

		_departmentId = departmentId;
	}

	public long getOriginalDepartmentId() {
		return _originalDepartmentId;
	}

	@JSON
	@Override
	public String getDocId() {
		if (_docId == null) {
			return "";
		}
		else {
			return _docId;
		}
	}

	@Override
	public void setDocId(String docId) {
		_columnBitmask = -1L;

		if (_originalDocId == null) {
			_originalDocId = _docId;
		}

		_docId = docId;
	}

	public String getOriginalDocId() {
		return GetterUtil.getString(_originalDocId);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public LegalDDRel toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, LegalDDRel>
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
		LegalDDRelImpl legalDDRelImpl = new LegalDDRelImpl();

		legalDDRelImpl.setDepartmentId(getDepartmentId());
		legalDDRelImpl.setDocId(getDocId());

		legalDDRelImpl.resetOriginalValues();

		return legalDDRelImpl;
	}

	@Override
	public int compareTo(LegalDDRel legalDDRel) {
		int value = 0;

		if (getDepartmentId() < legalDDRel.getDepartmentId()) {
			value = -1;
		}
		else if (getDepartmentId() > legalDDRel.getDepartmentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getDocId().compareTo(legalDDRel.getDocId());

		value = value * -1;

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

		if (!(obj instanceof LegalDDRel)) {
			return false;
		}

		LegalDDRel legalDDRel = (LegalDDRel)obj;

		LegalDDRelPK primaryKey = legalDDRel.getPrimaryKey();

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
		LegalDDRelModelImpl legalDDRelModelImpl = this;

		legalDDRelModelImpl._originalDepartmentId =
			legalDDRelModelImpl._departmentId;

		legalDDRelModelImpl._setOriginalDepartmentId = false;

		legalDDRelModelImpl._originalDocId = legalDDRelModelImpl._docId;

		legalDDRelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LegalDDRel> toCacheModel() {
		LegalDDRelCacheModel legalDDRelCacheModel = new LegalDDRelCacheModel();

		legalDDRelCacheModel.legalDDRelPK = getPrimaryKey();

		legalDDRelCacheModel.departmentId = getDepartmentId();

		legalDDRelCacheModel.docId = getDocId();

		String docId = legalDDRelCacheModel.docId;

		if ((docId != null) && (docId.length() == 0)) {
			legalDDRelCacheModel.docId = null;
		}

		return legalDDRelCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<LegalDDRel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<LegalDDRel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LegalDDRel, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((LegalDDRel)this));
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
		Map<String, Function<LegalDDRel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<LegalDDRel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LegalDDRel, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((LegalDDRel)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, LegalDDRel>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _departmentId;
	private long _originalDepartmentId;
	private boolean _setOriginalDepartmentId;
	private String _docId;
	private String _originalDocId;
	private long _columnBitmask;
	private LegalDDRel _escapedModel;

}