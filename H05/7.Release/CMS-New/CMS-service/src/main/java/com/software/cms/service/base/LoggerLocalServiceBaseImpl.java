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
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.software.cms.model.Logger;
import com.software.cms.service.LoggerLocalService;
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

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the logger local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.software.cms.service.impl.LoggerLocalServiceImpl}.
 * </p>
 *
 * @author DungNV
 * @see com.software.cms.service.impl.LoggerLocalServiceImpl
 * @generated
 */
public abstract class LoggerLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, LoggerLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>LoggerLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.software.cms.service.LoggerLocalServiceUtil</code>.
	 */

	/**
	 * Adds the logger to the database. Also notifies the appropriate model listeners.
	 *
	 * @param logger the logger
	 * @return the logger that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Logger addLogger(Logger logger) {
		logger.setNew(true);

		return loggerPersistence.update(logger);
	}

	/**
	 * Creates a new logger with the primary key. Does not add the logger to the database.
	 *
	 * @param loggerId the primary key for the new logger
	 * @return the new logger
	 */
	@Override
	@Transactional(enabled = false)
	public Logger createLogger(long loggerId) {
		return loggerPersistence.create(loggerId);
	}

	/**
	 * Deletes the logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loggerId the primary key of the logger
	 * @return the logger that was removed
	 * @throws PortalException if a logger with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Logger deleteLogger(long loggerId) throws PortalException {
		return loggerPersistence.remove(loggerId);
	}

	/**
	 * Deletes the logger from the database. Also notifies the appropriate model listeners.
	 *
	 * @param logger the logger
	 * @return the logger that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Logger deleteLogger(Logger logger) {
		return loggerPersistence.remove(logger);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Logger.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return loggerPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.LoggerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return loggerPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.LoggerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return loggerPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return loggerPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return loggerPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Logger fetchLogger(long loggerId) {
		return loggerPersistence.fetchByPrimaryKey(loggerId);
	}

	/**
	 * Returns the logger matching the UUID and group.
	 *
	 * @param uuid the logger's UUID
	 * @param groupId the primary key of the group
	 * @return the matching logger, or <code>null</code> if a matching logger could not be found
	 */
	@Override
	public Logger fetchLoggerByUuidAndGroupId(String uuid, long groupId) {
		return loggerPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the logger with the primary key.
	 *
	 * @param loggerId the primary key of the logger
	 * @return the logger
	 * @throws PortalException if a logger with the primary key could not be found
	 */
	@Override
	public Logger getLogger(long loggerId) throws PortalException {
		return loggerPersistence.findByPrimaryKey(loggerId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(loggerLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Logger.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("loggerId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(loggerLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Logger.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("loggerId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(loggerLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Logger.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("loggerId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return loggerLocalService.deleteLogger((Logger)persistedModel);
	}

	public BasePersistence<Logger> getBasePersistence() {
		return loggerPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return loggerPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the logger matching the UUID and group.
	 *
	 * @param uuid the logger's UUID
	 * @param groupId the primary key of the group
	 * @return the matching logger
	 * @throws PortalException if a matching logger could not be found
	 */
	@Override
	public Logger getLoggerByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return loggerPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.LoggerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of loggers
	 * @param end the upper bound of the range of loggers (not inclusive)
	 * @return the range of loggers
	 */
	@Override
	public List<Logger> getLoggers(int start, int end) {
		return loggerPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of loggers.
	 *
	 * @return the number of loggers
	 */
	@Override
	public int getLoggersCount() {
		return loggerPersistence.countAll();
	}

	/**
	 * Updates the logger in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param logger the logger
	 * @return the logger that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Logger updateLogger(Logger logger) {
		return loggerPersistence.update(logger);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			LoggerLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		loggerLocalService = (LoggerLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return LoggerLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Logger.class;
	}

	protected String getModelClassName() {
		return Logger.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = loggerPersistence.getDataSource();

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

	protected LoggerLocalService loggerLocalService;

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
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}