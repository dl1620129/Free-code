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

package com.ecoit.mr.model;

import com.ecoit.mr.service.persistence.UserGroupPK;

import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the UserGroup service. Represents a row in the &quot;ecoit_mr_UserGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ecoit.mr.model.impl.UserGroupModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ecoit.mr.model.impl.UserGroupImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserGroup
 * @generated
 */
@ProviderType
public interface UserGroupModel extends BaseModel<UserGroup> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user group model instance should use the {@link UserGroup} interface instead.
	 */

	/**
	 * Returns the primary key of this user group.
	 *
	 * @return the primary key of this user group
	 */
	public UserGroupPK getPrimaryKey();

	/**
	 * Sets the primary key of this user group.
	 *
	 * @param primaryKey the primary key of this user group
	 */
	public void setPrimaryKey(UserGroupPK primaryKey);

	/**
	 * Returns the user ID of this user group.
	 *
	 * @return the user ID of this user group
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this user group.
	 *
	 * @param userId the user ID of this user group
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user group.
	 *
	 * @return the user uuid of this user group
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user group.
	 *
	 * @param userUuid the user uuid of this user group
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user permission group ID of this user group.
	 *
	 * @return the user permission group ID of this user group
	 */
	public long getUserPermissionGroupId();

	/**
	 * Sets the user permission group ID of this user group.
	 *
	 * @param userPermissionGroupId the user permission group ID of this user group
	 */
	public void setUserPermissionGroupId(long userPermissionGroupId);

}