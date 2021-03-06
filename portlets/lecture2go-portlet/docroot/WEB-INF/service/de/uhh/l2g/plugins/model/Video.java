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

package de.uhh.l2g.plugins.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Video service. Represents a row in the &quot;LG_Video&quot; database table, with each column mapped to a property of this class.
 *
 * @author Iavor Sturm
 * @see VideoModel
 * @see de.uhh.l2g.plugins.model.impl.VideoImpl
 * @see de.uhh.l2g.plugins.model.impl.VideoModelImpl
 * @generated
 */
public interface Video extends VideoModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link de.uhh.l2g.plugins.model.impl.VideoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public java.lang.String getLectureseriesName();

	public void setLectureseriesName(java.lang.String lectureseriesName);

	public java.lang.String getLectureseriesNumber();

	public void setLectureseriesNumber(java.lang.String lectureseriesNumber);

	public java.lang.String getCreatorFullName();

	public void setCreatorFullName(java.lang.String creatorFullName);

	public java.lang.String getLectureseriesUrl();

	public void setLectureseriesUrl(java.lang.String lectureseriesUrl);

	public java.lang.Integer getAccessPermitted();

	public void setAccessPermitted(java.lang.Integer accessPermitted);

	public java.util.ArrayList<java.lang.String> getPlayerUris();

	public void setPlayerUris(java.util.ArrayList<java.lang.String> playerUris);

	public java.lang.String getEmbedIframe();

	public void setEmbedIframe(java.lang.String embedIframe);

	public java.lang.String getEmbedHtml5();

	public void setEmbedHtml5(java.lang.String embedHtml5);

	public java.lang.String getVttChapterFile();

	public void setVttChapterFile(java.lang.String vttChapterFile);

	public java.lang.String getVttThumbsFilde();

	public void setVttThumbsFilde(java.lang.String vttThumbsFilde);

	public java.lang.String getMp4RssLink();

	public void setMp4RssLink(java.lang.String mp4RssLink);

	public java.lang.String getMp3RssLink();

	public void setMp3RssLink(java.lang.String mp3RssLink);

	public java.lang.String getM4vRssLink();

	public void setM4vRssLink(java.lang.String m4vRssLink);

	public java.lang.String getM4aRssLink();

	public void setM4aRssLink(java.lang.String m4aRssLink);

	public java.lang.String getOggRssLink();

	public void setOggRssLink(java.lang.String oggRssLink);

	public java.lang.String getFlvRssLink();

	public void setFlvRssLink(java.lang.String flvRssLink);

	public java.lang.String getWebmRssLink();

	public void setWebmRssLink(java.lang.String webmRssLink);

	public boolean isHasChapters();

	public void setHasChapters(boolean hasChapters);

	public boolean isHasComments();

	public void setHasComments(boolean hasComments);

	public java.lang.String getUrl();

	public void setUrl(java.lang.String url);

	public java.lang.String getSecureUrl();

	public void setSecureUrl(java.lang.String secureUrl);

	public java.io.File getMp4File();

	public void setMp4File(java.io.File mp4File);

	public java.io.File getPdfFile();

	public void setPdfFile(java.io.File pdfFile);

	public java.io.File getMp3File();

	public void setMp3File(java.io.File mp3File);

	public java.io.File getM4vFile();

	public void setM4vFile(java.io.File m4vFile);

	public java.io.File getM4aFile();

	public void setM4aFile(java.io.File m4aFile);

	public java.lang.String getMp4DownloadLink();

	public void setMp4DownloadLink(java.lang.String mp4DownloadLink);

	public java.lang.String getPdfDownloadLink();

	public void setPdfDownloadLink(java.lang.String pdfDownloadLink);

	public java.lang.String getMp3DownloadLink();

	public void setMp3DownloadLink(java.lang.String mp3DownloadLink);

	public java.lang.String getM4vDownloadLink();

	public void setM4vDownloadLink(java.lang.String m4vDownloadLink);

	public java.lang.String getM4aDownloadLink();

	public void setM4aDownloadLink(java.lang.String m4aDownloadLink);

	public java.lang.String getFlvDownloadLink();

	public void setFlvDownloadLink(java.lang.String flvDownloadLink);

	public java.lang.String getOggDownloadLink();

	public void setOggDownloadLink(java.lang.String oggDownloadLink);

	public java.lang.String getWebmDownloadLink();

	public void setWebmDownloadLink(java.lang.String webmDownloadLink);

	public java.io.File getFlvFile();

	public void setFlvFile(java.io.File flvFile);

	public java.io.File getOggFile();

	public void setOggFile(java.io.File oggFile);

	public java.io.File getWebmFile();

	public void setWebmFile(java.io.File webmFile);

	public java.lang.String getDate();

	public void setDate(java.lang.String date);

	public java.lang.String getSimpleDate();

	public void setSimpleDate(java.lang.String simpleDate);

	public java.lang.String getBitrate();

	public void setBitrate(java.lang.String bitrate);

	public java.lang.String getImage();

	public void setImage(java.lang.String image);

	public java.lang.String getImageSmall();

	public void setImageSmall(java.lang.String imageSmall);

	public java.lang.String getImageMedium();

	public void setImageMedium(java.lang.String imageMedium);

	public java.lang.String getShortTitle();

	public void setShortTitle(java.lang.String shortTitle);

	public java.lang.String getShortName();

	public void setShortName(java.lang.String shortName);

	public java.lang.String getSPreffix();

	public java.lang.String getPreffix();

	public java.lang.String getCreators();

	public void setCreators(java.lang.String creators);
}