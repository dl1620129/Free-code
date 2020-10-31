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

package com.ecoit.elegaldocument.model;

import com.ecoit.elegaldocument.service.persistence.GroupOrganizationPK;

import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the GroupOrganization service. Represents a row in the &quot;ecoit_doc_GroupOrganization&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ecoit.elegaldocument.model.impl.GroupOrganizationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ecoit.elegaldocument.model.impl.GroupOrganizationImpl</code>.
 * </p>
 *
 * @author Liverpool
 * @see GroupOrganization
 * @generated
 */
@ProviderType
public interface GroupOrganizationModel extends BaseModel<GroupOrganization> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a group organization model instance should use the {@link GroupOrganization} interface instead.
	 */

	/**
	 * Returns the primary key of this group organization.
	 *
	 * @return the primary key of this group organization
	 */
	public GroupOrganizationPK getPrimaryKey();

	/**
	 * Sets the primary key of this group organization.
	 *
	 * @param primaryKey the primary key of this group organization
	 */
	public void setPrimaryKey(GroupOrganizationPK primaryKey);

	/**
	 * Returns the group user ID of this group organization.
	 *
	 * @return the group user ID of this group organization
	 */
	public long getGroupUserId();

	/**
	 * Sets the group user ID of this group organization.
	 *
	 * @param groupUserId the group user ID of this group organization
	 */
	public void setGroupUserId(long groupUserId);

	/**
	 * Returns the group user uuid of this group organization.
	 *
	 * @return the group user uuid of this group organization
	 */
	public String getGroupUserUuid();

	/**
	 * Sets the group user uuid of this group organization.
	 *
	 * @param groupUserUuid the group user uuid of this group organization
	 */
	public void setGroupUserUuid(String groupUserUuid);

	/**
	 * Returns the organizationid of this group organization.
	 *
	 * @return the organizationid of this group organization
	 */
	public long getOrganizationid();

	/**
	 * Sets the organizationid of this group organization.
	 *
	 * @param organizationid the organizationid of this group organization
	 */
	public void setOrganizationid(long organizationid);

}