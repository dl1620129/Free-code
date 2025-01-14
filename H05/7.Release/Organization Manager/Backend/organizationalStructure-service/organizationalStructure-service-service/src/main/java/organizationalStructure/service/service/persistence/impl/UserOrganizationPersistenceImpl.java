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

package organizationalStructure.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import organizationalStructure.service.exception.NoSuchUserOrganizationException;
import organizationalStructure.service.model.UserOrganization;
import organizationalStructure.service.model.impl.UserOrganizationImpl;
import organizationalStructure.service.model.impl.UserOrganizationModelImpl;
import organizationalStructure.service.service.persistence.UserOrganizationPK;
import organizationalStructure.service.service.persistence.UserOrganizationPersistence;
import organizationalStructure.service.service.persistence.impl.constants.portalPersistenceConstants;

/**
 * The persistence implementation for the user organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = UserOrganizationPersistence.class)
public class UserOrganizationPersistenceImpl
	extends BasePersistenceImpl<UserOrganization>
	implements UserOrganizationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>UserOrganizationUtil</code> to access the user organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		UserOrganizationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUser;
	private FinderPath _finderPathWithoutPaginationFindByUser;
	private FinderPath _finderPathCountByUser;

	/**
	 * Returns all the user organizations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user organizations
	 */
	@Override
	public List<UserOrganization> findByUser(long userId) {
		return findByUser(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user organizations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user organizations
	 * @param end the upper bound of the range of user organizations (not inclusive)
	 * @return the range of matching user organizations
	 */
	@Override
	public List<UserOrganization> findByUser(long userId, int start, int end) {
		return findByUser(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user organizations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user organizations
	 * @param end the upper bound of the range of user organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user organizations
	 */
	@Override
	public List<UserOrganization> findByUser(
		long userId, int start, int end,
		OrderByComparator<UserOrganization> orderByComparator) {

		return findByUser(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user organizations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user organizations
	 * @param end the upper bound of the range of user organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user organizations
	 */
	@Override
	public List<UserOrganization> findByUser(
		long userId, int start, int end,
		OrderByComparator<UserOrganization> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUser;
				finderArgs = new Object[] {userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUser;
			finderArgs = new Object[] {userId, start, end, orderByComparator};
		}

		List<UserOrganization> list = null;

		if (useFinderCache) {
			list = (List<UserOrganization>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UserOrganization userOrganization : list) {
					if (userId != userOrganization.getUserId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_USERORGANIZATION_WHERE);

			query.append(_FINDER_COLUMN_USER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(UserOrganizationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				list = (List<UserOrganization>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first user organization in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user organization
	 * @throws NoSuchUserOrganizationException if a matching user organization could not be found
	 */
	@Override
	public UserOrganization findByUser_First(
			long userId, OrderByComparator<UserOrganization> orderByComparator)
		throws NoSuchUserOrganizationException {

		UserOrganization userOrganization = fetchByUser_First(
			userId, orderByComparator);

		if (userOrganization != null) {
			return userOrganization;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchUserOrganizationException(msg.toString());
	}

	/**
	 * Returns the first user organization in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user organization, or <code>null</code> if a matching user organization could not be found
	 */
	@Override
	public UserOrganization fetchByUser_First(
		long userId, OrderByComparator<UserOrganization> orderByComparator) {

		List<UserOrganization> list = findByUser(
			userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user organization in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user organization
	 * @throws NoSuchUserOrganizationException if a matching user organization could not be found
	 */
	@Override
	public UserOrganization findByUser_Last(
			long userId, OrderByComparator<UserOrganization> orderByComparator)
		throws NoSuchUserOrganizationException {

		UserOrganization userOrganization = fetchByUser_Last(
			userId, orderByComparator);

		if (userOrganization != null) {
			return userOrganization;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append("}");

		throw new NoSuchUserOrganizationException(msg.toString());
	}

	/**
	 * Returns the last user organization in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user organization, or <code>null</code> if a matching user organization could not be found
	 */
	@Override
	public UserOrganization fetchByUser_Last(
		long userId, OrderByComparator<UserOrganization> orderByComparator) {

		int count = countByUser(userId);

		if (count == 0) {
			return null;
		}

		List<UserOrganization> list = findByUser(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user organizations before and after the current user organization in the ordered set where userId = &#63;.
	 *
	 * @param userOrganizationPK the primary key of the current user organization
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user organization
	 * @throws NoSuchUserOrganizationException if a user organization with the primary key could not be found
	 */
	@Override
	public UserOrganization[] findByUser_PrevAndNext(
			UserOrganizationPK userOrganizationPK, long userId,
			OrderByComparator<UserOrganization> orderByComparator)
		throws NoSuchUserOrganizationException {

		UserOrganization userOrganization = findByPrimaryKey(
			userOrganizationPK);

		Session session = null;

		try {
			session = openSession();

			UserOrganization[] array = new UserOrganizationImpl[3];

			array[0] = getByUser_PrevAndNext(
				session, userOrganization, userId, orderByComparator, true);

			array[1] = userOrganization;

			array[2] = getByUser_PrevAndNext(
				session, userOrganization, userId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserOrganization getByUser_PrevAndNext(
		Session session, UserOrganization userOrganization, long userId,
		OrderByComparator<UserOrganization> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERORGANIZATION_WHERE);

		query.append(_FINDER_COLUMN_USER_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(UserOrganizationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						userOrganization)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<UserOrganization> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user organizations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUser(long userId) {
		for (UserOrganization userOrganization :
				findByUser(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(userOrganization);
		}
	}

	/**
	 * Returns the number of user organizations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user organizations
	 */
	@Override
	public int countByUser(long userId) {
		FinderPath finderPath = _finderPathCountByUser;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERORGANIZATION_WHERE);

			query.append(_FINDER_COLUMN_USER_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USER_USERID_2 =
		"userOrganization.id.userId = ?";

	private FinderPath _finderPathWithPaginationFindByOrganization;
	private FinderPath _finderPathWithoutPaginationFindByOrganization;
	private FinderPath _finderPathCountByOrganization;

	/**
	 * Returns all the user organizations where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching user organizations
	 */
	@Override
	public List<UserOrganization> findByOrganization(long organizationId) {
		return findByOrganization(
			organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user organizations where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of user organizations
	 * @param end the upper bound of the range of user organizations (not inclusive)
	 * @return the range of matching user organizations
	 */
	@Override
	public List<UserOrganization> findByOrganization(
		long organizationId, int start, int end) {

		return findByOrganization(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user organizations where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of user organizations
	 * @param end the upper bound of the range of user organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user organizations
	 */
	@Override
	public List<UserOrganization> findByOrganization(
		long organizationId, int start, int end,
		OrderByComparator<UserOrganization> orderByComparator) {

		return findByOrganization(
			organizationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user organizations where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of user organizations
	 * @param end the upper bound of the range of user organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user organizations
	 */
	@Override
	public List<UserOrganization> findByOrganization(
		long organizationId, int start, int end,
		OrderByComparator<UserOrganization> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByOrganization;
				finderArgs = new Object[] {organizationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByOrganization;
			finderArgs = new Object[] {
				organizationId, start, end, orderByComparator
			};
		}

		List<UserOrganization> list = null;

		if (useFinderCache) {
			list = (List<UserOrganization>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UserOrganization userOrganization : list) {
					if (organizationId !=
							userOrganization.getOrganizationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_USERORGANIZATION_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(UserOrganizationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				list = (List<UserOrganization>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first user organization in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user organization
	 * @throws NoSuchUserOrganizationException if a matching user organization could not be found
	 */
	@Override
	public UserOrganization findByOrganization_First(
			long organizationId,
			OrderByComparator<UserOrganization> orderByComparator)
		throws NoSuchUserOrganizationException {

		UserOrganization userOrganization = fetchByOrganization_First(
			organizationId, orderByComparator);

		if (userOrganization != null) {
			return userOrganization;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchUserOrganizationException(msg.toString());
	}

	/**
	 * Returns the first user organization in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user organization, or <code>null</code> if a matching user organization could not be found
	 */
	@Override
	public UserOrganization fetchByOrganization_First(
		long organizationId,
		OrderByComparator<UserOrganization> orderByComparator) {

		List<UserOrganization> list = findByOrganization(
			organizationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user organization in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user organization
	 * @throws NoSuchUserOrganizationException if a matching user organization could not be found
	 */
	@Override
	public UserOrganization findByOrganization_Last(
			long organizationId,
			OrderByComparator<UserOrganization> orderByComparator)
		throws NoSuchUserOrganizationException {

		UserOrganization userOrganization = fetchByOrganization_Last(
			organizationId, orderByComparator);

		if (userOrganization != null) {
			return userOrganization;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append("}");

		throw new NoSuchUserOrganizationException(msg.toString());
	}

	/**
	 * Returns the last user organization in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user organization, or <code>null</code> if a matching user organization could not be found
	 */
	@Override
	public UserOrganization fetchByOrganization_Last(
		long organizationId,
		OrderByComparator<UserOrganization> orderByComparator) {

		int count = countByOrganization(organizationId);

		if (count == 0) {
			return null;
		}

		List<UserOrganization> list = findByOrganization(
			organizationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user organizations before and after the current user organization in the ordered set where organizationId = &#63;.
	 *
	 * @param userOrganizationPK the primary key of the current user organization
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user organization
	 * @throws NoSuchUserOrganizationException if a user organization with the primary key could not be found
	 */
	@Override
	public UserOrganization[] findByOrganization_PrevAndNext(
			UserOrganizationPK userOrganizationPK, long organizationId,
			OrderByComparator<UserOrganization> orderByComparator)
		throws NoSuchUserOrganizationException {

		UserOrganization userOrganization = findByPrimaryKey(
			userOrganizationPK);

		Session session = null;

		try {
			session = openSession();

			UserOrganization[] array = new UserOrganizationImpl[3];

			array[0] = getByOrganization_PrevAndNext(
				session, userOrganization, organizationId, orderByComparator,
				true);

			array[1] = userOrganization;

			array[2] = getByOrganization_PrevAndNext(
				session, userOrganization, organizationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserOrganization getByOrganization_PrevAndNext(
		Session session, UserOrganization userOrganization, long organizationId,
		OrderByComparator<UserOrganization> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERORGANIZATION_WHERE);

		query.append(_FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(UserOrganizationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						userOrganization)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<UserOrganization> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user organizations where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 */
	@Override
	public void removeByOrganization(long organizationId) {
		for (UserOrganization userOrganization :
				findByOrganization(
					organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(userOrganization);
		}
	}

	/**
	 * Returns the number of user organizations where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching user organizations
	 */
	@Override
	public int countByOrganization(long organizationId) {
		FinderPath finderPath = _finderPathCountByOrganization;

		Object[] finderArgs = new Object[] {organizationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERORGANIZATION_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2 =
		"userOrganization.id.organizationId = ?";

	public UserOrganizationPersistenceImpl() {
		setModelClass(UserOrganization.class);

		setModelImplClass(UserOrganizationImpl.class);
		setModelPKClass(UserOrganizationPK.class);
	}

	/**
	 * Caches the user organization in the entity cache if it is enabled.
	 *
	 * @param userOrganization the user organization
	 */
	@Override
	public void cacheResult(UserOrganization userOrganization) {
		entityCache.putResult(
			entityCacheEnabled, UserOrganizationImpl.class,
			userOrganization.getPrimaryKey(), userOrganization);

		userOrganization.resetOriginalValues();
	}

	/**
	 * Caches the user organizations in the entity cache if it is enabled.
	 *
	 * @param userOrganizations the user organizations
	 */
	@Override
	public void cacheResult(List<UserOrganization> userOrganizations) {
		for (UserOrganization userOrganization : userOrganizations) {
			if (entityCache.getResult(
					entityCacheEnabled, UserOrganizationImpl.class,
					userOrganization.getPrimaryKey()) == null) {

				cacheResult(userOrganization);
			}
			else {
				userOrganization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user organizations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UserOrganizationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user organization.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserOrganization userOrganization) {
		entityCache.removeResult(
			entityCacheEnabled, UserOrganizationImpl.class,
			userOrganization.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserOrganization> userOrganizations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserOrganization userOrganization : userOrganizations) {
			entityCache.removeResult(
				entityCacheEnabled, UserOrganizationImpl.class,
				userOrganization.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, UserOrganizationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new user organization with the primary key. Does not add the user organization to the database.
	 *
	 * @param userOrganizationPK the primary key for the new user organization
	 * @return the new user organization
	 */
	@Override
	public UserOrganization create(UserOrganizationPK userOrganizationPK) {
		UserOrganization userOrganization = new UserOrganizationImpl();

		userOrganization.setNew(true);
		userOrganization.setPrimaryKey(userOrganizationPK);

		return userOrganization;
	}

	/**
	 * Removes the user organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userOrganizationPK the primary key of the user organization
	 * @return the user organization that was removed
	 * @throws NoSuchUserOrganizationException if a user organization with the primary key could not be found
	 */
	@Override
	public UserOrganization remove(UserOrganizationPK userOrganizationPK)
		throws NoSuchUserOrganizationException {

		return remove((Serializable)userOrganizationPK);
	}

	/**
	 * Removes the user organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user organization
	 * @return the user organization that was removed
	 * @throws NoSuchUserOrganizationException if a user organization with the primary key could not be found
	 */
	@Override
	public UserOrganization remove(Serializable primaryKey)
		throws NoSuchUserOrganizationException {

		Session session = null;

		try {
			session = openSession();

			UserOrganization userOrganization = (UserOrganization)session.get(
				UserOrganizationImpl.class, primaryKey);

			if (userOrganization == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserOrganizationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(userOrganization);
		}
		catch (NoSuchUserOrganizationException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected UserOrganization removeImpl(UserOrganization userOrganization) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userOrganization)) {
				userOrganization = (UserOrganization)session.get(
					UserOrganizationImpl.class,
					userOrganization.getPrimaryKeyObj());
			}

			if (userOrganization != null) {
				session.delete(userOrganization);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (userOrganization != null) {
			clearCache(userOrganization);
		}

		return userOrganization;
	}

	@Override
	public UserOrganization updateImpl(UserOrganization userOrganization) {
		boolean isNew = userOrganization.isNew();

		if (!(userOrganization instanceof UserOrganizationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(userOrganization.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					userOrganization);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in userOrganization proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UserOrganization implementation " +
					userOrganization.getClass());
		}

		UserOrganizationModelImpl userOrganizationModelImpl =
			(UserOrganizationModelImpl)userOrganization;

		Session session = null;

		try {
			session = openSession();

			if (userOrganization.isNew()) {
				session.save(userOrganization);

				userOrganization.setNew(false);
			}
			else {
				userOrganization = (UserOrganization)session.merge(
					userOrganization);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {
				userOrganizationModelImpl.getUserId()
			};

			finderCache.removeResult(_finderPathCountByUser, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUser, args);

			args = new Object[] {userOrganizationModelImpl.getOrganizationId()};

			finderCache.removeResult(_finderPathCountByOrganization, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByOrganization, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((userOrganizationModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUser.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					userOrganizationModelImpl.getOriginalUserId()
				};

				finderCache.removeResult(_finderPathCountByUser, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUser, args);

				args = new Object[] {userOrganizationModelImpl.getUserId()};

				finderCache.removeResult(_finderPathCountByUser, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUser, args);
			}

			if ((userOrganizationModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByOrganization.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					userOrganizationModelImpl.getOriginalOrganizationId()
				};

				finderCache.removeResult(_finderPathCountByOrganization, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByOrganization, args);

				args = new Object[] {
					userOrganizationModelImpl.getOrganizationId()
				};

				finderCache.removeResult(_finderPathCountByOrganization, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByOrganization, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, UserOrganizationImpl.class,
			userOrganization.getPrimaryKey(), userOrganization, false);

		userOrganization.resetOriginalValues();

		return userOrganization;
	}

	/**
	 * Returns the user organization with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user organization
	 * @return the user organization
	 * @throws NoSuchUserOrganizationException if a user organization with the primary key could not be found
	 */
	@Override
	public UserOrganization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserOrganizationException {

		UserOrganization userOrganization = fetchByPrimaryKey(primaryKey);

		if (userOrganization == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserOrganizationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return userOrganization;
	}

	/**
	 * Returns the user organization with the primary key or throws a <code>NoSuchUserOrganizationException</code> if it could not be found.
	 *
	 * @param userOrganizationPK the primary key of the user organization
	 * @return the user organization
	 * @throws NoSuchUserOrganizationException if a user organization with the primary key could not be found
	 */
	@Override
	public UserOrganization findByPrimaryKey(
			UserOrganizationPK userOrganizationPK)
		throws NoSuchUserOrganizationException {

		return findByPrimaryKey((Serializable)userOrganizationPK);
	}

	/**
	 * Returns the user organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userOrganizationPK the primary key of the user organization
	 * @return the user organization, or <code>null</code> if a user organization with the primary key could not be found
	 */
	@Override
	public UserOrganization fetchByPrimaryKey(
		UserOrganizationPK userOrganizationPK) {

		return fetchByPrimaryKey((Serializable)userOrganizationPK);
	}

	/**
	 * Returns all the user organizations.
	 *
	 * @return the user organizations
	 */
	@Override
	public List<UserOrganization> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user organizations
	 * @param end the upper bound of the range of user organizations (not inclusive)
	 * @return the range of user organizations
	 */
	@Override
	public List<UserOrganization> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user organizations
	 * @param end the upper bound of the range of user organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user organizations
	 */
	@Override
	public List<UserOrganization> findAll(
		int start, int end,
		OrderByComparator<UserOrganization> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user organizations
	 * @param end the upper bound of the range of user organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user organizations
	 */
	@Override
	public List<UserOrganization> findAll(
		int start, int end,
		OrderByComparator<UserOrganization> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<UserOrganization> list = null;

		if (useFinderCache) {
			list = (List<UserOrganization>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_USERORGANIZATION);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERORGANIZATION;

				sql = sql.concat(UserOrganizationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				list = (List<UserOrganization>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the user organizations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UserOrganization userOrganization : findAll()) {
			remove(userOrganization);
		}
	}

	/**
	 * Returns the number of user organizations.
	 *
	 * @return the number of user organizations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERORGANIZATION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "userOrganizationPK";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_USERORGANIZATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UserOrganizationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the user organization persistence.
	 */
	@Activate
	public void activate() {
		UserOrganizationModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		UserOrganizationModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UserOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UserOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUser = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UserOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUser",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUser = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UserOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUser",
			new String[] {Long.class.getName()},
			UserOrganizationModelImpl.USERID_COLUMN_BITMASK);

		_finderPathCountByUser = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUser",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByOrganization = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UserOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrganization",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByOrganization = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, UserOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrganization",
			new String[] {Long.class.getName()},
			UserOrganizationModelImpl.ORGANIZATIONID_COLUMN_BITMASK);

		_finderPathCountByOrganization = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrganization",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(UserOrganizationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = portalPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.organizationalStructure.service.model.UserOrganization"),
			true);
	}

	@Override
	@Reference(
		target = portalPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = portalPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_USERORGANIZATION =
		"SELECT userOrganization FROM UserOrganization userOrganization";

	private static final String _SQL_SELECT_USERORGANIZATION_WHERE =
		"SELECT userOrganization FROM UserOrganization userOrganization WHERE ";

	private static final String _SQL_COUNT_USERORGANIZATION =
		"SELECT COUNT(userOrganization) FROM UserOrganization userOrganization";

	private static final String _SQL_COUNT_USERORGANIZATION_WHERE =
		"SELECT COUNT(userOrganization) FROM UserOrganization userOrganization WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "userOrganization.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No UserOrganization exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No UserOrganization exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		UserOrganizationPersistenceImpl.class);

	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"userId", "organizationId"});

	static {
		try {
			Class.forName(portalPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}