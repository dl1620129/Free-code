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

import com.ecoit.elegaldocument.service.EcmsGURelationServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>EcmsGURelationServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Liverpool
 * @see EcmsGURelationServiceSoap
 * @generated
 */
public class EcmsGURelationServiceHttp {

	public static com.ecoit.elegaldocument.model.EcmsGURelation addGURelation(
			HttpPrincipal httpPrincipal, long groupUserId, long userId)
		throws Exception {

		try {
			MethodKey methodKey = new MethodKey(
				EcmsGURelationServiceUtil.class, "addGURelation",
				_addGURelationParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupUserId, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof Exception) {
					throw (Exception)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.ecoit.elegaldocument.model.EcmsGURelation)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.ecoit.elegaldocument.model.EcmsGURelation>
			searchByGroupUser(HttpPrincipal httpPrincipal, long groupUserId)
		throws Exception {

		try {
			MethodKey methodKey = new MethodKey(
				EcmsGURelationServiceUtil.class, "searchByGroupUser",
				_searchByGroupUserParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupUserId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof Exception) {
					throw (Exception)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.ecoit.elegaldocument.model.EcmsGURelation>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.ecoit.elegaldocument.model.EcmsGURelation>
			searchByUserId(HttpPrincipal httpPrincipal, long userId)
		throws Exception {

		try {
			MethodKey methodKey = new MethodKey(
				EcmsGURelationServiceUtil.class, "searchByUserId",
				_searchByUserIdParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof Exception) {
					throw (Exception)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.ecoit.elegaldocument.model.EcmsGURelation>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static void removeByGroup(HttpPrincipal httpPrincipal, long groupId)
		throws Exception {

		try {
			MethodKey methodKey = new MethodKey(
				EcmsGURelationServiceUtil.class, "removeByGroup",
				_removeByGroupParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof Exception) {
					throw (Exception)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static boolean isContain(
		HttpPrincipal httpPrincipal, long groupId, long userId) {

		try {
			MethodKey methodKey = new MethodKey(
				EcmsGURelationServiceUtil.class, "isContain",
				_isContainParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		EcmsGURelationServiceHttp.class);

	private static final Class<?>[] _addGURelationParameterTypes0 =
		new Class[] {long.class, long.class};
	private static final Class<?>[] _searchByGroupUserParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _searchByUserIdParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _removeByGroupParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _isContainParameterTypes4 = new Class[] {
		long.class, long.class
	};

}