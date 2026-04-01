DROP TABLE IF EXISTS feel;
DROP TABLE IF EXISTS characters;
DROP TABLE IF EXISTS building;
DROP TABLE IF EXISTS garden;
DROP TABLE IF EXISTS plant;
DROP TABLE IF EXISTS entity;
DROP TYPE IF EXISTS sex_type;
DROP TYPE IF EXISTS plant_type;
DROP TYPE IF EXISTS garden_size;
DROP TYPE IF EXISTS colors;


CREATE TABLE entity (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    skill INTEGER  CHECK (skill >= 0 and skill <= 10000)
);

CREATE TYPE sex_type AS ENUM('male','female');
CREATE TYPE plant_type as ENUM('flower','tree');
CREATE TYPE garden_size as ENUM('big','baseical','small');
CREATE TYPE colors as ENUM('yellow','red','white','black','pink','blue','green');

CREATE TABLE characters (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    age INTEGER CHECK (age >= 0 AND age <= 200),
    sex sex_type 
);

CREATE TABLE plant (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    type plant_type,
    leaves_color VARCHAR(50),
    lifetime INTEGER CHECK (lifetime >= 0 and lifetime <= 5000)
);

CREATE TABLE garden (
    id SERIAL PRIMARY KEY,
    entity_id INTEGER NOT NULL, 
    plant_id INTEGER NOT NULL,
    sized garden_size,
    FOREIGN KEY (entity_id) REFERENCES entity(id) ON DELETE CASCADE,
    FOREIGN KEY (plant_id) REFERENCES plant(id) ON DELETE CASCADE,
    UNIQUE (entity_id)
);

CREATE TABLE building (
    id SERIAL PRIMARY KEY,
    color VARCHAR(50),
    floors_counter INTEGER CHECK (floors_counter >= 0 and floors_counter <= 10),
    condition VARCHAR(100),
    entity_id INTEGER NOT NULL,
    garden_id INTEGER NOT NULL, 
    FOREIGN KEY (entity_id) REFERENCES entity(id) ON DELETE CASCADE,
    FOREIGN KEY (garden_id) REFERENCES garden(id) ON DELETE CASCADE,
    UNIQUE (garden_id)
);

CREATE TABLE feel (
    building_id INTEGER NOT NULL,
    characters_id INTEGER NOT NULL,
    PRIMARY KEY(characters_id,building_id),
    feel VARCHAR(100), 
    FOREIGN KEY (building_id) REFERENCES building(id) ON DELETE CASCADE,
    FOREIGN KEY (characters_id) REFERENCES characters(id) ON DELETE CASCADE,
    UNIQUE (building_id, characters_id)
);

INSERT INTO entity(name,skill) VAlUES
('creepy',100),
('poor',50),
('freak',25),
('chillGuy',10);

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

INSERT INTO garden(entity_id,plant_id,sized) VALUES
(1,1,'big'),
(2,2,'small'),
(3,3,'small'),
(4,4,'big');

SELECT * FROM garden;

INSERT INTO building (color,floors_counter,condition,entity_id,garden_id) VALUES
('green',5,'great',1,4),
('yellow',5,'ok',2,3),
('yellow',5,'bad',3,2),
('white',3,'awful',4,1);

SELECT * FROM building;

INSERT INTO feel(building_id,characters_id,feel) VALUES
(1,1,'inspire'),
(2,2,'enjoy');

SELECT * FROM feel;
