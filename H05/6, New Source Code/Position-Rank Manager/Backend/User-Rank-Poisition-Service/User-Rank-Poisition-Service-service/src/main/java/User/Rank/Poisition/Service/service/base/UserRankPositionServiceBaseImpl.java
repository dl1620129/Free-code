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

import User.Rank.Poisition.Service.model.UserRankPosition;
import User.Rank.Poisition.Service.service.UserRankPositionService;
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
 * Provides the base implementation for the user rank position remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link User.Rank.Poisition.Service.service.impl.UserRankPositionServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see User.Rank.Poisition.Service.service.impl.UserRankPositionServiceImpl
 * @generated
 */
public abstract class UserRankPositionServiceBaseImpl
	extends BaseServiceImpl
	implements UserRankPositionService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>UserRankPositionService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>User.Rank.Poisition.Service.service.UserRankPositionServiceUtil</code>.
	 */
	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			UserRankPositionService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		userRankPositionService = (UserRankPositionService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return UserRankPositionService.class.getName();
	}

	protected Class<?> getModelClass() {
		return UserRankPosition.class;
	}

	protected String getModelClassName() {
		return UserRankPosition.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = userRankPositionPersistence.getDataSource();

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
	protected UserPoisition_DangPersistence userPoisition_DangPersistence;

	@Reference
	protected UserRankPersistence userRankPersistence;

	@Reference
	protected User.Rank.Poisition.Service.service.UserRankPositionLocalService
		userRankPositionLocalService;

	protected UserRankPositionService userRankPositionService;

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