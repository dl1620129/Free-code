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

package organizationalStructure.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the member service. Represents a row in the &quot;portal_member&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>organizationalStructure.service.model.impl.memberModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>organizationalStructure.service.model.impl.memberImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see member
 * @generated
 */
@ProviderType
public interface memberModel extends BaseModel<member> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a member model instance should use the {@link member} interface instead.
	 */

	/**
	 * Returns the primary key of this member.
	 *
	 * @return the primary key of this member
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this member.
	 *
	 * @param primaryKey the primary key of this member
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this member.
	 *
	 * @return the uuid of this member
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this member.
	 *
	 * @param uuid the uuid of this member
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the member ID of this member.
	 *
	 * @return the member ID of this member
	 */
	public long getMemberId();

	/**
	 * Sets the member ID of this member.
	 *
	 * @param memberId the member ID of this member
	 */
	public void setMemberId(long memberId);

	/**
	 * Returns the group ID of this member.
	 *
	 * @return the group ID of this member
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this member.
	 *
	 * @param groupId the group ID of this member
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the organization ID of this member.
	 *
	 * @return the organization ID of this member
	 */
	public long getOrganizationId();

	/**
	 * Sets the organization ID of this member.
	 *
	 * @param organizationId the organization ID of this member
	 */
	public void setOrganizationId(long organizationId);

	/**
	 * Returns the full name of this member.
	 *
	 * @return the full name of this member
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this member.
	 *
	 * @param fullName the full name of this member
	 */
	public void setFullName(String fullName);

	/**
	 * Returns the birthday of this member.
	 *
	 * @return the birthday of this member
	 */
	public Date getBirthday();

	/**
	 * Sets the birthday of this member.
	 *
	 * @param birthday the birthday of this member
	 */
	public void setBirthday(Date birthday);

	/**
	 * Returns the address of this member.
	 *
	 * @return the address of this member
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this member.
	 *
	 * @param address the address of this member
	 */
	public void setAddress(String address);

	/**
	 * Returns the sex of this member.
	 *
	 * @return the sex of this member
	 */
	public Boolean getSex();

	/**
	 * Sets the sex of this member.
	 *
	 * @param sex the sex of this member
	 */
	public void setSex(Boolean sex);

	/**
	 * Returns the position of this member.
	 *
	 * @return the position of this member
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this member.
	 *
	 * @param position the position of this member
	 */
	public void setPosition(String position);

	/**
	 * Returns the create date of this member.
	 *
	 * @return the create date of this member
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this member.
	 *
	 * @param createDate the create date of this member
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the create user of this member.
	 *
	 * @return the create user of this member
	 */
	public long getCreateUser();

	/**
	 * Sets the create user of this member.
	 *
	 * @param createUser the create user of this member
	 */
	public void setCreateUser(long createUser);

	/**
	 * Returns the modified user of this member.
	 *
	 * @return the modified user of this member
	 */
	public long getModifiedUser();

	/**
	 * Sets the modified user of this member.
	 *
	 * @param modifiedUser the modified user of this member
	 */
	public void setModifiedUser(long modifiedUser);

	/**
	 * Returns the modified date of this member.
	 *
	 * @return the modified date of this member
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this member.
	 *
	 * @param modifiedDate the modified date of this member
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the is leader of this member.
	 *
	 * @return the is leader of this member
	 */
	public Boolean getIsLeader();

	/**
	 * Sets the is leader of this member.
	 *
	 * @param isLeader the is leader of this member
	 */
	public void setIsLeader(Boolean isLeader);

	/**
	 * Returns the url image of this member.
	 *
	 * @return the url image of this member
	 */
	@AutoEscape
	public String getUrlImage();

	/**
	 * Sets the url image of this member.
	 *
	 * @param urlImage the url image of this member
	 */
	public void setUrlImage(String urlImage);

	/**
	 * Returns the folder ID of this member.
	 *
	 * @return the folder ID of this member
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this member.
	 *
	 * @param folderId the folder ID of this member
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the image file ID of this member.
	 *
	 * @return the image file ID of this member
	 */
	public long getImageFileId();

	/**
	 * Sets the image file ID of this member.
	 *
	 * @param imageFileId the image file ID of this member
	 */
	public void setImageFileId(long imageFileId);

}