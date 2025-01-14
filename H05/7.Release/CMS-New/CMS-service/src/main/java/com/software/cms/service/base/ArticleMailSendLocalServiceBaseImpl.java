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

import com.software.cms.model.ArticleMailSend;
import com.software.cms.service.ArticleMailSendLocalService;
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
 * Provides the base implementation for the article mail send local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.software.cms.service.impl.ArticleMailSendLocalServiceImpl}.
 * </p>
 *
 * @author DungNV
 * @see com.software.cms.service.impl.ArticleMailSendLocalServiceImpl
 * @generated
 */
public abstract class ArticleMailSendLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, ArticleMailSendLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ArticleMailSendLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.software.cms.service.ArticleMailSendLocalServiceUtil</code>.
	 */

	/**
	 * Adds the article mail send to the database. Also notifies the appropriate model listeners.
	 *
	 * @param articleMailSend the article mail send
	 * @return the article mail send that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ArticleMailSend addArticleMailSend(ArticleMailSend articleMailSend) {
		articleMailSend.setNew(true);

		return articleMailSendPersistence.update(articleMailSend);
	}

	/**
	 * Creates a new article mail send with the primary key. Does not add the article mail send to the database.
	 *
	 * @param mailSendId the primary key for the new article mail send
	 * @return the new article mail send
	 */
	@Override
	@Transactional(enabled = false)
	public ArticleMailSend createArticleMailSend(long mailSendId) {
		return articleMailSendPersistence.create(mailSendId);
	}

	/**
	 * Deletes the article mail send with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param mailSendId the primary key of the article mail send
	 * @return the article mail send that was removed
	 * @throws PortalException if a article mail send with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ArticleMailSend deleteArticleMailSend(long mailSendId)
		throws PortalException {

		return articleMailSendPersistence.remove(mailSendId);
	}

	/**
	 * Deletes the article mail send from the database. Also notifies the appropriate model listeners.
	 *
	 * @param articleMailSend the article mail send
	 * @return the article mail send that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ArticleMailSend deleteArticleMailSend(
		ArticleMailSend articleMailSend) {

		return articleMailSendPersistence.remove(articleMailSend);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			ArticleMailSend.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return articleMailSendPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.ArticleMailSendModelImpl</code>.
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

		return articleMailSendPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.ArticleMailSendModelImpl</code>.
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

		return articleMailSendPersistence.findWithDynamicQuery(
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
		return articleMailSendPersistence.countWithDynamicQuery(dynamicQuery);
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

		return articleMailSendPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public ArticleMailSend fetchArticleMailSend(long mailSendId) {
		return articleMailSendPersistence.fetchByPrimaryKey(mailSendId);
	}

	/**
	 * Returns the article mail send matching the UUID and group.
	 *
	 * @param uuid the article mail send's UUID
	 * @param groupId the primary key of the group
	 * @return the matching article mail send, or <code>null</code> if a matching article mail send could not be found
	 */
	@Override
	public ArticleMailSend fetchArticleMailSendByUuidAndGroupId(
		String uuid, long groupId) {

		return articleMailSendPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the article mail send with the primary key.
	 *
	 * @param mailSendId the primary key of the article mail send
	 * @return the article mail send
	 * @throws PortalException if a article mail send with the primary key could not be found
	 */
	@Override
	public ArticleMailSend getArticleMailSend(long mailSendId)
		throws PortalException {

		return articleMailSendPersistence.findByPrimaryKey(mailSendId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(articleMailSendLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ArticleMailSend.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("mailSendId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			articleMailSendLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(ArticleMailSend.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("mailSendId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(articleMailSendLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ArticleMailSend.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("mailSendId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return articleMailSendLocalService.deleteArticleMailSend(
			(ArticleMailSend)persistedModel);
	}

	public BasePersistence<ArticleMailSend> getBasePersistence() {
		return articleMailSendPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return articleMailSendPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the article mail send matching the UUID and group.
	 *
	 * @param uuid the article mail send's UUID
	 * @param groupId the primary key of the group
	 * @return the matching article mail send
	 * @throws PortalException if a matching article mail send could not be found
	 */
	@Override
	public ArticleMailSend getArticleMailSendByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return articleMailSendPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the article mail sends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.ArticleMailSendModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of article mail sends
	 * @param end the upper bound of the range of article mail sends (not inclusive)
	 * @return the range of article mail sends
	 */
	@Override
	public List<ArticleMailSend> getArticleMailSends(int start, int end) {
		return articleMailSendPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of article mail sends.
	 *
	 * @return the number of article mail sends
	 */
	@Override
	public int getArticleMailSendsCount() {
		return articleMailSendPersistence.countAll();
	}

	/**
	 * Updates the article mail send in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param articleMailSend the article mail send
	 * @return the article mail send that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ArticleMailSend updateArticleMailSend(
		ArticleMailSend articleMailSend) {

		return articleMailSendPersistence.update(articleMailSend);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ArticleMailSendLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		articleMailSendLocalService = (ArticleMailSendLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ArticleMailSendLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ArticleMailSend.class;
	}

	protected String getModelClassName() {
		return ArticleMailSend.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = articleMailSendPersistence.getDataSource();

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

	protected ArticleMailSendLocalService articleMailSendLocalService;

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