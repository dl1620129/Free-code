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

package LinkManager.Service.service.persistence;

import LinkManager.Service.model.GroupLink;

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

/**
 * The persistence utility for the group link service. This utility wraps <code>LinkManager.Service.service.persistence.impl.GroupLinkPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GroupLinkPersistence
 * @generated
 */
@ProviderType
public class GroupLinkUtil {

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
	public static void clearCache(GroupLink groupLink) {
		getPersistence().clearCache(groupLink);
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
	public static Map<Serializable, GroupLink> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GroupLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GroupLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GroupLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GroupLink> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GroupLink update(GroupLink groupLink) {
		return getPersistence().update(groupLink);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GroupLink update(
		GroupLink groupLink, ServiceContext serviceContext) {

		return getPersistence().update(groupLink, serviceContext);
	}

	/**
	 * Caches the group link in the entity cache if it is enabled.
	 *
	 * @param groupLink the group link
	 */
	public static void cacheResult(GroupLink groupLink) {
		getPersistence().cacheResult(groupLink);
	}

	/**
	 * Caches the group links in the entity cache if it is enabled.
	 *
	 * @param groupLinks the group links
	 */
	public static void cacheResult(List<GroupLink> groupLinks) {
		getPersistence().cacheResult(groupLinks);
	}

	/**
	 * Creates a new group link with the primary key. Does not add the group link to the database.
	 *
	 * @param linksgroupid the primary key for the new group link
	 * @return the new group link
	 */
	public static GroupLink create(long linksgroupid) {
		return getPersistence().create(linksgroupid);
	}

	/**
	 * Removes the group link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param linksgroupid the primary key of the group link
	 * @return the group link that was removed
	 * @throws NoSuchGroupLinkException if a group link with the primary key could not be found
	 */
	public static GroupLink remove(long linksgroupid)
		throws LinkManager.Service.exception.NoSuchGroupLinkException {

		return getPersistence().remove(linksgroupid);
	}

	public static GroupLink updateImpl(GroupLink groupLink) {
		return getPersistence().updateImpl(groupLink);
	}

	/**
	 * Returns the group link with the primary key or throws a <code>NoSuchGroupLinkException</code> if it could not be found.
	 *
	 * @param linksgroupid the primary key of the group link
	 * @return the group link
	 * @throws NoSuchGroupLinkException if a group link with the primary key could not be found
	 */
	public static GroupLink findByPrimaryKey(long linksgroupid)
		throws LinkManager.Service.exception.NoSuchGroupLinkException {

		return getPersistence().findByPrimaryKey(linksgroupid);
	}

	/**
	 * Returns the group link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param linksgroupid the primary key of the group link
	 * @return the group link, or <code>null</code> if a group link with the primary key could not be found
	 */
	public static GroupLink fetchByPrimaryKey(long linksgroupid) {
		return getPersistence().fetchByPrimaryKey(linksgroupid);
	}

	/**
	 * Returns all the group links.
	 *
	 * @return the group links
	 */
	public static List<GroupLink> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the group links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GroupLinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of group links
	 * @param end the upper bound of the range of group links (not inclusive)
	 * @return the range of group links
	 */
	public static List<GroupLink> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the group links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GroupLinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of group links
	 * @param end the upper bound of the range of group links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of group links
	 */
	@Deprecated
	public static List<GroupLink> findAll(
		int start, int end, OrderByComparator<GroupLink> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the group links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GroupLinkModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of group links
	 * @param end the upper bound of the range of group links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of group links
	 */
	public static List<GroupLink> findAll(
		int start, int end, OrderByComparator<GroupLink> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the group links from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of group links.
	 *
	 * @return the number of group links
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GroupLinkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<GroupLinkPersistence, GroupLinkPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(GroupLinkPersistence.class);

		ServiceTracker<GroupLinkPersistence, GroupLinkPersistence>
			serviceTracker =
				new ServiceTracker<GroupLinkPersistence, GroupLinkPersistence>(
					bundle.getBundleContext(), GroupLinkPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}