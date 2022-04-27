-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Tienda
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Tienda` ;

-- -----------------------------------------------------
-- Schema Tienda
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Tienda` DEFAULT CHARACTER SET utf8 ;
USE `Tienda` ;

-- -----------------------------------------------------
-- Table `Tienda`.`Productos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Tienda`.`Productos` ;

CREATE TABLE IF NOT EXISTS `Tienda`.`Productos` (
  `idProductos` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Descripcion` VARCHAR(100) NULL,
  `Precio` FLOAT NULL,
  PRIMARY KEY (`idProductos`),
  UNIQUE INDEX `idProductos_UNIQUE` (`idProductos` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Tienda`.`Clientes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Tienda`.`Clientes` ;

CREATE TABLE IF NOT EXISTS `Tienda`.`Clientes` (
  `idClientes` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `CIF` VARCHAR(9) NULL,
  `Telefono` VARCHAR(13) NULL,
  `Email` VARCHAR(45) NULL,
  PRIMARY KEY (`idClientes`),
  UNIQUE INDEX `idClientes_UNIQUE` (`idClientes` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Tienda`.`Pedido`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Tienda`.`Pedido` ;

CREATE TABLE IF NOT EXISTS `Tienda`.`Pedido` (
  `idPedido` INT NOT NULL,
  `FechaAlta` DATETIME NULL,
  `FechaEntrega` DATETIME NULL,
  `Estado` INT NULL,
  `Clientes_idClientes` INT NOT NULL,
  `PrecioTotal` FLOAT NULL,
  PRIMARY KEY (`idPedido`),
  INDEX `fk_Pedido_Clientes_idx` (`Clientes_idClientes` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Tienda`.`ListaProductos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Tienda`.`ListaProductos` ;

CREATE TABLE IF NOT EXISTS `Tienda`.`ListaProductos` (
  `Pedido_idPedido` INT NOT NULL,
  `Productos_idProductos` INT NOT NULL,
  `CantidadProducto` INT NULL,
  `Precio` FLOAT NULL,
  PRIMARY KEY (`Pedido_idPedido`, `Productos_idProductos`),
  INDEX `fk_Pedido_has_Productos_Productos1_idx` (`Productos_idProductos` ASC),
  INDEX `fk_Pedido_has_Productos_Pedido1_idx` (`Pedido_idPedido` ASC))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
