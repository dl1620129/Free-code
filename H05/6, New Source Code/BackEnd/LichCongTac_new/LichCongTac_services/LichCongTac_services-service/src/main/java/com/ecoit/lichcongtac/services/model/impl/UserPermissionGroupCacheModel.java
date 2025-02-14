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

import com.ecoit.lichcongtac.services.model.UserPermissionGroup;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserPermissionGroup in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserPermissionGroupCacheModel
	implements CacheModel<UserPermissionGroup>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserPermissionGroupCacheModel)) {
			return false;
		}

		UserPermissionGroupCacheModel userPermissionGroupCacheModel =
			(UserPermissionGroupCacheModel)obj;

		if (userPermissionGroupId ==
				userPermissionGroupCacheModel.userPermissionGroupId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userPermissionGroupId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{userPermissionGroupId=");
		sb.append(userPermissionGroupId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", groupName=");
		sb.append(groupName);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserPermissionGroup toEntityModel() {
		UserPermissionGroupImpl userPermissionGroupImpl =
			new UserPermissionGroupImpl();

		userPermissionGroupImpl.setUserPermissionGroupId(userPermissionGroupId);
		userPermissionGroupImpl.setGroupId(groupId);
		userPermissionGroupImpl.setCompanyId(companyId);
		userPermissionGroupImpl.setUserId(userId);

		if (userName == null) {
			userPermissionGroupImpl.setUserName("");
		}
		else {
			userPermissionGroupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			userPermissionGroupImpl.setCreateDate(null);
		}
		else {
			userPermissionGroupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userPermissionGroupImpl.setModifiedDate(null);
		}
		else {
			userPermissionGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (groupName == null) {
			userPermissionGroupImpl.setGroupName("");
		}
		else {
			userPermissionGroupImpl.setGroupName(groupName);
		}

		if (description == null) {
			userPermissionGroupImpl.setDescription("");
		}
		else {
			userPermissionGroupImpl.setDescription(description);
		}

		userPermissionGroupImpl.resetOriginalValues();

		return userPermissionGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userPermissionGroupId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		groupName = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(userPermissionGroupId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (groupName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(groupName);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long userPermissionGroupId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String groupName;
	public String description;

}