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

import com.software.cms.model.Comment;
import com.software.cms.service.CommentLocalService;
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
 * Provides the base implementation for the comment local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.software.cms.service.impl.CommentLocalServiceImpl}.
 * </p>
 *
 * @author DungNV
 * @see com.software.cms.service.impl.CommentLocalServiceImpl
 * @generated
 */
public abstract class CommentLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, CommentLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CommentLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.software.cms.service.CommentLocalServiceUtil</code>.
	 */

	/**
	 * Adds the comment to the database. Also notifies the appropriate model listeners.
	 *
	 * @param comment the comment
	 * @return the comment that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Comment addComment(Comment comment) {
		comment.setNew(true);

		return commentPersistence.update(comment);
	}

	/**
	 * Creates a new comment with the primary key. Does not add the comment to the database.
	 *
	 * @param commentId the primary key for the new comment
	 * @return the new comment
	 */
	@Override
	@Transactional(enabled = false)
	public Comment createComment(long commentId) {
		return commentPersistence.create(commentId);
	}

	/**
	 * Deletes the comment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commentId the primary key of the comment
	 * @return the comment that was removed
	 * @throws PortalException if a comment with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Comment deleteComment(long commentId) throws PortalException {
		return commentPersistence.remove(commentId);
	}

	/**
	 * Deletes the comment from the database. Also notifies the appropriate model listeners.
	 *
	 * @param comment the comment
	 * @return the comment that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Comment deleteComment(Comment comment) {
		return commentPersistence.remove(comment);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Comment.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return commentPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.CommentModelImpl</code>.
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

		return commentPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.CommentModelImpl</code>.
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

		return commentPersistence.findWithDynamicQuery(
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
		return commentPersistence.countWithDynamicQuery(dynamicQuery);
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

		return commentPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Comment fetchComment(long commentId) {
		return commentPersistence.fetchByPrimaryKey(commentId);
	}

	/**
	 * Returns the comment matching the UUID and group.
	 *
	 * @param uuid the comment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching comment, or <code>null</code> if a matching comment could not be found
	 */
	@Override
	public Comment fetchCommentByUuidAndGroupId(String uuid, long groupId) {
		return commentPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the comment with the primary key.
	 *
	 * @param commentId the primary key of the comment
	 * @return the comment
	 * @throws PortalException if a comment with the primary key could not be found
	 */
	@Override
	public Comment getComment(long commentId) throws PortalException {
		return commentPersistence.findByPrimaryKey(commentId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(commentLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Comment.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("commentId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			commentLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Comment.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("commentId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(commentLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Comment.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("commentId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return commentLocalService.deleteComment((Comment)persistedModel);
	}

	public BasePersistence<Comment> getBasePersistence() {
		return commentPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return commentPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the comment matching the UUID and group.
	 *
	 * @param uuid the comment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching comment
	 * @throws PortalException if a matching comment could not be found
	 */
	@Override
	public Comment getCommentByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return commentPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the comments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.software.cms.model.impl.CommentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comments
	 * @param end the upper bound of the range of comments (not inclusive)
	 * @return the range of comments
	 */
	@Override
	public List<Comment> getComments(int start, int end) {
		return commentPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of comments.
	 *
	 * @return the number of comments
	 */
	@Override
	public int getCommentsCount() {
		return commentPersistence.countAll();
	}

	/**
	 * Updates the comment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param comment the comment
	 * @return the comment that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Comment updateComment(Comment comment) {
		return commentPersistence.update(comment);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CommentLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		commentLocalService = (CommentLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CommentLocalService.class.getName();
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

	protected CommentLocalService commentLocalService;

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