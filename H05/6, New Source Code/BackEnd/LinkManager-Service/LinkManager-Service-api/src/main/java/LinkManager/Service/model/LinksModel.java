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

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Links service. Represents a row in the &quot;portal_Links&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>LinkManager.Service.model.impl.LinksModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>LinkManager.Service.model.impl.LinksImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Links
 * @generated
 */
@ProviderType
public interface LinksModel extends BaseModel<Links> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a links model instance should use the {@link Links} interface instead.
	 */

	/**
	 * Returns the primary key of this links.
	 *
	 * @return the primary key of this links
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this links.
	 *
	 * @param primaryKey the primary key of this links
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the linksid of this links.
	 *
	 * @return the linksid of this links
	 */
	public long getLinksid();

	/**
	 * Sets the linksid of this links.
	 *
	 * @param linksid the linksid of this links
	 */
	public void setLinksid(long linksid);

	/**
	 * Returns the groupid of this links.
	 *
	 * @return the groupid of this links
	 */
	public long getGroupid();

	/**
	 * Sets the groupid of this links.
	 *
	 * @param groupid the groupid of this links
	 */
	public void setGroupid(long groupid);

	/**
	 * Returns the createddate of this links.
	 *
	 * @return the createddate of this links
	 */
	public Date getCreateddate();

	/**
	 * Sets the createddate of this links.
	 *
	 * @param createddate the createddate of this links
	 */
	public void setCreateddate(Date createddate);

	/**
	 * Returns the modifieddate of this links.
	 *
	 * @return the modifieddate of this links
	 */
	public Date getModifieddate();

	/**
	 * Sets the modifieddate of this links.
	 *
	 * @param modifieddate the modifieddate of this links
	 */
	public void setModifieddate(Date modifieddate);

	/**
	 * Returns the linksgroupid of this links.
	 *
	 * @return the linksgroupid of this links
	 */
	public long getLinksgroupid();

	/**
	 * Sets the linksgroupid of this links.
	 *
	 * @param linksgroupid the linksgroupid of this links
	 */
	public void setLinksgroupid(long linksgroupid);

	/**
	 * Returns the name of this links.
	 *
	 * @return the name of this links
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this links.
	 *
	 * @param name the name of this links
	 */
	public void setName(String name);

	/**
	 * Returns the decription of this links.
	 *
	 * @return the decription of this links
	 */
	@AutoEscape
	public String getDecription();

	/**
	 * Sets the decription of this links.
	 *
	 * @param decription the decription of this links
	 */
	public void setDecription(String decription);

	/**
	 * Returns the url of this links.
	 *
	 * @return the url of this links
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this links.
	 *
	 * @param url the url of this links
	 */
	public void setUrl(String url);

	/**
	 * Returns the imageid of this links.
	 *
	 * @return the imageid of this links
	 */
	public long getImageid();

	/**
	 * Sets the imageid of this links.
	 *
	 * @param imageid the imageid of this links
	 */
	public void setImageid(long imageid);

	/**
	 * Returns the hasimage of this links.
	 *
	 * @return the hasimage of this links
	 */
	public boolean getHasimage();

	/**
	 * Returns <code>true</code> if this links is hasimage.
	 *
	 * @return <code>true</code> if this links is hasimage; <code>false</code> otherwise
	 */
	public boolean isHasimage();

	/**
	 * Sets whether this links is hasimage.
	 *
	 * @param hasimage the hasimage of this links
	 */
	public void setHasimage(boolean hasimage);

	/**
	 * Returns the position of this links.
	 *
	 * @return the position of this links
	 */
	public int getPosition();

	/**
	 * Sets the position of this links.
	 *
	 * @param position the position of this links
	 */
	public void setPosition(int position);

	/**
	 * Returns the show of this links.
	 *
	 * @return the show of this links
	 */
	public boolean getShow();

	/**
	 * Returns <code>true</code> if this links is show.
	 *
	 * @return <code>true</code> if this links is show; <code>false</code> otherwise
	 */
	public boolean isShow();

	/**
	 * Sets whether this links is show.
	 *
	 * @param show the show of this links
	 */
	public void setShow(boolean show);

	/**
	 * Returns the icon of this links.
	 *
	 * @return the icon of this links
	 */
	public boolean getIcon();

	/**
	 * Returns <code>true</code> if this links is icon.
	 *
	 * @return <code>true</code> if this links is icon; <code>false</code> otherwise
	 */
	public boolean isIcon();

	/**
	 * Sets whether this links is icon.
	 *
	 * @param icon the icon of this links
	 */
	public void setIcon(boolean icon);

	/**
	 * Returns the parent ID of this links.
	 *
	 * @return the parent ID of this links
	 */
	public long getParentId();

	/**
	 * Sets the parent ID of this links.
	 *
	 * @param parentId the parent ID of this links
	 */
	public void setParentId(long parentId);

}