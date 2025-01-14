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

package com.software.cms.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the ArticleConfig service. Represents a row in the &quot;soft_cms_ArticleConfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.software.cms.model.impl.ArticleConfigModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.software.cms.model.impl.ArticleConfigImpl</code>.
 * </p>
 *
 * @author DungNV
 * @see ArticleConfig
 * @generated
 */
@ProviderType
public interface ArticleConfigModel extends BaseModel<ArticleConfig> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a article config model instance should use the {@link ArticleConfig} interface instead.
	 */

	/**
	 * Returns the primary key of this article config.
	 *
	 * @return the primary key of this article config
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this article config.
	 *
	 * @param primaryKey the primary key of this article config
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this article config.
	 *
	 * @return the uuid of this article config
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this article config.
	 *
	 * @param uuid the uuid of this article config
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the article config ID of this article config.
	 *
	 * @return the article config ID of this article config
	 */
	public long getArticleConfigId();

	/**
	 * Sets the article config ID of this article config.
	 *
	 * @param articleConfigId the article config ID of this article config
	 */
	public void setArticleConfigId(long articleConfigId);

}