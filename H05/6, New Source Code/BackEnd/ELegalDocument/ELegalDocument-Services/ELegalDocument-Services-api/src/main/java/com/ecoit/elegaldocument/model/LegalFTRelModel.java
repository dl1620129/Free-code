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

import com.ecoit.elegaldocument.service.persistence.LegalFTRelPK;

import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the LegalFTRel service. Represents a row in the &quot;ecoit_doc_LegalFTRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ecoit.elegaldocument.model.impl.LegalFTRelModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ecoit.elegaldocument.model.impl.LegalFTRelImpl</code>.
 * </p>
 *
 * @author Liverpool
 * @see LegalFTRel
 * @generated
 */
@ProviderType
public interface LegalFTRelModel extends BaseModel<LegalFTRel> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a legal ft rel model instance should use the {@link LegalFTRel} interface instead.
	 */

	/**
	 * Returns the primary key of this legal ft rel.
	 *
	 * @return the primary key of this legal ft rel
	 */
	public LegalFTRelPK getPrimaryKey();

	/**
	 * Sets the primary key of this legal ft rel.
	 *
	 * @param primaryKey the primary key of this legal ft rel
	 */
	public void setPrimaryKey(LegalFTRelPK primaryKey);

	/**
	 * Returns the field ID of this legal ft rel.
	 *
	 * @return the field ID of this legal ft rel
	 */
	public long getFieldId();

	/**
	 * Sets the field ID of this legal ft rel.
	 *
	 * @param fieldId the field ID of this legal ft rel
	 */
	public void setFieldId(long fieldId);

	/**
	 * Returns the type ID of this legal ft rel.
	 *
	 * @return the type ID of this legal ft rel
	 */
	public long getTypeId();

	/**
	 * Sets the type ID of this legal ft rel.
	 *
	 * @param typeId the type ID of this legal ft rel
	 */
	public void setTypeId(long typeId);

}