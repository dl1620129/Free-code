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

import com.software.cms.model.GroupUserUsers;
import com.software.cms.service.GroupUserUsersLocalServiceUtil;

/**
 * The extended model base implementation for the GroupUserUsers service. Represents a row in the &quot;soft_cms_GroupUserUsers&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GroupUserUsersImpl}.
 * </p>
 *
 * @author DungNV
 * @see GroupUserUsersImpl
 * @see GroupUserUsers
 * @generated
 */
public abstract class GroupUserUsersBaseImpl
	extends GroupUserUsersModelImpl implements GroupUserUsers {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a group user users model instance should use the <code>GroupUserUsers</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			GroupUserUsersLocalServiceUtil.addGroupUserUsers(this);
		}
		else {
			GroupUserUsersLocalServiceUtil.updateGroupUserUsers(this);
		}
	}

}