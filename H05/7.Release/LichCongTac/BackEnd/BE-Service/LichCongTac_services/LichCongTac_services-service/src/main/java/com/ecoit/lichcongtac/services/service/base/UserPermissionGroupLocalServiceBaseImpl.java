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

package com.ecoit.lichcongtac.services.service.base;

import com.ecoit.lichcongtac.services.model.UserPermissionGroup;
import com.ecoit.lichcongtac.services.service.UserPermissionGroupLocalService;
import com.ecoit.lichcongtac.services.service.persistence.ColumnGroupRelPersistence;
import com.ecoit.lichcongtac.services.service.persistence.LichChiTietPersistence;
import com.ecoit.lichcongtac.services.service.persistence.LichCongTacPersistence;
import com.ecoit.lichcongtac.services.service.persistence.PermissionGroupRelPersistence;
import com.ecoit.lichcongtac.services.service.persistence.UserGroupRelPersistence;
import com.ecoit.lichcongtac.services.service.persistence.UserPermissionGroupPersistence;

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

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the user permission group local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ecoit.lichcongtac.services.service.impl.UserPermissionGroupLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ecoit.lichcongtac.services.service.impl.UserPermissionGroupLocalServiceImpl
 * @generated
 */
public abstract class UserPermissionGroupLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   UserPermissionGroupLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>UserPermissionGroupLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.ecoit.lichcongtac.services.service.UserPermissionGroupLocalServiceUtil</code>.
	 */

	/**
	 * Adds the user permission group to the database. Also notifies the appropriate model listeners.
	 *
	 * @param userPermissionGroup the user permission group
	 * @return the user permission group that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public UserPermissionGroup addUserPermissionGroup(
		UserPermissionGroup userPermissionGroup) {

		userPermissionGroup.setNew(true);

		return userPermissionGroupPersistence.update(userPermissionGroup);
	}

	/**
	 * Creates a new user permission group with the primary key. Does not add the user permission group to the database.
	 *
	 * @param userPermissionGroupId the primary key for the new user permission group
	 * @return the new user permission group
	 */
	@Override
	@Transactional(enabled = false)
	public UserPermissionGroup createUserPermissionGroup(
		long userPermissionGroupId) {

		return userPermissionGroupPersistence.create(userPermissionGroupId);
	}

	/**
	 * Deletes the user permission group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userPermissionGroupId the primary key of the user permission group
	 * @return the user permission group that was removed
	 * @throws PortalException if a user permission group with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public UserPermissionGroup deleteUserPermissionGroup(
			long userPermissionGroupId)
		throws PortalException {

		return userPermissionGroupPersistence.remove(userPermissionGroupId);
	}

	/**
	 * Deletes the user permission group from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userPermissionGroup the user permission group
	 * @return the user permission group that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public UserPermissionGroup deleteUserPermissionGroup(
		UserPermissionGroup userPermissionGroup) {

		return userPermissionGroupPersistence.remove(userPermissionGroup);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			UserPermissionGroup.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return userPermissionGroupPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.lichcongtac.services.model.impl.UserPermissionGroupModelImpl</code>.
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

		return userPermissionGroupPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.lichcongtac.services.model.impl.UserPermissionGroupModelImpl</code>.
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

		return userPermissionGroupPersistence.findWithDynamicQuery(
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
		return userPermissionGroupPersistence.countWithDynamicQuery(
			dynamicQuery);
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

		return userPermissionGroupPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public UserPermissionGroup fetchUserPermissionGroup(
		long userPermissionGroupId) {

		return userPermissionGroupPersistence.fetchByPrimaryKey(
			userPermissionGroupId);
	}

	/**
	 * Returns the user permission group with the primary key.
	 *
	 * @param userPermissionGroupId the primary key of the user permission group
	 * @return the user permission group
	 * @throws PortalException if a user permission group with the primary key could not be found
	 */
	@Override
	public UserPermissionGroup getUserPermissionGroup(
			long userPermissionGroupId)
		throws PortalException {

		return userPermissionGroupPersistence.findByPrimaryKey(
			userPermissionGroupId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			userPermissionGroupLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(UserPermissionGroup.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"userPermissionGroupId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			userPermissionGroupLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			UserPermissionGroup.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"userPermissionGroupId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			userPermissionGroupLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(UserPermissionGroup.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"userPermissionGroupId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return userPermissionGroupLocalService.deleteUserPermissionGroup(
			(UserPermissionGroup)persistedModel);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return userPermissionGroupPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the user permission groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.lichcongtac.services.model.impl.UserPermissionGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user permission groups
	 * @param end the upper bound of the range of user permission groups (not inclusive)
	 * @return the range of user permission groups
	 */
	@Override
	public List<UserPermissionGroup> getUserPermissionGroups(
		int start, int end) {

		return userPermissionGroupPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of user permission groups.
	 *
	 * @return the number of user permission groups
	 */
	@Override
	public int getUserPermissionGroupsCount() {
		return userPermissionGroupPersistence.countAll();
	}

	/**
	 * Updates the user permission group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param userPermissionGroup the user permission group
	 * @return the user permission group that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public UserPermissionGroup updateUserPermissionGroup(
		UserPermissionGroup userPermissionGroup) {

		return userPermissionGroupPersistence.update(userPermissionGroup);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			UserPermissionGroupLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		userPermissionGroupLocalService =
			(UserPermissionGroupLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return UserPermissionGroupLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return UserPermissionGroup.class;
	}

	protected String getModelClassName() {
		return UserPermissionGroup.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				userPermissionGroupPersistence.getDataSource();

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
	protected ColumnGroupRelPersistence columnGroupRelPersistence;

	@Reference
	protected LichChiTietPersistence lichChiTietPersistence;

	@Reference
	protected LichCongTacPersistence lichCongTacPersistence;

	@Reference
	protected PermissionGroupRelPersistence permissionGroupRelPersistence;

	@Reference
	protected UserGroupRelPersistence userGroupRelPersistence;

	protected UserPermissionGroupLocalService userPermissionGroupLocalService;

	@Reference
	protected UserPermissionGroupPersistence userPermissionGroupPersistence;

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