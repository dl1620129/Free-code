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

package User.Rank.Poisition.Service.service.base;

import User.Rank.Poisition.Service.model.UserPoisition_Dang;
import User.Rank.Poisition.Service.service.UserPoisition_DangService;
import User.Rank.Poisition.Service.service.persistence.UserChucDanhPersistence;
import User.Rank.Poisition.Service.service.persistence.UserPoisitionPersistence;
import User.Rank.Poisition.Service.service.persistence.UserPoisition_DangPersistence;
import User.Rank.Poisition.Service.service.persistence.UserRankPersistence;
import User.Rank.Poisition.Service.service.persistence.UserRankPositionPersistence;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the user poisition_ dang remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link User.Rank.Poisition.Service.service.impl.UserPoisition_DangServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see User.Rank.Poisition.Service.service.impl.UserPoisition_DangServiceImpl
 * @generated
 */
public abstract class UserPoisition_DangServiceBaseImpl
	extends BaseServiceImpl
	implements UserPoisition_DangService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>UserPoisition_DangService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>User.Rank.Poisition.Service.service.UserPoisition_DangServiceUtil</code>.
	 */
	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			UserPoisition_DangService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		userPoisition_DangService = (UserPoisition_DangService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return UserPoisition_DangService.class.getName();
	}

	protected Class<?> getModelClass() {
		return UserPoisition_Dang.class;
	}

	protected String getModelClassName() {
		return UserPoisition_Dang.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				userPoisition_DangPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@Reference
	protected UserChucDanhPersistence userChucDanhPersistence;

	@Reference
	protected UserPoisitionPersistence userPoisitionPersistence;

	@Reference
	protected User.Rank.Poisition.Service.service.UserPoisition_DangLocalService
		userPoisition_DangLocalService;

	protected UserPoisition_DangService userPoisition_DangService;

	@Reference
	protected UserPoisition_DangPersistence userPoisition_DangPersistence;

	@Reference
	protected UserRankPersistence userRankPersistence;

	@Reference
	protected UserRankPositionPersistence userRankPositionPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

}