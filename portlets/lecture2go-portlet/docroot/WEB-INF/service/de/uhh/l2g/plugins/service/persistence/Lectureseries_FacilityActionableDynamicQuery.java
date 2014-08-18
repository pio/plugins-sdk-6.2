/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package de.uhh.l2g.plugins.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.uhh.l2g.plugins.model.Lectureseries_Facility;
import de.uhh.l2g.plugins.service.Lectureseries_FacilityLocalServiceUtil;

/**
 * @author Iavor Sturm
 * @generated
 */
public abstract class Lectureseries_FacilityActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public Lectureseries_FacilityActionableDynamicQuery()
		throws SystemException {
		setBaseLocalService(Lectureseries_FacilityLocalServiceUtil.getService());
		setClass(Lectureseries_Facility.class);

		setClassLoader(de.uhh.l2g.plugins.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("lectureseriesFacilityId");
	}
}