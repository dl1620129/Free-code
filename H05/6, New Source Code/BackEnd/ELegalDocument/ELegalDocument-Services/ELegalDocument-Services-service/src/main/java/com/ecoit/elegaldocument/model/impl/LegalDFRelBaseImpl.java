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

package com.ecoit.elegaldocument.model.impl;

import com.ecoit.elegaldocument.model.LegalDFRel;
import com.ecoit.elegaldocument.service.LegalDFRelLocalServiceUtil;

/**
 * The extended model base implementation for the LegalDFRel service. Represents a row in the &quot;ecoit_doc_LegalDFRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegalDFRelImpl}.
 * </p>
 *
 * @author Liverpool
 * @see LegalDFRelImpl
 * @see LegalDFRel
 * @generated
 */
public abstract class LegalDFRelBaseImpl
	extends LegalDFRelModelImpl implements LegalDFRel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a legal df rel model instance should use the <code>LegalDFRel</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			LegalDFRelLocalServiceUtil.addLegalDFRel(this);
		}
		else {
			LegalDFRelLocalServiceUtil.updateLegalDFRel(this);
		}
	}

}