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

import com.ecoit.elegaldocument.model.LegalField;
import com.ecoit.elegaldocument.service.LegalFieldLocalService;
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
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the legal field local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ecoit.elegaldocument.service.impl.LegalFieldLocalServiceImpl}.
 * </p>
 *
 * @author Liverpool
 * @see com.ecoit.elegaldocument.service.impl.LegalFieldLocalServiceImpl
 * @generated
 */
public abstract class LegalFieldLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, LegalFieldLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>LegalFieldLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.ecoit.elegaldocument.service.LegalFieldLocalServiceUtil</code>.
	 */

	/**
	 * Adds the legal field to the database. Also notifies the appropriate model listeners.
	 *
	 * @param legalField the legal field
	 * @return the legal field that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public LegalField addLegalField(LegalField legalField) {
		legalField.setNew(true);

		return legalFieldPersistence.update(legalField);
	}

	/**
	 * Creates a new legal field with the primary key. Does not add the legal field to the database.
	 *
	 * @param fieldId the primary key for the new legal field
	 * @return the new legal field
	 */
	@Override
	@Transactional(enabled = false)
	public LegalField createLegalField(long fieldId) {
		return legalFieldPersistence.create(fieldId);
	}

	/**
	 * Deletes the legal field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fieldId the primary key of the legal field
	 * @return the legal field that was removed
	 * @throws PortalException if a legal field with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public LegalField deleteLegalField(long fieldId) throws PortalException {
		return legalFieldPersistence.remove(fieldId);
	}

	/**
	 * Deletes the legal field from the database. Also notifies the appropriate model listeners.
	 *
	 * @param legalField the legal field
	 * @return the legal field that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public LegalField deleteLegalField(LegalField legalField) {
		return legalFieldPersistence.remove(legalField);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			LegalField.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return legalFieldPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.elegaldocument.model.impl.LegalFieldModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return legalFieldPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.elegaldocument.model.impl.LegalFieldModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return legalFieldPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return legalFieldPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return legalFieldPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public LegalField fetchLegalField(long fieldId) {
		return legalFieldPersistence.fetchByPrimaryKey(fieldId);
	}

	/**
	 * Returns the legal field with the primary key.
	 *
	 * @param fieldId the primary key of the legal field
	 * @return the legal field
	 * @throws PortalException if a legal field with the primary key could not be found
	 */
	@Override
	public LegalField getLegalField(long fieldId) throws PortalException {
		return legalFieldPersistence.findByPrimaryKey(fieldId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(legalFieldLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(LegalField.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("fieldId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			legalFieldLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(LegalField.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("fieldId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(legalFieldLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(LegalField.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("fieldId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return legalFieldLocalService.deleteLegalField(
			(LegalField)persistedModel);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return legalFieldPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the legal fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.elegaldocument.model.impl.LegalFieldModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of legal fields
	 * @param end the upper bound of the range of legal fields (not inclusive)
	 * @return the range of legal fields
	 */
	@Override
	public List<LegalField> getLegalFields(int start, int end) {
		return legalFieldPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of legal fields.
	 *
	 * @return the number of legal fields
	 */
	@Override
	public int getLegalFieldsCount() {
		return legalFieldPersistence.countAll();
	}

	/**
	 * Updates the legal field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param legalField the legal field
	 * @return the legal field that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public LegalField updateLegalField(LegalField legalField) {
		return legalFieldPersistence.update(legalField);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			LegalFieldLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		legalFieldLocalService = (LegalFieldLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return LegalFieldLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return LegalField.class;
	}

	protected String getModelClassName() {
		return LegalField.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = legalFieldPersistence.getDataSource();

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

	protected LegalFieldLocalService legalFieldLocalService;

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
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}