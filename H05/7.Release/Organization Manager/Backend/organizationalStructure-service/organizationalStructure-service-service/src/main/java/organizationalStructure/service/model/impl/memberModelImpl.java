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

package organizationalStructure.service.model.impl;

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

import organizationalStructure.service.model.member;
import organizationalStructure.service.model.memberModel;
import organizationalStructure.service.model.memberSoap;

/**
 * The base model implementation for the member service. Represents a row in the &quot;portal_member&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>memberModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link memberImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see memberImpl
 * @generated
 */
@JSON(strict = true)
public class memberModelImpl
	extends BaseModelImpl<member> implements memberModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a member model instance should use the <code>member</code> interface instead.
	 */
	public static final String TABLE_NAME = "portal_member";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"memberId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"organizationId", Types.BIGINT},
		{"fullName", Types.VARCHAR}, {"birthday", Types.TIMESTAMP},
		{"address", Types.VARCHAR}, {"sex", Types.BOOLEAN},
		{"position", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"createUser", Types.BIGINT}, {"modifiedUser", Types.BIGINT},
		{"modifiedDate", Types.TIMESTAMP}, {"isLeader", Types.BOOLEAN},
		{"urlImage", Types.VARCHAR}, {"folderId", Types.BIGINT},
		{"imageFileId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("memberId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("organizationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fullName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("birthday", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sex", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("position", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("isLeader", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("urlImage", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("folderId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("imageFileId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table portal_member (uuid_ VARCHAR(75) null,memberId LONG not null primary key,groupId LONG,organizationId LONG,fullName VARCHAR(75) null,birthday DATE null,address VARCHAR(75) null,sex BOOLEAN,position VARCHAR(75) null,createDate DATE null,createUser LONG,modifiedUser LONG,modifiedDate DATE null,isLeader BOOLEAN,urlImage VARCHAR(75) null,folderId LONG,imageFileId LONG)";

	public static final String TABLE_SQL_DROP = "drop table portal_member";

	public static final String ORDER_BY_JPQL = " ORDER BY member_.memberId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY portal_member.memberId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long GROUPID_COLUMN_BITMASK = 1L;

	public static final long ORGANIZATIONID_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long MEMBERID_COLUMN_BITMASK = 8L;

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
	public static member toModel(memberSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		member model = new memberImpl();

		model.setUuid(soapModel.getUuid());
		model.setMemberId(soapModel.getMemberId());
		model.setGroupId(soapModel.getGroupId());
		model.setOrganizationId(soapModel.getOrganizationId());
		model.setFullName(soapModel.getFullName());
		model.setBirthday(soapModel.getBirthday());
		model.setAddress(soapModel.getAddress());
		model.setSex(soapModel.getSex());
		model.setPosition(soapModel.getPosition());
		model.setCreateDate(soapModel.getCreateDate());
		model.setCreateUser(soapModel.getCreateUser());
		model.setModifiedUser(soapModel.getModifiedUser());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setIsLeader(soapModel.getIsLeader());
		model.setUrlImage(soapModel.getUrlImage());
		model.setFolderId(soapModel.getFolderId());
		model.setImageFileId(soapModel.getImageFileId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<member> toModels(memberSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<member> models = new ArrayList<member>(soapModels.length);

		for (memberSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public memberModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _memberId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMemberId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _memberId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return member.class;
	}

	@Override
	public String getModelClassName() {
		return member.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<member, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<member, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<member, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((member)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<member, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<member, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(member)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<member, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<member, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, member>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			member.class.getClassLoader(), member.class, ModelWrapper.class);

		try {
			Constructor<member> constructor =
				(Constructor<member>)proxyClass.getConstructor(
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

	private static final Map<String, Function<member, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<member, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<member, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<member, Object>>();
		Map<String, BiConsumer<member, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<member, ?>>();

		attributeGetterFunctions.put("uuid", member::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<member, String>)member::setUuid);
		attributeGetterFunctions.put("memberId", member::getMemberId);
		attributeSetterBiConsumers.put(
			"memberId", (BiConsumer<member, Long>)member::setMemberId);
		attributeGetterFunctions.put("groupId", member::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<member, Long>)member::setGroupId);
		attributeGetterFunctions.put(
			"organizationId", member::getOrganizationId);
		attributeSetterBiConsumers.put(
			"organizationId",
			(BiConsumer<member, Long>)member::setOrganizationId);
		attributeGetterFunctions.put("fullName", member::getFullName);
		attributeSetterBiConsumers.put(
			"fullName", (BiConsumer<member, String>)member::setFullName);
		attributeGetterFunctions.put("birthday", member::getBirthday);
		attributeSetterBiConsumers.put(
			"birthday", (BiConsumer<member, Date>)member::setBirthday);
		attributeGetterFunctions.put("address", member::getAddress);
		attributeSetterBiConsumers.put(
			"address", (BiConsumer<member, String>)member::setAddress);
		attributeGetterFunctions.put("sex", member::getSex);
		attributeSetterBiConsumers.put(
			"sex", (BiConsumer<member, Boolean>)member::setSex);
		attributeGetterFunctions.put("position", member::getPosition);
		attributeSetterBiConsumers.put(
			"position", (BiConsumer<member, String>)member::setPosition);
		attributeGetterFunctions.put("createDate", member::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<member, Date>)member::setCreateDate);
		attributeGetterFunctions.put("createUser", member::getCreateUser);
		attributeSetterBiConsumers.put(
			"createUser", (BiConsumer<member, Long>)member::setCreateUser);
		attributeGetterFunctions.put("modifiedUser", member::getModifiedUser);
		attributeSetterBiConsumers.put(
			"modifiedUser", (BiConsumer<member, Long>)member::setModifiedUser);
		attributeGetterFunctions.put("modifiedDate", member::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<member, Date>)member::setModifiedDate);
		attributeGetterFunctions.put("isLeader", member::getIsLeader);
		attributeSetterBiConsumers.put(
			"isLeader", (BiConsumer<member, Boolean>)member::setIsLeader);
		attributeGetterFunctions.put("urlImage", member::getUrlImage);
		attributeSetterBiConsumers.put(
			"urlImage", (BiConsumer<member, String>)member::setUrlImage);
		attributeGetterFunctions.put("folderId", member::getFolderId);
		attributeSetterBiConsumers.put(
			"folderId", (BiConsumer<member, Long>)member::setFolderId);
		attributeGetterFunctions.put("imageFileId", member::getImageFileId);
		attributeSetterBiConsumers.put(
			"imageFileId", (BiConsumer<member, Long>)member::setImageFileId);

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
	public long getMemberId() {
		return _memberId;
	}

	@Override
	public void setMemberId(long memberId) {
		_columnBitmask = -1L;

		_memberId = memberId;
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
	public String getFullName() {
		if (_fullName == null) {
			return "";
		}
		else {
			return _fullName;
		}
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	@JSON
	@Override
	public Date getBirthday() {
		return _birthday;
	}

	@Override
	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	@JSON
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

	@JSON
	@Override
	public Boolean getSex() {
		return _sex;
	}

	@Override
	public void setSex(Boolean sex) {
		_sex = sex;
	}

	@JSON
	@Override
	public String getPosition() {
		if (_position == null) {
			return "";
		}
		else {
			return _position;
		}
	}

	@Override
	public void setPosition(String position) {
		_position = position;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public long getCreateUser() {
		return _createUser;
	}

	@Override
	public void setCreateUser(long createUser) {
		_createUser = createUser;
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

	@JSON
	@Override
	public Boolean getIsLeader() {
		return _isLeader;
	}

	@Override
	public void setIsLeader(Boolean isLeader) {
		_isLeader = isLeader;
	}

	@JSON
	@Override
	public String getUrlImage() {
		if (_urlImage == null) {
			return "";
		}
		else {
			return _urlImage;
		}
	}

	@Override
	public void setUrlImage(String urlImage) {
		_urlImage = urlImage;
	}

	@JSON
	@Override
	public long getFolderId() {
		return _folderId;
	}

	@Override
	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	@JSON
	@Override
	public long getImageFileId() {
		return _imageFileId;
	}

	@Override
	public void setImageFileId(long imageFileId) {
		_imageFileId = imageFileId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, member.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public member toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, member>
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
		memberImpl memberImpl = new memberImpl();

		memberImpl.setUuid(getUuid());
		memberImpl.setMemberId(getMemberId());
		memberImpl.setGroupId(getGroupId());
		memberImpl.setOrganizationId(getOrganizationId());
		memberImpl.setFullName(getFullName());
		memberImpl.setBirthday(getBirthday());
		memberImpl.setAddress(getAddress());
		memberImpl.setSex(getSex());
		memberImpl.setPosition(getPosition());
		memberImpl.setCreateDate(getCreateDate());
		memberImpl.setCreateUser(getCreateUser());
		memberImpl.setModifiedUser(getModifiedUser());
		memberImpl.setModifiedDate(getModifiedDate());
		memberImpl.setIsLeader(getIsLeader());
		memberImpl.setUrlImage(getUrlImage());
		memberImpl.setFolderId(getFolderId());
		memberImpl.setImageFileId(getImageFileId());

		memberImpl.resetOriginalValues();

		return memberImpl;
	}

	@Override
	public int compareTo(member member) {
		int value = 0;

		if (getMemberId() < member.getMemberId()) {
			value = -1;
		}
		else if (getMemberId() > member.getMemberId()) {
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

		if (!(obj instanceof member)) {
			return false;
		}

		member member = (member)obj;

		long primaryKey = member.getPrimaryKey();

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
		memberModelImpl memberModelImpl = this;

		memberModelImpl._originalUuid = memberModelImpl._uuid;

		memberModelImpl._originalGroupId = memberModelImpl._groupId;

		memberModelImpl._setOriginalGroupId = false;

		memberModelImpl._originalOrganizationId =
			memberModelImpl._organizationId;

		memberModelImpl._setOriginalOrganizationId = false;

		memberModelImpl._setModifiedDate = false;

		memberModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<member> toCacheModel() {
		memberCacheModel memberCacheModel = new memberCacheModel();

		memberCacheModel.uuid = getUuid();

		String uuid = memberCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			memberCacheModel.uuid = null;
		}

		memberCacheModel.memberId = getMemberId();

		memberCacheModel.groupId = getGroupId();

		memberCacheModel.organizationId = getOrganizationId();

		memberCacheModel.fullName = getFullName();

		String fullName = memberCacheModel.fullName;

		if ((fullName != null) && (fullName.length() == 0)) {
			memberCacheModel.fullName = null;
		}

		Date birthday = getBirthday();

		if (birthday != null) {
			memberCacheModel.birthday = birthday.getTime();
		}
		else {
			memberCacheModel.birthday = Long.MIN_VALUE;
		}

		memberCacheModel.address = getAddress();

		String address = memberCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			memberCacheModel.address = null;
		}

		memberCacheModel.sex = getSex();

		memberCacheModel.position = getPosition();

		String position = memberCacheModel.position;

		if ((position != null) && (position.length() == 0)) {
			memberCacheModel.position = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			memberCacheModel.createDate = createDate.getTime();
		}
		else {
			memberCacheModel.createDate = Long.MIN_VALUE;
		}

		memberCacheModel.createUser = getCreateUser();

		memberCacheModel.modifiedUser = getModifiedUser();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			memberCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			memberCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		memberCacheModel.isLeader = getIsLeader();

		memberCacheModel.urlImage = getUrlImage();

		String urlImage = memberCacheModel.urlImage;

		if ((urlImage != null) && (urlImage.length() == 0)) {
			memberCacheModel.urlImage = null;
		}

		memberCacheModel.folderId = getFolderId();

		memberCacheModel.imageFileId = getImageFileId();

		return memberCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<member, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<member, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<member, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((member)this));
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
		Map<String, Function<member, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<member, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<member, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((member)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, member>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _memberId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _organizationId;
	private long _originalOrganizationId;
	private boolean _setOriginalOrganizationId;
	private String _fullName;
	private Date _birthday;
	private String _address;
	private Boolean _sex;
	private String _position;
	private Date _createDate;
	private long _createUser;
	private long _modifiedUser;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private Boolean _isLeader;
	private String _urlImage;
	private long _folderId;
	private long _imageFileId;
	private long _columnBitmask;
	private member _escapedModel;

}