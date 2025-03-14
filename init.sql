/*
SQLyog Professional v12.08 (64 bit)
MySQL - 8.0.13 : Database - parttime_job_management
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`parttime_job_management` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `parttime_job_management`;

/*Table structure for table `flyer_management` */

DROP TABLE IF EXISTS `flyer_management`;

CREATE TABLE `flyer_management` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `address` varchar(512) DEFAULT NULL,
  `requirement` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `person_count` int(11) DEFAULT NULL,
  `pub_date` datetime DEFAULT NULL,
  `salary` varchar(128) DEFAULT NULL,
  `title` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `flyer_management` */

insert  into `flyer_management`(`id`,`name`,`phone`,`address`,`requirement`,`person_count`,`pub_date`,`salary`,`title`) values (1,'万达广场传单派发','13888888888','-','万达广场传单派发<br />工作内容：派发宣传类型传单<br /><br />工作地点：多个万达广场附近<br /><br />工作时间：周一到周日中午12点到2点，晚上6点半到10点',100,'2019-03-13 20:26:05','时薪20元','万达广场传单派发');

/*Table structure for table `repast_management` */

DROP TABLE IF EXISTS `repast_management`;

CREATE TABLE `repast_management` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `address` varchar(512) DEFAULT NULL,
  `requirement` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `person_count` int(11) DEFAULT NULL,
  `pub_date` datetime DEFAULT NULL,
  `salary` varchar(128) DEFAULT NULL,
  `title` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

/*Data for the table `repast_management` */

