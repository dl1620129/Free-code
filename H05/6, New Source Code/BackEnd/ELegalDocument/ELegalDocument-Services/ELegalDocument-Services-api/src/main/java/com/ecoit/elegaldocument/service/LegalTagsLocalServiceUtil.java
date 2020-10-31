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

package com.ecoit.elegaldocument.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for LegalTags. This utility wraps
 * <code>com.ecoit.elegaldocument.service.impl.LegalTagsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Liverpool
 * @see LegalTagsLocalService
 * @generated
 */
public class LegalTagsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.ecoit.elegaldocument.service.impl.LegalTagsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the legal tags to the database. Also notifies the appropriate model listeners.
	 *
	 * @param legalTags the legal tags
	 * @return the legal tags that was added
	 */
	public static com.ecoit.elegaldocument.model.LegalTags addLegalTags(
		com.ecoit.elegaldocument.model.LegalTags legalTags) {

		return getService().addLegalTags(legalTags);
	}

	/**
	 * Creates a new legal tags with the primary key. Does not add the legal tags to the database.
	 *
	 * @param tagId the primary key for the new legal tags
	 * @return the new legal tags
	 */
	public static com.ecoit.elegaldocument.model.LegalTags createLegalTags(
		long tagId) {

		return getService().createLegalTags(tagId);
	}

	/**
	 * Deletes the legal tags from the database. Also notifies the appropriate model listeners.
	 *
	 * @param legalTags the legal tags
	 * @return the legal tags that was removed
	 */
	public static com.ecoit.elegaldocument.model.LegalTags deleteLegalTags(
		com.ecoit.elegaldocument.model.LegalTags legalTags) {

		return getService().deleteLegalTags(legalTags);
	}

	/**
	 * Deletes the legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tagId the primary key of the legal tags
	 * @return the legal tags that was removed
	 * @throws PortalException if a legal tags with the primary key could not be found
	 */
	public static com.ecoit.elegaldocument.model.LegalTags deleteLegalTags(
			long tagId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteLegalTags(tagId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.elegaldocument.model.impl.LegalTagsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.elegaldocument.model.impl.LegalTagsModelImpl</code>.
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

	public static com.ecoit.elegaldocument.model.LegalTags fetchLegalTags(
		long tagId) {

		return getService().fetchLegalTags(tagId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the legal tags with the primary key.
	 *
	 * @param tagId the primary key of the legal tags
	 * @return the legal tags
	 * @throws PortalException if a legal tags with the primary key could not be found
	 */
	public static com.ecoit.elegaldocument.model.LegalTags getLegalTags(
			long tagId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getLegalTags(tagId);
	}

	/**
	 * Returns a range of all the legal tagses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.elegaldocument.model.impl.LegalTagsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of legal tagses
	 * @param end the upper bound of the range of legal tagses (not inclusive)
	 * @return the range of legal tagses
	 */
	public static java.util.List<com.ecoit.elegaldocument.model.LegalTags>
		getLegalTagses(int start, int end) {

		return getService().getLegalTagses(start, end);
	}

	/**
	 * Returns the number of legal tagses.
	 *
	 * @return the number of legal tagses
	 */
	public static int getLegalTagsesCount() {
		return getService().getLegalTagsesCount();
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
	 * Updates the legal tags in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param legalTags the legal tags
	 * @return the legal tags that was updated
	 */
	public static com.ecoit.elegaldocument.model.LegalTags updateLegalTags(
		com.ecoit.elegaldocument.model.LegalTags legalTags) {

		return getService().updateLegalTags(legalTags);
	}

	public static LegalTagsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LegalTagsLocalService, LegalTagsLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LegalTagsLocalService.class);

		ServiceTracker<LegalTagsLocalService, LegalTagsLocalService>
			serviceTracker =
				new ServiceTracker
					<LegalTagsLocalService, LegalTagsLocalService>(
						bundle.getBundleContext(), LegalTagsLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}