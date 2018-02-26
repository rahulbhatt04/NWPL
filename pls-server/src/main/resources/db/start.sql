
CREATE TABLE address (
  id varchar(64)  NOT NULL ,
  street_no int(20) DEFAULT NULL,
  CREATED_D datetime DEFAULT NULL,
  street_name varchar(256) DEFAULT NULL,
  CITY varchar(256) DEFAULT NULL,
  ZIP varchar(32) DEFAULT NULL,
  STATE_CODE varchar(32) DEFAULT NULL,
  	listing_id varchar(64),

  PRIMARY KEY (id)
);

 CREATE TABLE listing (
  id varchar(64) NOT NULL  ,
  CREATED_D datetime DEFAULT NULL,
	asking_PRICE BIGINT,
	address_id varchar(64),
	photos_link varchar(2000) ,
	description varchar (2000),
	submittedBy varchar(64),
	
  PRIMARY KEY (id)
) ;

create table person (
  id varchar(64) NOT NULL  ,
  first_name varchar(64),
  last_name varchar(64),
  email varchar(64),
  phone varchar(64),
  PRIMARY KEY (id)

  );
