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

import com.software.cms.model.Category;
import com.software.cms.model.CategoryModel;
import com.software.cms.model.CategorySoap;

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
 * The base model implementation for the Category service. Represents a row in the &quot;soft_cms_Category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CategoryModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CategoryImpl}.
 * </p>
 *
 * @author DungNV
 * @see CategoryImpl
 * @generated
 */
@JSON(strict = true)
public class CategoryModelImpl
	extends BaseModelImpl<Category> implements CategoryModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a category model instance should use the <code>Category</code> interface instead.
	 */
	public static final String TABLE_NAME = "soft_cms_Category";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"categoryId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"language", Types.VARCHAR},
		{"title", Types.VARCHAR}, {"createdDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"createdUser", Types.BIGINT},
		{"modifiedUser", Types.BIGINT}, {"path_", Types.VARCHAR},
		{"description", Types.VARCHAR}, {"display", Types.BOOLEAN},
		{"parentId", Types.BIGINT}, {"active_", Types.BIGINT},
		{"cateChild", Types.VARCHAR}, {"thuTu", Types.INTEGER},
		{"link", Types.VARCHAR}, {"isRss", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("categoryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("language", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("path_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("display", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("parentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("active_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("cateChild", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("thuTu", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("link", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("isRss", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table soft_cms_Category (uuid_ VARCHAR(75) null,categoryId LONG not null primary key,groupId LONG,language VARCHAR(75) null,title VARCHAR(75) null,createdDate DATE null,modifiedDate DATE null,createdUser LONG,modifiedUser LONG,path_ VARCHAR(75) null,description STRING null,display BOOLEAN,parentId LONG,active_ LONG,cateChild VARCHAR(75) null,thuTu INTEGER,link STRING null,isRss BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table soft_cms_Category";

	public static final String ORDER_BY_JPQL = " ORDER BY category.thuTu ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY soft_cms_Category.thuTu ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long GROUPID_COLUMN_BITMASK = 1L;

	public static final long LANGUAGE_COLUMN_BITMASK = 2L;

	public static final long PARENTID_COLUMN_BITMASK = 4L;

	public static final long UUID_COLUMN_BITMASK = 8L;

	public static final long THUTU_COLUMN_BITMASK = 16L;

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
	public static Category toModel(CategorySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Category model = new CategoryImpl();

		model.setUuid(soapModel.getUuid());
		model.setCategoryId(soapModel.getCategoryId());
		model.setGroupId(soapModel.getGroupId());
		model.setLanguage(soapModel.getLanguage());
		model.setTitle(soapModel.getTitle());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCreatedUser(soapModel.getCreatedUser());
		model.setModifiedUser(soapModel.getModifiedUser());
		model.setPath(soapModel.getPath());
		model.setDescription(soapModel.getDescription());
		model.setDisplay(soapModel.isDisplay());
		model.setParentId(soapModel.getParentId());
		model.setActive(soapModel.getActive());
		model.setCateChild(soapModel.getCateChild());
		model.setThuTu(soapModel.getThuTu());
		model.setLink(soapModel.getLink());
		model.setIsRss(soapModel.isIsRss());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Category> toModels(CategorySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Category> models = new ArrayList<Category>(soapModels.length);

		for (CategorySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public CategoryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _categoryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCategoryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _categoryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Category.class;
	}

	@Override
	public String getModelClassName() {
		return Category.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Category, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Category, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Category, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Category)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Category, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Category, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Category)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Category, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Category, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Category>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Category.class.getClassLoader(), Category.class,
			ModelWrapper.class);

		try {
			Constructor<Category> constructor =
				(Constructor<Category>)proxyClass.getConstructor(
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

	private static final Map<String, Function<Category, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Category, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Category, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Category, Object>>();
		Map<String, BiConsumer<Category, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Category, ?>>();

		attributeGetterFunctions.put("uuid", Category::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Category, String>)Category::setUuid);
		attributeGetterFunctions.put("categoryId", Category::getCategoryId);
		attributeSetterBiConsumers.put(
			"categoryId", (BiConsumer<Category, Long>)Category::setCategoryId);
		attributeGetterFunctions.put("groupId", Category::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Category, Long>)Category::setGroupId);
		attributeGetterFunctions.put("language", Category::getLanguage);
		attributeSetterBiConsumers.put(
			"language", (BiConsumer<Category, String>)Category::setLanguage);
		attributeGetterFunctions.put("title", Category::getTitle);
		attributeSetterBiConsumers.put(
			"title", (BiConsumer<Category, String>)Category::setTitle);
		attributeGetterFunctions.put("createdDate", Category::getCreatedDate);
		attributeSetterBiConsumers.put(
			"createdDate",
			(BiConsumer<Category, Date>)Category::setCreatedDate);
		attributeGetterFunctions.put("modifiedDate", Category::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Category, Date>)Category::setModifiedDate);
		attributeGetterFunctions.put("createdUser", Category::getCreatedUser);
		attributeSetterBiConsumers.put(
			"createdUser",
			(BiConsumer<Category, Long>)Category::setCreatedUser);
		attributeGetterFunctions.put("modifiedUser", Category::getModifiedUser);
		attributeSetterBiConsumers.put(
			"modifiedUser",
			(BiConsumer<Category, Long>)Category::setModifiedUser);
		attributeGetterFunctions.put("path", Category::getPath);
		attributeSetterBiConsumers.put(
			"path", (BiConsumer<Category, String>)Category::setPath);
		attributeGetterFunctions.put("description", Category::getDescription);
		attributeSetterBiConsumers.put(
			"description",
			(BiConsumer<Category, String>)Category::setDescription);
		attributeGetterFunctions.put("display", Category::getDisplay);
		attributeSetterBiConsumers.put(
			"display", (BiConsumer<Category, Boolean>)Category::setDisplay);
		attributeGetterFunctions.put("parentId", Category::getParentId);
		attributeSetterBiConsumers.put(
			"parentId", (BiConsumer<Category, Long>)Category::setParentId);
		attributeGetterFunctions.put("active", Category::getActive);
		attributeSetterBiConsumers.put(
			"active", (BiConsumer<Category, Long>)Category::setActive);
		attributeGetterFunctions.put("cateChild", Category::getCateChild);
		attributeSetterBiConsumers.put(
			"cateChild", (BiConsumer<Category, String>)Category::setCateChild);
		attributeGetterFunctions.put("thuTu", Category::getThuTu);
		attributeSetterBiConsumers.put(
			"thuTu", (BiConsumer<Category, Integer>)Category::setThuTu);
		attributeGetterFunctions.put("link", Category::getLink);
		attributeSetterBiConsumers.put(
			"link", (BiConsumer<Category, String>)Category::setLink);
		attributeGetterFunctions.put("isRss", Category::getIsRss);
		attributeSetterBiConsumers.put(
			"isRss", (BiConsumer<Category, Boolean>)Category::setIsRss);

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
	public long getCategoryId() {
		return _categoryId;
	}

	@Override
	public void setCategoryId(long categoryId) {
		_categoryId = categoryId;
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
	public String getTitle() {
		if (_title == null) {
			return "";
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
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
	public long getCreatedUser() {
		return _createdUser;
	}

	@Override
	public void setCreatedUser(long createdUser) {
		_createdUser = createdUser;
	}

	@JSON
	@Override
	public long getModifiedUser() {
		return _modifiedUser;
	}

	@Override
	public void setModifiedUser(long modifiedUser) {
		_modifiedUser = modifiedUser;
	}

	@JSON
	@Override
	public String getPath() {
		if (_path == null) {
			return "";
		}
		else {
			return _path;
		}
	}

	@Override
	public void setPath(String path) {
		_path = path;
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
	public boolean getDisplay() {
		return _display;
	}

	@JSON
	@Override
	public boolean isDisplay() {
		return _display;
	}

	@Override
	public void setDisplay(boolean display) {
		_display = display;
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

	@JSON
	@Override
	public long getActive() {
		return _active;
	}

	@Override
	public void setActive(long active) {
		_active = active;
	}

	@JSON
	@Override
	public String getCateChild() {
		if (_cateChild == null) {
			return "";
		}
		else {
			return _cateChild;
		}
	}

	@Override
	public void setCateChild(String cateChild) {
		_cateChild = cateChild;
	}

	@JSON
	@Override
	public int getThuTu() {
		return _thuTu;
	}

	@Override
	public void setThuTu(int thuTu) {
		_columnBitmask = -1L;

		_thuTu = thuTu;
	}

	@JSON
	@Override
	public String getLink() {
		if (_link == null) {
			return "";
		}
		else {
			return _link;
		}
	}

	@Override
	public void setLink(String link) {
		_link = link;
	}

	@JSON
	@Override
	public boolean getIsRss() {
		return _isRss;
	}

	@JSON
	@Override
	public boolean isIsRss() {
		return _isRss;
	}

	@Override
	public void setIsRss(boolean isRss) {
		_isRss = isRss;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Category.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Category toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Category>
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
		CategoryImpl categoryImpl = new CategoryImpl();

		categoryImpl.setUuid(getUuid());
		categoryImpl.setCategoryId(getCategoryId());
		categoryImpl.setGroupId(getGroupId());
		categoryImpl.setLanguage(getLanguage());
		categoryImpl.setTitle(getTitle());
		categoryImpl.setCreatedDate(getCreatedDate());
		categoryImpl.setModifiedDate(getModifiedDate());
		categoryImpl.setCreatedUser(getCreatedUser());
		categoryImpl.setModifiedUser(getModifiedUser());
		categoryImpl.setPath(getPath());
		categoryImpl.setDescription(getDescription());
		categoryImpl.setDisplay(isDisplay());
		categoryImpl.setParentId(getParentId());
		categoryImpl.setActive(getActive());
		categoryImpl.setCateChild(getCateChild());
		categoryImpl.setThuTu(getThuTu());
		categoryImpl.setLink(getLink());
		categoryImpl.setIsRss(isIsRss());

		categoryImpl.resetOriginalValues();

		return categoryImpl;
	}

	@Override
	public int compareTo(Category category) {
		int value = 0;

		if (getThuTu() < category.getThuTu()) {
			value = -1;
		}
		else if (getThuTu() > category.getThuTu()) {
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

		if (!(obj instanceof Category)) {
			return false;
		}

		Category category = (Category)obj;

		long primaryKey = category.getPrimaryKey();

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
		CategoryModelImpl categoryModelImpl = this;

		categoryModelImpl._originalUuid = categoryModelImpl._uuid;

		categoryModelImpl._originalGroupId = categoryModelImpl._groupId;

		categoryModelImpl._setOriginalGroupId = false;

		categoryModelImpl._originalLanguage = categoryModelImpl._language;

		categoryModelImpl._originalParentId = categoryModelImpl._parentId;

		categoryModelImpl._setOriginalParentId = false;

		categoryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Category> toCacheModel() {
		CategoryCacheModel categoryCacheModel = new CategoryCacheModel();

		categoryCacheModel.uuid = getUuid();

		String uuid = categoryCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			categoryCacheModel.uuid = null;
		}

		categoryCacheModel.categoryId = getCategoryId();

		categoryCacheModel.groupId = getGroupId();

		categoryCacheModel.language = getLanguage();

		String language = categoryCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			categoryCacheModel.language = null;
		}

		categoryCacheModel.title = getTitle();

		String title = categoryCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			categoryCacheModel.title = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			categoryCacheModel.createdDate = createdDate.getTime();
		}
		else {
			categoryCacheModel.createdDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			categoryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			categoryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		categoryCacheModel.createdUser = getCreatedUser();

		categoryCacheModel.modifiedUser = getModifiedUser();

		categoryCacheModel.path = getPath();

		String path = categoryCacheModel.path;

		if ((path != null) && (path.length() == 0)) {
			categoryCacheModel.path = null;
		}

		categoryCacheModel.description = getDescription();

		String description = categoryCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			categoryCacheModel.description = null;
		}

		categoryCacheModel.display = isDisplay();

		categoryCacheModel.parentId = getParentId();

		categoryCacheModel.active = getActive();

		categoryCacheModel.cateChild = getCateChild();

		String cateChild = categoryCacheModel.cateChild;

		if ((cateChild != null) && (cateChild.length() == 0)) {
			categoryCacheModel.cateChild = null;
		}

		categoryCacheModel.thuTu = getThuTu();

		categoryCacheModel.link = getLink();

		String link = categoryCacheModel.link;

		if ((link != null) && (link.length() == 0)) {
			categoryCacheModel.link = null;
		}

		categoryCacheModel.isRss = isIsRss();

		return categoryCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Category, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Category, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Category, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Category)this));
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
		Map<String, Function<Category, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Category, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Category, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Category)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Category>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _categoryId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private String _language;
	private String _originalLanguage;
	private String _title;
	private Date _createdDate;
	private Date _modifiedDate;
	private long _createdUser;
	private long _modifiedUser;
	private String _path;
	private String _description;
	private boolean _display;
	private long _parentId;
	private long _originalParentId;
	private boolean _setOriginalParentId;
	private long _active;
	private String _cateChild;
	private int _thuTu;
	private String _link;
	private boolean _isRss;
	private long _columnBitmask;
	private Category _escapedModel;

}