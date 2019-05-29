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

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `FirstName` varchar(45) NOT NULL,
  `MiddleName` varchar(45) NOT NULL,
  `LastName` varchar(45) NOT NULL,
  `GenderId` varchar(1) NOT NULL,
  `Height` int(11) DEFAULT NULL,
  `BirthDate` datetime NOT NULL,
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdAddress` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdAddress_idx` (`IdAddress`),
  KEY `GenderID_idx` (`GenderId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES ('Desislava','Marinova','Mladenova','F',167,'1936-09-18 00:00:00',1,1),('Georgi','Stamenov','Kalaijiev','M',180,'1956-09-01 00:00:00',2,2),('Matio','Ivanov','Ivanov','M',202,'1933-03-03 00:00:00',3,3),('Angel','Angelov','Angelov','M',191,'1967-01-01 00:00:00',4,4),('Atanas','Todorov','Hadjikostov','M',190,'1978-12-13 00:00:00',5,5),('Gergana','Petkova','Petrova','F',167,'1988-11-10 00:00:00',6,6),('Elena','Mitkova','Rosenova','F',172,'1945-06-22 00:00:00',7,7),('Vladislav','Petrov','Kucev','M',178,'1990-02-04 00:00:00',8,8),('Deyan','Martinov','Penev','M',177,'1991-09-30 00:00:00',9,9),('Zdravko','Petev','Gerdjikov','M',179,'1982-02-02 00:00:00',10,10),('Nikolay','Koliov','Yurukov','M',196,'1936-05-11 00:00:00',11,11),('Stoio','Enchev','Shotev','M',193,'1971-05-08 00:00:00',12,12),('Stefan','Liybchev','Vylkvov','M',186,'1973-03-13 00:00:00',13,13),('Teodora','Koicheva','Kachorova','F',160,'1972-10-26 00:00:00',14,14),('Savina','Todorova','Peneva','F',163,'1980-09-19 00:00:00',15,15),('Hristo','Hristov','Haralampiev','M',167,'1936-12-15 00:00:00',16,16),('Ilya','Prodanov','Vasilev','M',200,'1937-09-02 00:00:00',17,17),('Valya','Gospodinova','Diulgerova','F',180,'1945-07-06 00:00:00',18,18),('Petya','Markova','Markova','F',176,'1991-07-10 00:00:00',19,19),('Stoicho','Stoev','Stoev','M',177,'1992-06-15 00:00:00',20,20);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-20 14:48:28
