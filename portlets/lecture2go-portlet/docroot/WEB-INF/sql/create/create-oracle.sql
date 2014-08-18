drop user &1 cascade;
create user &1 identified by &2;
grant connect,resource to &1;
connect &1/&2;
set define off;

create table LG_Coordinator (
	coordinatorId number(30,0) not null primary key,
	facilityId number(30,0),
	officeId number(30,0)
);

create table LG_Facility (
	facilityId number(30,0) not null primary key,
	parentId number(30,0),
	name VARCHAR2(75 CHAR) null,
	typ VARCHAR2(75 CHAR) null,
	www VARCHAR2(75 CHAR) null,
	level number(30,0),
	sort number(30,0)
);

create table LG_Facility_Host (
	fasilityHostId number(30,0) not null primary key,
	facilityId number(30,0),
	hostId number(30,0)
);

create table LG_Host (
	hostId number(30,0) not null primary key,
	protocol VARCHAR2(75 CHAR) null,
	streamer VARCHAR2(75 CHAR) null,
	port number(30,0),
	serverRoot VARCHAR2(75 CHAR) null,
	name VARCHAR2(75 CHAR) null
);

create table LG_Lastvideolist (
	lastvideolistId number(30,0) not null primary key,
	videoId number(30,0)
);

create table LG_Lectureseries (
	lectureseriesId number(30,0) not null primary key,
	number_ VARCHAR2(75 CHAR) null,
	eventType VARCHAR2(75 CHAR) null,
	eventCategory VARCHAR2(75 CHAR) null,
	name VARCHAR2(75 CHAR) null,
	shortDesc VARCHAR2(75 CHAR) null,
	semesterName VARCHAR2(75 CHAR) null,
	language VARCHAR2(75 CHAR) null,
	facultyName VARCHAR2(75 CHAR) null,
	instructorsString VARCHAR2(75 CHAR) null,
	password_ VARCHAR2(75 CHAR) null,
	approved number(30,0),
	longDesc VARCHAR2(75 CHAR) null
);

create table LG_Lectureseries_Facility (
	lectureseriesFacilityId number(30,0) not null primary key,
	lectureseriesId number(30,0),
	facilityId number(30,0)
);

create table LG_License (
	licenseId number(30,0) not null primary key,
	videoId number(30,0),
	ccby VARCHAR2(75 CHAR) null,
	ccbybc VARCHAR2(75 CHAR) null,
	ccbyncnd VARCHAR2(75 CHAR) null,
	ccbyncsa VARCHAR2(75 CHAR) null,
	ccbysa VARCHAR2(75 CHAR) null,
	ccbync VARCHAR2(75 CHAR) null,
	l2go VARCHAR2(75 CHAR) null
);

create table LG_Metadata (
	metadataId number(30,0) not null primary key,
	URLID VARCHAR2(75 CHAR) null,
	format VARCHAR2(75 CHAR) null,
	type_ VARCHAR2(75 CHAR) null,
	language VARCHAR2(75 CHAR) null,
	title VARCHAR2(75 CHAR) null,
	subject VARCHAR2(75 CHAR) null,
	coverage VARCHAR2(75 CHAR) null,
	description VARCHAR2(75 CHAR) null,
	creator VARCHAR2(75 CHAR) null,
	publisher VARCHAR2(75 CHAR) null,
	contributor VARCHAR2(75 CHAR) null,
	rightsHolder VARCHAR2(75 CHAR) null,
	rights VARCHAR2(75 CHAR) null,
	provenance VARCHAR2(75 CHAR) null,
	source VARCHAR2(75 CHAR) null,
	relation VARCHAR2(75 CHAR) null,
	audience VARCHAR2(75 CHAR) null,
	instructionalMethods VARCHAR2(75 CHAR) null,
	date_ timestamp null
);

