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

package ChungThuSo.Service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Kyso service. Represents a row in the &quot;cts_portal_Kyso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>ChungThuSo.Service.model.impl.KysoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>ChungThuSo.Service.model.impl.KysoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Kyso
 * @generated
 */
@ProviderType
public interface KysoModel
	extends BaseModel<Kyso>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kyso model instance should use the {@link Kyso} interface instead.
	 */

	/**
	 * Returns the primary key of this kyso.
	 *
	 * @return the primary key of this kyso
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kyso.
	 *
	 * @param primaryKey the primary key of this kyso
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this kyso.
	 *
	 * @return the uuid of this kyso
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this kyso.
	 *
	 * @param uuid the uuid of this kyso
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the kyso ID of this kyso.
	 *
	 * @return the kyso ID of this kyso
	 */
	public long getKysoId();

	/**
	 * Sets the kyso ID of this kyso.
	 *
	 * @param kysoId the kyso ID of this kyso
	 */
	public void setKysoId(long kysoId);

	/**
	 * Returns the group ID of this kyso.
	 *
	 * @return the group ID of this kyso
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this kyso.
	 *
	 * @param groupId the group ID of this kyso
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this kyso.
	 *
	 * @return the company ID of this kyso
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this kyso.
	 *
	 * @param companyId the company ID of this kyso
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this kyso.
	 *
	 * @return the user ID of this kyso
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this kyso.
	 *
	 * @param userId the user ID of this kyso
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this kyso.
	 *
	 * @return the user uuid of this kyso
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this kyso.
	 *
	 * @param userUuid the user uuid of this kyso
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the screen name of this kyso.
	 *
	 * @return the screen name of this kyso
	 */
	@AutoEscape
	public String getScreenName();

	/**
	 * Sets the screen name of this kyso.
	 *
	 * @param screenName the screen name of this kyso
	 */
	public void setScreenName(String screenName);

	/**
	 * Returns the create date of this kyso.
	 *
	 * @return the create date of this kyso
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this kyso.
	 *
	 * @param createDate the create date of this kyso
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this kyso.
	 *
	 * @return the modified date of this kyso
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kyso.
	 *
	 * @param modifiedDate the modified date of this kyso
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the raw data of this kyso.
	 *
	 * @return the raw data of this kyso
	 */
	@AutoEscape
	public String getRawData();

	/**
	 * Sets the raw data of this kyso.
	 *
	 * @param rawData the raw data of this kyso
	 */
	public void setRawData(String rawData);

	/**
	 * Returns the serial number of this kyso.
	 *
	 * @return the serial number of this kyso
	 */
	@AutoEscape
	public String getSerialNumber();

	/**
	 * Sets the serial number of this kyso.
	 *
	 * @param serialNumber the serial number of this kyso
	 */
	public void setSerialNumber(String serialNumber);

	/**
	 * Returns the details of this kyso.
	 *
	 * @return the details of this kyso
	 */
	@AutoEscape
	public String getDetails();

	/**
	 * Sets the details of this kyso.
	 *
	 * @param details the details of this kyso
	 */
	public void setDetails(String details);

	/**
	 * Returns the organization of this kyso.
	 *
	 * @return the organization of this kyso
	 */
	@AutoEscape
	public String getOrganization();

	/**
	 * Sets the organization of this kyso.
	 *
	 * @param organization the organization of this kyso
	 */
	public void setOrganization(String organization);

	/**
	 * Returns the user name of this kyso.
	 *
	 * @return the user name of this kyso
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this kyso.
	 *
	 * @param userName the user name of this kyso
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create user ID of this kyso.
	 *
	 * @return the create user ID of this kyso
	 */
	public long getCreateUserId();

	/**
	 * Sets the create user ID of this kyso.
	 *
	 * @param createUserId the create user ID of this kyso
	 */
	public void setCreateUserId(long createUserId);

	/**
	 * Returns the create user uuid of this kyso.
	 *
	 * @return the create user uuid of this kyso
	 */
	public String getCreateUserUuid();

	/**
	 * Sets the create user uuid of this kyso.
	 *
	 * @param createUserUuid the create user uuid of this kyso
	 */
	public void setCreateUserUuid(String createUserUuid);

	/**
	 * Returns the from date of this kyso.
	 *
	 * @return the from date of this kyso
	 */
	public Date getFromDate();

	/**
	 * Sets the from date of this kyso.
	 *
	 * @param fromDate the from date of this kyso
	 */
	public void setFromDate(Date fromDate);

	/**
	 * Returns the to date of this kyso.
	 *
	 * @return the to date of this kyso
	 */
	public Date getToDate();

	/**
	 * Sets the to date of this kyso.
	 *
	 * @param toDate the to date of this kyso
	 */
	public void setToDate(Date toDate);

}