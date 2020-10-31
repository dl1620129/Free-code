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

package com.ecoit.cms.config.service.base;

import com.ecoit.cms.config.model.PortletConfig;
import com.ecoit.cms.config.service.PortletConfigLocalService;
import com.ecoit.cms.config.service.persistence.PortletConfigPersistence;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
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
 * Provides the base implementation for the portlet config local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ecoit.cms.config.service.impl.PortletConfigLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ecoit.cms.config.service.impl.PortletConfigLocalServiceImpl
 * @generated
 */
public abstract class PortletConfigLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, PortletConfigLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PortletConfigLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.ecoit.cms.config.service.PortletConfigLocalServiceUtil</code>.
	 */

	/**
	 * Adds the portlet config to the database. Also notifies the appropriate model listeners.
	 *
	 * @param portletConfig the portlet config
	 * @return the portlet config that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PortletConfig addPortletConfig(PortletConfig portletConfig) {
		portletConfig.setNew(true);

		return portletConfigPersistence.update(portletConfig);
	}

	/**
	 * Creates a new portlet config with the primary key. Does not add the portlet config to the database.
	 *
	 * @param portletId the primary key for the new portlet config
	 * @return the new portlet config
	 */
	@Override
	@Transactional(enabled = false)
	public PortletConfig createPortletConfig(String portletId) {
		return portletConfigPersistence.create(portletId);
	}

	/**
	 * Deletes the portlet config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param portletId the primary key of the portlet config
	 * @return the portlet config that was removed
	 * @throws PortalException if a portlet config with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PortletConfig deletePortletConfig(String portletId)
		throws PortalException {

		return portletConfigPersistence.remove(portletId);
	}

	/**
	 * Deletes the portlet config from the database. Also notifies the appropriate model listeners.
	 *
	 * @param portletConfig the portlet config
	 * @return the portlet config that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PortletConfig deletePortletConfig(PortletConfig portletConfig) {
		return portletConfigPersistence.remove(portletConfig);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			PortletConfig.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return portletConfigPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.cms.config.model.impl.PortletConfigModelImpl</code>.
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

		return portletConfigPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.cms.config.model.impl.PortletConfigModelImpl</code>.
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

		return portletConfigPersistence.findWithDynamicQuery(
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
		return portletConfigPersistence.countWithDynamicQuery(dynamicQuery);
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

		return portletConfigPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public PortletConfig fetchPortletConfig(String portletId) {
		return portletConfigPersistence.fetchByPrimaryKey(portletId);
	}

	/**
	 * Returns the portlet config with the primary key.
	 *
	 * @param portletId the primary key of the portlet config
	 * @return the portlet config
	 * @throws PortalException if a portlet config with the primary key could not be found
	 */
	@Override
	public PortletConfig getPortletConfig(String portletId)
		throws PortalException {

		return portletConfigPersistence.findByPrimaryKey(portletId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return portletConfigLocalService.deletePortletConfig(
			(PortletConfig)persistedModel);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return portletConfigPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the portlet configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.cms.config.model.impl.PortletConfigModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of portlet configs
	 * @param end the upper bound of the range of portlet configs (not inclusive)
	 * @return the range of portlet configs
	 */
	@Override
	public List<PortletConfig> getPortletConfigs(int start, int end) {
		return portletConfigPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of portlet configs.
	 *
	 * @return the number of portlet configs
	 */
	@Override
	public int getPortletConfigsCount() {
		return portletConfigPersistence.countAll();
	}

	/**
	 * Updates the portlet config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param portletConfig the portlet config
	 * @return the portlet config that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PortletConfig updatePortletConfig(PortletConfig portletConfig) {
		return portletConfigPersistence.update(portletConfig);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			PortletConfigLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		portletConfigLocalService = (PortletConfigLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PortletConfigLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PortletConfig.class;
	}

	protected String getModelClassName() {
		return PortletConfig.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = portletConfigPersistence.getDataSource();

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

	protected PortletConfigLocalService portletConfigLocalService;

	@Reference
	protected PortletConfigPersistence portletConfigPersistence;

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

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

}