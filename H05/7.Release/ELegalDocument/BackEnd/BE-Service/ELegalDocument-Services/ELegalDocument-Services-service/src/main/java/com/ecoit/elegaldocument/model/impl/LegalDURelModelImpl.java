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

import com.ecoit.elegaldocument.model.LegalDURel;
import com.ecoit.elegaldocument.model.LegalDURelModel;
import com.ecoit.elegaldocument.model.LegalDURelSoap;
import com.ecoit.elegaldocument.service.persistence.LegalDURelPK;

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
 * The base model implementation for the LegalDURel service. Represents a row in the &quot;ecoit_doc_LegalDURel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>LegalDURelModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegalDURelImpl}.
 * </p>
 *
 * @author Liverpool
 * @see LegalDURelImpl
 * @generated
 */
@JSON(strict = true)
public class LegalDURelModelImpl
	extends BaseModelImpl<LegalDURel> implements LegalDURelModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a legal du rel model instance should use the <code>LegalDURel</code> interface instead.
	 */
	public static final String TABLE_NAME = "ecoit_doc_LegalDURel";

	public static final Object[][] TABLE_COLUMNS = {
		{"departmentId", Types.BIGINT}, {"userid", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("departmentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userid", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ecoit_doc_LegalDURel (departmentId LONG not null,userid LONG not null,primary key (departmentId, userid))";

	public static final String TABLE_SQL_DROP =
		"drop table ecoit_doc_LegalDURel";

	public static final String ORDER_BY_JPQL =
		" ORDER BY legalDURel.id.departmentId DESC, legalDURel.id.userid DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ecoit_doc_LegalDURel.departmentId DESC, ecoit_doc_LegalDURel.userid DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long DEPARTMENTID_COLUMN_BITMASK = 1L;

	public static final long USERID_COLUMN_BITMASK = 2L;

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
	public static LegalDURel toModel(LegalDURelSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		LegalDURel model = new LegalDURelImpl();

		model.setDepartmentId(soapModel.getDepartmentId());
		model.setUserid(soapModel.getUserid());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<LegalDURel> toModels(LegalDURelSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<LegalDURel> models = new ArrayList<LegalDURel>(soapModels.length);

		for (LegalDURelSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public LegalDURelModelImpl() {
	}

	@Override
	public LegalDURelPK getPrimaryKey() {
		return new LegalDURelPK(_departmentId, _userid);
	}

	@Override
	public void setPrimaryKey(LegalDURelPK primaryKey) {
		setDepartmentId(primaryKey.departmentId);
		setUserid(primaryKey.userid);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new LegalDURelPK(_departmentId, _userid);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((LegalDURelPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return LegalDURel.class;
	}

	@Override
	public String getModelClassName() {
		return LegalDURel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<LegalDURel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<LegalDURel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LegalDURel, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((LegalDURel)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<LegalDURel, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<LegalDURel, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(LegalDURel)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<LegalDURel, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<LegalDURel, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, LegalDURel>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			LegalDURel.class.getClassLoader(), LegalDURel.class,
			ModelWrapper.class);

		try {
			Constructor<LegalDURel> constructor =
				(Constructor<LegalDURel>)proxyClass.getConstructor(
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

	private static final Map<String, Function<LegalDURel, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<LegalDURel, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<LegalDURel, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<LegalDURel, Object>>();
		Map<String, BiConsumer<LegalDURel, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<LegalDURel, ?>>();

		attributeGetterFunctions.put(
			"departmentId", LegalDURel::getDepartmentId);
		attributeSetterBiConsumers.put(
			"departmentId",
			(BiConsumer<LegalDURel, Long>)LegalDURel::setDepartmentId);
		attributeGetterFunctions.put("userid", LegalDURel::getUserid);
		attributeSetterBiConsumers.put(
			"userid", (BiConsumer<LegalDURel, Long>)LegalDURel::setUserid);

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
	public long getUserid() {
		return _userid;
	}

	@Override
	public void setUserid(long userid) {
		_columnBitmask = -1L;

		if (!_setOriginalUserid) {
			_setOriginalUserid = true;

			_originalUserid = _userid;
		}

		_userid = userid;
	}

	public long getOriginalUserid() {
		return _originalUserid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public LegalDURel toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, LegalDURel>
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
		LegalDURelImpl legalDURelImpl = new LegalDURelImpl();

		legalDURelImpl.setDepartmentId(getDepartmentId());
		legalDURelImpl.setUserid(getUserid());

		legalDURelImpl.resetOriginalValues();

		return legalDURelImpl;
	}

	@Override
	public int compareTo(LegalDURel legalDURel) {
		int value = 0;

		if (getDepartmentId() < legalDURel.getDepartmentId()) {
			value = -1;
		}
		else if (getDepartmentId() > legalDURel.getDepartmentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		if (getUserid() < legalDURel.getUserid()) {
			value = -1;
		}
		else if (getUserid() > legalDURel.getUserid()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof LegalDURel)) {
			return false;
		}

		LegalDURel legalDURel = (LegalDURel)obj;

		LegalDURelPK primaryKey = legalDURel.getPrimaryKey();

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
		LegalDURelModelImpl legalDURelModelImpl = this;

		legalDURelModelImpl._originalDepartmentId =
			legalDURelModelImpl._departmentId;

		legalDURelModelImpl._setOriginalDepartmentId = false;

		legalDURelModelImpl._originalUserid = legalDURelModelImpl._userid;

		legalDURelModelImpl._setOriginalUserid = false;

		legalDURelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LegalDURel> toCacheModel() {
		LegalDURelCacheModel legalDURelCacheModel = new LegalDURelCacheModel();

		legalDURelCacheModel.legalDURelPK = getPrimaryKey();

		legalDURelCacheModel.departmentId = getDepartmentId();

		legalDURelCacheModel.userid = getUserid();

		return legalDURelCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<LegalDURel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<LegalDURel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LegalDURel, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((LegalDURel)this));
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
		Map<String, Function<LegalDURel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<LegalDURel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<LegalDURel, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((LegalDURel)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, LegalDURel>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _departmentId;
	private long _originalDepartmentId;
	private boolean _setOriginalDepartmentId;
	private long _userid;
	private long _originalUserid;
	private boolean _setOriginalUserid;
	private long _columnBitmask;
	private LegalDURel _escapedModel;

}