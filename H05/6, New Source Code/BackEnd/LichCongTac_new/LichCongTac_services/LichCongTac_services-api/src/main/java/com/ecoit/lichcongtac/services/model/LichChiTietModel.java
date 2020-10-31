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

package com.ecoit.lichcongtac.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the LichChiTiet service. Represents a row in the &quot;ecoit_lich_LichChiTiet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ecoit.lichcongtac.services.model.impl.LichChiTietModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ecoit.lichcongtac.services.model.impl.LichChiTietImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LichChiTiet
 * @generated
 */
@ProviderType
public interface LichChiTietModel
	extends BaseModel<LichChiTiet>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lich chi tiet model instance should use the {@link LichChiTiet} interface instead.
	 */

	/**
	 * Returns the primary key of this lich chi tiet.
	 *
	 * @return the primary key of this lich chi tiet
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lich chi tiet.
	 *
	 * @param primaryKey the primary key of this lich chi tiet
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the lich chi tiet ID of this lich chi tiet.
	 *
	 * @return the lich chi tiet ID of this lich chi tiet
	 */
	public long getLichChiTietId();

	/**
	 * Sets the lich chi tiet ID of this lich chi tiet.
	 *
	 * @param lichChiTietId the lich chi tiet ID of this lich chi tiet
	 */
	public void setLichChiTietId(long lichChiTietId);

	/**
	 * Returns the group ID of this lich chi tiet.
	 *
	 * @return the group ID of this lich chi tiet
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this lich chi tiet.
	 *
	 * @param groupId the group ID of this lich chi tiet
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the language of this lich chi tiet.
	 *
	 * @return the language of this lich chi tiet
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this lich chi tiet.
	 *
	 * @param language the language of this lich chi tiet
	 */
	public void setLanguage(String language);

	/**
	 * Returns the company ID of this lich chi tiet.
	 *
	 * @return the company ID of this lich chi tiet
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this lich chi tiet.
	 *
	 * @param companyId the company ID of this lich chi tiet
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this lich chi tiet.
	 *
	 * @return the user ID of this lich chi tiet
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this lich chi tiet.
	 *
	 * @param userId the user ID of this lich chi tiet
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this lich chi tiet.
	 *
	 * @return the user uuid of this lich chi tiet
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this lich chi tiet.
	 *
	 * @param userUuid the user uuid of this lich chi tiet
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this lich chi tiet.
	 *
	 * @return the user name of this lich chi tiet
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this lich chi tiet.
	 *
	 * @param userName the user name of this lich chi tiet
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this lich chi tiet.
	 *
	 * @return the create date of this lich chi tiet
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this lich chi tiet.
	 *
	 * @param createDate the create date of this lich chi tiet
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the created by user of this lich chi tiet.
	 *
	 * @return the created by user of this lich chi tiet
	 */
	public long getCreatedByUser();

	/**
	 * Sets the created by user of this lich chi tiet.
	 *
	 * @param createdByUser the created by user of this lich chi tiet
	 */
	public void setCreatedByUser(long createdByUser);

	/**
	 * Returns the modified date of this lich chi tiet.
	 *
	 * @return the modified date of this lich chi tiet
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this lich chi tiet.
	 *
	 * @param modifiedDate the modified date of this lich chi tiet
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the modified by user of this lich chi tiet.
	 *
	 * @return the modified by user of this lich chi tiet
	 */
	public long getModifiedByUser();

	/**
	 * Sets the modified by user of this lich chi tiet.
	 *
	 * @param modifiedByUser the modified by user of this lich chi tiet
	 */
	public void setModifiedByUser(long modifiedByUser);

	/**
	 * Returns the gio bat dau of this lich chi tiet.
	 *
	 * @return the gio bat dau of this lich chi tiet
	 */
	public Date getGioBatDau();

	/**
	 * Sets the gio bat dau of this lich chi tiet.
	 *
	 * @param gioBatDau the gio bat dau of this lich chi tiet
	 */
	public void setGioBatDau(Date gioBatDau);

	/**
	 * Returns the mo ta of this lich chi tiet.
	 *
	 * @return the mo ta of this lich chi tiet
	 */
	@AutoEscape
	public String getMoTa();

	/**
	 * Sets the mo ta of this lich chi tiet.
	 *
	 * @param moTa the mo ta of this lich chi tiet
	 */
	public void setMoTa(String moTa);

	/**
	 * Returns the nguoi tham du of this lich chi tiet.
	 *
	 * @return the nguoi tham du of this lich chi tiet
	 */
	@AutoEscape
	public String getNguoiThamDu();

	/**
	 * Sets the nguoi tham du of this lich chi tiet.
	 *
	 * @param nguoiThamDu the nguoi tham du of this lich chi tiet
	 */
	public void setNguoiThamDu(String nguoiThamDu);

	/**
	 * Returns the nguoi chu tri of this lich chi tiet.
	 *
	 * @return the nguoi chu tri of this lich chi tiet
	 */
	@AutoEscape
	public String getNguoiChuTri();

	/**
	 * Sets the nguoi chu tri of this lich chi tiet.
	 *
	 * @param nguoiChuTri the nguoi chu tri of this lich chi tiet
	 */
	public void setNguoiChuTri(String nguoiChuTri);

	/**
	 * Returns the selected date of this lich chi tiet.
	 *
	 * @return the selected date of this lich chi tiet
	 */
	public Date getSelectedDate();

	/**
	 * Sets the selected date of this lich chi tiet.
	 *
	 * @param selectedDate the selected date of this lich chi tiet
	 */
	public void setSelectedDate(Date selectedDate);

	/**
	 * Returns the trangthai chi tiet of this lich chi tiet.
	 *
	 * @return the trangthai chi tiet of this lich chi tiet
	 */
	public int getTrangthaiChiTiet();

	/**
	 * Sets the trangthai chi tiet of this lich chi tiet.
	 *
	 * @param trangthaiChiTiet the trangthai chi tiet of this lich chi tiet
	 */
	public void setTrangthaiChiTiet(int trangthaiChiTiet);

	/**
	 * Returns the lich cong tac ID of this lich chi tiet.
	 *
	 * @return the lich cong tac ID of this lich chi tiet
	 */
	public long getLichCongTacId();

	/**
	 * Sets the lich cong tac ID of this lich chi tiet.
	 *
	 * @param lichCongTacId the lich cong tac ID of this lich chi tiet
	 */
	public void setLichCongTacId(long lichCongTacId);

	/**
	 * Returns the address of this lich chi tiet.
	 *
	 * @return the address of this lich chi tiet
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this lich chi tiet.
	 *
	 * @param address the address of this lich chi tiet
	 */
	public void setAddress(String address);

	/**
	 * Returns the note of this lich chi tiet.
	 *
	 * @return the note of this lich chi tiet
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this lich chi tiet.
	 *
	 * @param note the note of this lich chi tiet
	 */
	public void setNote(String note);

	/**
	 * Returns the lydo tra ve of this lich chi tiet.
	 *
	 * @return the lydo tra ve of this lich chi tiet
	 */
	@AutoEscape
	public String getLydoTraVe();

	/**
	 * Sets the lydo tra ve of this lich chi tiet.
	 *
	 * @param lydoTraVe the lydo tra ve of this lich chi tiet
	 */
	public void setLydoTraVe(String lydoTraVe);

	/**
	 * Returns the organization ID of this lich chi tiet.
	 *
	 * @return the organization ID of this lich chi tiet
	 */
	public long getOrganizationId();

	/**
	 * Sets the organization ID of this lich chi tiet.
	 *
	 * @param organizationId the organization ID of this lich chi tiet
	 */
	public void setOrganizationId(long organizationId);

}