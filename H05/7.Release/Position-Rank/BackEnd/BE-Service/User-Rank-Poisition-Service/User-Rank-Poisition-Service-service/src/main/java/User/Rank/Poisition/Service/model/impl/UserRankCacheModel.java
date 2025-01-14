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

package User.Rank.Poisition.Service.model.impl;

import User.Rank.Poisition.Service.model.UserRank;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing UserRank in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class UserRankCacheModel
	implements CacheModel<UserRank>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserRankCacheModel)) {
			return false;
		}

		UserRankCacheModel userRankCacheModel = (UserRankCacheModel)obj;

		if (userRankId == userRankCacheModel.userRankId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userRankId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userRankId=");
		sb.append(userRankId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", rankName=");
		sb.append(rankName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", totalMember=");
		sb.append(totalMember);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserRank toEntityModel() {
		UserRankImpl userRankImpl = new UserRankImpl();

		if (uuid == null) {
			userRankImpl.setUuid("");
		}
		else {
			userRankImpl.setUuid(uuid);
		}

		userRankImpl.setUserRankId(userRankId);
		userRankImpl.setGroupId(groupId);
		userRankImpl.setCompanyId(companyId);
		userRankImpl.setUserId(userId);

		if (rankName == null) {
			userRankImpl.setRankName("");
		}
		else {
			userRankImpl.setRankName(rankName);
		}

		if (description == null) {
			userRankImpl.setDescription("");
		}
		else {
			userRankImpl.setDescription(description);
		}

		if (createDate == Long.MIN_VALUE) {
			userRankImpl.setCreateDate(null);
		}
		else {
			userRankImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userRankImpl.setModifiedDate(null);
		}
		else {
			userRankImpl.setModifiedDate(new Date(modifiedDate));
		}

		userRankImpl.setTotalMember(totalMember);

		userRankImpl.resetOriginalValues();

		return userRankImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userRankId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		rankName = objectInput.readUTF();
		description = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		totalMember = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userRankId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (rankName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rankName);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(totalMember);
	}

	public String uuid;
	public long userRankId;
	public long groupId;
	public long companyId;
	public long userId;
	public String rankName;
	public String description;
	public long createDate;
	public long modifiedDate;
	public long totalMember;

}