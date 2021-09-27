/*
Navicat MySQL Data Transfer

Source Server         : 阿里云数据库
Source Server Version : 50735
Source Host           : 47.113.218.78:3306
Source Database       : db01

Target Server Type    : MYSQL
Target Server Version : 50735
File Encoding         : 65001

Date: 2021-09-27 20:15:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('6', '开发部', 'db01');
INSERT INTO `dept` VALUES ('7', '人事部', 'db01');
INSERT INTO `dept` VALUES ('8', '财务部', 'db01');
INSERT INTO `dept` VALUES ('9', '市场部', 'db01');
INSERT INTO `dept` VALUES ('10', '运维部', 'db01');
