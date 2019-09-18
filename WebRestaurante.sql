-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DBRestaurante_2018132
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DBRestaurante_2018132
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DBRestaurante_2018132` DEFAULT CHARACTER SET utf8 ;
USE `DBRestaurante_2018132` ;

-- -----------------------------------------------------
-- Table `DBRestaurante_2018132`.`area`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante_2018132`.`area` (
  `idarea` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idarea`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante_2018132`.`mesas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante_2018132`.`mesas` (
  `idmesas` INT NOT NULL,
  `idarea` INT NOT NULL,
  PRIMARY KEY (`idmesas`),
  INDEX `fk_area_idx` (`idarea` ASC) VISIBLE,
  CONSTRAINT `fk_area`
    FOREIGN KEY (`idarea`)
    REFERENCES `DBRestaurante_2018132`.`area` (`idarea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante_2018132`.`meseros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante_2018132`.`meseros` (
  `idmeseros` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `idhorario` INT NOT NULL,
  PRIMARY KEY (`idmeseros`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante_2018132`.`platos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante_2018132`.`platos` (
  `idplatos` INT NOT NULL,
  `plato` VARCHAR(45) NOT NULL,
  `aperitivo` VARCHAR(45) NOT NULL,
  `postre` VARCHAR(45) NOT NULL,
  `bebida` VARCHAR(45) NOT NULL,
  `precio` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idplatos`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante_2018132`.`cocineros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante_2018132`.`cocineros` (
  `idcocineros` INT NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `Telefono` VARCHAR(45) NOT NULL,
  `idhorario` INT NOT NULL,
  PRIMARY KEY (`idcocineros`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante_2018132`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante_2018132`.`clientes` (
  `idclientes` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `nit` INT(8) NOT NULL,
  PRIMARY KEY (`idclientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante_2018132`.`pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante_2018132`.`pago` (
  `idpago` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idpago`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante_2018132`.`facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante_2018132`.`facturas` (
  `idfacturas` INT NOT NULL,
  `idcliente` INT NOT NULL,
  `idmesero` INT NOT NULL,
  `idpago` INT NOT NULL,
  `totalapagar` VARCHAR(45) NOT NULL,
  `fechafactura` DATETIME NOT NULL,
  `idmesa` INT NOT NULL,
  PRIMARY KEY (`idfacturas`),
  INDEX `fk_clientes_idx` (`idcliente` ASC) VISIBLE,
  INDEX `fk_mesero_idx` (`idmesero` ASC) VISIBLE,
  INDEX `fk_pago_idx` (`idpago` ASC) VISIBLE,
  INDEX `fk_mesas2_idx` (`idmesa` ASC) VISIBLE,
  CONSTRAINT `fk_clientes`
    FOREIGN KEY (`idcliente`)
    REFERENCES `DBRestaurante_2018132`.`clientes` (`idclientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_mesero`
    FOREIGN KEY (`idmesero`)
    REFERENCES `DBRestaurante_2018132`.`meseros` (`idmeseros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pago`
    FOREIGN KEY (`idpago`)
    REFERENCES `DBRestaurante_2018132`.`pago` (`idpago`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_mesas2`
    FOREIGN KEY (`idmesa`)
    REFERENCES `DBRestaurante_2018132`.`mesas` (`idmesas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante_2018132`.`detallefactura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante_2018132`.`detallefactura` (
  `iddetallefactura` INT NOT NULL,
  `idfactura` INT NOT NULL,
  `idplatos` INT NOT NULL,
  `idcocineros` INT NOT NULL,
  `totalpago` VARCHAR(45) NOT NULL,
  `totalventa` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`iddetallefactura`),
  INDEX `fk_factura_idx` (`idfactura` ASC) VISIBLE,
  INDEX `fk_platos_idx` (`idplatos` ASC) VISIBLE,
  INDEX `fk_cocineros_idx` (`idcocineros` ASC) VISIBLE,
  CONSTRAINT `fk_factura`
    FOREIGN KEY (`idfactura`)
    REFERENCES `DBRestaurante_2018132`.`facturas` (`idfacturas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_plato`
    FOREIGN KEY (`idplatos`)
    REFERENCES `DBRestaurante_2018132`.`platos` (`idplatos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cocineros`
    FOREIGN KEY (`idcocineros`)
    REFERENCES `DBRestaurante_2018132`.`cocineros` (`idcocineros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
