-- Create table
drop table if exists food;
create table food (
                       id BIGINT AUTO_INCREMENT  PRIMARY KEY,
                       food_name VARCHAR(255) NOT NULL,
                       status INTEGER,
                       create_time DATETIME,
                       update_time DATETIME
);

-- Init data
insert into food(food_name,status,create_time,update_time) values ('Rice',1,'2012-09-17 18:47:52.069','2012-09-17 18:47:52.069');
insert into food(food_name,status,create_time,update_time) values ('Cheese',1,'2012-09-17 18:47:52.069','2012-09-17 18:47:52.069');
insert into food(food_name,status,create_time,update_time) values ('Yogurt',1,'2012-09-17 18:47:52.069','2012-09-17 18:47:52.069');

