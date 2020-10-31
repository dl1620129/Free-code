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

package organizationalStructure.service.service.impl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

import organizationalStructure.service.service.base.membersLocalServiceBaseImpl;

/**
 * The implementation of the members local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>organizationalStructure.service.service.membersLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see membersLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=organizationalStructure.service.model.members",
	service = AopService.class
)
public class membersLocalServiceImpl extends membersLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>organizationalStructure.service.service.membersLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>organizationalStructure.service.service.membersLocalServiceUtil</code>.
	 */
}