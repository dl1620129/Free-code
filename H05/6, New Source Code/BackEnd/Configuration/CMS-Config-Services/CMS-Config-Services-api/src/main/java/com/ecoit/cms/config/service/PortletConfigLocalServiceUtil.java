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

package com.ecoit.cms.config.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for PortletConfig. This utility wraps
 * <code>com.ecoit.cms.config.service.impl.PortletConfigLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PortletConfigLocalService
 * @generated
 */
public class PortletConfigLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.ecoit.cms.config.service.impl.PortletConfigLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the portlet config to the database. Also notifies the appropriate model listeners.
	 *
	 * @param portletConfig the portlet config
	 * @return the portlet config that was added
	 */
	public static com.ecoit.cms.config.model.PortletConfig addPortletConfig(
		com.ecoit.cms.config.model.PortletConfig portletConfig) {

		return getService().addPortletConfig(portletConfig);
	}

	public static int countConfig(String q) {
		return getService().countConfig(q);
	}

	/**
	 * Creates a new portlet config with the primary key. Does not add the portlet config to the database.
	 *
	 * @param portletId the primary key for the new portlet config
	 * @return the new portlet config
	 */
	public static com.ecoit.cms.config.model.PortletConfig createPortletConfig(
		String portletId) {

		return getService().createPortletConfig(portletId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the portlet config from the database. Also notifies the appropriate model listeners.
	 *
	 * @param portletConfig the portlet config
	 * @return the portlet config that was removed
	 */
	public static com.ecoit.cms.config.model.PortletConfig deletePortletConfig(
		com.ecoit.cms.config.model.PortletConfig portletConfig) {

		return getService().deletePortletConfig(portletConfig);
	}

	/**
	 * Deletes the portlet config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param portletId the primary key of the portlet config
	 * @return the portlet config that was removed
	 * @throws PortalException if a portlet config with the primary key could not be found
	 */
	public static com.ecoit.cms.config.model.PortletConfig deletePortletConfig(
			String portletId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePortletConfig(portletId);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.ecoit.cms.config.model.PortletConfig fetchPortletConfig(
		String portletId) {

		return getService().fetchPortletConfig(portletId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the portlet config with the primary key.
	 *
	 * @param portletId the primary key of the portlet config
	 * @return the portlet config
	 * @throws PortalException if a portlet config with the primary key could not be found
	 */
	public static com.ecoit.cms.config.model.PortletConfig getPortletConfig(
			String portletId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPortletConfig(portletId);
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
	public static java.util.List<com.ecoit.cms.config.model.PortletConfig>
		getPortletConfigs(int start, int end) {

		return getService().getPortletConfigs(start, end);
	}

	/**
	 * Returns the number of portlet configs.
	 *
	 * @return the number of portlet configs
	 */
	public static int getPortletConfigsCount() {
		return getService().getPortletConfigsCount();
	}

	public static java.util.List<com.ecoit.cms.config.model.PortletConfig>
		searchConfig(String q, int start, int limit) {

		return getService().searchConfig(q, start, limit);
	}

	/**
	 * Updates the portlet config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param portletConfig the portlet config
	 * @return the portlet config that was updated
	 */
	public static com.ecoit.cms.config.model.PortletConfig updatePortletConfig(
		com.ecoit.cms.config.model.PortletConfig portletConfig) {

		return getService().updatePortletConfig(portletConfig);
	}

	public static PortletConfigLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<PortletConfigLocalService, PortletConfigLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			PortletConfigLocalService.class);

		ServiceTracker<PortletConfigLocalService, PortletConfigLocalService>
			serviceTracker =
				new ServiceTracker
					<PortletConfigLocalService, PortletConfigLocalService>(
						bundle.getBundleContext(),
						PortletConfigLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}