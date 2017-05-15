-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: jobportal
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company` (
  `companyId` int(11) NOT NULL,
  `companyName` varchar(255) NOT NULL,
  `headquarters` varchar(255) NOT NULL,
  `companyUser` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `description` blob,
  PRIMARY KEY (`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobapplication`
--

DROP TABLE IF EXISTS `jobapplication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobapplication` (
  `appId` int(11) NOT NULL,
  `jobId` int(11) NOT NULL,
  `jobSeekerId` int(11) NOT NULL,
  `resume` tinyint(4) DEFAULT '0',
  `resumePath` blob,
  `state` int(11) DEFAULT '0',
  PRIMARY KEY (`appId`),
  KEY `jobposting_idx` (`jobId`),
  KEY `jobseeker_idx` (`jobSeekerId`),
  CONSTRAINT `FK1urhfyvocp1ryhb1c18dcbh5m` FOREIGN KEY (`jobSeekerId`) REFERENCES `jobseeker` (`jobSeekerId`),
  CONSTRAINT `FKjxcwb2fekoduom5q146d6sllh` FOREIGN KEY (`jobId`) REFERENCES `jobposting` (`jobId`),
  CONSTRAINT `jobposting` FOREIGN KEY (`jobId`) REFERENCES `jobposting` (`jobId`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `jobseeker` FOREIGN KEY (`jobSeekerId`) REFERENCES `jobseeker` (`jobSeekerId`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobapplication`
--

LOCK TABLES `jobapplication` WRITE;
/*!40000 ALTER TABLE `jobapplication` DISABLE KEYS */;
/*!40000 ALTER TABLE `jobapplication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobposting`
--

DROP TABLE IF EXISTS `jobposting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobposting` (
  `jobId` int(11) NOT NULL,
  `companyId` int(11) NOT NULL,
  `state` int(11) NOT NULL DEFAULT '0',
  `title` varchar(255) NOT NULL,
  `description` blob,
  `responsibilities` blob,
  `location` varchar(255) NOT NULL,
  `salary` float DEFAULT '0',
  PRIMARY KEY (`jobId`),
  KEY `company_idx` (`companyId`),
  CONSTRAINT `FK9s2a13di3vurgeiw7iwp1kwl` FOREIGN KEY (`companyId`) REFERENCES `company` (`companyId`),
  CONSTRAINT `company` FOREIGN KEY (`companyId`) REFERENCES `company` (`companyId`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobposting`
--

LOCK TABLES `jobposting` WRITE;
/*!40000 ALTER TABLE `jobposting` DISABLE KEYS */;
/*!40000 ALTER TABLE `jobposting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobseeker`
--

DROP TABLE IF EXISTS `jobseeker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobseeker` (
  `jobSeekerId` int(11) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `emailId` varchar(255) NOT NULL,
  `password` varchar(45) NOT NULL,
  `workEx` int(11) DEFAULT '0',
  `highestEducation` int(11) DEFAULT '0',
  `skills` blob,
  `verified` tinyint(4) DEFAULT '0',
  `verificationCode` int(11) NOT NULL,
  PRIMARY KEY (`jobSeekerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobseeker`
--

LOCK TABLES `jobseeker` WRITE;
/*!40000 ALTER TABLE `jobseeker` DISABLE KEYS */;
/*!40000 ALTER TABLE `jobseeker` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-15 12:21:36
