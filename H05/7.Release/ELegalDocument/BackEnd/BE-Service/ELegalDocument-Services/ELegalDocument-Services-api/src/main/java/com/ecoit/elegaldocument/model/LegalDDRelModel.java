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

import com.ecoit.elegaldocument.service.persistence.LegalDDRelPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the LegalDDRel service. Represents a row in the &quot;ecoit_doc_LegalDDRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ecoit.elegaldocument.model.impl.LegalDDRelModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ecoit.elegaldocument.model.impl.LegalDDRelImpl</code>.
 * </p>
 *
 * @author Liverpool
 * @see LegalDDRel
 * @generated
 */
@ProviderType
public interface LegalDDRelModel extends BaseModel<LegalDDRel> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a legal dd rel model instance should use the {@link LegalDDRel} interface instead.
	 */

	/**
	 * Returns the primary key of this legal dd rel.
	 *
	 * @return the primary key of this legal dd rel
	 */
	public LegalDDRelPK getPrimaryKey();

	/**
	 * Sets the primary key of this legal dd rel.
	 *
	 * @param primaryKey the primary key of this legal dd rel
	 */
	public void setPrimaryKey(LegalDDRelPK primaryKey);

	/**
	 * Returns the department ID of this legal dd rel.
	 *
	 * @return the department ID of this legal dd rel
	 */
	public long getDepartmentId();

	/**
	 * Sets the department ID of this legal dd rel.
	 *
	 * @param departmentId the department ID of this legal dd rel
	 */
	public void setDepartmentId(long departmentId);

	/**
	 * Returns the doc ID of this legal dd rel.
	 *
	 * @return the doc ID of this legal dd rel
	 */
	@AutoEscape
	public String getDocId();

	/**
	 * Sets the doc ID of this legal dd rel.
	 *
	 * @param docId the doc ID of this legal dd rel
	 */
	public void setDocId(String docId);

}