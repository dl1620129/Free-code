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
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.software.cms.model.GroupUserUsers;
import com.software.cms.service.GroupUserUsersLocalService;
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
import com.software.cms.service.persistence.GroupUserUsersPK;
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
 * Provides the base implementation for the group user users local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.software.cms.service.impl.GroupUserUsersLocalServiceImpl}.
 * </p>
 *
 * @author DungNV
 * @see com.software.cms.service.impl.GroupUserUsersLocalServiceImpl
 * @generated
 */
public abstract class GroupUserUsersLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, GroupUserUsersLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>GroupUserUsersLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.software.cms.service.GroupUserUsersLocalServiceUtil</code>.
	 */

	/**
	 * Adds the group user users to the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupUserUsers the group user users
	 * @return the group user users that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public GroupUserUsers addGroupUserUsers(GroupUserUsers groupUserUsers) {
		groupUserUsers.setNew(true);

		return groupUserUsersPersistence.update(groupUserUsers);
	}

	/**
	 * Creates a new group user users with the primary key. Does not add the group user users to the database.
	 *
	 * @param groupUserUsersPK the primary key for the new group user users
	 * @return the new group user users
	 */
	@Override
	@Transactional(enabled = false)
	public GroupUserUsers createGroupUserUsers(
		GroupUserUsersPK groupUserUsersPK) {

		return groupUserUsersPersistence.create(groupUserUsersPK);
	}

	/**
	 * Deletes the group user users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupUserUsersPK the primary key of the group user users
	 * @return the group user users that was removed
	 * @throws PortalException if a group user users with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public GroupUserUsers deleteGroupUserUsers(
			GroupUserUsersPK groupUserUsersPK)
		throws PortalException {

		return groupUserUsersPersistence.remove(groupUserUsersPK);
	}

	/**
	 * Deletes the group user users from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupUserUsers the group user users
	 * @return the group user users that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public GroupUserUsers deleteGroupUserUsers(GroupUserUsers groupUserUsers) {
		return groupUserUsersPersistence.remove(groupUserUsers);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			GroupUserUsers.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return groupUserUsersPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.GroupUserUsersModelImpl</code>.
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

		return groupUserUsersPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.GroupUserUsersModelImpl</code>.
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

		return groupUserUsersPersistence.findWithDynamicQuery(
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
		return groupUserUsersPersistence.countWithDynamicQuery(dynamicQuery);
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

		return groupUserUsersPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public GroupUserUsers fetchGroupUserUsers(
		GroupUserUsersPK groupUserUsersPK) {

		return groupUserUsersPersistence.fetchByPrimaryKey(groupUserUsersPK);
	}

	/**
	 * Returns the group user users with the primary key.
	 *
	 * @param groupUserUsersPK the primary key of the group user users
	 * @return the group user users
	 * @throws PortalException if a group user users with the primary key could not be found
	 */
	@Override
	public GroupUserUsers getGroupUserUsers(GroupUserUsersPK groupUserUsersPK)
		throws PortalException {

		return groupUserUsersPersistence.findByPrimaryKey(groupUserUsersPK);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(groupUserUsersLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(GroupUserUsers.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.groupUserId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			groupUserUsersLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(GroupUserUsers.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.groupUserId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(groupUserUsersLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(GroupUserUsers.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.groupUserId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return groupUserUsersLocalService.deleteGroupUserUsers(
			(GroupUserUsers)persistedModel);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return groupUserUsersPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the group user userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.GroupUserUsersModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of group user userses
	 * @param end the upper bound of the range of group user userses (not inclusive)
	 * @return the range of group user userses
	 */
	@Override
	public List<GroupUserUsers> getGroupUserUserses(int start, int end) {
		return groupUserUsersPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of group user userses.
	 *
	 * @return the number of group user userses
	 */
	@Override
	public int getGroupUserUsersesCount() {
		return groupUserUsersPersistence.countAll();
	}

	/**
	 * Updates the group user users in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param groupUserUsers the group user users
	 * @return the group user users that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public GroupUserUsers updateGroupUserUsers(GroupUserUsers groupUserUsers) {
		return groupUserUsersPersistence.update(groupUserUsers);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			GroupUserUsersLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		groupUserUsersLocalService = (GroupUserUsersLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return GroupUserUsersLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return GroupUserUsers.class;
	}

	protected String getModelClassName() {
		return GroupUserUsers.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = groupUserUsersPersistence.getDataSource();

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

	protected GroupUserUsersLocalService groupUserUsersLocalService;

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