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

package de.uhh.l2g.plugins.migration.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LegacyLectureSeriesFacility service. Represents a row in the &quot;lectureseries_facility&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.migration.model.impl.LegacyLectureSeriesFacilityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.migration.model.impl.LegacyLectureSeriesFacilityImpl}.
 * </p>
 *
 * @author unihh
 * @see LegacyLectureSeriesFacility
 * @see de.uhh.l2g.plugins.migration.model.impl.LegacyLectureSeriesFacilityImpl
 * @see de.uhh.l2g.plugins.migration.model.impl.LegacyLectureSeriesFacilityModelImpl
 * @generated
 */
public interface LegacyLectureSeriesFacilityModel extends BaseModel<LegacyLectureSeriesFacility> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a legacy lecture series facility model instance should use the {@link LegacyLectureSeriesFacility} interface instead.
	 */

	/**
	 * Returns the primary key of this legacy lecture series facility.
	 *
	 * @return the primary key of this legacy lecture series facility
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this legacy lecture series facility.
	 *
	 * @param primaryKey the primary key of this legacy lecture series facility
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the lectureseries facility ID of this legacy lecture series facility.
	 *
	 * @return the lectureseries facility ID of this legacy lecture series facility
	 */
	public long getLectureseriesFacilityId();

	/**
	 * Sets the lectureseries facility ID of this legacy lecture series facility.
	 *
	 * @param lectureseriesFacilityId the lectureseries facility ID of this legacy lecture series facility
	 */
	public void setLectureseriesFacilityId(long lectureseriesFacilityId);

	/**
	 * Returns the facility ID of this legacy lecture series facility.
	 *
	 * @return the facility ID of this legacy lecture series facility
	 */
	public long getFacilityId();

	/**
	 * Sets the facility ID of this legacy lecture series facility.
	 *
	 * @param facilityId the facility ID of this legacy lecture series facility
	 */
	public void setFacilityId(long facilityId);

	/**
	 * Returns the lectureseries ID of this legacy lecture series facility.
	 *
	 * @return the lectureseries ID of this legacy lecture series facility
	 */
	public long getLectureseriesId();

	/**
	 * Sets the lectureseries ID of this legacy lecture series facility.
	 *
	 * @param lectureseriesId the lectureseries ID of this legacy lecture series facility
	 */
	public void setLectureseriesId(long lectureseriesId);

	/**
	 * Returns the is link from of this legacy lecture series facility.
	 *
	 * @return the is link from of this legacy lecture series facility
	 */
	public long getIsLinkFrom();

	/**
	 * Sets the is link from of this legacy lecture series facility.
	 *
	 * @param isLinkFrom the is link from of this legacy lecture series facility
	 */
	public void setIsLinkFrom(long isLinkFrom);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		de.uhh.l2g.plugins.migration.model.LegacyLectureSeriesFacility legacyLectureSeriesFacility);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.migration.model.LegacyLectureSeriesFacility> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyLectureSeriesFacility toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyLectureSeriesFacility toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}