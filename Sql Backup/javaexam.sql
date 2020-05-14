-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2020 at 10:16 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaexam`
--

-- --------------------------------------------------------

--
-- Table structure for table `soal10`
--

CREATE TABLE `soal10` (
  `kd_barang` varchar(255) NOT NULL,
  `nm_barang` varchar(255) NOT NULL,
  `satuan` varchar(255) NOT NULL,
  `qty` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `soal10`
--

INSERT INTO `soal10` (`kd_barang`, `nm_barang`, `satuan`, `qty`) VALUES
('1', 'Barang 1', 'Pack', '5'),
('2', 'Barang 2', 'Kapsul', '15'),
('3', 'Barang 3', 'Tablet', '3'),
('4', 'Barang 4', 'Ampul', '23'),
('5', 'Barang 5', 'Botol', '36');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
