-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-01-2022 a las 19:12:37
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cajero_rob_ivan`
--
CREATE DATABASE IF NOT EXISTS `cajero_rob_ivan` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `cajero_rob_ivan`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE `administradores` (
  `usuario` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `contrasena` varchar(20) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- RELACIONES PARA LA TABLA `administradores`:
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `nif` varchar(9) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(35) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- RELACIONES PARA LA TABLA `cliente`:
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `num_cuenta` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `saldo` decimal(8,0) NOT NULL,
  `fecha_creacion` date NOT NULL,
  `fecha_ult_modif` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- RELACIONES PARA LA TABLA `cuenta`:
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta_cliente`
--

CREATE TABLE `cuenta_cliente` (
  `num_cuenta` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `nif` varchar(9) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- RELACIONES PARA LA TABLA `cuenta_cliente`:
--   `nif`
--       `cliente` -> `nif`
--   `num_cuenta`
--       `cuenta` -> `num_cuenta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `limite`
--

CREATE TABLE `limite` (
  `tipo` varchar(15) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- RELACIONES PARA LA TABLA `limite`:
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `limite_tarjeta`
--

CREATE TABLE `limite_tarjeta` (
  `tipo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `num_tarjeta` int(16) NOT NULL,
  `valor_limite` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- RELACIONES PARA LA TABLA `limite_tarjeta`:
--   `num_tarjeta`
--       `tarjeta` -> `num_tarjeta`
--   `tipo`
--       `limite` -> `tipo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operacion`
--

CREATE TABLE `operacion` (
  `num_operacion` int(10) NOT NULL,
  `tipo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `cantidad` decimal(8,0) NOT NULL,
  `timestamp` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `validada` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_validacion` date NOT NULL,
  `num_cuenta` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `num_tarjeta` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- RELACIONES PARA LA TABLA `operacion`:
--   `num_cuenta`
--       `cuenta` -> `num_cuenta`
--   `num_tarjeta`
--       `tarjeta` -> `num_tarjeta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjeta`
--

CREATE TABLE `tarjeta` (
  `num_tarjeta` int(16) NOT NULL,
  `cvs` int(3) NOT NULL,
  `pin` int(12) NOT NULL,
  `fecha_cad` date NOT NULL,
  `intentos_fallidos` int(3) DEFAULT NULL,
  `bloqueada` varchar(2) COLLATE utf8_spanish_ci DEFAULT NULL,
  `nif_cliente` varchar(9) COLLATE utf8_spanish_ci NOT NULL,
  `num_cuenta` varchar(25) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- RELACIONES PARA LA TABLA `tarjeta`:
--   `nif_cliente`
--       `cliente` -> `nif`
--   `num_cuenta`
--       `cuenta` -> `num_cuenta`
--

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administradores`
--
ALTER TABLE `administradores`
  ADD PRIMARY KEY (`usuario`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`nif`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`num_cuenta`);

--
-- Indices de la tabla `cuenta_cliente`
--
ALTER TABLE `cuenta_cliente`
  ADD PRIMARY KEY (`num_cuenta`,`nif`);

--
-- Indices de la tabla `limite`
--
ALTER TABLE `limite`
  ADD PRIMARY KEY (`tipo`);

--
-- Indices de la tabla `limite_tarjeta`
--
ALTER TABLE `limite_tarjeta`
  ADD PRIMARY KEY (`tipo`,`num_tarjeta`);

--
-- Indices de la tabla `operacion`
--
ALTER TABLE `operacion`
  ADD PRIMARY KEY (`num_operacion`),
  ADD KEY `num_tarjeta` (`num_tarjeta`),
  ADD KEY `num_cuenta` (`num_cuenta`);

--
-- Indices de la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  ADD PRIMARY KEY (`num_tarjeta`),
  ADD KEY `nif_cliente` (`nif_cliente`),
  ADD KEY `num_cuenta` (`num_cuenta`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `operacion`
--
ALTER TABLE `operacion`
  ADD CONSTRAINT `fk_num_cuenta2` FOREIGN KEY (`num_cuenta`) REFERENCES `cuenta` (`num_cuenta`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_num_tarjeta` FOREIGN KEY (`num_tarjeta`) REFERENCES `tarjeta` (`num_tarjeta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `tarjeta`
--
ALTER TABLE `tarjeta`
  ADD CONSTRAINT `fk_nif_cliente` FOREIGN KEY (`nif_cliente`) REFERENCES `cliente` (`nif`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_num_cuenta` FOREIGN KEY (`num_cuenta`) REFERENCES `cuenta` (`num_cuenta`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
