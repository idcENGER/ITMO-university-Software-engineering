CREATE TABLE entity (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    skill INTEGER  CHECK (skill >= 0)
);

CREATE TYPE sex_type AS ENUM('male','female');
CREATE TYPE names AS ENUM('Olvin','Alistra');

CREATE TABLE characters (
    id SERIAL PRIMARY KEY,
    name names,
    age INTEGER CHECK (age >= 0 AND age <= 200),
    sex sex_type 
);

CREATE TABLE plant (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    type VARCHAR(100),
    leaves_color VARCHAR(50),
    lifetime INTEGER CHECK (lifetime >= 0)
);

CREATE TABLE garden (
    id SERIAL PRIMARY KEY,
    entity_id INTEGER NOT NULL, 
    plant_id INTEGER NOT NULL,
    FOREIGN KEY (entity_id) REFERENCES entity(id) ON DELETE CASCADE,
    FOREIGN KEY (plant_id) REFERENCES plant(id) ON DELETE CASCADE,
    UNIQUE (entity_id)
);

CREATE TABLE building (
    id SERIAL PRIMARY KEY,
    color VARCHAR(50),
    floors_counter INTEGER CHECK (floors_counter >= 0),
    condition VARCHAR(100),
    entity_id INTEGER NOT NULL,
    garden_id INTEGER NOT NULL, 
    FOREIGN KEY (entity_id) REFERENCES entity(id) ON DELETE CASCADE,
    FOREIGN KEY (garden_id) REFERENCES garden(id) ON DELETE CASCADE,
    UNIQUE (garden_id)
);

CREATE TABLE characters_building (
    id SERIAL PRIMARY KEY,
    building_id INTEGER NOT NULL,
    characters_id INTEGER NOT NULL,
    feel VARCHAR(100), 
    FOREIGN KEY (building_id) REFERENCES building(id) ON DELETE CASCADE,
    FOREIGN KEY (characters_id) REFERENCES characters(id) ON DELETE CASCADE,
    UNIQUE (building_id, characters_id)
);

CREATE INDEX idx_building_entity ON building(entity_id);
CREATE INDEX idx_characters_building_building ON characters_building(building_id);
CREATE INDEX idx_characters_building_characters ON characters_building(characters_id);
CREATE INDEX idx_garden_plant ON garden(plant_id);
