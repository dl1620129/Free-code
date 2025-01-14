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

package com.ecoit.elegaldocument.service.persistence;

import com.ecoit.elegaldocument.model.EcmsGroup;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the ecms group service. This utility wraps <code>com.ecoit.elegaldocument.service.persistence.impl.EcmsGroupPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Liverpool
 * @see EcmsGroupPersistence
 * @generated
 */
public class EcmsGroupUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(EcmsGroup ecmsGroup) {
		getPersistence().clearCache(ecmsGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, EcmsGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EcmsGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EcmsGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EcmsGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EcmsGroup> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EcmsGroup update(EcmsGroup ecmsGroup) {
		return getPersistence().update(ecmsGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EcmsGroup update(
		EcmsGroup ecmsGroup, ServiceContext serviceContext) {

		return getPersistence().update(ecmsGroup, serviceContext);
	}

	/**
	 * Returns the ecms group where groupUserId = &#63; or throws a <code>NoSuchEcmsGroupException</code> if it could not be found.
	 *
	 * @param groupUserId the group user ID
	 * @return the matching ecms group
	 * @throws NoSuchEcmsGroupException if a matching ecms group could not be found
	 */
	public static EcmsGroup findBygroupUserId(long groupUserId)
		throws com.ecoit.elegaldocument.exception.NoSuchEcmsGroupException {

		return getPersistence().findBygroupUserId(groupUserId);
	}

	/**
	 * Returns the ecms group where groupUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupUserId the group user ID
	 * @return the matching ecms group, or <code>null</code> if a matching ecms group could not be found
	 */
	public static EcmsGroup fetchBygroupUserId(long groupUserId) {
		return getPersistence().fetchBygroupUserId(groupUserId);
	}

	/**
	 * Returns the ecms group where groupUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupUserId the group user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ecms group, or <code>null</code> if a matching ecms group could not be found
	 */
	public static EcmsGroup fetchBygroupUserId(
		long groupUserId, boolean useFinderCache) {

		return getPersistence().fetchBygroupUserId(groupUserId, useFinderCache);
	}

	/**
	 * Removes the ecms group where groupUserId = &#63; from the database.
	 *
	 * @param groupUserId the group user ID
	 * @return the ecms group that was removed
	 */
	public static EcmsGroup removeBygroupUserId(long groupUserId)
		throws com.ecoit.elegaldocument.exception.NoSuchEcmsGroupException {

		return getPersistence().removeBygroupUserId(groupUserId);
	}

	/**
	 * Returns the number of ecms groups where groupUserId = &#63;.
	 *
	 * @param groupUserId the group user ID
	 * @return the number of matching ecms groups
	 */
	public static int countBygroupUserId(long groupUserId) {
		return getPersistence().countBygroupUserId(groupUserId);
	}

	/**
	 * Caches the ecms group in the entity cache if it is enabled.
	 *
	 * @param ecmsGroup the ecms group
	 */
	public static void cacheResult(EcmsGroup ecmsGroup) {
		getPersistence().cacheResult(ecmsGroup);
	}

	/**
	 * Caches the ecms groups in the entity cache if it is enabled.
	 *
	 * @param ecmsGroups the ecms groups
	 */
	public static void cacheResult(List<EcmsGroup> ecmsGroups) {
		getPersistence().cacheResult(ecmsGroups);
	}

	/**
	 * Creates a new ecms group with the primary key. Does not add the ecms group to the database.
	 *
	 * @param groupUserId the primary key for the new ecms group
	 * @return the new ecms group
	 */
	public static EcmsGroup create(long groupUserId) {
		return getPersistence().create(groupUserId);
	}

	/**
	 * Removes the ecms group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupUserId the primary key of the ecms group
	 * @return the ecms group that was removed
	 * @throws NoSuchEcmsGroupException if a ecms group with the primary key could not be found
	 */
	public static EcmsGroup remove(long groupUserId)
		throws com.ecoit.elegaldocument.exception.NoSuchEcmsGroupException {

		return getPersistence().remove(groupUserId);
	}

	public static EcmsGroup updateImpl(EcmsGroup ecmsGroup) {
		return getPersistence().updateImpl(ecmsGroup);
	}

	/**
	 * Returns the ecms group with the primary key or throws a <code>NoSuchEcmsGroupException</code> if it could not be found.
	 *
	 * @param groupUserId the primary key of the ecms group
	 * @return the ecms group
	 * @throws NoSuchEcmsGroupException if a ecms group with the primary key could not be found
	 */
	public static EcmsGroup findByPrimaryKey(long groupUserId)
		throws com.ecoit.elegaldocument.exception.NoSuchEcmsGroupException {

		return getPersistence().findByPrimaryKey(groupUserId);
	}

	/**
	 * Returns the ecms group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param groupUserId the primary key of the ecms group
	 * @return the ecms group, or <code>null</code> if a ecms group with the primary key could not be found
	 */
	public static EcmsGroup fetchByPrimaryKey(long groupUserId) {
		return getPersistence().fetchByPrimaryKey(groupUserId);
	}

	/**
	 * Returns all the ecms groups.
	 *
	 * @return the ecms groups
	 */
	public static List<EcmsGroup> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ecms groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EcmsGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ecms groups
	 * @param end the upper bound of the range of ecms groups (not inclusive)
	 * @return the range of ecms groups
	 */
	public static List<EcmsGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ecms groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EcmsGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ecms groups
	 * @param end the upper bound of the range of ecms groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ecms groups
	 */
	public static List<EcmsGroup> findAll(
		int start, int end, OrderByComparator<EcmsGroup> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ecms groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EcmsGroupModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ecms groups
	 * @param end the upper bound of the range of ecms groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ecms groups
	 */
	public static List<EcmsGroup> findAll(
		int start, int end, OrderByComparator<EcmsGroup> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ecms groups from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ecms groups.
	 *
	 * @return the number of ecms groups
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EcmsGroupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EcmsGroupPersistence, EcmsGroupPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EcmsGroupPersistence.class);

		ServiceTracker<EcmsGroupPersistence, EcmsGroupPersistence>
			serviceTracker =
				new ServiceTracker<EcmsGroupPersistence, EcmsGroupPersistence>(
					bundle.getBundleContext(), EcmsGroupPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}