insert  into `repast_management`(`id`,`name`,`phone`,`address`,`requirement`,`person_count`,`pub_date`,`salary`,`title`) values (1,'麦当劳','-','-','麦当劳兼职10人',10,'2019-03-13 20:27:23','日薪100元','麦当劳兼职'),(2,'测试餐饮','-','-','测试餐饮',10,'2019-03-12 20:29:48','时薪30元','测试餐饮'),(3,'测试餐饮2','-','-','测试餐饮2',20,'2019-03-20 20:30:40','时薪32元','测试餐饮2'),(4,'测试餐饮3','-','-','测试餐饮3',20,'2019-03-12 20:32:22','时薪30元','测试餐饮3'),(5,'测试餐饮4','-','-','测试餐饮4',97,'2019-03-12 20:36:09','时薪45元','测试餐饮4'),(6,'测试餐饮5','-','-','测试餐饮5',92,'2019-03-12 20:36:09','时薪60元','测试餐饮5'),(7,'测试餐饮6','-','-','测试餐饮6',96,'2019-03-12 20:36:09','时薪55元','测试餐饮6'),(8,'测试餐饮7','-','-','测试餐饮7',97,'2019-03-12 20:36:09','时薪47元','测试餐饮7'),(9,'测试餐饮8','-','-','测试餐饮8',96,'2019-03-12 20:36:09','时薪54元','测试餐饮8'),(10,'测试餐饮9','-','-','测试餐饮9',97,'2019-03-12 20:36:09','时薪59元','测试餐饮9'),(11,'测试餐饮10','-','-','测试餐饮10',100,'2019-03-12 20:36:09','时薪42元','测试餐饮10'),(12,'测试餐饮11','-','-','测试餐饮11',94,'2019-03-12 20:36:09','时薪56元','测试餐饮11'),(13,'测试餐饮12','-','-','测试餐饮12',100,'2019-03-12 20:36:09','时薪47元','测试餐饮12'),(14,'测试餐饮13','-','-','测试餐饮13',92,'2019-03-12 20:36:09','时薪46元','测试餐饮13'),(15,'测试餐饮14','-','-','测试餐饮14',100,'2019-03-12 20:36:09','时薪55元','测试餐饮14'),(16,'测试餐饮15','-','-','测试餐饮15',97,'2019-03-12 20:36:09','时薪57元','测试餐饮15'),(17,'测试餐饮16','-','-','测试餐饮16',96,'2019-03-12 20:36:09','时薪54元','测试餐饮16'),(18,'测试餐饮17','-','-','测试餐饮17',98,'2019-03-12 20:36:09','时薪58元','测试餐饮17'),(19,'测试餐饮18','-','-','测试餐饮18',93,'2019-03-12 20:36:09','时薪51元','测试餐饮18'),(20,'测试餐饮19','-','-','测试餐饮19',92,'2019-03-12 20:36:09','时薪46元','测试餐饮19'),(21,'测试餐饮20','-','-','测试餐饮20',93,'2019-03-12 20:36:09','时薪49元','测试餐饮20'),(22,'测试餐饮21','-','-','测试餐饮21',94,'2019-03-12 20:36:09','时薪45元','测试餐饮21'),(23,'测试餐饮22','-','-','测试餐饮22',94,'2019-03-12 20:36:09','时薪42元','测试餐饮22'),(24,'测试餐饮23','-','-','测试餐饮23',92,'2019-03-12 20:36:09','时薪41元','测试餐饮23'),(25,'测试餐饮24','-','-','测试餐饮24',99,'2019-03-12 20:36:09','时薪44元','测试餐饮24'),(26,'测试餐饮25','-','-','测试餐饮25',99,'2019-03-12 20:36:09','时薪56元','测试餐饮25'),(27,'测试餐饮26','-','-','测试餐饮26',98,'2019-03-12 20:36:09','时薪47元','测试餐饮26'),(28,'测试餐饮27','-','-','测试餐饮27',94,'2019-03-12 20:36:09','时薪52元','测试餐饮27'),(29,'测试餐饮28','-','-','测试餐饮28',99,'2019-03-12 20:36:09','时薪49元','测试餐饮28'),(30,'测试餐饮29','-','-','测试餐饮29',98,'2019-03-12 20:36:09','时薪42元','测试餐饮29'),(31,'测试餐饮30','-','-','测试餐饮30',92,'2019-03-12 20:36:09','时薪57元','测试餐饮30'),(32,'测试餐饮31','-','-','测试餐饮31',95,'2019-03-12 20:36:09','时薪53元','测试餐饮31'),(33,'测试餐饮32','-','-','测试餐饮32',91,'2019-03-12 20:36:09','时薪60元','测试餐饮32'),(34,'测试餐饮33','-','-','测试餐饮33',91,'2019-03-12 20:36:09','时薪58元','测试餐饮33'),(35,'测试餐饮34','-','-','测试餐饮34',91,'2019-03-12 20:36:09','时薪60元','测试餐饮34'),(36,'测试餐饮35','-','-','测试餐饮35',98,'2019-03-12 20:36:09','时薪50元','测试餐饮35'),(37,'测试餐饮36','-','-','测试餐饮36',95,'2019-03-12 20:36:09','时薪44元','测试餐饮36'),(38,'测试餐饮37','-','-','测试餐饮37',93,'2019-03-12 20:36:10','时薪60元','测试餐饮37'),(39,'测试餐饮38','-','-','测试餐饮38',97,'2019-03-12 20:36:10','时薪54元','测试餐饮38'),(40,'测试餐饮39','-','-','测试餐饮39',96,'2019-03-12 20:36:10','时薪49元','测试餐饮39'),(41,'测试餐饮40','-','-','测试餐饮40',92,'2019-03-12 20:36:10','时薪42元','测试餐饮40'),(42,'测试餐饮41','-','-','测试餐饮41',96,'2019-03-12 20:36:10','时薪44元','测试餐饮41'),(43,'测试餐饮42','-','-','测试餐饮42',91,'2019-03-12 20:36:10','时薪54元','测试餐饮42'),(44,'测试餐饮43','-','-','测试餐饮43',97,'2019-03-12 20:36:10','时薪49元','测试餐饮43'),(45,'测试餐饮44','-','-','测试餐饮44',100,'2019-03-12 20:36:10','时薪51元','测试餐饮44'),(46,'测试餐饮45','-','-','测试餐饮45',100,'2019-03-12 20:36:10','时薪47元','测试餐饮45'),(47,'测试餐饮46','-','-','测试餐饮46',98,'2019-03-12 20:36:10','时薪44元','测试餐饮46'),(48,'测试餐饮47','-','-','测试餐饮47',99,'2019-03-12 20:36:10','时薪44元','测试餐饮47'),(49,'测试餐饮48','-','-','测试餐饮48',92,'2019-03-12 20:36:10','时薪55元','测试餐饮48'),(50,'测试餐饮49','-','-','测试餐饮49',94,'2019-03-12 20:36:10','时薪57元','测试餐饮49'),(51,'测试餐饮50','-','-','测试餐饮50',97,'2019-03-12 20:36:10','时薪43元','测试餐饮50'),(52,'测试餐饮51','-','-','测试餐饮51',94,'2019-03-12 20:36:10','时薪50元','测试餐饮51'),(53,'测试餐饮52','-','-','测试餐饮52',97,'2019-03-12 20:36:10','时薪44元','测试餐饮52'),(54,'测试餐饮53','-','-','测试餐饮53',96,'2019-03-12 20:36:10','时薪55元','测试餐饮53'),(55,'测试餐饮54','-','-','测试餐饮54',94,'2019-03-12 20:36:10','时薪52元','测试餐饮54'),(56,'测试餐饮55','-','-','测试餐饮55',98,'2019-03-12 20:36:10','时薪51元','测试餐饮55'),(57,'测试餐饮56','-','-','测试餐饮56',97,'2019-03-12 20:36:10','时薪43元','测试餐饮56'),(58,'测试餐饮57','-','-','测试餐饮57',95,'2019-03-12 20:36:10','时薪47元','测试餐饮57'),(59,'测试餐饮58','-','-','测试餐饮58',93,'2019-03-12 20:36:10','时薪53元','测试餐饮58'),(60,'测试餐饮59','-','-','测试餐饮59',100,'2019-03-12 20:36:10','时薪47元','测试餐饮59'),(61,'测试餐饮60','-','-','测试餐饮60',99,'2019-03-12 20:36:10','时薪45元','测试餐饮60'),(62,'测试餐饮61','-','-','测试餐饮61',92,'2019-03-12 20:36:10','时薪56元','测试餐饮61'),(63,'测试餐饮62','-','-','测试餐饮62',97,'2019-03-12 20:36:10','时薪59元','测试餐饮62'),(64,'测试餐饮63','-','-','测试餐饮63',92,'2019-03-12 20:36:10','时薪55元','测试餐饮63'),(65,'测试餐饮64','-','-','测试餐饮64',98,'2019-03-12 20:36:10','时薪60元','测试餐饮64'),(66,'测试餐饮65','-','-','测试餐饮65',98,'2019-03-12 20:36:10','时薪56元','测试餐饮65'),(67,'测试餐饮66','-','-','测试餐饮66',92,'2019-03-12 20:36:10','时薪41元','测试餐饮66'),(68,'测试餐饮67','-','-','测试餐饮67',98,'2019-03-12 20:36:10','时薪53元','测试餐饮67'),(69,'测试餐饮68','-','-','测试餐饮68',96,'2019-03-12 20:36:10','时薪45元','测试餐饮68'),(70,'测试餐饮69','-','-','测试餐饮69',97,'2019-03-12 20:36:10','时薪52元','测试餐饮69'),(71,'测试餐饮70','-','-','测试餐饮70',91,'2019-03-12 20:36:10','时薪50元','测试餐饮70'),(72,'测试餐饮71','-','-','测试餐饮71',97,'2019-03-12 20:36:10','时薪45元','测试餐饮71'),(73,'测试餐饮72','-','-','测试餐饮72',96,'2019-03-12 20:36:10','时薪59元','测试餐饮72'),(74,'测试餐饮73','-','-','测试餐饮73',95,'2019-03-12 20:36:10','时薪57元','测试餐饮73'),(75,'测试餐饮74','-','-','测试餐饮74',94,'2019-03-12 20:36:10','时薪52元','测试餐饮74'),(76,'测试餐饮75','-','-','测试餐饮75',99,'2019-03-12 20:36:10','时薪45元','测试餐饮75'),(77,'测试餐饮76','-','-','测试餐饮76',95,'2019-03-12 20:36:10','时薪43元','测试餐饮76'),(78,'测试餐饮77','-','-','测试餐饮77',96,'2019-03-12 20:36:10','时薪58元','测试餐饮77'),(79,'测试餐饮78','-','-','测试餐饮78',92,'2019-03-12 20:36:10','时薪42元','测试餐饮78'),(80,'测试餐饮79','-','-','测试餐饮79',96,'2019-03-12 20:36:10','时薪60元','测试餐饮79'),(81,'测试餐饮80','-','-','测试餐饮80',93,'2019-03-12 20:36:10','时薪48元','测试餐饮80'),(82,'测试餐饮81','-','-','测试餐饮81',97,'2019-03-12 20:36:10','时薪60元','测试餐饮81'),(83,'测试餐饮82','-','-','测试餐饮82',97,'2019-03-12 20:36:10','时薪46元','测试餐饮82'),(84,'测试餐饮83','-','-','测试餐饮83',98,'2019-03-12 20:36:10','时薪51元','测试餐饮83'),(85,'测试餐饮84','-','-','测试餐饮84',94,'2019-03-12 20:36:10','时薪51元','测试餐饮84'),(86,'测试餐饮85','-','-','测试餐饮85',98,'2019-03-12 20:36:10','时薪41元','测试餐饮85'),(87,'测试餐饮86','-','-','测试餐饮86',93,'2019-03-12 20:36:10','时薪44元','测试餐饮86'),(88,'测试餐饮87','-','-','测试餐饮87',92,'2019-03-12 20:36:10','时薪55元','测试餐饮87'),(89,'测试餐饮88','-','-','测试餐饮88',100,'2019-03-12 20:36:10','时薪49元','测试餐饮88'),(90,'测试餐饮89','-','-','测试餐饮89',98,'2019-03-12 20:36:10','时薪53元','测试餐饮89'),(91,'测试餐饮90','-','-','测试餐饮90',94,'2019-03-12 20:36:10','时薪56元','测试餐饮90'),(92,'测试餐饮91','-','-','测试餐饮91',93,'2019-03-12 20:36:10','时薪58元','测试餐饮91'),(93,'测试餐饮92','-','-','测试餐饮92',97,'2019-03-12 20:36:10','时薪41元','测试餐饮92'),(94,'测试餐饮93','-','-','测试餐饮93',93,'2019-03-12 20:36:10','时薪54元','测试餐饮93'),(95,'测试餐饮94','-','-','测试餐饮94',95,'2019-03-12 20:36:10','时薪42元','测试餐饮94'),(96,'测试餐饮95','-','-','测试餐饮95',93,'2019-03-12 20:36:10','时薪45元','测试餐饮95'),(97,'测试餐饮96','-','-','测试餐饮96',91,'2019-03-12 20:36:10','时薪48元','测试餐饮96'),(98,'测试餐饮97','-','-','测试餐饮97',100,'2019-03-12 20:36:10','时薪46元','测试餐饮97'),(99,'测试餐饮98','-','-','测试餐饮98',98,'2019-03-12 20:36:10','时薪55元','测试餐饮98'),(100,'测试餐饮99','-','-','测试餐饮99',92,'2019-03-12 20:36:10','时薪50元','测试餐饮99');

