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

package com.software.cms.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.software.cms.model.Comment;
import com.software.cms.service.CommentService;
import com.software.cms.service.persistence.ArticleConfigPersistence;
import com.software.cms.service.persistence.ArticleFinder;
import com.software.cms.service.persistence.ArticleHistoryPersistence;
import com.software.cms.service.persistence.ArticleMailSendPersistence;
import com.software.cms.service.persistence.ArticleMessagePersistence;
import com.software.cms.service.persistence.ArticlePersistence;
import com.software.cms.service.persistence.CategoryArticlePersistence;
import com.software.cms.service.persistence.CategoryPersistence;
import com.software.cms.service.persistence.CommentFinder;
import com.software.cms.service.persistence.CommentPersistence;
import com.software.cms.service.persistence.EventFinder;
import com.software.cms.service.persistence.EventPersistence;
import com.software.cms.service.persistence.GroupCategoryPersistence;
import com.software.cms.service.persistence.GroupUserPersistence;
import com.software.cms.service.persistence.GroupUserUsersPersistence;
import com.software.cms.service.persistence.LoggerFinder;
import com.software.cms.service.persistence.LoggerPersistence;
import com.software.cms.service.persistence.MapCateLayoutPersistence;
import com.software.cms.service.persistence.PermissionGroupPersistence;
import com.software.cms.service.persistence.TagFinder;
import com.software.cms.service.persistence.TagPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the comment remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.software.cms.service.impl.CommentServiceImpl}.
 * </p>
 *
 * @author DungNV
 * @see com.software.cms.service.impl.CommentServiceImpl
 * @generated
 */
public abstract class CommentServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, CommentService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CommentService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.software.cms.service.CommentServiceUtil</code>.
	 */
	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CommentService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		commentService = (CommentService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CommentService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Comment.class;
	}

	protected String getModelClassName() {
		return Comment.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = commentPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected ArticlePersistence articlePersistence;

	@Reference
	protected ArticleFinder articleFinder;

	@Reference
	protected ArticleConfigPersistence articleConfigPersistence;

	@Reference
	protected ArticleHistoryPersistence articleHistoryPersistence;

	@Reference
	protected ArticleMailSendPersistence articleMailSendPersistence;

	@Reference
	protected ArticleMessagePersistence articleMessagePersistence;

	@Reference
	protected CategoryPersistence categoryPersistence;

	@Reference
	protected CategoryArticlePersistence categoryArticlePersistence;

	@Reference
	protected com.software.cms.service.CommentLocalService commentLocalService;

	protected CommentService commentService;

	@Reference
	protected CommentPersistence commentPersistence;

	@Reference
	protected CommentFinder commentFinder;

	@Reference
	protected EventPersistence eventPersistence;

	@Reference
	protected EventFinder eventFinder;

	@Reference
	protected GroupCategoryPersistence groupCategoryPersistence;

	@Reference
	protected GroupUserPersistence groupUserPersistence;

	@Reference
	protected GroupUserUsersPersistence groupUserUsersPersistence;

	@Reference
	protected LoggerPersistence loggerPersistence;

	@Reference
	protected LoggerFinder loggerFinder;

	@Reference
	protected MapCateLayoutPersistence mapCateLayoutPersistence;

	@Reference
	protected PermissionGroupPersistence permissionGroupPersistence;

	@Reference
	protected TagPersistence tagPersistence;

	@Reference
	protected TagFinder tagFinder;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

}