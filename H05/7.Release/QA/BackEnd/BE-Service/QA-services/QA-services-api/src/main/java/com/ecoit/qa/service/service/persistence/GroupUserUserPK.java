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

package com.ecoit.qa.service.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GroupUserUserPK
	implements Comparable<GroupUserUserPK>, Serializable {

	public long groupUserId;
	public long userId;

	public GroupUserUserPK() {
	}

	public GroupUserUserPK(long groupUserId, long userId) {
		this.groupUserId = groupUserId;
		this.userId = userId;
	}

	public long getGroupUserId() {
		return groupUserId;
	}

	public void setGroupUserId(long groupUserId) {
		this.groupUserId = groupUserId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public int compareTo(GroupUserUserPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (groupUserId < pk.groupUserId) {
			value = -1;
		}
		else if (groupUserId > pk.groupUserId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

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

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GroupUserUserPK)) {
			return false;
		}

		GroupUserUserPK pk = (GroupUserUserPK)obj;

		if ((groupUserId == pk.groupUserId) && (userId == pk.userId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, groupUserId);
		hashCode = HashUtil.hash(hashCode, userId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("groupUserId=");

		sb.append(groupUserId);
		sb.append(", userId=");

		sb.append(userId);

		sb.append("}");

		return sb.toString();
	}

}