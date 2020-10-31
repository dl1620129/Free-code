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

package Album.service.service;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Fields. This utility wraps
 * <code>Album.service.service.impl.FieldsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FieldsLocalService
 * @generated
 */
@ProviderType
public class FieldsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>Album.service.service.impl.FieldsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the fields to the database. Also notifies the appropriate model listeners.
	 *
	 * @param fields the fields
	 * @return the fields that was added
	 */
	public static Album.service.model.Fields addFields(
		Album.service.model.Fields fields) {

		return getService().addFields(fields);
	}

	/**
	 * Creates a new fields with the primary key. Does not add the fields to the database.
	 *
	 * @param fieldId the primary key for the new fields
	 * @return the new fields
	 */
	public static Album.service.model.Fields createFields(long fieldId) {
		return getService().createFields(fieldId);
	}

	/**
	 * Deletes the fields from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fields the fields
	 * @return the fields that was removed
	 */
	public static Album.service.model.Fields deleteFields(
		Album.service.model.Fields fields) {

		return getService().deleteFields(fields);
	}

	/**
	 * Deletes the fields with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fieldId the primary key of the fields
	 * @return the fields that was removed
	 * @throws PortalException if a fields with the primary key could not be found
	 */
	public static Album.service.model.Fields deleteFields(long fieldId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteFields(fieldId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>Album.service.model.impl.FieldsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>Album.service.model.impl.FieldsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static Album.service.model.Fields fetchFields(long fieldId) {
		return getService().fetchFields(fieldId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static int getCountAll(String name, long groupId) throws Exception {
		return getService().getCountAll(name, groupId);
	}

	/**
	 * Returns the fields with the primary key.
	 *
	 * @param fieldId the primary key of the fields
	 * @return the fields
	 * @throws PortalException if a fields with the primary key could not be found
	 */
	public static Album.service.model.Fields getFields(long fieldId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getFields(fieldId);
	}

	/**
	 * Returns a range of all the fieldses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>Album.service.model.impl.FieldsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fieldses
	 * @param end the upper bound of the range of fieldses (not inclusive)
	 * @return the range of fieldses
	 */
	public static java.util.List<Album.service.model.Fields> getFieldses(
		int start, int end) {

		return getService().getFieldses(start, end);
	}

	/**
	 * Returns the number of fieldses.
	 *
	 * @return the number of fieldses
	 */
	public static int getFieldsesCount() {
		return getService().getFieldsesCount();
	}

	public static java.util.List<Album.service.model.Fields> getFieldsTheoSQL(
		String sqlQuery) {

		return getService().getFieldsTheoSQL(sqlQuery);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static java.util.List<Album.service.model.Fields> getListFields(
			String name, int start, int limit, long groupId)
		throws Exception {

		return getService().getListFields(name, start, limit, groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the fields in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param fields the fields
	 * @return the fields that was updated
	 */
	public static Album.service.model.Fields updateFields(
		Album.service.model.Fields fields) {

		return getService().updateFields(fields);
	}

	public static FieldsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FieldsLocalService, FieldsLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FieldsLocalService.class);

		ServiceTracker<FieldsLocalService, FieldsLocalService> serviceTracker =
			new ServiceTracker<FieldsLocalService, FieldsLocalService>(
				bundle.getBundleContext(), FieldsLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}