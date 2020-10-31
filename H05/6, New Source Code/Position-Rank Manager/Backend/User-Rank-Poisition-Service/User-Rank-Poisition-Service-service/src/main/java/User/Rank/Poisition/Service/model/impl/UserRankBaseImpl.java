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
import User.Rank.Poisition.Service.service.UserRankLocalServiceUtil;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model base implementation for the UserRank service. Represents a row in the &quot;portal_user_UserRank&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserRankImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserRankImpl
 * @see UserRank
 * @generated
 */
@ProviderType
public abstract class UserRankBaseImpl
	extends UserRankModelImpl implements UserRank {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user rank model instance should use the <code>UserRank</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			UserRankLocalServiceUtil.addUserRank(this);
		}
		else {
			UserRankLocalServiceUtil.updateUserRank(this);
		}
	}

}