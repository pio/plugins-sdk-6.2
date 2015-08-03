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

import de.uhh.l2g.plugins.model.Metadata;
import de.uhh.l2g.plugins.model.MetadataModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Metadata service. Represents a row in the &quot;LG_Metadata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.MetadataModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MetadataImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see MetadataImpl
 * @see de.uhh.l2g.plugins.model.Metadata
 * @see de.uhh.l2g.plugins.model.MetadataModel
 * @generated
 */
public class MetadataModelImpl extends BaseModelImpl<Metadata>
	implements MetadataModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a metadata model instance should use the {@link de.uhh.l2g.plugins.model.Metadata} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Metadata";
	public static final Object[][] TABLE_COLUMNS = {
			{ "metadataId", Types.BIGINT },
			{ "type_", Types.VARCHAR },
			{ "language", Types.VARCHAR },
			{ "title", Types.VARCHAR },
			{ "subject", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "publisher", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_Metadata (metadataId LONG not null primary key,type_ VARCHAR(75) null,language VARCHAR(75) null,title VARCHAR(75) null,subject VARCHAR(75) null,description STRING null,publisher VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table LG_Metadata";
	public static final String ORDER_BY_JPQL = " ORDER BY metadata.metadataId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Metadata.metadataId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Metadata"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Metadata"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Metadata"));

	public MetadataModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _metadataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMetadataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _metadataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Metadata.class;
	}

	@Override
	public String getModelClassName() {
		return Metadata.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("metadataId", getMetadataId());
		attributes.put("type", getType());
		attributes.put("language", getLanguage());
		attributes.put("title", getTitle());
		attributes.put("subject", getSubject());
		attributes.put("description", getDescription());
		attributes.put("publisher", getPublisher());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long metadataId = (Long)attributes.get("metadataId");

		if (metadataId != null) {
			setMetadataId(metadataId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String publisher = (String)attributes.get("publisher");

		if (publisher != null) {
			setPublisher(publisher);
		}
	}

	@Override
	public long getMetadataId() {
		return _metadataId;
	}

	@Override
	public void setMetadataId(long metadataId) {
		_metadataId = metadataId;
	}

	@Override
	public String getType() {
		if (_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _type;
		}
	}

	@Override
	public void setType(String type) {
		_type = type;
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
		_language = language;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public String getSubject() {
		if (_subject == null) {
			return StringPool.BLANK;
		}
		else {
			return _subject;
		}
	}

	@Override
	public void setSubject(String subject) {
		_subject = subject;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getPublisher() {
		if (_publisher == null) {
			return StringPool.BLANK;
		}
		else {
			return _publisher;
		}
	}

	@Override
	public void setPublisher(String publisher) {
		_publisher = publisher;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Metadata.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Metadata toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Metadata)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MetadataImpl metadataImpl = new MetadataImpl();

		metadataImpl.setMetadataId(getMetadataId());
		metadataImpl.setType(getType());
		metadataImpl.setLanguage(getLanguage());
		metadataImpl.setTitle(getTitle());
		metadataImpl.setSubject(getSubject());
		metadataImpl.setDescription(getDescription());
		metadataImpl.setPublisher(getPublisher());

		metadataImpl.resetOriginalValues();

		return metadataImpl;
	}

	@Override
	public int compareTo(Metadata metadata) {
		long primaryKey = metadata.getPrimaryKey();

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

		if (!(obj instanceof Metadata)) {
			return false;
		}

		Metadata metadata = (Metadata)obj;

		long primaryKey = metadata.getPrimaryKey();

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
	public CacheModel<Metadata> toCacheModel() {
		MetadataCacheModel metadataCacheModel = new MetadataCacheModel();

		metadataCacheModel.metadataId = getMetadataId();

		metadataCacheModel.type = getType();

		String type = metadataCacheModel.type;

		if ((type != null) && (type.length() == 0)) {
			metadataCacheModel.type = null;
		}

		metadataCacheModel.language = getLanguage();

		String language = metadataCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			metadataCacheModel.language = null;
		}

		metadataCacheModel.title = getTitle();

		String title = metadataCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			metadataCacheModel.title = null;
		}

		metadataCacheModel.subject = getSubject();

		String subject = metadataCacheModel.subject;

		if ((subject != null) && (subject.length() == 0)) {
			metadataCacheModel.subject = null;
		}

		metadataCacheModel.description = getDescription();

		String description = metadataCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			metadataCacheModel.description = null;
		}

		metadataCacheModel.publisher = getPublisher();

		String publisher = metadataCacheModel.publisher;

		if ((publisher != null) && (publisher.length() == 0)) {
			metadataCacheModel.publisher = null;
		}

		return metadataCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{metadataId=");
		sb.append(getMetadataId());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", subject=");
		sb.append(getSubject());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", publisher=");
		sb.append(getPublisher());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Metadata");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>metadataId</column-name><column-value><![CDATA[");
		sb.append(getMetadataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subject</column-name><column-value><![CDATA[");
		sb.append(getSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publisher</column-name><column-value><![CDATA[");
		sb.append(getPublisher());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Metadata.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Metadata.class
		};
	private long _metadataId;
	private String _type;
	private String _language;
	private String _title;
	private String _subject;
	private String _description;
	private String _publisher;
	private Metadata _escapedModel;
}