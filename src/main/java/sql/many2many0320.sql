/*
SQLyog Ultimate v12.09 (32 bit)
MySQL - 5.7.13-log : Database - many2many
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`many2many` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `many2many`;

/*Table structure for table `choose_course` */

DROP TABLE IF EXISTS `choose_course`;

CREATE TABLE `choose_course` (
  `cc_sid` int(10) NOT NULL,
  `cc_cid` varchar(32) NOT NULL,
  `cc_grade` int(4) DEFAULT NULL,
  PRIMARY KEY (`cc_sid`,`cc_cid`),
  KEY `course_cc_fk` (`cc_cid`),
  CONSTRAINT `course_cc_fk` FOREIGN KEY (`cc_cid`) REFERENCES `course` (`cid`),
  CONSTRAINT `stu_cc_fk` FOREIGN KEY (`cc_sid`) REFERENCES `student` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `choose_course` */

insert  into `choose_course`(`cc_sid`,`cc_cid`,`cc_grade`) values (101,'1001',65),(101,'1002',70),(102,'1001',80),(102,'1003',50),(103,'1004',90),(104,'1001',82);

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `cid` varchar(32) NOT NULL,
  `cname` varchar(32) DEFAULT NULL,
  `cperiod` int(4) DEFAULT NULL COMMENT '学时',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

insert  into `course`(`cid`,`cname`,`cperiod`) values ('1001','java基础',42),('1002','javaweb',30),('1003','ssm',20),('1004','mysql',10);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `sid` int(10) NOT NULL,
  `sname` varchar(32) DEFAULT NULL,
  `ssex` varchar(4) DEFAULT '男',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`sid`,`sname`,`ssex`) values (101,'崔一','男'),(102,'崔二','女'),(103,'崔三','女'),(104,'崔四','男');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
