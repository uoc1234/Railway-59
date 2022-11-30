use JDBC;

-- Create table Car
drop table if exists Car;
create table Car (
                     CarID				int auto_increment primary key,
                     Maker				enum('HONDA', 'TOYOTA', 'NISSAN') not null,
                     Model				varchar(50) not null,
                     Year				datetime not null,
                     color				varchar(50) not null,
                     Note				varchar(500) not null
);

-- Insert table Car
insert into Car (Maker,			Model,			`Year`,					color,			Note)
values			('HONDA',		'HONDA1',		'2018-11-22',			'BLACK',		'a123'),
                  ('TOYOTA',		'TOYOTA1',		'2017-10-12',			'WHITE',		'abc1'),
                  ('NISSAN',		'NISSAN1',		'2019-01-20',			'BLUE',			'1234');

drop table if exists `User`;
create table `User` (
                     user_id			int auto_increment primary key,
                     full_name			varchar(50),
                     email				varchar(50) not null,
                     password			varchar(50) not null,
                     exp_in_year		int,
                     pro_skill		    varchar(50),
                     `role`             enum('ADMIN', 'EMPLOYEE') not null
);

DROP PROCEDURE IF EXISTS demoStore ;
DELIMITER $$
CREATE PROCEDURE demoStore ()
BEGIN
select * from Car where year(`year`) = year(now());
END $$
DELIMITER ;
call demoStore();