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

package com.ecoit.qa.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttachmentQuestionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttachmentQuestionLocalService
 * @generated
 */
public class AttachmentQuestionLocalServiceWrapper
	implements AttachmentQuestionLocalService,
			   ServiceWrapper<AttachmentQuestionLocalService> {

	public AttachmentQuestionLocalServiceWrapper(
		AttachmentQuestionLocalService attachmentQuestionLocalService) {

		_attachmentQuestionLocalService = attachmentQuestionLocalService;
	}

	/**
	 * Adds the attachment question to the database. Also notifies the appropriate model listeners.
	 *
	 * @param attachmentQuestion the attachment question
	 * @return the attachment question that was added
	 */
	@Override
	public com.ecoit.qa.service.model.AttachmentQuestion addAttachmentQuestion(
		com.ecoit.qa.service.model.AttachmentQuestion attachmentQuestion) {

		return _attachmentQuestionLocalService.addAttachmentQuestion(
			attachmentQuestion);
	}

	/**
	 * Creates a new attachment question with the primary key. Does not add the attachment question to the database.
	 *
	 * @param attachmentQuestionPK the primary key for the new attachment question
	 * @return the new attachment question
	 */
	@Override
	public com.ecoit.qa.service.model.AttachmentQuestion
		createAttachmentQuestion(
			com.ecoit.qa.service.service.persistence.AttachmentQuestionPK
				attachmentQuestionPK) {

		return _attachmentQuestionLocalService.createAttachmentQuestion(
			attachmentQuestionPK);
	}

	@Override
	public void createAttachmentQuestion(long questionId, long attachmentId) {
		_attachmentQuestionLocalService.createAttachmentQuestion(
			questionId, attachmentId);
	}

	/**
	 * Deletes the attachment question from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attachmentQuestion the attachment question
	 * @return the attachment question that was removed
	 */
	@Override
	public com.ecoit.qa.service.model.AttachmentQuestion
		deleteAttachmentQuestion(
			com.ecoit.qa.service.model.AttachmentQuestion attachmentQuestion) {

		return _attachmentQuestionLocalService.deleteAttachmentQuestion(
			attachmentQuestion);
	}

	/**
	 * Deletes the attachment question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attachmentQuestionPK the primary key of the attachment question
	 * @return the attachment question that was removed
	 * @throws PortalException if a attachment question with the primary key could not be found
	 */
	@Override
	public com.ecoit.qa.service.model.AttachmentQuestion
			deleteAttachmentQuestion(
				com.ecoit.qa.service.service.persistence.AttachmentQuestionPK
					attachmentQuestionPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attachmentQuestionLocalService.deleteAttachmentQuestion(
			attachmentQuestionPK);
	}

	@Override
	public void deleteByQuestionId(long questionId) {
		_attachmentQuestionLocalService.deleteByQuestionId(questionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attachmentQuestionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attachmentQuestionLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _attachmentQuestionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.qa.service.model.impl.AttachmentQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _attachmentQuestionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.qa.service.model.impl.AttachmentQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _attachmentQuestionLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _attachmentQuestionLocalService.dynamicQueryCount(dynamicQuery);
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _attachmentQuestionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.ecoit.qa.service.model.AttachmentQuestion
		fetchAttachmentQuestion(
			com.ecoit.qa.service.service.persistence.AttachmentQuestionPK
				attachmentQuestionPK) {

		return _attachmentQuestionLocalService.fetchAttachmentQuestion(
			attachmentQuestionPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attachmentQuestionLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the attachment question with the primary key.
	 *
	 * @param attachmentQuestionPK the primary key of the attachment question
	 * @return the attachment question
	 * @throws PortalException if a attachment question with the primary key could not be found
	 */
	@Override
	public com.ecoit.qa.service.model.AttachmentQuestion getAttachmentQuestion(
			com.ecoit.qa.service.service.persistence.AttachmentQuestionPK
				attachmentQuestionPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attachmentQuestionLocalService.getAttachmentQuestion(
			attachmentQuestionPK);
	}

	/**
	 * Returns a range of all the attachment questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ecoit.qa.service.model.impl.AttachmentQuestionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attachment questions
	 * @param end the upper bound of the range of attachment questions (not inclusive)
	 * @return the range of attachment questions
	 */
	@Override
	public java.util.List<com.ecoit.qa.service.model.AttachmentQuestion>
		getAttachmentQuestions(int start, int end) {

		return _attachmentQuestionLocalService.getAttachmentQuestions(
			start, end);
	}

	/**
	 * Returns the number of attachment questions.
	 *
	 * @return the number of attachment questions
	 */
	@Override
	public int getAttachmentQuestionsCount() {
		return _attachmentQuestionLocalService.getAttachmentQuestionsCount();
	}

	@Override
	public java.util.List<com.ecoit.qa.service.model.AttachmentQuestion>
		getByQuestionId(long questionId) {

		return _attachmentQuestionLocalService.getByQuestionId(questionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attachmentQuestionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attachmentQuestionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attachmentQuestionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the attachment question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param attachmentQuestion the attachment question
	 * @return the attachment question that was updated
	 */
	@Override
	public com.ecoit.qa.service.model.AttachmentQuestion
		updateAttachmentQuestion(
			com.ecoit.qa.service.model.AttachmentQuestion attachmentQuestion) {

		return _attachmentQuestionLocalService.updateAttachmentQuestion(
			attachmentQuestion);
	}

	@Override
	public AttachmentQuestionLocalService getWrappedService() {
		return _attachmentQuestionLocalService;
	}

	@Override
	public void setWrappedService(
		AttachmentQuestionLocalService attachmentQuestionLocalService) {

		_attachmentQuestionLocalService = attachmentQuestionLocalService;
	}

	private AttachmentQuestionLocalService _attachmentQuestionLocalService;

}