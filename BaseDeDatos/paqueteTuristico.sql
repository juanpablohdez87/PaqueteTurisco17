-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-10-2023 a las 16:56:48
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemadepaqueteturisctico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamiento`
--

CREATE TABLE `alojamiento` (
  `idAlojamiento` int(11) NOT NULL,
  `fechaIngreso` date NOT NULL,
  `fechaSalida` date DEFAULT NULL,
  `estado` tinyint(4) NOT NULL,
  `servicio` varchar(60) NOT NULL,
  `importeDiario` double NOT NULL,
  `idCiuDestino` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `idCiudad` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `pais` varchar(60) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `provincia` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `telefono` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `idPaquete` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquete`
--

CREATE TABLE `paquete` (
  `idPaquete` int(11) NOT NULL,
  `idCiuOrigen` int(11) NOT NULL,
  `idCuiDestino` int(11) NOT NULL,
  `idAlojamiento` int(60) NOT NULL,
  `idPasaje` int(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasaje`
--

CREATE TABLE `pasaje` (
  `idPasaje` int(11) NOT NULL,
  `tipoTransporte` varchar(60) NOT NULL,
  `importe` double NOT NULL,
  `idCiuOrigen` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD PRIMARY KEY (`idAlojamiento`),
  ADD KEY `idCiuDestino` (`idCiuDestino`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`idCiudad`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `idPaquete` (`idPaquete`);

--
-- Indices de la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD PRIMARY KEY (`idPaquete`),
  ADD KEY `idCiuOrigen` (`idCiuOrigen`),
  ADD KEY `idCuiDestino` (`idCuiDestino`),
  ADD KEY `idAlojamiento` (`idAlojamiento`),
  ADD KEY `idPasaje` (`idPasaje`);

--
-- Indices de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD PRIMARY KEY (`idPasaje`),
  ADD KEY `idCiuOrigen` (`idCiuOrigen`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  MODIFY `idAlojamiento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `idCiudad` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `paquete`
--
ALTER TABLE `paquete`
  MODIFY `idPaquete` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  MODIFY `idPasaje` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD CONSTRAINT `alojamiento_ibfk_1` FOREIGN KEY (`idCiuDestino`) REFERENCES `ciudad` (`idCiudad`);

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`idPaquete`) REFERENCES `paquete` (`idPaquete`);

--
-- Filtros para la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD CONSTRAINT `paquete_ibfk_1` FOREIGN KEY (`idCiuOrigen`) REFERENCES `ciudad` (`idCiudad`),
  ADD CONSTRAINT `paquete_ibfk_2` FOREIGN KEY (`idCuiDestino`) REFERENCES `ciudad` (`idCiudad`),
  ADD CONSTRAINT `paquete_ibfk_3` FOREIGN KEY (`idAlojamiento`) REFERENCES `alojamiento` (`idAlojamiento`),
  ADD CONSTRAINT `paquete_ibfk_4` FOREIGN KEY (`idPasaje`) REFERENCES `pasaje` (`idPasaje`);

--
-- Filtros para la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD CONSTRAINT `pasaje_ibfk_1` FOREIGN KEY (`idCiuOrigen`) REFERENCES `ciudad` (`idCiudad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
