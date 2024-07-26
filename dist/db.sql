CREATE DATABASE  IF NOT EXISTS `prog63` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `prog63`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: prog63
-- ------------------------------------------------------
-- Server version	5.6.16

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
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `idbill` int(11) NOT NULL,
  `emp` varchar(45) DEFAULT NULL,
  `cust` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`idbill`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,'moaaz','sd co','2020-00-00'),(2,'moaaz','sd co','2020-00-00'),(3,'mazen','vault','2023-07-03'),(4,'jaber','zedan','2020-00-00'),(5,'moaaz','sd co','2016-00-00'),(6,'moaaz','sd co','2024-07-01'),(7,'moaaz','sd co','2024-07-02'),(9,'moaaz','zedan','2024-07-03'),(12,'jaber','zedan','2024-07-03'),(13,'moaaz','zedan','2023-12-12'),(19,'moaaz','zedan','2023-05-19'),(22,'moaaz','vault','2024-07-01'),(24,'moaaz','vault c','2024-06-30'),(36,'moaaz','zedan','2024-07-02'),(37,'moaaz','zedan','2024-07-01'),(39,'moaaz','sd co','2023-12-03'),(40,'moaaz','vault co','2023-12-03'),(56,'moaaz','sder co','2024-06-29'),(100,'moaaz','sd co','2020-00-00'),(101,'jaber','sder co','2023-05-06'),(102,'mohamed','vault co','2023-05-07'),(103,'mohamed','vault','2024-06-07');
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cust`
--

DROP TABLE IF EXISTS `cust`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cust` (
  `name` varchar(20) NOT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `debt` int(11) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cust`
--

LOCK TABLES `cust` WRITE;
/*!40000 ALTER TABLE `cust` DISABLE KEYS */;
INSERT INTO `cust` VALUES ('sd co','01132134566',262000),('sder co','01132134566',262000),('vault','01122233333',3193000),('vault c','01122233333',36000),('vault co','01122233333',117000),('zedan','01144356785',44000);
/*!40000 ALTER TABLE `cust` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emp` (
  `idemp` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) DEFAULT NULL,
  `job` varchar(20) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  PRIMARY KEY (`idemp`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` VALUES (1,'moaaz','مهندس',101000,'01132467809','october city','1982-11-19'),(2,'mazen','موظف',7000,'01267843210','sadat city','2000-01-09'),(5,'mohamed','مهندس',8000,'01233344432','fayom city','2006-06-06'),(7,'jaber','مهندس',11000,'01134234567','dokki','2002-12-12'),(9,'mostafa','موظف',8000,'01156789099','shekh zayed','1987-08-07'),(20,'fawzi','شؤون قانونية',7000,'01122222222','helmya','1988-03-12'),(21,'esmaeel','سكرتارية',5000,'01234543212','sayda','1980-12-19');
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `name` varchar(20) NOT NULL,
  `count` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES ('dell 450',78,16000),('hp e4',77,20000),('samsung pro8',50,13000);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sitems`
--

DROP TABLE IF EXISTS `sitems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sitems` (
  `idsitem` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sitems`
--

LOCK TABLES `sitems` WRITE;
/*!40000 ALTER TABLE `sitems` DISABLE KEYS */;
INSERT INTO `sitems` VALUES (4,'dell 450',2,16000),(4,'hp e4',2,20000),(6,'dell 450',1,16000),(7,'dell 450',1,16000),(7,'hp e4',2,20000),(12,'dell 450',1,16000),(12,'hp e4',3,20000),(9,'dell 450',5,16000),(9,'hp e4',5,20000),(13,'dell 450',5,16000),(13,'hp e4',5,20000),(19,'dell 450',1,16000),(19,'hp e4',1,20000),(36,'dell 450',1,16000),(36,'hp e4',2,20000),(37,'dell 450',1,16000),(37,'hp e4',1,20000),(22,'2',87,16000),(22,'1',86,20000),(24,'1',87,16000),(24,'1',86,20000),(56,'dell 450',1,16000),(56,'hp e4',1,20000),(39,'dell 450',2,16000),(39,'hp e4',2,20000),(40,'dell 450',2,16000),(40,'hp e4',2,20000),(101,'dell 450',1,16000),(101,'hp e4',1,20000),(102,'dell 450',1,16000),(102,'hp e4',1,20000),(103,'dell 450',2,16000),(103,'hp e4',2,20000);
/*!40000 ALTER TABLE `sitems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user` varchar(30) NOT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `permission` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('basem','12345','viewer'),('fawzi','1234','viewer'),('jaber','123','viewer'),('mazen','1234','admin'),('moaaz','123','admin');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-26  7:31:19
