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

import com.ecoit.elegaldocument.model.EcmsGroup;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for EcmsGroup. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Liverpool
 * @see EcmsGroupServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface EcmsGroupService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EcmsGroupServiceUtil} to access the ecms group remote service. Add custom service methods to <code>com.ecoit.elegaldocument.service.impl.EcmsGroupServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public EcmsGroup addGroup(
			String groupName, String groupDesciption, long groupId)
		throws Exception;

	public void deleteGroup(long groupId) throws Exception;

	public List<EcmsGroup> findAll() throws Exception;

	public EcmsGroup findByPrimaryKey(long groupId) throws Exception;

	public long findUserInGroup(long userId);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public void updateGroup(EcmsGroup group) throws Exception;

	public EcmsGroup updateGroup(
			long groupId, String groupName, String groupDesciption)
		throws Exception;

}