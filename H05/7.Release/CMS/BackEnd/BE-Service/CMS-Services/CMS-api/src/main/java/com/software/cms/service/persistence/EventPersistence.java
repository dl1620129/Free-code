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

package com.software.cms.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.software.cms.exception.NoSuchEventException;
import com.software.cms.model.Event;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DungNV
 * @see EventUtil
 * @generated
 */
@ProviderType
public interface EventPersistence extends BasePersistence<Event> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EventUtil} to access the event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching events
	 */
	public java.util.List<Event> findByUuid(String uuid);

	/**
	 * Returns a range of all the events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @return the range of matching events
	 */
	public java.util.List<Event> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching events
	 */
	public java.util.List<Event> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

	/**
	 * Returns an ordered range of all the events where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching events
	 */
	public java.util.List<Event> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching event
	 * @throws NoSuchEventException if a matching event could not be found
	 */
	public Event findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Event>
				orderByComparator)
		throws NoSuchEventException;

	/**
	 * Returns the first event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching event, or <code>null</code> if a matching event could not be found
	 */
	public Event fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

	/**
	 * Returns the last event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching event
	 * @throws NoSuchEventException if a matching event could not be found
	 */
	public Event findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Event>
				orderByComparator)
		throws NoSuchEventException;

	/**
	 * Returns the last event in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching event, or <code>null</code> if a matching event could not be found
	 */
	public Event fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

	/**
	 * Returns the events before and after the current event in the ordered set where uuid = &#63;.
	 *
	 * @param eventId the primary key of the current event
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next event
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public Event[] findByUuid_PrevAndNext(
			long eventId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Event>
				orderByComparator)
		throws NoSuchEventException;

	/**
	 * Removes all the events where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of events where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching events
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the event where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEventException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching event
	 * @throws NoSuchEventException if a matching event could not be found
	 */
	public Event findByUUID_G(String uuid, long groupId)
		throws NoSuchEventException;

	/**
	 * Returns the event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching event, or <code>null</code> if a matching event could not be found
	 */
	public Event fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the event where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching event, or <code>null</code> if a matching event could not be found
	 */
	public Event fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the event where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the event that was removed
	 */
	public Event removeByUUID_G(String uuid, long groupId)
		throws NoSuchEventException;

	/**
	 * Returns the number of events where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching events
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the events where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching events
	 */
	public java.util.List<Event> findByGroup_Language(
		long groupId, String language);

	/**
	 * Returns a range of all the events where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @return the range of matching events
	 */
	public java.util.List<Event> findByGroup_Language(
		long groupId, String language, int start, int end);

	/**
	 * Returns an ordered range of all the events where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching events
	 */
	public java.util.List<Event> findByGroup_Language(
		long groupId, String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

	/**
	 * Returns an ordered range of all the events where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching events
	 */
	public java.util.List<Event> findByGroup_Language(
		long groupId, String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first event in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching event
	 * @throws NoSuchEventException if a matching event could not be found
	 */
	public Event findByGroup_Language_First(
			long groupId, String language,
			com.liferay.portal.kernel.util.OrderByComparator<Event>
				orderByComparator)
		throws NoSuchEventException;

	/**
	 * Returns the first event in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching event, or <code>null</code> if a matching event could not be found
	 */
	public Event fetchByGroup_Language_First(
		long groupId, String language,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

	/**
	 * Returns the last event in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching event
	 * @throws NoSuchEventException if a matching event could not be found
	 */
	public Event findByGroup_Language_Last(
			long groupId, String language,
			com.liferay.portal.kernel.util.OrderByComparator<Event>
				orderByComparator)
		throws NoSuchEventException;

	/**
	 * Returns the last event in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching event, or <code>null</code> if a matching event could not be found
	 */
	public Event fetchByGroup_Language_Last(
		long groupId, String language,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

	/**
	 * Returns the events before and after the current event in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param eventId the primary key of the current event
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next event
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public Event[] findByGroup_Language_PrevAndNext(
			long eventId, long groupId, String language,
			com.liferay.portal.kernel.util.OrderByComparator<Event>
				orderByComparator)
		throws NoSuchEventException;

	/**
	 * Removes all the events where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	public void removeByGroup_Language(long groupId, String language);

	/**
	 * Returns the number of events where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching events
	 */
	public int countByGroup_Language(long groupId, String language);

	/**
	 * Caches the event in the entity cache if it is enabled.
	 *
	 * @param event the event
	 */
	public void cacheResult(Event event);

	/**
	 * Caches the events in the entity cache if it is enabled.
	 *
	 * @param events the events
	 */
	public void cacheResult(java.util.List<Event> events);

	/**
	 * Creates a new event with the primary key. Does not add the event to the database.
	 *
	 * @param eventId the primary key for the new event
	 * @return the new event
	 */
	public Event create(long eventId);

	/**
	 * Removes the event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventId the primary key of the event
	 * @return the event that was removed
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public Event remove(long eventId) throws NoSuchEventException;

	public Event updateImpl(Event event);

	/**
	 * Returns the event with the primary key or throws a <code>NoSuchEventException</code> if it could not be found.
	 *
	 * @param eventId the primary key of the event
	 * @return the event
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public Event findByPrimaryKey(long eventId) throws NoSuchEventException;

	/**
	 * Returns the event with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eventId the primary key of the event
	 * @return the event, or <code>null</code> if a event with the primary key could not be found
	 */
	public Event fetchByPrimaryKey(long eventId);

	/**
	 * Returns all the events.
	 *
	 * @return the events
	 */
	public java.util.List<Event> findAll();

	/**
	 * Returns a range of all the events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @return the range of events
	 */
	public java.util.List<Event> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of events
	 */
	public java.util.List<Event> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

	/**
	 * Returns an ordered range of all the events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of events
	 */
	public java.util.List<Event> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the events from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of events.
	 *
	 * @return the number of events
	 */
	public int countAll();

}