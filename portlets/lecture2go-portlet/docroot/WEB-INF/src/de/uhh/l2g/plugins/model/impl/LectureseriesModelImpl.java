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

package de.uhh.l2g.plugins.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.uhh.l2g.plugins.model.Lectureseries;
import de.uhh.l2g.plugins.model.LectureseriesModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Lectureseries service. Represents a row in the &quot;LG_Lectureseries&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.LectureseriesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LectureseriesImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see LectureseriesImpl
 * @see de.uhh.l2g.plugins.model.Lectureseries
 * @see de.uhh.l2g.plugins.model.LectureseriesModel
 * @generated
 */
public class LectureseriesModelImpl extends BaseModelImpl<Lectureseries>
	implements LectureseriesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lectureseries model instance should use the {@link de.uhh.l2g.plugins.model.Lectureseries} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Lectureseries";
	public static final Object[][] TABLE_COLUMNS = {
			{ "number_", Types.VARCHAR },
			{ "eventType", Types.VARCHAR },
			{ "categoryId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "shortDesc", Types.VARCHAR },
			{ "termId", Types.BIGINT },
			{ "language", Types.VARCHAR },
			{ "facultyName", Types.VARCHAR },
			{ "lectureseriesId", Types.BIGINT },
			{ "password_", Types.VARCHAR },
			{ "approved", Types.INTEGER },
			{ "longDesc", Types.CLOB },
			{ "latestOpenAccessVideoId", Types.BIGINT },
			{ "latestVideoUploadDate", Types.TIMESTAMP },
			{ "latestVideoGenerationDate", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_Lectureseries (number_ VARCHAR(75) null,eventType VARCHAR(75) null,categoryId LONG,name VARCHAR(75) null,shortDesc VARCHAR(75) null,termId LONG,language VARCHAR(75) null,facultyName VARCHAR(75) null,lectureseriesId LONG not null primary key,password_ VARCHAR(75) null,approved INTEGER,longDesc TEXT null,latestOpenAccessVideoId LONG,latestVideoUploadDate DATE null,latestVideoGenerationDate VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table LG_Lectureseries";
	public static final String ORDER_BY_JPQL = " ORDER BY lectureseries.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Lectureseries.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Lectureseries"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Lectureseries"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.de.uhh.l2g.plugins.model.Lectureseries"),
			true);
	public static long APPROVED_COLUMN_BITMASK = 1L;
	public static long CATEGORYID_COLUMN_BITMASK = 2L;
	public static long EVENTTYPE_COLUMN_BITMASK = 4L;
	public static long FACULTYNAME_COLUMN_BITMASK = 8L;
	public static long LANGUAGE_COLUMN_BITMASK = 16L;
	public static long LATESTOPENACCESSVIDEOID_COLUMN_BITMASK = 32L;
	public static long LATESTVIDEOGENERATIONDATE_COLUMN_BITMASK = 64L;
	public static long LATESTVIDEOUPLOADDATE_COLUMN_BITMASK = 128L;
	public static long NAME_COLUMN_BITMASK = 256L;
	public static long NUMBER_COLUMN_BITMASK = 512L;
	public static long PASSWORD_COLUMN_BITMASK = 1024L;
	public static long TERMID_COLUMN_BITMASK = 2048L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Lectureseries"));

	public LectureseriesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _lectureseriesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLectureseriesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lectureseriesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Lectureseries.class;
	}

	@Override
	public String getModelClassName() {
		return Lectureseries.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("number", getNumber());
		attributes.put("eventType", getEventType());
		attributes.put("categoryId", getCategoryId());
		attributes.put("name", getName());
		attributes.put("shortDesc", getShortDesc());
		attributes.put("termId", getTermId());
		attributes.put("language", getLanguage());
		attributes.put("facultyName", getFacultyName());
		attributes.put("lectureseriesId", getLectureseriesId());
		attributes.put("password", getPassword());
		attributes.put("approved", getApproved());
		attributes.put("longDesc", getLongDesc());
		attributes.put("latestOpenAccessVideoId", getLatestOpenAccessVideoId());
		attributes.put("latestVideoUploadDate", getLatestVideoUploadDate());
		attributes.put("latestVideoGenerationDate",
			getLatestVideoGenerationDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String shortDesc = (String)attributes.get("shortDesc");

		if (shortDesc != null) {
			setShortDesc(shortDesc);
		}

		Long termId = (Long)attributes.get("termId");

		if (termId != null) {
			setTermId(termId);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		String facultyName = (String)attributes.get("facultyName");

		if (facultyName != null) {
			setFacultyName(facultyName);
		}

		Long lectureseriesId = (Long)attributes.get("lectureseriesId");

		if (lectureseriesId != null) {
			setLectureseriesId(lectureseriesId);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Integer approved = (Integer)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
		}

		String longDesc = (String)attributes.get("longDesc");

		if (longDesc != null) {
			setLongDesc(longDesc);
		}

		Long latestOpenAccessVideoId = (Long)attributes.get(
				"latestOpenAccessVideoId");

		if (latestOpenAccessVideoId != null) {
			setLatestOpenAccessVideoId(latestOpenAccessVideoId);
		}

		Date latestVideoUploadDate = (Date)attributes.get(
				"latestVideoUploadDate");

		if (latestVideoUploadDate != null) {
			setLatestVideoUploadDate(latestVideoUploadDate);
		}

		String latestVideoGenerationDate = (String)attributes.get(
				"latestVideoGenerationDate");

		if (latestVideoGenerationDate != null) {
			setLatestVideoGenerationDate(latestVideoGenerationDate);
		}
	}

	@Override
	public String getNumber() {
		if (_number == null) {
			return StringPool.BLANK;
		}
		else {
			return _number;
		}
	}

	@Override
	public void setNumber(String number) {
		_columnBitmask |= NUMBER_COLUMN_BITMASK;

		if (_originalNumber == null) {
			_originalNumber = _number;
		}

		_number = number;
	}

	public String getOriginalNumber() {
		return GetterUtil.getString(_originalNumber);
	}

	@Override
	public String getEventType() {
		if (_eventType == null) {
			return StringPool.BLANK;
		}
		else {
			return _eventType;
		}
	}

	@Override
	public void setEventType(String eventType) {
		_columnBitmask |= EVENTTYPE_COLUMN_BITMASK;

		if (_originalEventType == null) {
			_originalEventType = _eventType;
		}

		_eventType = eventType;
	}

	public String getOriginalEventType() {
		return GetterUtil.getString(_originalEventType);
	}

	@Override
	public long getCategoryId() {
		return _categoryId;
	}

	@Override
	public void setCategoryId(long categoryId) {
		_columnBitmask |= CATEGORYID_COLUMN_BITMASK;

		if (!_setOriginalCategoryId) {
			_setOriginalCategoryId = true;

			_originalCategoryId = _categoryId;
		}

		_categoryId = categoryId;
	}

	public long getOriginalCategoryId() {
		return _originalCategoryId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@Override
	public String getShortDesc() {
		if (_shortDesc == null) {
			return StringPool.BLANK;
		}
		else {
			return _shortDesc;
		}
	}

	@Override
	public void setShortDesc(String shortDesc) {
		_shortDesc = shortDesc;
	}

	@Override
	public long getTermId() {
		return _termId;
	}

	@Override
	public void setTermId(long termId) {
		_columnBitmask |= TERMID_COLUMN_BITMASK;

		if (!_setOriginalTermId) {
			_setOriginalTermId = true;

			_originalTermId = _termId;
		}

		_termId = termId;
	}

	public long getOriginalTermId() {
		return _originalTermId;
	}

	@Override
	public String getLanguage() {
		if (_language == null) {
			return StringPool.BLANK;
		}
		else {
			return _language;
		}
	}

	@Override
	public void setLanguage(String language) {
		_columnBitmask |= LANGUAGE_COLUMN_BITMASK;

		if (_originalLanguage == null) {
			_originalLanguage = _language;
		}

		_language = language;
	}

	public String getOriginalLanguage() {
		return GetterUtil.getString(_originalLanguage);
	}

	@Override
	public String getFacultyName() {
		if (_facultyName == null) {
			return StringPool.BLANK;
		}
		else {
			return _facultyName;
		}
	}

	@Override
	public void setFacultyName(String facultyName) {
		_columnBitmask |= FACULTYNAME_COLUMN_BITMASK;

		if (_originalFacultyName == null) {
			_originalFacultyName = _facultyName;
		}

		_facultyName = facultyName;
	}

	public String getOriginalFacultyName() {
		return GetterUtil.getString(_originalFacultyName);
	}

	@Override
	public long getLectureseriesId() {
		return _lectureseriesId;
	}

	@Override
	public void setLectureseriesId(long lectureseriesId) {
		_lectureseriesId = lectureseriesId;
	}

	@Override
	public String getPassword() {
		if (_password == null) {
			return StringPool.BLANK;
		}
		else {
			return _password;
		}
	}

	@Override
	public void setPassword(String password) {
		_columnBitmask |= PASSWORD_COLUMN_BITMASK;

		if (_originalPassword == null) {
			_originalPassword = _password;
		}

		_password = password;
	}

	public String getOriginalPassword() {
		return GetterUtil.getString(_originalPassword);
	}

	@Override
	public int getApproved() {
		return _approved;
	}

	@Override
	public void setApproved(int approved) {
		_columnBitmask |= APPROVED_COLUMN_BITMASK;

		if (!_setOriginalApproved) {
			_setOriginalApproved = true;

			_originalApproved = _approved;
		}

		_approved = approved;
	}

	public int getOriginalApproved() {
		return _originalApproved;
	}

	@Override
	public String getLongDesc() {
		if (_longDesc == null) {
			return StringPool.BLANK;
		}
		else {
			return _longDesc;
		}
	}

	@Override
	public void setLongDesc(String longDesc) {
		_longDesc = longDesc;
	}

	@Override
	public long getLatestOpenAccessVideoId() {
		return _latestOpenAccessVideoId;
	}

	@Override
	public void setLatestOpenAccessVideoId(long latestOpenAccessVideoId) {
		_columnBitmask |= LATESTOPENACCESSVIDEOID_COLUMN_BITMASK;

		if (!_setOriginalLatestOpenAccessVideoId) {
			_setOriginalLatestOpenAccessVideoId = true;

			_originalLatestOpenAccessVideoId = _latestOpenAccessVideoId;
		}

		_latestOpenAccessVideoId = latestOpenAccessVideoId;
	}

	public long getOriginalLatestOpenAccessVideoId() {
		return _originalLatestOpenAccessVideoId;
	}

	@Override
	public Date getLatestVideoUploadDate() {
		return _latestVideoUploadDate;
	}

	@Override
	public void setLatestVideoUploadDate(Date latestVideoUploadDate) {
		_columnBitmask |= LATESTVIDEOUPLOADDATE_COLUMN_BITMASK;

		if (_originalLatestVideoUploadDate == null) {
			_originalLatestVideoUploadDate = _latestVideoUploadDate;
		}

		_latestVideoUploadDate = latestVideoUploadDate;
	}

	public Date getOriginalLatestVideoUploadDate() {
		return _originalLatestVideoUploadDate;
	}

	@Override
	public String getLatestVideoGenerationDate() {
		if (_latestVideoGenerationDate == null) {
			return StringPool.BLANK;
		}
		else {
			return _latestVideoGenerationDate;
		}
	}

	@Override
	public void setLatestVideoGenerationDate(String latestVideoGenerationDate) {
		_columnBitmask |= LATESTVIDEOGENERATIONDATE_COLUMN_BITMASK;

		if (_originalLatestVideoGenerationDate == null) {
			_originalLatestVideoGenerationDate = _latestVideoGenerationDate;
		}

		_latestVideoGenerationDate = latestVideoGenerationDate;
	}

	public String getOriginalLatestVideoGenerationDate() {
		return GetterUtil.getString(_originalLatestVideoGenerationDate);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Lectureseries.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Lectureseries toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Lectureseries)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LectureseriesImpl lectureseriesImpl = new LectureseriesImpl();

		lectureseriesImpl.setNumber(getNumber());
		lectureseriesImpl.setEventType(getEventType());
		lectureseriesImpl.setCategoryId(getCategoryId());
		lectureseriesImpl.setName(getName());
		lectureseriesImpl.setShortDesc(getShortDesc());
		lectureseriesImpl.setTermId(getTermId());
		lectureseriesImpl.setLanguage(getLanguage());
		lectureseriesImpl.setFacultyName(getFacultyName());
		lectureseriesImpl.setLectureseriesId(getLectureseriesId());
		lectureseriesImpl.setPassword(getPassword());
		lectureseriesImpl.setApproved(getApproved());
		lectureseriesImpl.setLongDesc(getLongDesc());
		lectureseriesImpl.setLatestOpenAccessVideoId(getLatestOpenAccessVideoId());
		lectureseriesImpl.setLatestVideoUploadDate(getLatestVideoUploadDate());
		lectureseriesImpl.setLatestVideoGenerationDate(getLatestVideoGenerationDate());

		lectureseriesImpl.resetOriginalValues();

		return lectureseriesImpl;
	}

	@Override
	public int compareTo(Lectureseries lectureseries) {
		int value = 0;

		value = getName().compareTo(lectureseries.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Lectureseries)) {
			return false;
		}

		Lectureseries lectureseries = (Lectureseries)obj;

		long primaryKey = lectureseries.getPrimaryKey();

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
		LectureseriesModelImpl lectureseriesModelImpl = this;

		lectureseriesModelImpl._originalNumber = lectureseriesModelImpl._number;

		lectureseriesModelImpl._originalEventType = lectureseriesModelImpl._eventType;

		lectureseriesModelImpl._originalCategoryId = lectureseriesModelImpl._categoryId;

		lectureseriesModelImpl._setOriginalCategoryId = false;

		lectureseriesModelImpl._originalName = lectureseriesModelImpl._name;

		lectureseriesModelImpl._originalTermId = lectureseriesModelImpl._termId;

		lectureseriesModelImpl._setOriginalTermId = false;

		lectureseriesModelImpl._originalLanguage = lectureseriesModelImpl._language;

		lectureseriesModelImpl._originalFacultyName = lectureseriesModelImpl._facultyName;

		lectureseriesModelImpl._originalPassword = lectureseriesModelImpl._password;

		lectureseriesModelImpl._originalApproved = lectureseriesModelImpl._approved;

		lectureseriesModelImpl._setOriginalApproved = false;

		lectureseriesModelImpl._originalLatestOpenAccessVideoId = lectureseriesModelImpl._latestOpenAccessVideoId;

		lectureseriesModelImpl._setOriginalLatestOpenAccessVideoId = false;

		lectureseriesModelImpl._originalLatestVideoUploadDate = lectureseriesModelImpl._latestVideoUploadDate;

		lectureseriesModelImpl._originalLatestVideoGenerationDate = lectureseriesModelImpl._latestVideoGenerationDate;

		lectureseriesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Lectureseries> toCacheModel() {
		LectureseriesCacheModel lectureseriesCacheModel = new LectureseriesCacheModel();

		lectureseriesCacheModel.number = getNumber();

		String number = lectureseriesCacheModel.number;

		if ((number != null) && (number.length() == 0)) {
			lectureseriesCacheModel.number = null;
		}

		lectureseriesCacheModel.eventType = getEventType();

		String eventType = lectureseriesCacheModel.eventType;

		if ((eventType != null) && (eventType.length() == 0)) {
			lectureseriesCacheModel.eventType = null;
		}

		lectureseriesCacheModel.categoryId = getCategoryId();

		lectureseriesCacheModel.name = getName();

		String name = lectureseriesCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			lectureseriesCacheModel.name = null;
		}

		lectureseriesCacheModel.shortDesc = getShortDesc();

		String shortDesc = lectureseriesCacheModel.shortDesc;

		if ((shortDesc != null) && (shortDesc.length() == 0)) {
			lectureseriesCacheModel.shortDesc = null;
		}

		lectureseriesCacheModel.termId = getTermId();

		lectureseriesCacheModel.language = getLanguage();

		String language = lectureseriesCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			lectureseriesCacheModel.language = null;
		}

		lectureseriesCacheModel.facultyName = getFacultyName();

		String facultyName = lectureseriesCacheModel.facultyName;

		if ((facultyName != null) && (facultyName.length() == 0)) {
			lectureseriesCacheModel.facultyName = null;
		}

		lectureseriesCacheModel.lectureseriesId = getLectureseriesId();

		lectureseriesCacheModel.password = getPassword();

		String password = lectureseriesCacheModel.password;

		if ((password != null) && (password.length() == 0)) {
			lectureseriesCacheModel.password = null;
		}

		lectureseriesCacheModel.approved = getApproved();

		lectureseriesCacheModel.longDesc = getLongDesc();

		String longDesc = lectureseriesCacheModel.longDesc;

		if ((longDesc != null) && (longDesc.length() == 0)) {
			lectureseriesCacheModel.longDesc = null;
		}

		lectureseriesCacheModel.latestOpenAccessVideoId = getLatestOpenAccessVideoId();

		Date latestVideoUploadDate = getLatestVideoUploadDate();

		if (latestVideoUploadDate != null) {
			lectureseriesCacheModel.latestVideoUploadDate = latestVideoUploadDate.getTime();
		}
		else {
			lectureseriesCacheModel.latestVideoUploadDate = Long.MIN_VALUE;
		}

		lectureseriesCacheModel.latestVideoGenerationDate = getLatestVideoGenerationDate();

		String latestVideoGenerationDate = lectureseriesCacheModel.latestVideoGenerationDate;

		if ((latestVideoGenerationDate != null) &&
				(latestVideoGenerationDate.length() == 0)) {
			lectureseriesCacheModel.latestVideoGenerationDate = null;
		}

		return lectureseriesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{number=");
		sb.append(getNumber());
		sb.append(", eventType=");
		sb.append(getEventType());
		sb.append(", categoryId=");
		sb.append(getCategoryId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", shortDesc=");
		sb.append(getShortDesc());
		sb.append(", termId=");
		sb.append(getTermId());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", facultyName=");
		sb.append(getFacultyName());
		sb.append(", lectureseriesId=");
		sb.append(getLectureseriesId());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", approved=");
		sb.append(getApproved());
		sb.append(", longDesc=");
		sb.append(getLongDesc());
		sb.append(", latestOpenAccessVideoId=");
		sb.append(getLatestOpenAccessVideoId());
		sb.append(", latestVideoUploadDate=");
		sb.append(getLatestVideoUploadDate());
		sb.append(", latestVideoGenerationDate=");
		sb.append(getLatestVideoGenerationDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Lectureseries");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>number</column-name><column-value><![CDATA[");
		sb.append(getNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventType</column-name><column-value><![CDATA[");
		sb.append(getEventType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shortDesc</column-name><column-value><![CDATA[");
		sb.append(getShortDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>termId</column-name><column-value><![CDATA[");
		sb.append(getTermId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facultyName</column-name><column-value><![CDATA[");
		sb.append(getFacultyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lectureseriesId</column-name><column-value><![CDATA[");
		sb.append(getLectureseriesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approved</column-name><column-value><![CDATA[");
		sb.append(getApproved());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>longDesc</column-name><column-value><![CDATA[");
		sb.append(getLongDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestOpenAccessVideoId</column-name><column-value><![CDATA[");
		sb.append(getLatestOpenAccessVideoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestVideoUploadDate</column-name><column-value><![CDATA[");
		sb.append(getLatestVideoUploadDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestVideoGenerationDate</column-name><column-value><![CDATA[");
		sb.append(getLatestVideoGenerationDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Lectureseries.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Lectureseries.class
		};
	private String _number;
	private String _originalNumber;
	private String _eventType;
	private String _originalEventType;
	private long _categoryId;
	private long _originalCategoryId;
	private boolean _setOriginalCategoryId;
	private String _name;
	private String _originalName;
	private String _shortDesc;
	private long _termId;
	private long _originalTermId;
	private boolean _setOriginalTermId;
	private String _language;
	private String _originalLanguage;
	private String _facultyName;
	private String _originalFacultyName;
	private long _lectureseriesId;
	private String _password;
	private String _originalPassword;
	private int _approved;
	private int _originalApproved;
	private boolean _setOriginalApproved;
	private String _longDesc;
	private long _latestOpenAccessVideoId;
	private long _originalLatestOpenAccessVideoId;
	private boolean _setOriginalLatestOpenAccessVideoId;
	private Date _latestVideoUploadDate;
	private Date _originalLatestVideoUploadDate;
	private String _latestVideoGenerationDate;
	private String _originalLatestVideoGenerationDate;
	private long _columnBitmask;
	private Lectureseries _escapedModel;
}