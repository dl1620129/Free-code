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

package com.ecoit.elegaldocument.service.http;

import com.ecoit.elegaldocument.service.EcmsGroupServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>EcmsGroupServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.ecoit.elegaldocument.model.EcmsGroupSoap</code>. If the method in the
 * service utility returns a
 * <code>com.ecoit.elegaldocument.model.EcmsGroup</code>, that is translated to a
 * <code>com.ecoit.elegaldocument.model.EcmsGroupSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Liverpool
 * @see EcmsGroupServiceHttp
 * @generated
 */
public class EcmsGroupServiceSoap {

	public static com.ecoit.elegaldocument.model.EcmsGroupSoap addGroup(
			String groupName, String groupDesciption, long groupId)
		throws RemoteException {

		try {
			com.ecoit.elegaldocument.model.EcmsGroup returnValue =
				EcmsGroupServiceUtil.addGroup(
					groupName, groupDesciption, groupId);

			return com.ecoit.elegaldocument.model.EcmsGroupSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.ecoit.elegaldocument.model.EcmsGroupSoap updateGroup(
			long groupId, String groupName, String groupDesciption)
		throws RemoteException {

		try {
			com.ecoit.elegaldocument.model.EcmsGroup returnValue =
				EcmsGroupServiceUtil.updateGroup(
					groupId, groupName, groupDesciption);

			return com.ecoit.elegaldocument.model.EcmsGroupSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static void updateGroup(
			com.ecoit.elegaldocument.model.EcmsGroupSoap group)
		throws RemoteException {

		try {
			EcmsGroupServiceUtil.updateGroup(
				com.ecoit.elegaldocument.model.impl.EcmsGroupModelImpl.toModel(
					group));
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static void deleteGroup(long groupId) throws RemoteException {
		try {
			EcmsGroupServiceUtil.deleteGroup(groupId);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.ecoit.elegaldocument.model.EcmsGroupSoap[] findAll()
		throws RemoteException {

		try {
			java.util.List<com.ecoit.elegaldocument.model.EcmsGroup>
				returnValue = EcmsGroupServiceUtil.findAll();

			return com.ecoit.elegaldocument.model.EcmsGroupSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.ecoit.elegaldocument.model.EcmsGroupSoap findByPrimaryKey(
			long groupId)
		throws RemoteException {

		try {
			com.ecoit.elegaldocument.model.EcmsGroup returnValue =
				EcmsGroupServiceUtil.findByPrimaryKey(groupId);

			return com.ecoit.elegaldocument.model.EcmsGroupSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static long findUserInGroup(long userId) throws RemoteException {
		try {
			long returnValue = EcmsGroupServiceUtil.findUserInGroup(userId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EcmsGroupServiceSoap.class);

}