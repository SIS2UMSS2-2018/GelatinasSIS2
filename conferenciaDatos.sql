-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-10-2018 a las 03:37:18
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `conferencia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistentes`
--

CREATE TABLE `asistentes` (
  `ci_asis` int(10) UNSIGNED NOT NULL,
  `nombre_asis` varchar(15) NOT NULL,
  `apellido_asis` varchar(30) NOT NULL,
  `ocupacion_asis` varchar(20) NOT NULL,
  `correo_asis` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asistentes`
--

INSERT INTO `asistentes` (`ci_asis`, `nombre_asis`, `apellido_asis`, `ocupacion_asis`, `correo_asis`) VALUES
(123, 'JULIO', 'CABRERA', 'ESTUDIANTE', 'julio@gmail.com'),
(124, 'ROCIO', 'CABALLERO', 'ESTUDIANTE', 'rocio@gmail.com'),
(125, 'MAURICIO', 'OROPEZA', 'ESTUDIANTE', 'mau@gmail.com'),
(126, 'PATRICIA', 'PACO', 'ING.INFORMATICA', 'patricia@gmail.com'),
(127, 'CLARA', 'SORIA', 'ING.SISTEMAS', 'clara@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cronograma`
--

CREATE TABLE `cronograma` (
  `id_crono` int(10) UNSIGNED NOT NULL,
  `grupos_id_grupo` int(10) UNSIGNED NOT NULL,
  `expositores_id_expo` int(10) UNSIGNED NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cronograma`
--

INSERT INTO `cronograma` (`id_crono`, `grupos_id_grupo`, `expositores_id_expo`, `hora`) VALUES
(1, 4, 2, '19:00:00'),
(2, 3, 1, '17:00:00'),
(3, 2, 3, '15:00:00'),
(4, 1, 2, '12:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `expositores`
--

CREATE TABLE `expositores` (
  `id_expo` int(10) UNSIGNED NOT NULL,
  `nombre_expo` varchar(15) NOT NULL,
  `apellido_expo` varchar(30) NOT NULL,
  `historial` varchar(60) NOT NULL,
  `nro_contacto` int(10) UNSIGNED NOT NULL,
  `actividades` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `expositores`
--

INSERT INTO `expositores` (`id_expo`, `nombre_expo`, `apellido_expo`, `historial`, `nro_contacto`, `actividades`) VALUES
(1, 'TATIANA', 'APARICIO', 'DOCENTE', 4132144, '\r\nEmplear conceptos avanzados de bases de datos para satisfacer en forma adecuada requerimientos de alta dificultad.\r\nAplicar tecnologías de bases de datos para solucionar problemas reales de manejo de grandes volúmenes de datos.\r\nEstimar los cambios que el futuro trae en la tecnología de Base de Datos, para de este modo anticiparse al desarrollo en el área. '),
(2, 'JORGE', 'ORELLANA', 'MAESTRIA EN INGENIERIA', 0, '\r\nDescribir las ventajas de las redes de computadoras y explicar el funcionamiento de los elementos de la redes.\r\nAnalizar problemas de flujo de datos en las redes y determinar niveles de seguridad.\r\nDesarrollar utilidades para realizar o adecuar a las necesidades del usuario para un determinado acceso a los servicios de las redes de computadoras.\r\nDiferenciar medios físicos de transmisión de datos y elegir para un determinado uso.\r\nSeleccionar servicios, protocolos y topologías para la construcción de una red de computadoras.\r\nDistinguir problemas de implementación y uso de los servicios de las subredes para lograr óptimos aprovechamiento de los recursos. '),
(3, 'MARIA', 'BLANCO', 'LIC.INFORMATICA', 4252439, '\r\n    Describir con sus propias palabras los principales componentes de la computadora (hardware, software, lenguajes de programación, intérprete y compilador).\r\n    Diseñar algoritmos para resolver pequeños problemas siguiendo las etapas: formulación del problema, elección del método, codificación y ejecución.\r\n    Aplicar correctamente los conceptos principales relacionados con la programación: constantes, variables, tipos de datos, expresiones, asignación de datos e instrucciones de entrada y salida al tiempo de programar en la computadora.\r\n    Seleccionar y aplicar correctamente las estructuras de control (decisión y repetición) adecuadas a cada problema, al tiempo de realizar programas en la computadora.\r\n    Reconocer la oportunidad de utilización de estructuras de datos (arreglos y matrices) para solucionar satisfactoriamente los problemas, tomando en cuenta los criterios expuestos en el curso.\r\n    Dividir un problema en subprogramas aplicando el concepto \"divide y conquistarás\" y \"refinamiento sucesivo\", tomando en cuenta todos los criterios planteados en el curso.\r\n    Programar soluciones a pequeños problemas utilizando apropiadamente la programación estructurada y la sintaxis de Java. ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupos`
--

CREATE TABLE `grupos` (
  `id_grupo` int(10) UNSIGNED NOT NULL,
  `cupos_dispo` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `grupos`
--

INSERT INTO `grupos` (`id_grupo`, `cupos_dispo`) VALUES
(1, 30),
(2, 20),
(3, 5),
(4, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `grupos_id_grupo` int(10) UNSIGNED NOT NULL,
  `asistentes_ci_asis` int(10) UNSIGNED NOT NULL,
  `asistido` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`grupos_id_grupo`, `asistentes_ci_asis`, `asistido`) VALUES
(1, 123, 'N'),
(2, 124, 'N'),
(3, 125, 'N'),
(3, 127, 'N'),
(4, 126, 'N'),
(4, 127, 'N');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `temas`
--

CREATE TABLE `temas` (
  `id_tema` int(10) UNSIGNED NOT NULL,
  `expositores_id_expo` int(10) UNSIGNED NOT NULL,
  `nombre_tema` varchar(20) NOT NULL,
  `descrip_tema` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `temas`
--

INSERT INTO `temas` (`id_tema`, `expositores_id_expo`, `nombre_tema`, `descrip_tema`) VALUES
(1, 1, 'BASE DE DATOS', 'Base de Datos II constituye uno de los componentes'),
(2, 2, 'REDES DE COMPUTADORA', 'Los alumnos con estos conocimientos podrán plantea'),
(3, 3, 'INTRODUCCION A LA PR', 'Realizar tareas usando la computadora: correo elec'),
(4, 2, 'TALLER DE SISTEMAS O', 'Los Sistemas operativos se instalan configuran y e');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(10) UNSIGNED NOT NULL,
  `nombre_us` varchar(15) NOT NULL,
  `contrasenia` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre_us`, `contrasenia`) VALUES
(1, 'OSCAR', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asistentes`
--
ALTER TABLE `asistentes`
  ADD PRIMARY KEY (`ci_asis`);

--
-- Indices de la tabla `cronograma`
--
ALTER TABLE `cronograma`
  ADD PRIMARY KEY (`id_crono`),
  ADD KEY `cronograma_FKIndex1` (`expositores_id_expo`),
  ADD KEY `cronograma_FKIndex2` (`grupos_id_grupo`);

--
-- Indices de la tabla `expositores`
--
ALTER TABLE `expositores`
  ADD PRIMARY KEY (`id_expo`);

--
-- Indices de la tabla `grupos`
--
ALTER TABLE `grupos`
  ADD PRIMARY KEY (`id_grupo`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`grupos_id_grupo`,`asistentes_ci_asis`),
  ADD KEY `asisten_grupo_FKIndex1` (`asistentes_ci_asis`),
  ADD KEY `asisten_grupo_FKIndex2` (`grupos_id_grupo`);

--
-- Indices de la tabla `temas`
--
ALTER TABLE `temas`
  ADD PRIMARY KEY (`id_tema`),
  ADD KEY `temas_FKIndex1` (`expositores_id_expo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cronograma`
--
ALTER TABLE `cronograma`
  MODIFY `id_crono` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `expositores`
--
ALTER TABLE `expositores`
  MODIFY `id_expo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `grupos`
--
ALTER TABLE `grupos`
  MODIFY `id_grupo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `temas`
--
ALTER TABLE `temas`
  MODIFY `id_tema` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
