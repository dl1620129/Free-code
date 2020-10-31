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

package com.ecoit.cms.config.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PortletConfig service. Represents a row in the &quot;ecoit_config_PortletConfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ecoit.cms.config.model.impl.PortletConfigModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ecoit.cms.config.model.impl.PortletConfigImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PortletConfig
 * @generated
 */
@ProviderType
public interface PortletConfigModel extends BaseModel<PortletConfig> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a portlet config model instance should use the {@link PortletConfig} interface instead.
	 */

	/**
	 * Returns the primary key of this portlet config.
	 *
	 * @return the primary key of this portlet config
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this portlet config.
	 *
	 * @param primaryKey the primary key of this portlet config
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the uuid of this portlet config.
	 *
	 * @return the uuid of this portlet config
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this portlet config.
	 *
	 * @param uuid the uuid of this portlet config
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the portlet ID of this portlet config.
	 *
	 * @return the portlet ID of this portlet config
	 */
	@AutoEscape
	public String getPortletId();

	/**
	 * Sets the portlet ID of this portlet config.
	 *
	 * @param portletId the portlet ID of this portlet config
	 */
	public void setPortletId(String portletId);

	/**
	 * Returns the catgory ID of this portlet config.
	 *
	 * @return the catgory ID of this portlet config
	 */
	public long getCatgoryId();

	/**
	 * Sets the catgory ID of this portlet config.
	 *
	 * @param catgoryId the catgory ID of this portlet config
	 */
	public void setCatgoryId(long catgoryId);

}