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

import com.ecoit.elegaldocument.model.LegalLevelValidity;
import com.ecoit.elegaldocument.service.LegalLevelValidityLocalServiceUtil;

/**
 * The extended model base implementation for the LegalLevelValidity service. Represents a row in the &quot;ecoit_doc_LegalLevelValidity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegalLevelValidityImpl}.
 * </p>
 *
 * @author Liverpool
 * @see LegalLevelValidityImpl
 * @see LegalLevelValidity
 * @generated
 */
public abstract class LegalLevelValidityBaseImpl
	extends LegalLevelValidityModelImpl implements LegalLevelValidity {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a legal level validity model instance should use the <code>LegalLevelValidity</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			LegalLevelValidityLocalServiceUtil.addLegalLevelValidity(this);
		}
		else {
			LegalLevelValidityLocalServiceUtil.updateLegalLevelValidity(this);
		}
	}

}