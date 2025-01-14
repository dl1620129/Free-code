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

package com.software.cms.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.software.cms.exception.NoSuchArticleConfigException;
import com.software.cms.model.ArticleConfig;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the article config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DungNV
 * @see ArticleConfigUtil
 * @generated
 */
@ProviderType
public interface ArticleConfigPersistence
	extends BasePersistence<ArticleConfig> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ArticleConfigUtil} to access the article config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the article configs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching article configs
	 */
	public java.util.List<ArticleConfig> findByUuid(String uuid);

	/**
	 * Returns a range of all the article configs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ArticleConfigModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of article configs
	 * @param end the upper bound of the range of article configs (not inclusive)
	 * @return the range of matching article configs
	 */
	public java.util.List<ArticleConfig> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the article configs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ArticleConfigModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of article configs
	 * @param end the upper bound of the range of article configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching article configs
	 */
	public java.util.List<ArticleConfig> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ArticleConfig>
			orderByComparator);

	/**
	 * Returns an ordered range of all the article configs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ArticleConfigModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of article configs
	 * @param end the upper bound of the range of article configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching article configs
	 */
	public java.util.List<ArticleConfig> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ArticleConfig>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first article config in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching article config
	 * @throws NoSuchArticleConfigException if a matching article config could not be found
	 */
	public ArticleConfig findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ArticleConfig>
				orderByComparator)
		throws NoSuchArticleConfigException;

	/**
	 * Returns the first article config in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching article config, or <code>null</code> if a matching article config could not be found
	 */
	public ArticleConfig fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ArticleConfig>
			orderByComparator);

	/**
	 * Returns the last article config in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching article config
	 * @throws NoSuchArticleConfigException if a matching article config could not be found
	 */
	public ArticleConfig findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ArticleConfig>
				orderByComparator)
		throws NoSuchArticleConfigException;

	/**
	 * Returns the last article config in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching article config, or <code>null</code> if a matching article config could not be found
	 */
	public ArticleConfig fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ArticleConfig>
			orderByComparator);

	/**
	 * Returns the article configs before and after the current article config in the ordered set where uuid = &#63;.
	 *
	 * @param articleConfigId the primary key of the current article config
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next article config
	 * @throws NoSuchArticleConfigException if a article config with the primary key could not be found
	 */
	public ArticleConfig[] findByUuid_PrevAndNext(
			long articleConfigId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ArticleConfig>
				orderByComparator)
		throws NoSuchArticleConfigException;

	/**
	 * Removes all the article configs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of article configs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching article configs
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the article config in the entity cache if it is enabled.
	 *
	 * @param articleConfig the article config
	 */
	public void cacheResult(ArticleConfig articleConfig);

	/**
	 * Caches the article configs in the entity cache if it is enabled.
	 *
	 * @param articleConfigs the article configs
	 */
	public void cacheResult(java.util.List<ArticleConfig> articleConfigs);

	/**
	 * Creates a new article config with the primary key. Does not add the article config to the database.
	 *
	 * @param articleConfigId the primary key for the new article config
	 * @return the new article config
	 */
	public ArticleConfig create(long articleConfigId);

	/**
	 * Removes the article config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param articleConfigId the primary key of the article config
	 * @return the article config that was removed
	 * @throws NoSuchArticleConfigException if a article config with the primary key could not be found
	 */
	public ArticleConfig remove(long articleConfigId)
		throws NoSuchArticleConfigException;

	public ArticleConfig updateImpl(ArticleConfig articleConfig);

	/**
	 * Returns the article config with the primary key or throws a <code>NoSuchArticleConfigException</code> if it could not be found.
	 *
	 * @param articleConfigId the primary key of the article config
	 * @return the article config
	 * @throws NoSuchArticleConfigException if a article config with the primary key could not be found
	 */
	public ArticleConfig findByPrimaryKey(long articleConfigId)
		throws NoSuchArticleConfigException;

	/**
	 * Returns the article config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param articleConfigId the primary key of the article config
	 * @return the article config, or <code>null</code> if a article config with the primary key could not be found
	 */
	public ArticleConfig fetchByPrimaryKey(long articleConfigId);

	/**
	 * Returns all the article configs.
	 *
	 * @return the article configs
	 */
	public java.util.List<ArticleConfig> findAll();

	/**
	 * Returns a range of all the article configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ArticleConfigModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of article configs
	 * @param end the upper bound of the range of article configs (not inclusive)
	 * @return the range of article configs
	 */
	public java.util.List<ArticleConfig> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the article configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ArticleConfigModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of article configs
	 * @param end the upper bound of the range of article configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of article configs
	 */
	public java.util.List<ArticleConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ArticleConfig>
			orderByComparator);

	/**
	 * Returns an ordered range of all the article configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ArticleConfigModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of article configs
	 * @param end the upper bound of the range of article configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of article configs
	 */
	public java.util.List<ArticleConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ArticleConfig>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the article configs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of article configs.
	 *
	 * @return the number of article configs
	 */
	public int countAll();

}