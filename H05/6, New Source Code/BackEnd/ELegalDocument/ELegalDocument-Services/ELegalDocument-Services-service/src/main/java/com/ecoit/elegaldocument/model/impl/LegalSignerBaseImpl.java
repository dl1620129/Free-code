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

import com.ecoit.elegaldocument.model.LegalSigner;
import com.ecoit.elegaldocument.service.LegalSignerLocalServiceUtil;

/**
 * The extended model base implementation for the LegalSigner service. Represents a row in the &quot;ecoit_doc_LegalSigner&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegalSignerImpl}.
 * </p>
 *
 * @author Liverpool
 * @see LegalSignerImpl
 * @see LegalSigner
 * @generated
 */
public abstract class LegalSignerBaseImpl
	extends LegalSignerModelImpl implements LegalSigner {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a legal signer model instance should use the <code>LegalSigner</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			LegalSignerLocalServiceUtil.addLegalSigner(this);
		}
		else {
			LegalSignerLocalServiceUtil.updateLegalSigner(this);
		}
	}

}