/*Table structure for table `supermarket_management` */

DROP TABLE IF EXISTS `supermarket_management`;

CREATE TABLE `supermarket_management` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `address` varchar(512) DEFAULT NULL,
  `requirement` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `person_count` int(11) DEFAULT NULL,
  `pub_date` datetime DEFAULT NULL,
  `salary` varchar(128) DEFAULT NULL,
  `title` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `supermarket_management` */

insert  into `supermarket_management`(`id`,`name`,`phone`,`address`,`requirement`,`person_count`,`pub_date`,`salary`,`title`) values (1,'超市兼职','-','-','超市兼职',10,'2019-03-13 20:29:31','时薪30元','超市兼职');

/*Table structure for table `tutor_management` */

DROP TABLE IF EXISTS `tutor_management`;

CREATE TABLE `tutor_management` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `address` varchar(512) DEFAULT NULL,
  `requirement` varchar(1000) DEFAULT NULL,
  `person_count` int(11) DEFAULT NULL,
  `pub_date` datetime DEFAULT NULL,
  `salary` varchar(128) DEFAULT NULL,
  `title` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tutor_management` */

insert  into `tutor_management`(`id`,`name`,`phone`,`address`,`requirement`,`person_count`,`pub_date`,`salary`,`title`) values (1,'测试家教1','-','-','测试家教1',10,'2019-03-13 20:27:48','日薪200元','测试家教1'),(2,'测试家教2','-','-','测试家教2',20,'2019-03-13 20:28:17','日薪200元','测试家教2');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(256) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `reg_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `role` varchar(32) DEFAULT 'admin',
  `phone` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`reg_date`,`role`,`phone`) values (1,'admin','202cb962ac59075b964b07152d234b70','2019-03-08 17:09:39','admin','13888888888'),(3,'admin2','202cb962ac59075b964b07152d234b70','2019-03-08 17:13:45','admin','admin'),(4,'jason','202cb962ac59075b964b07152d234b70','2019-03-15 02:08:16','user','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
