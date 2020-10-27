-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.11-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for spring_test
DROP DATABASE IF EXISTS `spring_test`;
CREATE DATABASE IF NOT EXISTS `spring_test` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `spring_test`;

-- Dumping data for table spring_test.contact: ~8 rows (approximately)
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` (`id`, `name`, `email`, `requested_date`, `message`) VALUES
	(1, 'test1', 'test1@gmail.com', '2020-10-25 11:22:31', NULL),
	(2, 'test2', 'test2@gmail.com', '2020-10-25 11:22:52', NULL),
	(3, 'test', 'fromclientemail.@gmail.co,', '2020-10-25 11:59:18', NULL),
	(4, 'test', 'fromclientemail.@gmail.co,', '2020-10-25 11:59:50', NULL),
	(5, 'test', 'fromclientemail.@gmail.co,', '2020-10-25 12:00:48', 'sample messatest'),
	(6, 'testemailfromclietnfortestin', 'testemailfromclietnfortestin.@gmail.co,', '2020-10-25 12:01:18', 'sample messatest'),
	(7, 'testemailfromclietnfortestin', 'testemailfromclietnfortestin.@gmail.co,', '2020-10-25 12:01:39', NULL),
	(8, 'testemailfromclietnfortestin', 'testemailfromclietnfortestin.@gmail.co,', '2020-10-25 12:02:00', '');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;

-- Dumping data for table spring_test.user: ~4 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `name`, `age`) VALUES
	(1, 'user1', 1),
	(2, 'user2', 10),
	(3, 'user3', 52),
	(4, 'user4', 15);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
