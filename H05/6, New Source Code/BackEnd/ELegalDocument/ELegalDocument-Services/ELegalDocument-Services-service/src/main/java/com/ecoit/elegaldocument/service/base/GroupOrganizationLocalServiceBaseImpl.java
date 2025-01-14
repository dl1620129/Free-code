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

import com.ecoit.elegaldocument.model.GroupOrganization;
import com.ecoit.elegaldocument.service.GroupOrganizationLocalService;
import com.ecoit.elegaldocument.service.persistence.DocumentAttachmentsPersistence;
import com.ecoit.elegaldocument.service.persistence.DraftAttachmentsPersistence;
import com.ecoit.elegaldocument.service.persistence.EcmsGURelationPersistence;
import com.ecoit.elegaldocument.service.persistence.EcmsGroupPersistence;
import com.ecoit.elegaldocument.service.persistence.EcmsPGRelationPersistence;
import com.ecoit.elegaldocument.service.persistence.GroupCategoryPersistence;
import com.ecoit.elegaldocument.service.persistence.GroupFieldPersistence;
import com.ecoit.elegaldocument.service.persistence.GroupOrganizationPK;
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
 * Provides the base implementation for the group organization local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ecoit.elegaldocument.service.impl.GroupOrganizationLocalServiceImpl}.
 * </p>
 *
 * @author Liverpool
 * @see com.ecoit.elegaldocument.service.impl.GroupOrganizationLocalServiceImpl
 * @generated
 */
public abstract class GroupOrganizationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, GroupOrganizationLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>GroupOrganizationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.ecoit.elegaldocument.service.GroupOrganizationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the group organization to the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupOrganization the group organization
	 * @return the group organization that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public GroupOrganization addGroupOrganization(
		GroupOrganization groupOrganization) {

		groupOrganization.setNew(true);

		return groupOrganizationPersistence.update(groupOrganization);
	}

	/**
	 * Creates a new group organization with the primary key. Does not add the group organization to the database.
	 *
	 * @param groupOrganizationPK the primary key for the new group organization
	 * @return the new group organization
	 */
	@Override
	@Transactional(enabled = false)
	public GroupOrganization createGroupOrganization(
		GroupOrganizationPK groupOrganizationPK) {

		return groupOrganizationPersistence.create(groupOrganizationPK);
	}

	/**
	 * Deletes the group organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupOrganizationPK the primary key of the group organization
	 * @return the group organization that was removed
	 * @throws PortalException if a group organization with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public GroupOrganization deleteGroupOrganization(
			GroupOrganizationPK groupOrganizationPK)
		throws PortalException {

		return groupOrganizationPersistence.remove(groupOrganizationPK);
	}

	/**
	 * Deletes the group organization from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupOrganization the group organization
	 * @return the group organization that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public GroupOrganization deleteGroupOrganization(
		GroupOrganization groupOrganization) {

		return groupOrganizationPersistence.remove(groupOrganization);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			GroupOrganization.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return groupOrganizationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.elegaldocument.model.impl.GroupOrganizationModelImpl</code>.
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

		return groupOrganizationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.elegaldocument.model.impl.GroupOrganizationModelImpl</code>.
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

		return groupOrganizationPersistence.findWithDynamicQuery(
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
		return groupOrganizationPersistence.countWithDynamicQuery(dynamicQuery);
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

		return groupOrganizationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public GroupOrganization fetchGroupOrganization(
		GroupOrganizationPK groupOrganizationPK) {

		return groupOrganizationPersistence.fetchByPrimaryKey(
			groupOrganizationPK);
	}

	/**
	 * Returns the group organization with the primary key.
	 *
	 * @param groupOrganizationPK the primary key of the group organization
	 * @return the group organization
	 * @throws PortalException if a group organization with the primary key could not be found
	 */
	@Override
	public GroupOrganization getGroupOrganization(
			GroupOrganizationPK groupOrganizationPK)
		throws PortalException {

		return groupOrganizationPersistence.findByPrimaryKey(
			groupOrganizationPK);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			groupOrganizationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(GroupOrganization.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.groupUserId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			groupOrganizationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(GroupOrganization.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.groupUserId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			groupOrganizationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(GroupOrganization.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.groupUserId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return groupOrganizationLocalService.deleteGroupOrganization(
			(GroupOrganization)persistedModel);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return groupOrganizationPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the group organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.elegaldocument.model.impl.GroupOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of group organizations
	 * @param end the upper bound of the range of group organizations (not inclusive)
	 * @return the range of group organizations
	 */
	@Override
	public List<GroupOrganization> getGroupOrganizations(int start, int end) {
		return groupOrganizationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of group organizations.
	 *
	 * @return the number of group organizations
	 */
	@Override
	public int getGroupOrganizationsCount() {
		return groupOrganizationPersistence.countAll();
	}

	/**
	 * Updates the group organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param groupOrganization the group organization
	 * @return the group organization that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public GroupOrganization updateGroupOrganization(
		GroupOrganization groupOrganization) {

		return groupOrganizationPersistence.update(groupOrganization);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			GroupOrganizationLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		groupOrganizationLocalService = (GroupOrganizationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return GroupOrganizationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return GroupOrganization.class;
	}

	protected String getModelClassName() {
		return GroupOrganization.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				groupOrganizationPersistence.getDataSource();

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

	protected GroupOrganizationLocalService groupOrganizationLocalService;

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