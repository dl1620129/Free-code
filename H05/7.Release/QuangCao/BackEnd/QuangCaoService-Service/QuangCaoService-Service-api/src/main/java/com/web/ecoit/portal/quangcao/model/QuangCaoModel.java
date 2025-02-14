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

package com.web.ecoit.portal.quangcao.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the QuangCao service. Represents a row in the &quot;soft_adv_QuangCao&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.web.ecoit.portal.quangcao.model.impl.QuangCaoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.web.ecoit.portal.quangcao.model.impl.QuangCaoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuangCao
 * @generated
 */
@ProviderType
public interface QuangCaoModel extends BaseModel<QuangCao> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a quang cao model instance should use the {@link QuangCao} interface instead.
	 */

	/**
	 * Returns the primary key of this quang cao.
	 *
	 * @return the primary key of this quang cao
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this quang cao.
	 *
	 * @param primaryKey the primary key of this quang cao
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this quang cao.
	 *
	 * @return the uuid of this quang cao
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this quang cao.
	 *
	 * @param uuid the uuid of this quang cao
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the quang cao ID of this quang cao.
	 *
	 * @return the quang cao ID of this quang cao
	 */
	public long getQuangCaoId();

	/**
	 * Sets the quang cao ID of this quang cao.
	 *
	 * @param quangCaoId the quang cao ID of this quang cao
	 */
	public void setQuangCaoId(long quangCaoId);

	/**
	 * Returns the group ID of this quang cao.
	 *
	 * @return the group ID of this quang cao
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this quang cao.
	 *
	 * @param groupId the group ID of this quang cao
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the language of this quang cao.
	 *
	 * @return the language of this quang cao
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this quang cao.
	 *
	 * @param language the language of this quang cao
	 */
	public void setLanguage(String language);

	/**
	 * Returns the user ID of this quang cao.
	 *
	 * @return the user ID of this quang cao
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this quang cao.
	 *
	 * @param userId the user ID of this quang cao
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this quang cao.
	 *
	 * @return the user uuid of this quang cao
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this quang cao.
	 *
	 * @param userUuid the user uuid of this quang cao
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this quang cao.
	 *
	 * @return the create date of this quang cao
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this quang cao.
	 *
	 * @param createDate the create date of this quang cao
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this quang cao.
	 *
	 * @return the modified date of this quang cao
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this quang cao.
	 *
	 * @param modifiedDate the modified date of this quang cao
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ten quang cao of this quang cao.
	 *
	 * @return the ten quang cao of this quang cao
	 */
	@AutoEscape
	public String getTenQuangCao();

	/**
	 * Sets the ten quang cao of this quang cao.
	 *
	 * @param tenQuangCao the ten quang cao of this quang cao
	 */
	public void setTenQuangCao(String tenQuangCao);

	/**
	 * Returns the mo ta of this quang cao.
	 *
	 * @return the mo ta of this quang cao
	 */
	@AutoEscape
	public String getMoTa();

	/**
	 * Sets the mo ta of this quang cao.
	 *
	 * @param moTa the mo ta of this quang cao
	 */
	public void setMoTa(String moTa);

	/**
	 * Returns the target of this quang cao.
	 *
	 * @return the target of this quang cao
	 */
	public Boolean getTarget();

	/**
	 * Sets the target of this quang cao.
	 *
	 * @param target the target of this quang cao
	 */
	public void setTarget(Boolean target);

	/**
	 * Returns the image ID of this quang cao.
	 *
	 * @return the image ID of this quang cao
	 */
	public long getImageId();

	/**
	 * Sets the image ID of this quang cao.
	 *
	 * @param imageId the image ID of this quang cao
	 */
	public void setImageId(long imageId);

	/**
	 * Returns the url of this quang cao.
	 *
	 * @return the url of this quang cao
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this quang cao.
	 *
	 * @param url the url of this quang cao
	 */
	public void setUrl(String url);

	/**
	 * Returns the type of this quang cao.
	 *
	 * @return the type of this quang cao
	 */
	public int getType();

	/**
	 * Sets the type of this quang cao.
	 *
	 * @param type the type of this quang cao
	 */
	public void setType(int type);

	/**
	 * Returns the status of this quang cao.
	 *
	 * @return the status of this quang cao
	 */
	public int getStatus();

	/**
	 * Sets the status of this quang cao.
	 *
	 * @param status the status of this quang cao
	 */
	public void setStatus(int status);

}