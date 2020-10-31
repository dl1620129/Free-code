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

package com.ecoit.elegaldocument.service.base;

import com.ecoit.elegaldocument.model.LegalOrg;
import com.ecoit.elegaldocument.service.LegalOrgService;
import com.ecoit.elegaldocument.service.persistence.DocumentAttachmentsPersistence;
import com.ecoit.elegaldocument.service.persistence.DraftAttachmentsPersistence;
import com.ecoit.elegaldocument.service.persistence.EcmsGURelationPersistence;
import com.ecoit.elegaldocument.service.persistence.EcmsGroupPersistence;
import com.ecoit.elegaldocument.service.persistence.EcmsPGRelationPersistence;
import com.ecoit.elegaldocument.service.persistence.GroupCategoryPersistence;
import com.ecoit.elegaldocument.service.persistence.GroupFieldPersistence;
import com.ecoit.elegaldocument.service.persistence.GroupOrganizationPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalAttachedMessagePersistence;
import com.ecoit.elegaldocument.service.persistence.LegalConfigurationFilePersistence;
import com.ecoit.elegaldocument.service.persistence.LegalDDRelPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalDFRelPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalDSRelPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalDTypeRelPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalDURelPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalDocumentPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalDraftDocumentPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalFTRelPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalFieldPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalFoRelPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalLevelValidityPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalLoggerPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalOrgPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalSignerPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalSuggestDocumentPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalTDRelPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalTagsPersistence;
import com.ecoit.elegaldocument.service.persistence.LegalTypePersistence;

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
 * Provides the base implementation for the legal org remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ecoit.elegaldocument.service.impl.LegalOrgServiceImpl}.
 * </p>
 *
 * @author Liverpool
 * @see com.ecoit.elegaldocument.service.impl.LegalOrgServiceImpl
 * @generated
 */
public abstract class LegalOrgServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, LegalOrgService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>LegalOrgService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.ecoit.elegaldocument.service.LegalOrgServiceUtil</code>.
	 */
	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			LegalOrgService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		legalOrgService = (LegalOrgService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return LegalOrgService.class.getName();
	}

	protected Class<?> getModelClass() {
		return LegalOrg.class;
	}

	protected String getModelClassName() {
		return LegalOrg.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = legalOrgPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected DocumentAttachmentsPersistence documentAttachmentsPersistence;

	@Reference
	protected DraftAttachmentsPersistence draftAttachmentsPersistence;

	@Reference
	protected EcmsGroupPersistence ecmsGroupPersistence;

	@Reference
	protected EcmsGURelationPersistence ecmsGURelationPersistence;

	@Reference
	protected EcmsPGRelationPersistence ecmsPGRelationPersistence;

	@Reference
	protected GroupCategoryPersistence groupCategoryPersistence;

	@Reference
	protected GroupFieldPersistence groupFieldPersistence;

	@Reference
	protected GroupOrganizationPersistence groupOrganizationPersistence;

	@Reference
	protected LegalAttachedMessagePersistence legalAttachedMessagePersistence;

	@Reference
	protected LegalConfigurationFilePersistence
		legalConfigurationFilePersistence;

	@Reference
	protected LegalDDRelPersistence legalDDRelPersistence;

	@Reference
	protected LegalDFRelPersistence legalDFRelPersistence;

	@Reference
	protected LegalDocumentPersistence legalDocumentPersistence;

	@Reference
	protected LegalDraftDocumentPersistence legalDraftDocumentPersistence;

	@Reference
	protected LegalDSRelPersistence legalDSRelPersistence;

	@Reference
	protected LegalDTypeRelPersistence legalDTypeRelPersistence;

	@Reference
	protected LegalDURelPersistence legalDURelPersistence;

	@Reference
	protected LegalFieldPersistence legalFieldPersistence;

	@Reference
	protected LegalFoRelPersistence legalFoRelPersistence;

	@Reference
	protected LegalFTRelPersistence legalFTRelPersistence;

	@Reference
	protected LegalLevelValidityPersistence legalLevelValidityPersistence;

	@Reference
	protected LegalLoggerPersistence legalLoggerPersistence;

	@Reference
	protected com.ecoit.elegaldocument.service.LegalOrgLocalService
		legalOrgLocalService;

	protected LegalOrgService legalOrgService;

	@Reference
	protected LegalOrgPersistence legalOrgPersistence;

	@Reference
	protected LegalSignerPersistence legalSignerPersistence;

	@Reference
	protected LegalSuggestDocumentPersistence legalSuggestDocumentPersistence;

	@Reference
	protected LegalTagsPersistence legalTagsPersistence;

	@Reference
	protected LegalTDRelPersistence legalTDRelPersistence;

	@Reference
	protected LegalTypePersistence legalTypePersistence;

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