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

package organizationalStructure.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import organizationalStructure.service.model.organizations;

/**
 * The persistence utility for the organizations service. This utility wraps <code>organizationalStructure.service.service.persistence.impl.organizationsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see organizationsPersistence
 * @generated
 */
@ProviderType
public class organizationsUtil {

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
	public static void clearCache(organizations organizations) {
		getPersistence().clearCache(organizations);
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
	public static Map<Serializable, organizations> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<organizations> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<organizations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<organizations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<organizations> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static organizations update(organizations organizations) {
		return getPersistence().update(organizations);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static organizations update(
		organizations organizations, ServiceContext serviceContext) {

		return getPersistence().update(organizations, serviceContext);
	}

	/**
	 * Returns all the organizationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching organizationses
	 */
	public static List<organizations> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the organizationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>organizationsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of organizationses
	 * @param end the upper bound of the range of organizationses (not inclusive)
	 * @return the range of matching organizationses
	 */
	public static List<organizations> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the organizationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>organizationsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of organizationses
	 * @param end the upper bound of the range of organizationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching organizationses
	 */
	@Deprecated
	public static List<organizations> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<organizations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the organizationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>organizationsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of organizationses
	 * @param end the upper bound of the range of organizationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching organizationses
	 */
	public static List<organizations> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<organizations> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns the first organizations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching organizations
	 * @throws NoSuchorganizationsException if a matching organizations could not be found
	 */
	public static organizations findByUuid_First(
			String uuid, OrderByComparator<organizations> orderByComparator)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first organizations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching organizations, or <code>null</code> if a matching organizations could not be found
	 */
	public static organizations fetchByUuid_First(
		String uuid, OrderByComparator<organizations> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last organizations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching organizations
	 * @throws NoSuchorganizationsException if a matching organizations could not be found
	 */
	public static organizations findByUuid_Last(
			String uuid, OrderByComparator<organizations> orderByComparator)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last organizations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching organizations, or <code>null</code> if a matching organizations could not be found
	 */
	public static organizations fetchByUuid_Last(
		String uuid, OrderByComparator<organizations> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the organizationses before and after the current organizations in the ordered set where uuid = &#63;.
	 *
	 * @param organizationId the primary key of the current organizations
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next organizations
	 * @throws NoSuchorganizationsException if a organizations with the primary key could not be found
	 */
	public static organizations[] findByUuid_PrevAndNext(
			long organizationId, String uuid,
			OrderByComparator<organizations> orderByComparator)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().findByUuid_PrevAndNext(
			organizationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the organizationses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of organizationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching organizationses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the organizations where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchorganizationsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching organizations
	 * @throws NoSuchorganizationsException if a matching organizations could not be found
	 */
	public static organizations findByUUID_G(String uuid, long groupId)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the organizations where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching organizations, or <code>null</code> if a matching organizations could not be found
	 */
	@Deprecated
	public static organizations fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Returns the organizations where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching organizations, or <code>null</code> if a matching organizations could not be found
	 */
	public static organizations fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Removes the organizations where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the organizations that was removed
	 */
	public static organizations removeByUUID_G(String uuid, long groupId)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of organizationses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching organizationses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the organizationses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching organizationses
	 */
	public static List<organizations> findByFindAll(long groupId) {
		return getPersistence().findByFindAll(groupId);
	}

	/**
	 * Returns a range of all the organizationses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>organizationsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of organizationses
	 * @param end the upper bound of the range of organizationses (not inclusive)
	 * @return the range of matching organizationses
	 */
	public static List<organizations> findByFindAll(
		long groupId, int start, int end) {

		return getPersistence().findByFindAll(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the organizationses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>organizationsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByFindAll(long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param start the lower bound of the range of organizationses
	 * @param end the upper bound of the range of organizationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching organizationses
	 */
	@Deprecated
	public static List<organizations> findByFindAll(
		long groupId, int start, int end,
		OrderByComparator<organizations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByFindAll(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the organizationses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>organizationsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of organizationses
	 * @param end the upper bound of the range of organizationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching organizationses
	 */
	public static List<organizations> findByFindAll(
		long groupId, int start, int end,
		OrderByComparator<organizations> orderByComparator) {

		return getPersistence().findByFindAll(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the first organizations in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching organizations
	 * @throws NoSuchorganizationsException if a matching organizations could not be found
	 */
	public static organizations findByFindAll_First(
			long groupId, OrderByComparator<organizations> orderByComparator)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().findByFindAll_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first organizations in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching organizations, or <code>null</code> if a matching organizations could not be found
	 */
	public static organizations fetchByFindAll_First(
		long groupId, OrderByComparator<organizations> orderByComparator) {

		return getPersistence().fetchByFindAll_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last organizations in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching organizations
	 * @throws NoSuchorganizationsException if a matching organizations could not be found
	 */
	public static organizations findByFindAll_Last(
			long groupId, OrderByComparator<organizations> orderByComparator)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().findByFindAll_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last organizations in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching organizations, or <code>null</code> if a matching organizations could not be found
	 */
	public static organizations fetchByFindAll_Last(
		long groupId, OrderByComparator<organizations> orderByComparator) {

		return getPersistence().fetchByFindAll_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the organizationses before and after the current organizations in the ordered set where groupId = &#63;.
	 *
	 * @param organizationId the primary key of the current organizations
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next organizations
	 * @throws NoSuchorganizationsException if a organizations with the primary key could not be found
	 */
	public static organizations[] findByFindAll_PrevAndNext(
			long organizationId, long groupId,
			OrderByComparator<organizations> orderByComparator)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().findByFindAll_PrevAndNext(
			organizationId, groupId, orderByComparator);
	}

	/**
	 * Removes all the organizationses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByFindAll(long groupId) {
		getPersistence().removeByFindAll(groupId);
	}

	/**
	 * Returns the number of organizationses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching organizationses
	 */
	public static int countByFindAll(long groupId) {
		return getPersistence().countByFindAll(groupId);
	}

	/**
	 * Caches the organizations in the entity cache if it is enabled.
	 *
	 * @param organizations the organizations
	 */
	public static void cacheResult(organizations organizations) {
		getPersistence().cacheResult(organizations);
	}

	/**
	 * Caches the organizationses in the entity cache if it is enabled.
	 *
	 * @param organizationses the organizationses
	 */
	public static void cacheResult(List<organizations> organizationses) {
		getPersistence().cacheResult(organizationses);
	}

	/**
	 * Creates a new organizations with the primary key. Does not add the organizations to the database.
	 *
	 * @param organizationId the primary key for the new organizations
	 * @return the new organizations
	 */
	public static organizations create(long organizationId) {
		return getPersistence().create(organizationId);
	}

	/**
	 * Removes the organizations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param organizationId the primary key of the organizations
	 * @return the organizations that was removed
	 * @throws NoSuchorganizationsException if a organizations with the primary key could not be found
	 */
	public static organizations remove(long organizationId)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().remove(organizationId);
	}

	public static organizations updateImpl(organizations organizations) {
		return getPersistence().updateImpl(organizations);
	}

	/**
	 * Returns the organizations with the primary key or throws a <code>NoSuchorganizationsException</code> if it could not be found.
	 *
	 * @param organizationId the primary key of the organizations
	 * @return the organizations
	 * @throws NoSuchorganizationsException if a organizations with the primary key could not be found
	 */
	public static organizations findByPrimaryKey(long organizationId)
		throws organizationalStructure.service.exception.
			NoSuchorganizationsException {

		return getPersistence().findByPrimaryKey(organizationId);
	}

	/**
	 * Returns the organizations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param organizationId the primary key of the organizations
	 * @return the organizations, or <code>null</code> if a organizations with the primary key could not be found
	 */
	public static organizations fetchByPrimaryKey(long organizationId) {
		return getPersistence().fetchByPrimaryKey(organizationId);
	}

	/**
	 * Returns all the organizationses.
	 *
	 * @return the organizationses
	 */
	public static List<organizations> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the organizationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>organizationsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizationses
	 * @param end the upper bound of the range of organizationses (not inclusive)
	 * @return the range of organizationses
	 */
	public static List<organizations> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the organizationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>organizationsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of organizationses
	 * @param end the upper bound of the range of organizationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of organizationses
	 */
	@Deprecated
	public static List<organizations> findAll(
		int start, int end, OrderByComparator<organizations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the organizationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>organizationsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizationses
	 * @param end the upper bound of the range of organizationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of organizationses
	 */
	public static List<organizations> findAll(
		int start, int end,
		OrderByComparator<organizations> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the organizationses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of organizationses.
	 *
	 * @return the number of organizationses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static organizationsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<organizationsPersistence, organizationsPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(organizationsPersistence.class);

		ServiceTracker<organizationsPersistence, organizationsPersistence>
			serviceTracker =
				new ServiceTracker
					<organizationsPersistence, organizationsPersistence>(
						bundle.getBundleContext(),
						organizationsPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}