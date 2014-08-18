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

package de.uhh.l2g.plugins.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import de.uhh.l2g.plugins.model.Videohitlist;
import de.uhh.l2g.plugins.model.VideohitlistModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Videohitlist service. Represents a row in the &quot;LG_Videohitlist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.VideohitlistModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VideohitlistImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see VideohitlistImpl
 * @see de.uhh.l2g.plugins.model.Videohitlist
 * @see de.uhh.l2g.plugins.model.VideohitlistModel
 * @generated
 */
public class VideohitlistModelImpl extends BaseModelImpl<Videohitlist>
	implements VideohitlistModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a videohitlist model instance should use the {@link de.uhh.l2g.plugins.model.Videohitlist} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Videohitlist";
	public static final Object[][] TABLE_COLUMNS = {
			{ "videohitlistId", Types.INTEGER },
			{ "hitsPerDay", Types.INTEGER },
			{ "hitsPerWeek", Types.INTEGER },
			{ "hitsPerMonth", Types.INTEGER },
			{ "hitsPerYear", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_Videohitlist (videohitlistId INTEGER not null primary key,hitsPerDay INTEGER,hitsPerWeek INTEGER,hitsPerMonth INTEGER,hitsPerYear INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table LG_Videohitlist";
	public static final String ORDER_BY_JPQL = " ORDER BY videohitlist.videohitlistId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Videohitlist.videohitlistId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Videohitlist"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Videohitlist"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Videohitlist"));

	public VideohitlistModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _videohitlistId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setVideohitlistId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _videohitlistId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Videohitlist.class;
	}

	@Override
	public String getModelClassName() {
		return Videohitlist.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("videohitlistId", getVideohitlistId());
		attributes.put("hitsPerDay", getHitsPerDay());
		attributes.put("hitsPerWeek", getHitsPerWeek());
		attributes.put("hitsPerMonth", getHitsPerMonth());
		attributes.put("hitsPerYear", getHitsPerYear());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer videohitlistId = (Integer)attributes.get("videohitlistId");

		if (videohitlistId != null) {
			setVideohitlistId(videohitlistId);
		}

		Integer hitsPerDay = (Integer)attributes.get("hitsPerDay");

		if (hitsPerDay != null) {
			setHitsPerDay(hitsPerDay);
		}

		Integer hitsPerWeek = (Integer)attributes.get("hitsPerWeek");

		if (hitsPerWeek != null) {
			setHitsPerWeek(hitsPerWeek);
		}

		Integer hitsPerMonth = (Integer)attributes.get("hitsPerMonth");

		if (hitsPerMonth != null) {
			setHitsPerMonth(hitsPerMonth);
		}

		Integer hitsPerYear = (Integer)attributes.get("hitsPerYear");

		if (hitsPerYear != null) {
			setHitsPerYear(hitsPerYear);
		}
	}

	@Override
	public int getVideohitlistId() {
		return _videohitlistId;
	}

	@Override
	public void setVideohitlistId(int videohitlistId) {
		_videohitlistId = videohitlistId;
	}

	@Override
	public int getHitsPerDay() {
		return _hitsPerDay;
	}

	@Override
	public void setHitsPerDay(int hitsPerDay) {
		_hitsPerDay = hitsPerDay;
	}

	@Override
	public int getHitsPerWeek() {
		return _hitsPerWeek;
	}

	@Override
	public void setHitsPerWeek(int hitsPerWeek) {
		_hitsPerWeek = hitsPerWeek;
	}

	@Override
	public int getHitsPerMonth() {
		return _hitsPerMonth;
	}

	@Override
	public void setHitsPerMonth(int hitsPerMonth) {
		_hitsPerMonth = hitsPerMonth;
	}

	@Override
	public int getHitsPerYear() {
		return _hitsPerYear;
	}

	@Override
	public void setHitsPerYear(int hitsPerYear) {
		_hitsPerYear = hitsPerYear;
	}

	@Override
	public Videohitlist toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Videohitlist)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VideohitlistImpl videohitlistImpl = new VideohitlistImpl();

		videohitlistImpl.setVideohitlistId(getVideohitlistId());
		videohitlistImpl.setHitsPerDay(getHitsPerDay());
		videohitlistImpl.setHitsPerWeek(getHitsPerWeek());
		videohitlistImpl.setHitsPerMonth(getHitsPerMonth());
		videohitlistImpl.setHitsPerYear(getHitsPerYear());

		videohitlistImpl.resetOriginalValues();

		return videohitlistImpl;
	}

	@Override
	public int compareTo(Videohitlist videohitlist) {
		int primaryKey = videohitlist.getPrimaryKey();

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

		if (!(obj instanceof Videohitlist)) {
			return false;
		}

		Videohitlist videohitlist = (Videohitlist)obj;

		int primaryKey = videohitlist.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Videohitlist> toCacheModel() {
		VideohitlistCacheModel videohitlistCacheModel = new VideohitlistCacheModel();

		videohitlistCacheModel.videohitlistId = getVideohitlistId();

		videohitlistCacheModel.hitsPerDay = getHitsPerDay();

		videohitlistCacheModel.hitsPerWeek = getHitsPerWeek();

		videohitlistCacheModel.hitsPerMonth = getHitsPerMonth();

		videohitlistCacheModel.hitsPerYear = getHitsPerYear();

		return videohitlistCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{videohitlistId=");
		sb.append(getVideohitlistId());
		sb.append(", hitsPerDay=");
		sb.append(getHitsPerDay());
		sb.append(", hitsPerWeek=");
		sb.append(getHitsPerWeek());
		sb.append(", hitsPerMonth=");
		sb.append(getHitsPerMonth());
		sb.append(", hitsPerYear=");
		sb.append(getHitsPerYear());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Videohitlist");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>videohitlistId</column-name><column-value><![CDATA[");
		sb.append(getVideohitlistId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hitsPerDay</column-name><column-value><![CDATA[");
		sb.append(getHitsPerDay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hitsPerWeek</column-name><column-value><![CDATA[");
		sb.append(getHitsPerWeek());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hitsPerMonth</column-name><column-value><![CDATA[");
		sb.append(getHitsPerMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hitsPerYear</column-name><column-value><![CDATA[");
		sb.append(getHitsPerYear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Videohitlist.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Videohitlist.class
		};
	private int _videohitlistId;
	private int _hitsPerDay;
	private int _hitsPerWeek;
	private int _hitsPerMonth;
	private int _hitsPerYear;
	private Videohitlist _escapedModel;
}