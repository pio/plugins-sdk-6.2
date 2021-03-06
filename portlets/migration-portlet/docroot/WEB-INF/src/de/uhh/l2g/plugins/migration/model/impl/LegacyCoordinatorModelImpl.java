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

package de.uhh.l2g.plugins.migration.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.uhh.l2g.plugins.migration.model.LegacyCoordinator;
import de.uhh.l2g.plugins.migration.model.LegacyCoordinatorModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LegacyCoordinator service. Represents a row in the &quot;coordinator&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.migration.model.LegacyCoordinatorModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegacyCoordinatorImpl}.
 * </p>
 *
 * @author unihh
 * @see LegacyCoordinatorImpl
 * @see de.uhh.l2g.plugins.migration.model.LegacyCoordinator
 * @see de.uhh.l2g.plugins.migration.model.LegacyCoordinatorModel
 * @generated
 */
public class LegacyCoordinatorModelImpl extends BaseModelImpl<LegacyCoordinator>
	implements LegacyCoordinatorModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a legacy coordinator model instance should use the {@link de.uhh.l2g.plugins.migration.model.LegacyCoordinator} interface instead.
	 */
	public static final String TABLE_NAME = "coordinator";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userId", Types.BIGINT },
			{ "facilityId", Types.BIGINT },
			{ "officeId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table coordinator (userId LONG not null primary key,facilityId LONG,officeId LONG)";
	public static final String TABLE_SQL_DROP = "drop table coordinator";
	public static final String ORDER_BY_JPQL = " ORDER BY legacyCoordinator.userId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY coordinator.userId ASC";
	public static final String DATA_SOURCE = "anotherDataSource";
	public static final String SESSION_FACTORY = "anotherSessionFactory";
	public static final String TX_MANAGER = "anotherTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.migration.model.LegacyCoordinator"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.migration.model.LegacyCoordinator"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.migration.model.LegacyCoordinator"));

	public LegacyCoordinatorModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LegacyCoordinator.class;
	}

	@Override
	public String getModelClassName() {
		return LegacyCoordinator.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("facilityId", getFacilityId());
		attributes.put("officeId", getOfficeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long facilityId = (Long)attributes.get("facilityId");

		if (facilityId != null) {
			setFacilityId(facilityId);
		}

		Long officeId = (Long)attributes.get("officeId");

		if (officeId != null) {
			setOfficeId(officeId);
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getFacilityId() {
		return _facilityId;
	}

	@Override
	public void setFacilityId(long facilityId) {
		_facilityId = facilityId;
	}

	@Override
	public long getOfficeId() {
		return _officeId;
	}

	@Override
	public void setOfficeId(long officeId) {
		_officeId = officeId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			LegacyCoordinator.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LegacyCoordinator toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LegacyCoordinator)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LegacyCoordinatorImpl legacyCoordinatorImpl = new LegacyCoordinatorImpl();

		legacyCoordinatorImpl.setUserId(getUserId());
		legacyCoordinatorImpl.setFacilityId(getFacilityId());
		legacyCoordinatorImpl.setOfficeId(getOfficeId());

		legacyCoordinatorImpl.resetOriginalValues();

		return legacyCoordinatorImpl;
	}

	@Override
	public int compareTo(LegacyCoordinator legacyCoordinator) {
		long primaryKey = legacyCoordinator.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LegacyCoordinator)) {
			return false;
		}

		LegacyCoordinator legacyCoordinator = (LegacyCoordinator)obj;

		long primaryKey = legacyCoordinator.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<LegacyCoordinator> toCacheModel() {
		LegacyCoordinatorCacheModel legacyCoordinatorCacheModel = new LegacyCoordinatorCacheModel();

		legacyCoordinatorCacheModel.userId = getUserId();

		legacyCoordinatorCacheModel.facilityId = getFacilityId();

		legacyCoordinatorCacheModel.officeId = getOfficeId();

		return legacyCoordinatorCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", facilityId=");
		sb.append(getFacilityId());
		sb.append(", officeId=");
		sb.append(getOfficeId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.migration.model.LegacyCoordinator");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facilityId</column-name><column-value><![CDATA[");
		sb.append(getFacilityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>officeId</column-name><column-value><![CDATA[");
		sb.append(getOfficeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LegacyCoordinator.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LegacyCoordinator.class
		};
	private long _userId;
	private String _userUuid;
	private long _facilityId;
	private long _officeId;
	private LegacyCoordinator _escapedModel;
}