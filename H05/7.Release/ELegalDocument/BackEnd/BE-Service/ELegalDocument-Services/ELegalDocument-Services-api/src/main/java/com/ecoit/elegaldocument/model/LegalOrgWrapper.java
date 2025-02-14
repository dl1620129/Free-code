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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LegalOrg}.
 * </p>
 *
 * @author Liverpool
 * @see LegalOrg
 * @generated
 */
public class LegalOrgWrapper
	extends BaseModelWrapper<LegalOrg>
	implements LegalOrg, ModelWrapper<LegalOrg> {

	public LegalOrgWrapper(LegalOrg legalOrg) {
		super(legalOrg);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("language", getLanguage());
		attributes.put("statusOrg", isStatusOrg());
		attributes.put("rssable", isRssable());
		attributes.put("position", getPosition());
		attributes.put("parentId", getParentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long createdByUser = (Long)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Long modifiedByUser = (Long)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Boolean statusOrg = (Boolean)attributes.get("statusOrg");

		if (statusOrg != null) {
			setStatusOrg(statusOrg);
		}

		Boolean rssable = (Boolean)attributes.get("rssable");

		if (rssable != null) {
			setRssable(rssable);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}
	}

	/**
	 * Returns the company ID of this legal org.
	 *
	 * @return the company ID of this legal org
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the created by user of this legal org.
	 *
	 * @return the created by user of this legal org
	 */
	@Override
	public long getCreatedByUser() {
		return model.getCreatedByUser();
	}

	/**
	 * Returns the created date of this legal org.
	 *
	 * @return the created date of this legal org
	 */
	@Override
	public Date getCreatedDate() {
		return model.getCreatedDate();
	}

	/**
	 * Returns the description of this legal org.
	 *
	 * @return the description of this legal org
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this legal org.
	 *
	 * @return the group ID of this legal org
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the language of this legal org.
	 *
	 * @return the language of this legal org
	 */
	@Override
	public String getLanguage() {
		return model.getLanguage();
	}

	/**
	 * Returns the modified by user of this legal org.
	 *
	 * @return the modified by user of this legal org
	 */
	@Override
	public long getModifiedByUser() {
		return model.getModifiedByUser();
	}

	/**
	 * Returns the modified date of this legal org.
	 *
	 * @return the modified date of this legal org
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this legal org.
	 *
	 * @return the name of this legal org
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the organization ID of this legal org.
	 *
	 * @return the organization ID of this legal org
	 */
	@Override
	public long getOrganizationId() {
		return model.getOrganizationId();
	}

	/**
	 * Returns the parent ID of this legal org.
	 *
	 * @return the parent ID of this legal org
	 */
	@Override
	public long getParentId() {
		return model.getParentId();
	}

	/**
	 * Returns the position of this legal org.
	 *
	 * @return the position of this legal org
	 */
	@Override
	public int getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this legal org.
	 *
	 * @return the primary key of this legal org
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rssable of this legal org.
	 *
	 * @return the rssable of this legal org
	 */
	@Override
	public boolean getRssable() {
		return model.getRssable();
	}

	/**
	 * Returns the status org of this legal org.
	 *
	 * @return the status org of this legal org
	 */
	@Override
	public boolean getStatusOrg() {
		return model.getStatusOrg();
	}

	/**
	 * Returns the user ID of this legal org.
	 *
	 * @return the user ID of this legal org
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this legal org.
	 *
	 * @return the user uuid of this legal org
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns <code>true</code> if this legal org is rssable.
	 *
	 * @return <code>true</code> if this legal org is rssable; <code>false</code> otherwise
	 */
	@Override
	public boolean isRssable() {
		return model.isRssable();
	}

	/**
	 * Returns <code>true</code> if this legal org is status org.
	 *
	 * @return <code>true</code> if this legal org is status org; <code>false</code> otherwise
	 */
	@Override
	public boolean isStatusOrg() {
		return model.isStatusOrg();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this legal org.
	 *
	 * @param companyId the company ID of this legal org
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the created by user of this legal org.
	 *
	 * @param createdByUser the created by user of this legal org
	 */
	@Override
	public void setCreatedByUser(long createdByUser) {
		model.setCreatedByUser(createdByUser);
	}

	/**
	 * Sets the created date of this legal org.
	 *
	 * @param createdDate the created date of this legal org
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		model.setCreatedDate(createdDate);
	}

	/**
	 * Sets the description of this legal org.
	 *
	 * @param description the description of this legal org
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this legal org.
	 *
	 * @param groupId the group ID of this legal org
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the language of this legal org.
	 *
	 * @param language the language of this legal org
	 */
	@Override
	public void setLanguage(String language) {
		model.setLanguage(language);
	}

	/**
	 * Sets the modified by user of this legal org.
	 *
	 * @param modifiedByUser the modified by user of this legal org
	 */
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		model.setModifiedByUser(modifiedByUser);
	}

	/**
	 * Sets the modified date of this legal org.
	 *
	 * @param modifiedDate the modified date of this legal org
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this legal org.
	 *
	 * @param name the name of this legal org
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the organization ID of this legal org.
	 *
	 * @param organizationId the organization ID of this legal org
	 */
	@Override
	public void setOrganizationId(long organizationId) {
		model.setOrganizationId(organizationId);
	}

	/**
	 * Sets the parent ID of this legal org.
	 *
	 * @param parentId the parent ID of this legal org
	 */
	@Override
	public void setParentId(long parentId) {
		model.setParentId(parentId);
	}

	/**
	 * Sets the position of this legal org.
	 *
	 * @param position the position of this legal org
	 */
	@Override
	public void setPosition(int position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this legal org.
	 *
	 * @param primaryKey the primary key of this legal org
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets whether this legal org is rssable.
	 *
	 * @param rssable the rssable of this legal org
	 */
	@Override
	public void setRssable(boolean rssable) {
		model.setRssable(rssable);
	}

	/**
	 * Sets whether this legal org is status org.
	 *
	 * @param statusOrg the status org of this legal org
	 */
	@Override
	public void setStatusOrg(boolean statusOrg) {
		model.setStatusOrg(statusOrg);
	}

	/**
	 * Sets the user ID of this legal org.
	 *
	 * @param userId the user ID of this legal org
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this legal org.
	 *
	 * @param userUuid the user uuid of this legal org
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected LegalOrgWrapper wrap(LegalOrg legalOrg) {
		return new LegalOrgWrapper(legalOrg);
	}

}