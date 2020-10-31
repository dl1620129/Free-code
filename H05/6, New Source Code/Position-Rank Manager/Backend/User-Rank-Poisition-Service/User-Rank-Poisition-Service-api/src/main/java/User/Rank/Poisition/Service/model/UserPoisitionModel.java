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
 * The base model interface for the UserPoisition service. Represents a row in the &quot;portal_user_UserPoisition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>User.Rank.Poisition.Service.model.impl.UserPoisitionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>User.Rank.Poisition.Service.model.impl.UserPoisitionImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserPoisition
 * @generated
 */
@ProviderType
public interface UserPoisitionModel
	extends BaseModel<UserPoisition>, ShardedModel, StagedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user poisition model instance should use the {@link UserPoisition} interface instead.
	 */

	/**
	 * Returns the primary key of this user poisition.
	 *
	 * @return the primary key of this user poisition
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user poisition.
	 *
	 * @param primaryKey the primary key of this user poisition
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this user poisition.
	 *
	 * @return the uuid of this user poisition
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this user poisition.
	 *
	 * @param uuid the uuid of this user poisition
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the user poisition ID of this user poisition.
	 *
	 * @return the user poisition ID of this user poisition
	 */
	public long getUserPoisitionId();

	/**
	 * Sets the user poisition ID of this user poisition.
	 *
	 * @param userPoisitionId the user poisition ID of this user poisition
	 */
	public void setUserPoisitionId(long userPoisitionId);

	/**
	 * Returns the group ID of this user poisition.
	 *
	 * @return the group ID of this user poisition
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this user poisition.
	 *
	 * @param groupId the group ID of this user poisition
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this user poisition.
	 *
	 * @return the company ID of this user poisition
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this user poisition.
	 *
	 * @param companyId the company ID of this user poisition
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this user poisition.
	 *
	 * @return the user ID of this user poisition
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this user poisition.
	 *
	 * @param userId the user ID of this user poisition
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user poisition.
	 *
	 * @return the user uuid of this user poisition
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user poisition.
	 *
	 * @param userUuid the user uuid of this user poisition
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user poisition name of this user poisition.
	 *
	 * @return the user poisition name of this user poisition
	 */
	@AutoEscape
	public String getUserPoisitionName();

	/**
	 * Sets the user poisition name of this user poisition.
	 *
	 * @param userPoisitionName the user poisition name of this user poisition
	 */
	public void setUserPoisitionName(String userPoisitionName);

	/**
	 * Returns the description of this user poisition.
	 *
	 * @return the description of this user poisition
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this user poisition.
	 *
	 * @param description the description of this user poisition
	 */
	public void setDescription(String description);

	/**
	 * Returns the create date of this user poisition.
	 *
	 * @return the create date of this user poisition
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this user poisition.
	 *
	 * @param createDate the create date of this user poisition
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this user poisition.
	 *
	 * @return the modified date of this user poisition
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this user poisition.
	 *
	 * @param modifiedDate the modified date of this user poisition
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the total member of this user poisition.
	 *
	 * @return the total member of this user poisition
	 */
	public long getTotalMember();

	/**
	 * Sets the total member of this user poisition.
	 *
	 * @param totalMember the total member of this user poisition
	 */
	public void setTotalMember(long totalMember);

}