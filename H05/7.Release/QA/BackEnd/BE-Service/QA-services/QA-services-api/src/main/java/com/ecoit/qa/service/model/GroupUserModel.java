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

package com.ecoit.qa.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the GroupUser service. Represents a row in the &quot;ecoit_qa_GroupUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ecoit.qa.service.model.impl.GroupUserModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ecoit.qa.service.model.impl.GroupUserImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GroupUser
 * @generated
 */
@ProviderType
public interface GroupUserModel
	extends BaseModel<GroupUser>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a group user model instance should use the {@link GroupUser} interface instead.
	 */

	/**
	 * Returns the primary key of this group user.
	 *
	 * @return the primary key of this group user
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this group user.
	 *
	 * @param primaryKey the primary key of this group user
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the group user ID of this group user.
	 *
	 * @return the group user ID of this group user
	 */
	public long getGroupUserId();

	/**
	 * Sets the group user ID of this group user.
	 *
	 * @param groupUserId the group user ID of this group user
	 */
	public void setGroupUserId(long groupUserId);

	/**
	 * Returns the group user uuid of this group user.
	 *
	 * @return the group user uuid of this group user
	 */
	public String getGroupUserUuid();

	/**
	 * Sets the group user uuid of this group user.
	 *
	 * @param groupUserUuid the group user uuid of this group user
	 */
	public void setGroupUserUuid(String groupUserUuid);

	/**
	 * Returns the group ID of this group user.
	 *
	 * @return the group ID of this group user
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this group user.
	 *
	 * @param groupId the group ID of this group user
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this group user.
	 *
	 * @return the company ID of this group user
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this group user.
	 *
	 * @param companyId the company ID of this group user
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this group user.
	 *
	 * @return the user ID of this group user
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this group user.
	 *
	 * @param userId the user ID of this group user
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this group user.
	 *
	 * @return the user uuid of this group user
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this group user.
	 *
	 * @param userUuid the user uuid of this group user
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this group user.
	 *
	 * @return the user name of this group user
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this group user.
	 *
	 * @param userName the user name of this group user
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this group user.
	 *
	 * @return the create date of this group user
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this group user.
	 *
	 * @param createDate the create date of this group user
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the created by user of this group user.
	 *
	 * @return the created by user of this group user
	 */
	public long getCreatedByUser();

	/**
	 * Sets the created by user of this group user.
	 *
	 * @param createdByUser the created by user of this group user
	 */
	public void setCreatedByUser(long createdByUser);

	/**
	 * Returns the modified date of this group user.
	 *
	 * @return the modified date of this group user
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this group user.
	 *
	 * @param modifiedDate the modified date of this group user
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the modified by user of this group user.
	 *
	 * @return the modified by user of this group user
	 */
	public long getModifiedByUser();

	/**
	 * Sets the modified by user of this group user.
	 *
	 * @param modifiedByUser the modified by user of this group user
	 */
	public void setModifiedByUser(long modifiedByUser);

	/**
	 * Returns the name of this group user.
	 *
	 * @return the name of this group user
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this group user.
	 *
	 * @param name the name of this group user
	 */
	public void setName(String name);

	/**
	 * Returns the description of this group user.
	 *
	 * @return the description of this group user
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this group user.
	 *
	 * @param description the description of this group user
	 */
	public void setDescription(String description);

}