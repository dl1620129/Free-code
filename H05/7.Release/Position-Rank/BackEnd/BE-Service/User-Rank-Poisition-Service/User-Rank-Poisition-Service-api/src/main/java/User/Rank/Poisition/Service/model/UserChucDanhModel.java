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

package User.Rank.Poisition.Service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the UserChucDanh service. Represents a row in the &quot;portal_user_UserChucDanh&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>User.Rank.Poisition.Service.model.impl.UserChucDanhModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>User.Rank.Poisition.Service.model.impl.UserChucDanhImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserChucDanh
 * @generated
 */
@ProviderType
public interface UserChucDanhModel
	extends BaseModel<UserChucDanh>, ShardedModel, StagedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user chuc danh model instance should use the {@link UserChucDanh} interface instead.
	 */

	/**
	 * Returns the primary key of this user chuc danh.
	 *
	 * @return the primary key of this user chuc danh
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user chuc danh.
	 *
	 * @param primaryKey the primary key of this user chuc danh
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this user chuc danh.
	 *
	 * @return the uuid of this user chuc danh
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this user chuc danh.
	 *
	 * @param uuid the uuid of this user chuc danh
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the user chuc danh ID of this user chuc danh.
	 *
	 * @return the user chuc danh ID of this user chuc danh
	 */
	public long getUserChucDanhId();

	/**
	 * Sets the user chuc danh ID of this user chuc danh.
	 *
	 * @param userChucDanhId the user chuc danh ID of this user chuc danh
	 */
	public void setUserChucDanhId(long userChucDanhId);

	/**
	 * Returns the group ID of this user chuc danh.
	 *
	 * @return the group ID of this user chuc danh
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this user chuc danh.
	 *
	 * @param groupId the group ID of this user chuc danh
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this user chuc danh.
	 *
	 * @return the company ID of this user chuc danh
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this user chuc danh.
	 *
	 * @param companyId the company ID of this user chuc danh
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this user chuc danh.
	 *
	 * @return the user ID of this user chuc danh
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this user chuc danh.
	 *
	 * @param userId the user ID of this user chuc danh
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user chuc danh.
	 *
	 * @return the user uuid of this user chuc danh
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user chuc danh.
	 *
	 * @param userUuid the user uuid of this user chuc danh
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user chuc danh name of this user chuc danh.
	 *
	 * @return the user chuc danh name of this user chuc danh
	 */
	@AutoEscape
	public String getUserChucDanhName();

	/**
	 * Sets the user chuc danh name of this user chuc danh.
	 *
	 * @param userChucDanhName the user chuc danh name of this user chuc danh
	 */
	public void setUserChucDanhName(String userChucDanhName);

	/**
	 * Returns the description of this user chuc danh.
	 *
	 * @return the description of this user chuc danh
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this user chuc danh.
	 *
	 * @param description the description of this user chuc danh
	 */
	public void setDescription(String description);

	/**
	 * Returns the create date of this user chuc danh.
	 *
	 * @return the create date of this user chuc danh
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this user chuc danh.
	 *
	 * @param createDate the create date of this user chuc danh
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this user chuc danh.
	 *
	 * @return the modified date of this user chuc danh
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this user chuc danh.
	 *
	 * @param modifiedDate the modified date of this user chuc danh
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the total member of this user chuc danh.
	 *
	 * @return the total member of this user chuc danh
	 */
	public long getTotalMember();

	/**
	 * Sets the total member of this user chuc danh.
	 *
	 * @param totalMember the total member of this user chuc danh
	 */
	public void setTotalMember(long totalMember);

}