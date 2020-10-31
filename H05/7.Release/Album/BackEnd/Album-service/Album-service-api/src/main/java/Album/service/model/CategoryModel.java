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

package Album.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Category service. Represents a row in the &quot;portal_album_Category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>Album.service.model.impl.CategoryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>Album.service.model.impl.CategoryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Category
 * @generated
 */
@ProviderType
public interface CategoryModel extends BaseModel<Category>, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a category model instance should use the {@link Category} interface instead.
	 */

	/**
	 * Returns the primary key of this category.
	 *
	 * @return the primary key of this category
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this category.
	 *
	 * @param primaryKey the primary key of this category
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the category ID of this category.
	 *
	 * @return the category ID of this category
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this category.
	 *
	 * @param categoryId the category ID of this category
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Returns the group ID of this category.
	 *
	 * @return the group ID of this category
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this category.
	 *
	 * @param groupId the group ID of this category
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this category.
	 *
	 * @return the company ID of this category
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this category.
	 *
	 * @param companyId the company ID of this category
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create by user of this category.
	 *
	 * @return the create by user of this category
	 */
	@AutoEscape
	public String getCreateByUser();

	/**
	 * Sets the create by user of this category.
	 *
	 * @param createByUser the create by user of this category
	 */
	public void setCreateByUser(String createByUser);

	/**
	 * Returns the create date of this category.
	 *
	 * @return the create date of this category
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this category.
	 *
	 * @param createDate the create date of this category
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified by user of this category.
	 *
	 * @return the modified by user of this category
	 */
	@AutoEscape
	public String getModifiedByUser();

	/**
	 * Sets the modified by user of this category.
	 *
	 * @param modifiedByUser the modified by user of this category
	 */
	public void setModifiedByUser(String modifiedByUser);

	/**
	 * Returns the modified date of this category.
	 *
	 * @return the modified date of this category
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this category.
	 *
	 * @param modifiedDate the modified date of this category
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the view of this category.
	 *
	 * @return the view of this category
	 */
	public long getView();

	/**
	 * Sets the view of this category.
	 *
	 * @param view the view of this category
	 */
	public void setView(long view);

	/**
	 * Returns the parent ID of this category.
	 *
	 * @return the parent ID of this category
	 */
	public long getParentId();

	/**
	 * Sets the parent ID of this category.
	 *
	 * @param parentId the parent ID of this category
	 */
	public void setParentId(long parentId);

	/**
	 * Returns the name of this category.
	 *
	 * @return the name of this category
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this category.
	 *
	 * @param name the name of this category
	 */
	public void setName(String name);

	/**
	 * Returns the description of this category.
	 *
	 * @return the description of this category
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this category.
	 *
	 * @param description the description of this category
	 */
	public void setDescription(String description);

	/**
	 * Returns the tac gia album of this category.
	 *
	 * @return the tac gia album of this category
	 */
	@AutoEscape
	public String getTacGiaAlbum();

	/**
	 * Sets the tac gia album of this category.
	 *
	 * @param tacGiaAlbum the tac gia album of this category
	 */
	public void setTacGiaAlbum(String tacGiaAlbum);

	/**
	 * Returns the field ID of this category.
	 *
	 * @return the field ID of this category
	 */
	public long getFieldId();

	/**
	 * Sets the field ID of this category.
	 *
	 * @param fieldId the field ID of this category
	 */
	public void setFieldId(long fieldId);

	/**
	 * Returns the status of this category.
	 *
	 * @return the status of this category
	 */
	public long getStatus();

	/**
	 * Sets the status of this category.
	 *
	 * @param status the status of this category
	 */
	public void setStatus(long status);

	/**
	 * Returns the thu tu of this category.
	 *
	 * @return the thu tu of this category
	 */
	public int getThuTu();

	/**
	 * Sets the thu tu of this category.
	 *
	 * @param thuTu the thu tu of this category
	 */
	public void setThuTu(int thuTu);

	/**
	 * Returns the is dai dien of this category.
	 *
	 * @return the is dai dien of this category
	 */
	public boolean getIsDaiDien();

	/**
	 * Returns <code>true</code> if this category is is dai dien.
	 *
	 * @return <code>true</code> if this category is is dai dien; <code>false</code> otherwise
	 */
	public boolean isIsDaiDien();

	/**
	 * Sets whether this category is is dai dien.
	 *
	 * @param isDaiDien the is dai dien of this category
	 */
	public void setIsDaiDien(boolean isDaiDien);

	/**
	 * Returns the url image of this category.
	 *
	 * @return the url image of this category
	 */
	@AutoEscape
	public String getUrlImage();

	/**
	 * Sets the url image of this category.
	 *
	 * @param urlImage the url image of this category
	 */
	public void setUrlImage(String urlImage);

}