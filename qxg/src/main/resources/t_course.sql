/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50151
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2018-03-13 15:43:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course` (
  `description` varchar(255) DEFAULT NULL,
  `teacher` varchar(255) DEFAULT NULL,
  `cname` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_course
-- ----------------------------
INSERT INTO `t_course` VALUES ('很简单AA', '李珊A', '英语A', '1');
INSERT INTO `t_course` VALUES ('蝌蚪贼屌', '蝌蚪', '编程', '7');
INSERT INTO `t_course` VALUES ('叮叮当当', '思思', '音乐', '13');
INSERT INTO `t_course` VALUES ('', '貌似俄火速', '美术', '35');
INSERT INTO `t_course` VALUES ('', '李老师', '自然', '36');
INSERT INTO `t_course` VALUES ('很难记', '花护花', '历史', '38');
INSERT INTO `t_course` VALUES ('的', '但你熊', '丹尼', '39');
INSERT INTO `t_course` VALUES ('测试描述', '测试', '测试', '40');
INSERT INTO `t_course` VALUES ('继续测试描述1', '继续测试1', '继续测试1', '41');
SET FOREIGN_KEY_CHECKS=1;