create table LG_Office (
	officeId number(30,0) not null primary key,
	name VARCHAR2(75 CHAR) null,
	www VARCHAR2(75 CHAR) null,
	email VARCHAR2(75 CHAR) null,
	facilityId number(30,0)
);

create table LG_Producer (
	producerId number(30,0) not null primary key,
	idNum VARCHAR2(75 CHAR) null,
	homeDir VARCHAR2(75 CHAR) null,
	userId number(30,0),
	hostId number(30,0),
	facilityId number(30,0),
	numberOfProductions number(30,0),
	approved number(30,0)
);

create table LG_Producer_Lectureseries (
	producerLectureseries number(30,0) not null primary key,
	lectureseriesId number(30,0),
	producerId number(30,0)
);

create table LG_Segment (
	segmentId number(30,0) not null primary key,
	videoId number(30,0),
	start_ VARCHAR2(75 CHAR) null,
	title VARCHAR2(75 CHAR) null,
	description VARCHAR2(75 CHAR) null,
	end_ VARCHAR2(75 CHAR) null,
	chapter VARCHAR2(75 CHAR) null,
	userId number(30,0)
);

create table LG_Segment_User_Video (
	segmentId number(30,0),
	userId number(30,0),
	videoId number(30,0),
	segmentUserVideoId number(30,0) not null primary key
);

create table LG_Sys (
	sysId number(30,0) not null primary key,
	version VARCHAR2(75 CHAR) null,
	setupWizard number(30,0)
);

create table LG_Upload (
	uploadId number(30,0) not null primary key,
	userId number(30,0),
	contentLength number(30,0),
	timestamp number(30,0),
	status number(30,0),
	videoId number(30,0)
);

create table LG_Video (
	videoId number(30,0) not null primary key,
	title VARCHAR2(75 CHAR) null,
	tags VARCHAR2(75 CHAR) null,
	lectureseriesId number(30,0),
	producerId number(30,0),
	containerFormat VARCHAR2(75 CHAR) null,
	filename VARCHAR2(75 CHAR) null,
	resolution VARCHAR2(75 CHAR) null,
	duration VARCHAR2(75 CHAR) null,
	hostId number(30,0),
	fileSize VARCHAR2(75 CHAR) null,
	generationDate VARCHAR2(75 CHAR) null,
	openAccess number(30,0),
	downloadLink number(30,0),
	metadataId number(30,0),
	surl VARCHAR2(75 CHAR) null,
	hits number(30,0),
	uploadDate timestamp null,
	permittedToSegment number(30,0),
	facilityId number(30,0),
	citation2go number(30,0)
);

create table LG_Video_Facility (
	videoFacilityId number(30,0) not null primary key,
	videoId number(30,0),
	facilityId number(30,0)
);

create table LG_Videohitlist (
	videohitlistId number(30,0) not null primary key,
	hitsPerDay number(30,0),
	hitsPerWeek number(30,0),
	hitsPerMonth number(30,0),
	hitsPerYear number(30,0)
);


create index IX_C05F3E24 on LG_Coordinator (facilityId);
create index IX_8439EBD on LG_Coordinator (officeId);

create index IX_2859F587 on LG_Facility (level);
create index IX_8059650C on LG_Facility (name);
create index IX_A4C50BE6 on LG_Facility (parentId);
create index IX_89A9675F on LG_Facility (sort);
create index IX_2DCDB70E on LG_Facility (typ);
create index IX_2DF72F1A on LG_Facility (www);

create index IX_8CD13042 on LG_Lectureseries (approved);
create index IX_9D792271 on LG_Lectureseries (eventCategory);
create index IX_EBC55E2D on LG_Lectureseries (eventType);
create index IX_F43BC8 on LG_Lectureseries (facultyName);
create index IX_4F65B8A3 on LG_Lectureseries (language);
create index IX_DB929396 on LG_Lectureseries (name);
create index IX_225A0AF on LG_Lectureseries (number_);
create index IX_2E421DEE on LG_Lectureseries (semesterName);



quit