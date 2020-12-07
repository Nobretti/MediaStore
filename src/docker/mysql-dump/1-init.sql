CREATE DATABASE MediaStore; 
USE MediaStore;
CREATE TABLE Games
(
	id int NOT NULL AUTO_INCREMENT,
	shortName varchar(255),
	description varchar(2555),
	releaseYear varchar(255),
	imgPath varchar(255),
	rate int,
	link varchar(255),
	mediaType varChar(100),
	humanState varChar(100),
	company varchar(255),
	type varchar(255),
	os varchar(255),
	country varchar(10),
	CONSTRAINT rateGame_100 CHECK (rate <= 100 AND rate >= 0),
	CONSTRAINT games_pk PRIMARY KEY (id)
);
CREATE TABLE Movies
(
	id int NOT NULL AUTO_INCREMENT,
	shortName varchar(255),
	description varchar(2555),
	releaseYear varchar(255),
	imgPath varchar(255),
        rate int,
	link varchar(255),
	mediaType varChar(100),
	humanState varChar(100),
	director varchar(255),	
	country varchar(10),
	CONSTRAINT rateMovie_100 CHECK (rate <= 100 AND rate >= 0),
	CONSTRAINT movies_pk PRIMARY KEY (id)
);
CREATE TABLE Series
(
	id int NOT NULL AUTO_INCREMENT,
	shortName varchar(255),
	description varchar(2555),
	releaseYear varchar(255),
	imgPath varchar(255),
        rate int,
	link varchar(255),
	mediaType varChar(100),
	humanState varChar(100),
	producer varchar(255),
	endYear int,
        company varchar(255),
	seasons int,
	country varchar(10),
	CONSTRAINT rateSerie_100 CHECK (rate <= 100 AND rate >= 0),
	CONSTRAINT series_pk PRIMARY KEY (id)
);
CREATE TABLE Albums
(
	id int NOT NULL AUTO_INCREMENT,
	shortName varchar(255),
	description varchar(2555),
	releaseYear varchar(255),
	imgPath varchar(255),
	rate int,
	link varchar(255),
	mediaType varChar(100),
	humanState varChar(100),
	artist varchar(255),
	company varchar(255),
	nrTracks int,
	time varchar(255),
	country varchar(10),
	CONSTRAINT rateAlbum_100 CHECK (rate <= 100 AND rate >= 0),
	CONSTRAINT albums_pk PRIMARY KEY (id)
);
CREATE TABLE Applications
(
	id int NOT NULL AUTO_INCREMENT,
	shortName varchar(255),
	description varchar(2555),
	releaseYear varchar(255),
	imgPath varchar(255),
	rate int,
	link varchar(255),
	mediaType varChar(100),
	humanState varChar(100),
	company varchar(255),
	os varchar(255),
	utility varchar(255),
	country varchar(10),
	CONSTRAINT rateApplication_100 CHECK (rate <= 100 AND rate >= 0),
	CONSTRAINT apps_pk PRIMARY KEY (id)
);
CREATE TABLE EBooks
(
	id int NOT NULL AUTO_INCREMENT,
	shortName varchar(255),
	description varchar(2555),
	releaseYear varchar(255),
	imgPath varchar(255),
	rate int,
	link varchar(255),
	mediaType varChar(100),
	humanState varChar(100),
	author varchar(255),
	textformat varchar(10),
	country varchar(10),
	CONSTRAINT rateEbook_100 CHECK (rate <= 100 AND rate >= 0),
	CONSTRAINT ebooks_pk PRIMARY KEY (id)
);
CREATE TABLE Roms
(
	id int NOT NULL AUTO_INCREMENT,
	shortName varchar(255),
	description varchar(2555),
	imgPath varchar(255),
	releaseYear varchar(255),
	rate int,
	link varchar(255),
	mediaType varChar(100),
	humanState varChar(100),
	company varchar(150),
	developer varchar(150),
	country varchar(10),
	CONSTRAINT rateRom_100 CHECK (rate <= 100 AND rate >= 0),
	CONSTRAINT roms_pk PRIMARY KEY (id)
);
CREATE TABLE Collections
(
	id int NOT NULL AUTO_INCREMENT,
	shortName varchar(255),
	description varchar(2555),
	imgPath varchar(255),
	releaseYear varchar(255),
	rate int,
	link varchar(255),
	mediaType varChar(100),
	humanState varChar(100),
	numberCollection int,
	company varchar(255),
	type varchar(255),
	country varchar(10),
	CONSTRAINT rateCollections_100 CHECK (rate <= 100 AND rate >= 0),
	CONSTRAINT collections_pk PRIMARY KEY (id)
);
CREATE TABLE Users
(
	userId int NOT NULL AUTO_INCREMENT,
	userName varchar(255),
	password varchar(25),
	fullName varchar(255),
	birthDate date,
	email varchar(255),
	CONSTRAINT user_pk PRIMARY KEY (userId)
);