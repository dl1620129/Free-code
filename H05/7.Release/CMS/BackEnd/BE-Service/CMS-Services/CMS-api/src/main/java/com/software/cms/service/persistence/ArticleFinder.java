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

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author DungNV
 * @generated
 */
@ProviderType
public interface ArticleFinder {

	public java.util.List<com.software.cms.model.Article> getArticleBySql(
			String sql, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int getCountByArticle(String sql);

	public java.util.List<Object> getDuLieuTheoSql(
		String sql, int start, int end);

	public java.util.List<com.software.cms.model.Article> findByUserNews(
			long groupId, String language, long userId, long status,
			long categoryId, String eventName, String tagName, String keyword,
			boolean inTitle, boolean inSummary, boolean inContent,
			boolean inDate, java.util.Date fromDate, java.util.Date toDate,
			boolean inAuthor, boolean userKiemDuyet, int start, int end)
		throws Exception;

	public int getCountByUserNews(
			long groupId, String language, long userId, long status,
			long categoryId, String eventName, String tagName, String keyword,
			boolean inTitle, boolean inSummary, boolean inContent,
			boolean inDate, java.util.Date fromDate, java.util.Date toDate,
			boolean inAuthor, boolean userKiemDuyet)
		throws Exception;

	public int getCountArticleByCaterory(
			long groupId, Long categoryId, java.util.Date publishDateFrom)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.software.cms.model.Article>
			getListArticleByCaterory(
				long groupId, Long categoryId, java.util.Date publishDateFrom,
				Integer start, Integer end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.software.cms.model.Article> getListArticleByEvent(
			long groupId, long articleId, long categoryId, String eventId,
			Integer start, Integer end)
		throws com.liferay.portal.kernel.exception.SystemException;

}