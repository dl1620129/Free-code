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

package adv.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the QuangCaoSlider service. Represents a row in the &quot;soft_adv_QuangCaoSlider&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>adv.model.impl.QuangCaoSliderModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>adv.model.impl.QuangCaoSliderImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuangCaoSlider
 * @generated
 */
@ProviderType
public interface QuangCaoSliderModel extends BaseModel<QuangCaoSlider> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a quang cao slider model instance should use the {@link QuangCaoSlider} interface instead.
	 */

	/**
	 * Returns the primary key of this quang cao slider.
	 *
	 * @return the primary key of this quang cao slider
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this quang cao slider.
	 *
	 * @param primaryKey the primary key of this quang cao slider
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this quang cao slider.
	 *
	 * @return the uuid of this quang cao slider
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this quang cao slider.
	 *
	 * @param uuid the uuid of this quang cao slider
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the quang cao slider ID of this quang cao slider.
	 *
	 * @return the quang cao slider ID of this quang cao slider
	 */
	public long getQuangCaoSliderId();

	/**
	 * Sets the quang cao slider ID of this quang cao slider.
	 *
	 * @param quangCaoSliderId the quang cao slider ID of this quang cao slider
	 */
	public void setQuangCaoSliderId(long quangCaoSliderId);

	/**
	 * Returns the quang cao ID of this quang cao slider.
	 *
	 * @return the quang cao ID of this quang cao slider
	 */
	public long getQuangCaoId();

	/**
	 * Sets the quang cao ID of this quang cao slider.
	 *
	 * @param quangCaoId the quang cao ID of this quang cao slider
	 */
	public void setQuangCaoId(long quangCaoId);

	/**
	 * Returns the group ID of this quang cao slider.
	 *
	 * @return the group ID of this quang cao slider
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this quang cao slider.
	 *
	 * @param groupId the group ID of this quang cao slider
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this quang cao slider.
	 *
	 * @return the user ID of this quang cao slider
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this quang cao slider.
	 *
	 * @param userId the user ID of this quang cao slider
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this quang cao slider.
	 *
	 * @return the user uuid of this quang cao slider
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this quang cao slider.
	 *
	 * @param userUuid the user uuid of this quang cao slider
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this quang cao slider.
	 *
	 * @return the create date of this quang cao slider
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this quang cao slider.
	 *
	 * @param createDate the create date of this quang cao slider
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this quang cao slider.
	 *
	 * @return the modified date of this quang cao slider
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this quang cao slider.
	 *
	 * @param modifiedDate the modified date of this quang cao slider
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ten quang cao of this quang cao slider.
	 *
	 * @return the ten quang cao of this quang cao slider
	 */
	@AutoEscape
	public String getTenQuangCao();

	/**
	 * Sets the ten quang cao of this quang cao slider.
	 *
	 * @param tenQuangCao the ten quang cao of this quang cao slider
	 */
	public void setTenQuangCao(String tenQuangCao);

	/**
	 * Returns the mo ta of this quang cao slider.
	 *
	 * @return the mo ta of this quang cao slider
	 */
	@AutoEscape
	public String getMoTa();

	/**
	 * Sets the mo ta of this quang cao slider.
	 *
	 * @param moTa the mo ta of this quang cao slider
	 */
	public void setMoTa(String moTa);

	/**
	 * Returns the target of this quang cao slider.
	 *
	 * @return the target of this quang cao slider
	 */
	public Boolean getTarget();

	/**
	 * Sets the target of this quang cao slider.
	 *
	 * @param target the target of this quang cao slider
	 */
	public void setTarget(Boolean target);

	/**
	 * Returns the url of this quang cao slider.
	 *
	 * @return the url of this quang cao slider
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this quang cao slider.
	 *
	 * @param url the url of this quang cao slider
	 */
	public void setUrl(String url);

	/**
	 * Returns the type of this quang cao slider.
	 *
	 * @return the type of this quang cao slider
	 */
	public int getType();

	/**
	 * Sets the type of this quang cao slider.
	 *
	 * @param type the type of this quang cao slider
	 */
	public void setType(int type);

}