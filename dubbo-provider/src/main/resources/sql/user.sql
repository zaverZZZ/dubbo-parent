/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : javatest

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2019-04-08 22:09:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '2', '3', '4');
INSERT INTO `user` VALUES ('2', '12', '1233312', '123', '213');
INSERT INTO `user` VALUES ('3', '123', '123', 'qweqw', '1232');
INSERT INTO `user` VALUES ('4', 'wqeed', '123qwe', 'qwed', '12');
INSERT INTO `user` VALUES ('5', 'qweqweds', 'afdfqa', 'kjui', '2314');
INSERT INTO `user` VALUES ('6', 'kloi', 'ohoh', 'oihoih', '123');
INSERT INTO `user` VALUES ('7', 'oihohi', 'onono', 'oinn', '89789');
INSERT INTO `user` VALUES ('8', 'jkbkj', 'onuoigu', 'vbybuy', '9807980');
INSERT INTO `user` VALUES ('9', 'iubiu', 'ionbiu', 'biuybiu', '98098');
INSERT INTO `user` VALUES ('10', 'iubiu', 'gyuv', 'ftyfuyt', '98098');
INSERT INTO `user` VALUES ('11', 'bibufu', 'yvuyo', 'biuybiyf', '98');
INSERT INTO `user` VALUES ('12', 'hiug', 'nuhiu', 'gyug', '9709');
INSERT INTO `user` VALUES ('13', 'bibig', 'uygf', 'uygbi', '8976');
