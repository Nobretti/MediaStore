DROP TABLE Games;
DROP TABLE Movies;
DROP TABLE Series;
DROP TABLE Albums;
DROP TABLE Applications;
DROP TABLE EBooks;
DROP TABLE Roms;
DROP TABLE Collections;
DROP TABLE News;
DROP TABLE Users;


CREATE TABLE Games
(
	id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	shortName varchar(255),
	description varchar(2555),
	releaseYear int,
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
	id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	shortName varchar(255),
	description varchar(2555),
	releaseYear int,
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
	id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	shortName varchar(255),
	description varchar(2555),
	releaseYear int,
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
	id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	shortName varchar(255),
	description varchar(2555),
	releaseYear int,
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
	id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	shortName varchar(255),
	description varchar(2555),
	releaseYear int,
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
	id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	shortName varchar(255),
	description varchar(2555),
	releaseYear int,
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
	id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	shortName varchar(255),
	description varchar(2555),
	imgPath varchar(255),
	releaseYear int,
	rate int,
	link varchar(255),
	mediaType varChar(100),
	humanState varChar(100),
	company varchar(255),
	type varchar(255),
	romType varchar(255),
	country varchar(10),
	CONSTRAINT rateRom_100 CHECK (rate <= 100 AND rate >= 0),
	CONSTRAINT roms_pk PRIMARY KEY (id)
);


CREATE TABLE Collections
(
	id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	shortName varchar(255),
	description varchar(2555),
	imgPath varchar(255),
	releaseYear int,
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
	userId int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	userName varchar(255),
	password varchar(25),
	fullName varchar(255),
	birthDate date,
	email varchar(255),
	CONSTRAINT user_pk PRIMARY KEY (userId)
);

CREATE TABLE News
(
    newsId int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    title varchar(255),
    content varchar(255),
    usernewsId int not null,
    newsdate date,
    CONSTRAINT news_pk PRIMARY KEY (newsId),
    CONSTRAINT users_fk
    
);

