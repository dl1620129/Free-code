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

package LinkManager.Service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the portal service. Represents a row in the &quot;portal_portal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>LinkManager.Service.model.impl.portalModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>LinkManager.Service.model.impl.portalImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see portal
 * @generated
 */
@ProviderType
public interface portalModel
	extends BaseModel<portal>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a portal model instance should use the {@link portal} interface instead.
	 */

	/**
	 * Returns the primary key of this portal.
	 *
	 * @return the primary key of this portal
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this portal.
	 *
	 * @param primaryKey the primary key of this portal
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this portal.
	 *
	 * @return the uuid of this portal
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this portal.
	 *
	 * @param uuid the uuid of this portal
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the portal ID of this portal.
	 *
	 * @return the portal ID of this portal
	 */
	public long getPortalId();

	/**
	 * Sets the portal ID of this portal.
	 *
	 * @param portalId the portal ID of this portal
	 */
	public void setPortalId(long portalId);

	/**
	 * Returns the group ID of this portal.
	 *
	 * @return the group ID of this portal
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this portal.
	 *
	 * @param groupId the group ID of this portal
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this portal.
	 *
	 * @return the company ID of this portal
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this portal.
	 *
	 * @param companyId the company ID of this portal
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this portal.
	 *
	 * @return the user ID of this portal
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this portal.
	 *
	 * @param userId the user ID of this portal
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this portal.
	 *
	 * @return the user uuid of this portal
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this portal.
	 *
	 * @param userUuid the user uuid of this portal
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this portal.
	 *
	 * @return the user name of this portal
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this portal.
	 *
	 * @param userName the user name of this portal
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this portal.
	 *
	 * @return the create date of this portal
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this portal.
	 *
	 * @param createDate the create date of this portal
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this portal.
	 *
	 * @return the modified date of this portal
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this portal.
	 *
	 * @param modifiedDate the modified date of this portal
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the field1 of this portal.
	 *
	 * @return the field1 of this portal
	 */
	@AutoEscape
	public String getField1();

	/**
	 * Sets the field1 of this portal.
	 *
	 * @param field1 the field1 of this portal
	 */
	public void setField1(String field1);

	/**
	 * Returns the field2 of this portal.
	 *
	 * @return the field2 of this portal
	 */
	public boolean getField2();

	/**
	 * Returns <code>true</code> if this portal is field2.
	 *
	 * @return <code>true</code> if this portal is field2; <code>false</code> otherwise
	 */
	public boolean isField2();

	/**
	 * Sets whether this portal is field2.
	 *
	 * @param field2 the field2 of this portal
	 */
	public void setField2(boolean field2);

	/**
	 * Returns the field3 of this portal.
	 *
	 * @return the field3 of this portal
	 */
	public int getField3();

	/**
	 * Sets the field3 of this portal.
	 *
	 * @param field3 the field3 of this portal
	 */
	public void setField3(int field3);

	/**
	 * Returns the field4 of this portal.
	 *
	 * @return the field4 of this portal
	 */
	public Date getField4();

	/**
	 * Sets the field4 of this portal.
	 *
	 * @param field4 the field4 of this portal
	 */
	public void setField4(Date field4);

	/**
	 * Returns the field5 of this portal.
	 *
	 * @return the field5 of this portal
	 */
	@AutoEscape
	public String getField5();

	/**
	 * Sets the field5 of this portal.
	 *
	 * @param field5 the field5 of this portal
	 */
	public void setField5(String field5);

}