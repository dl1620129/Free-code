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

package com.ecoit.elegaldocument.model;

import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the DraftAttachments service. Represents a row in the &quot;ecoit_doc_DraftAttachments&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ecoit.elegaldocument.model.impl.DraftAttachmentsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ecoit.elegaldocument.model.impl.DraftAttachmentsImpl</code>.
 * </p>
 *
 * @author Liverpool
 * @see DraftAttachments
 * @generated
 */
@ProviderType
public interface DraftAttachmentsModel extends BaseModel<DraftAttachments> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a draft attachments model instance should use the {@link DraftAttachments} interface instead.
	 */

	/**
	 * Returns the primary key of this draft attachments.
	 *
	 * @return the primary key of this draft attachments
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this draft attachments.
	 *
	 * @param primaryKey the primary key of this draft attachments
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the attachment ID of this draft attachments.
	 *
	 * @return the attachment ID of this draft attachments
	 */
	public long getAttachmentId();

	/**
	 * Sets the attachment ID of this draft attachments.
	 *
	 * @param attachmentId the attachment ID of this draft attachments
	 */
	public void setAttachmentId(long attachmentId);

	/**
	 * Returns the draft ID of this draft attachments.
	 *
	 * @return the draft ID of this draft attachments
	 */
	public long getDraftId();

	/**
	 * Sets the draft ID of this draft attachments.
	 *
	 * @param draftId the draft ID of this draft attachments
	 */
	public void setDraftId(long draftId);

}