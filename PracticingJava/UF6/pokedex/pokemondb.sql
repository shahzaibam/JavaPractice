CREATE USER 'taxiusr'@'localhost' IDENTIFIED BY 'taxipsw';
CREATE DATABASE taxidb
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;
GRANT SELECT, INSERT, UPDATE, DELETE ON taxidb.* TO 'taxiusr'@'localhost';
USE taxidb;
CREATE TABLE `taxiTrabajo` (
    `id` INT(4) NOT NULL AUTO_INCREMENT,
    `trabajo` VARCHAR(10) NOT NULL,
    `fecha` DATE NOT NULL,
    `coste` NUMBER(25) NOT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE `workers` (
    `id` INT(4) NOT NULL UNIQUE,
    `name` VARCHAR(10) NOT NULL,
    `email` VARCHAR(250) NOT NULL,
    `password` VARCHAR(250) NOT NULL,
    PRIMARY KEY (`id`)
);
/* Si implementeu l'evolució, heu d'afegir un camp a la taula 'workers' i la com a clau forana reflexiva */
ALTER TABLE `workers` 
    ADD CONSTRAINT `fk_pokemon` FOREIGN KEY (type_id) 
    REFERENCES taxiTrabajo(id)
    ON UPDATE CASCADE ON DELETE RESTRICT;
/* Si implementeu l'evolució, heu d'afegir la restricció d'integritat de la clau forana reflexiva de la taula 'workers' */

/* FALTA REALITZAR ELS INSERTS A LES DUES TAULES */

/* INSERT INTO workers VALUES 
    (1, "Bulbasur", 0.7, 6.9, 'both', 1);*/
