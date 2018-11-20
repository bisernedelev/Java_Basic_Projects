-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: person_characteristics
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `Country` varchar(45) NOT NULL,
  `City` varchar(45) NOT NULL,
  `Municipality` varchar(45) NOT NULL,
  `PostalCode` varchar(45) NOT NULL,
  `Street` varchar(45) NOT NULL,
  `Number` varchar(45) NOT NULL,
  `Floor` int(11) DEFAULT NULL,
  `ApNo` int(11) DEFAULT NULL,
  `IdAddress` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdAddress`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES ('Bulgaria','Sofia','Mladost','1015','Alabin','133',9,104,1),('Bulgaria','Sofia','Liulyn','1000','VasilLevski','5',1,1,2),('Bulgaria','Sofia','KrasnaPolyana','1002','Oborishte','120',1,3,3),('Bulgaria','Sofia','Mladost','1020','Shipka','51',9,43,4),('Bulgaria','Sofia','Strelbishte','1010','ShandorPetyofi','31',2,6,5),('Bulgaria','Sofia','Lozenetz','1015','IvanVazov','165',8,24,6),('Bulgaria','Sofia','Liulyn','1000','HristoBotev','99',9,31,7),('Bulgaria','Sofia','OvchaKupel','1003','Pirotska','43',6,12,8),('Bulgaria','Sofia','GornaBanya','1005','Stamboliysky','79',3,3,9),('Bulgaria','Sofia','OvchaKupel','1021','Alabin','157',3,1,10),('Bulgaria','Sofia','GornaBanya','1015','TodorAlexandrov','212',9,15,11),('Bulgaria','Sofia','KrasnaPolyana','1021','PetyrPetrov','6',12,36,12),('Bulgaria','Sofia','Lozenetz','1012','StefanStambolov','133',1,2,13),('Bulgaria','Sofia','GornaBanya','1015','CarOsvoboditel','190',18,40,14),('Bulgaria','Sofia','Liulyn','1016','Moskovska','32',3,3,15),('Bulgaria','Sofia','IvanVazov','1015','Pozitano','67',8,23,16),('Bulgaria','Sofia','Lozenetz','1026','CherniVrah','23',5,5,17),('Bulgaria','Sofia','Strelbishte','1023','Srebarna','35',9,26,18),('Bulgaria','Sofia','Liulyn','1000','G.M.Dimitrov','67',6,7,19),('Bulgaria','Sofia','KrasnaPolyana','1015','VasilLevski','100',2,2,20);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-20 14:48:29
