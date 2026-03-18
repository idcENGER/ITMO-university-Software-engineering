INSERT INTO entity(name,skill) VAlUES
('creepy',100),
('poor',50),
('freak',25),
('chillGay',10);

SELECT * FROM entity;

INSERT INTO "characters"(name,age,sex) VALUES
('Olvin',18,'male'),
('Alistra',18,'female');

SELECT * FROM "characters";

INSERT INTO plant (name,type,leaves_color,lifetime) VALUES
('rose','flower','red',54),
('fir','tree','green',833),
('astra','flower','yellow',64),
('lily','flower','blue',11),
('rose','flower','white',32),
('fir','tree','green',213);

SELECT * FROM plant;

INSERT INTO garden(entity_id,plant_id) VALUES
(1,1),
(2,2),
(3,3),
(4,4);

SELECT * FROM garden;

INSERT INTO building (color,floors_counter,condition,entity_id,garden_id) VALUES
('green',5,'great',1,4),
('yellow',5,'ok',2,3),
('yellow',5,'bad',3,2),
('white',3,'awful',4,1);

SELECT * FROM building;

INSERT INTO characters_building(building_id,characters_id,feel) VALUES
(1,1,'inspire'),
(2,2,'enjoy');

SELECT * FROM characters_building;

