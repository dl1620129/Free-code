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

import com.ecoit.elegaldocument.model.LegalDFRel;

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
 * The persistence utility for the legal df rel service. This utility wraps <code>com.ecoit.elegaldocument.service.persistence.impl.LegalDFRelPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Liverpool
 * @see LegalDFRelPersistence
 * @generated
 */
public class LegalDFRelUtil {

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
	public static void clearCache(LegalDFRel legalDFRel) {
		getPersistence().clearCache(legalDFRel);
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
	public static Map<Serializable, LegalDFRel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LegalDFRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LegalDFRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LegalDFRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LegalDFRel> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LegalDFRel update(LegalDFRel legalDFRel) {
		return getPersistence().update(legalDFRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LegalDFRel update(
		LegalDFRel legalDFRel, ServiceContext serviceContext) {

		return getPersistence().update(legalDFRel, serviceContext);
	}

	/**
	 * Returns all the legal df rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the matching legal df rels
	 */
	public static List<LegalDFRel> findByField(long fieldId) {
		return getPersistence().findByField(fieldId);
	}

	/**
	 * Returns a range of all the legal df rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LegalDFRelModelImpl</code>.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of legal df rels
	 * @param end the upper bound of the range of legal df rels (not inclusive)
	 * @return the range of matching legal df rels
	 */
	public static List<LegalDFRel> findByField(
		long fieldId, int start, int end) {

		return getPersistence().findByField(fieldId, start, end);
	}

	/**
	 * Returns an ordered range of all the legal df rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LegalDFRelModelImpl</code>.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of legal df rels
	 * @param end the upper bound of the range of legal df rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching legal df rels
	 */
	public static List<LegalDFRel> findByField(
		long fieldId, int start, int end,
		OrderByComparator<LegalDFRel> orderByComparator) {

		return getPersistence().findByField(
			fieldId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the legal df rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LegalDFRelModelImpl</code>.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of legal df rels
	 * @param end the upper bound of the range of legal df rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching legal df rels
	 */
	public static List<LegalDFRel> findByField(
		long fieldId, int start, int end,
		OrderByComparator<LegalDFRel> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByField(
			fieldId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first legal df rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching legal df rel
	 * @throws NoSuchLegalDFRelException if a matching legal df rel could not be found
	 */
	public static LegalDFRel findByField_First(
			long fieldId, OrderByComparator<LegalDFRel> orderByComparator)
		throws com.ecoit.elegaldocument.exception.NoSuchLegalDFRelException {

		return getPersistence().findByField_First(fieldId, orderByComparator);
	}

	/**
	 * Returns the first legal df rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching legal df rel, or <code>null</code> if a matching legal df rel could not be found
	 */
	public static LegalDFRel fetchByField_First(
		long fieldId, OrderByComparator<LegalDFRel> orderByComparator) {

		return getPersistence().fetchByField_First(fieldId, orderByComparator);
	}

	/**
	 * Returns the last legal df rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching legal df rel
	 * @throws NoSuchLegalDFRelException if a matching legal df rel could not be found
	 */
	public static LegalDFRel findByField_Last(
			long fieldId, OrderByComparator<LegalDFRel> orderByComparator)
		throws com.ecoit.elegaldocument.exception.NoSuchLegalDFRelException {

		return getPersistence().findByField_Last(fieldId, orderByComparator);
	}

	/**
	 * Returns the last legal df rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching legal df rel, or <code>null</code> if a matching legal df rel could not be found
	 */
	public static LegalDFRel fetchByField_Last(
		long fieldId, OrderByComparator<LegalDFRel> orderByComparator) {

		return getPersistence().fetchByField_Last(fieldId, orderByComparator);
	}

	/**
	 * Returns the legal df rels before and after the current legal df rel in the ordered set where fieldId = &#63;.
	 *
	 * @param legalDFRelPK the primary key of the current legal df rel
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next legal df rel
	 * @throws NoSuchLegalDFRelException if a legal df rel with the primary key could not be found
	 */
	public static LegalDFRel[] findByField_PrevAndNext(
			LegalDFRelPK legalDFRelPK, long fieldId,
			OrderByComparator<LegalDFRel> orderByComparator)
		throws com.ecoit.elegaldocument.exception.NoSuchLegalDFRelException {

		return getPersistence().findByField_PrevAndNext(
			legalDFRelPK, fieldId, orderByComparator);
	}

	/**
	 * Removes all the legal df rels where fieldId = &#63; from the database.
	 *
	 * @param fieldId the field ID
	 */
	public static void removeByField(long fieldId) {
		getPersistence().removeByField(fieldId);
	}

	/**
	 * Returns the number of legal df rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the number of matching legal df rels
	 */
	public static int countByField(long fieldId) {
		return getPersistence().countByField(fieldId);
	}

	/**
	 * Returns all the legal df rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the matching legal df rels
	 */
	public static List<LegalDFRel> findByDocId(long docId) {
		return getPersistence().findByDocId(docId);
	}

	/**
	 * Returns a range of all the legal df rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LegalDFRelModelImpl</code>.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of legal df rels
	 * @param end the upper bound of the range of legal df rels (not inclusive)
	 * @return the range of matching legal df rels
	 */
	public static List<LegalDFRel> findByDocId(long docId, int start, int end) {
		return getPersistence().findByDocId(docId, start, end);
	}

	/**
	 * Returns an ordered range of all the legal df rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LegalDFRelModelImpl</code>.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of legal df rels
	 * @param end the upper bound of the range of legal df rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching legal df rels
	 */
	public static List<LegalDFRel> findByDocId(
		long docId, int start, int end,
		OrderByComparator<LegalDFRel> orderByComparator) {

		return getPersistence().findByDocId(
			docId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the legal df rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LegalDFRelModelImpl</code>.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of legal df rels
	 * @param end the upper bound of the range of legal df rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching legal df rels
	 */
	public static List<LegalDFRel> findByDocId(
		long docId, int start, int end,
		OrderByComparator<LegalDFRel> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByDocId(
			docId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first legal df rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching legal df rel
	 * @throws NoSuchLegalDFRelException if a matching legal df rel could not be found
	 */
	public static LegalDFRel findByDocId_First(
			long docId, OrderByComparator<LegalDFRel> orderByComparator)
		throws com.ecoit.elegaldocument.exception.NoSuchLegalDFRelException {

		return getPersistence().findByDocId_First(docId, orderByComparator);
	}

	/**
	 * Returns the first legal df rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching legal df rel, or <code>null</code> if a matching legal df rel could not be found
	 */
	public static LegalDFRel fetchByDocId_First(
		long docId, OrderByComparator<LegalDFRel> orderByComparator) {

		return getPersistence().fetchByDocId_First(docId, orderByComparator);
	}

	/**
	 * Returns the last legal df rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching legal df rel
	 * @throws NoSuchLegalDFRelException if a matching legal df rel could not be found
	 */
	public static LegalDFRel findByDocId_Last(
			long docId, OrderByComparator<LegalDFRel> orderByComparator)
		throws com.ecoit.elegaldocument.exception.NoSuchLegalDFRelException {

		return getPersistence().findByDocId_Last(docId, orderByComparator);
	}

	/**
	 * Returns the last legal df rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching legal df rel, or <code>null</code> if a matching legal df rel could not be found
	 */
	public static LegalDFRel fetchByDocId_Last(
		long docId, OrderByComparator<LegalDFRel> orderByComparator) {

		return getPersistence().fetchByDocId_Last(docId, orderByComparator);
	}

	/**
	 * Returns the legal df rels before and after the current legal df rel in the ordered set where docId = &#63;.
	 *
	 * @param legalDFRelPK the primary key of the current legal df rel
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next legal df rel
	 * @throws NoSuchLegalDFRelException if a legal df rel with the primary key could not be found
	 */
	public static LegalDFRel[] findByDocId_PrevAndNext(
			LegalDFRelPK legalDFRelPK, long docId,
			OrderByComparator<LegalDFRel> orderByComparator)
		throws com.ecoit.elegaldocument.exception.NoSuchLegalDFRelException {

		return getPersistence().findByDocId_PrevAndNext(
			legalDFRelPK, docId, orderByComparator);
	}

	/**
	 * Removes all the legal df rels where docId = &#63; from the database.
	 *
	 * @param docId the doc ID
	 */
	public static void removeByDocId(long docId) {
		getPersistence().removeByDocId(docId);
	}

	/**
	 * Returns the number of legal df rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the number of matching legal df rels
	 */
	public static int countByDocId(long docId) {
		return getPersistence().countByDocId(docId);
	}

	/**
	 * Caches the legal df rel in the entity cache if it is enabled.
	 *
	 * @param legalDFRel the legal df rel
	 */
	public static void cacheResult(LegalDFRel legalDFRel) {
		getPersistence().cacheResult(legalDFRel);
	}

	/**
	 * Caches the legal df rels in the entity cache if it is enabled.
	 *
	 * @param legalDFRels the legal df rels
	 */
	public static void cacheResult(List<LegalDFRel> legalDFRels) {
		getPersistence().cacheResult(legalDFRels);
	}

	/**
	 * Creates a new legal df rel with the primary key. Does not add the legal df rel to the database.
	 *
	 * @param legalDFRelPK the primary key for the new legal df rel
	 * @return the new legal df rel
	 */
	public static LegalDFRel create(LegalDFRelPK legalDFRelPK) {
		return getPersistence().create(legalDFRelPK);
	}

	/**
	 * Removes the legal df rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param legalDFRelPK the primary key of the legal df rel
	 * @return the legal df rel that was removed
	 * @throws NoSuchLegalDFRelException if a legal df rel with the primary key could not be found
	 */
	public static LegalDFRel remove(LegalDFRelPK legalDFRelPK)
		throws com.ecoit.elegaldocument.exception.NoSuchLegalDFRelException {

		return getPersistence().remove(legalDFRelPK);
	}

	public static LegalDFRel updateImpl(LegalDFRel legalDFRel) {
		return getPersistence().updateImpl(legalDFRel);
	}

	/**
	 * Returns the legal df rel with the primary key or throws a <code>NoSuchLegalDFRelException</code> if it could not be found.
	 *
	 * @param legalDFRelPK the primary key of the legal df rel
	 * @return the legal df rel
	 * @throws NoSuchLegalDFRelException if a legal df rel with the primary key could not be found
	 */
	public static LegalDFRel findByPrimaryKey(LegalDFRelPK legalDFRelPK)
		throws com.ecoit.elegaldocument.exception.NoSuchLegalDFRelException {

		return getPersistence().findByPrimaryKey(legalDFRelPK);
	}

	/**
	 * Returns the legal df rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param legalDFRelPK the primary key of the legal df rel
	 * @return the legal df rel, or <code>null</code> if a legal df rel with the primary key could not be found
	 */
	public static LegalDFRel fetchByPrimaryKey(LegalDFRelPK legalDFRelPK) {
		return getPersistence().fetchByPrimaryKey(legalDFRelPK);
	}

	/**
	 * Returns all the legal df rels.
	 *
	 * @return the legal df rels
	 */
	public static List<LegalDFRel> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the legal df rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LegalDFRelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of legal df rels
	 * @param end the upper bound of the range of legal df rels (not inclusive)
	 * @return the range of legal df rels
	 */
	public static List<LegalDFRel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the legal df rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LegalDFRelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of legal df rels
	 * @param end the upper bound of the range of legal df rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of legal df rels
	 */
	public static List<LegalDFRel> findAll(
		int start, int end, OrderByComparator<LegalDFRel> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the legal df rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LegalDFRelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of legal df rels
	 * @param end the upper bound of the range of legal df rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of legal df rels
	 */
	public static List<LegalDFRel> findAll(
		int start, int end, OrderByComparator<LegalDFRel> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the legal df rels from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of legal df rels.
	 *
	 * @return the number of legal df rels
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static LegalDFRelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LegalDFRelPersistence, LegalDFRelPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LegalDFRelPersistence.class);

		ServiceTracker<LegalDFRelPersistence, LegalDFRelPersistence>
			serviceTracker =
				new ServiceTracker
					<LegalDFRelPersistence, LegalDFRelPersistence>(
						bundle.getBundleContext(), LegalDFRelPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}