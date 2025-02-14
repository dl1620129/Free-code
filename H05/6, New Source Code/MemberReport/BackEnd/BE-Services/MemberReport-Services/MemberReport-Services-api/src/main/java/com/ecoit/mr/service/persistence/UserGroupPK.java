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

package com.ecoit.mr.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserGroupPK implements Comparable<UserGroupPK>, Serializable {

	public long userId;
	public long userPermissionGroupId;

	public UserGroupPK() {
	}

	public UserGroupPK(long userId, long userPermissionGroupId) {
		this.userId = userId;
		this.userPermissionGroupId = userPermissionGroupId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getUserPermissionGroupId() {
		return userPermissionGroupId;
	}

	public void setUserPermissionGroupId(long userPermissionGroupId) {
		this.userPermissionGroupId = userPermissionGroupId;
	}

	@Override
	public int compareTo(UserGroupPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (userId < pk.userId) {
			value = -1;
		}
		else if (userId > pk.userId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (userPermissionGroupId < pk.userPermissionGroupId) {
			value = -1;
		}
		else if (userPermissionGroupId > pk.userPermissionGroupId) {
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

		if (!(obj instanceof UserGroupPK)) {
			return false;
		}

		UserGroupPK pk = (UserGroupPK)obj;

		if ((userId == pk.userId) &&
			(userPermissionGroupId == pk.userPermissionGroupId)) {

			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, userId);
		hashCode = HashUtil.hash(hashCode, userPermissionGroupId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("userId=");

		sb.append(userId);
		sb.append(", userPermissionGroupId=");

		sb.append(userPermissionGroupId);

		sb.append("}");

		return sb.toString();
	}

}