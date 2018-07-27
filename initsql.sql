/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50714
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50714
 File Encoding         : 65001

 Date: 27/07/2018 17:23:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` bigint(20) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `obj_json` json,
  `obj_arr` json,
  `str_arr` json,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'www', '{\"name\": \"www\", \"level\": 1, \"title\": \"www\"}', '[{\"name\": \"www\", \"level\": 1, \"title\": \"www\"}, {\"name\": \"www\", \"level\": 1, \"title\": \"www\"}]', '[\"aaa\", \"bbb\", \"ccc\"]');
INSERT INTO `users` VALUES (2, 'ewe', '{\"name\": \"eee\", \"level\": 2, \"title\": \"eee\"}', '[{\"name\": \"eee\", \"level\": 2, \"title\": \"eee\"}, {\"name\": \"eee\", \"level\": 2, \"title\": \"eee\"}]', '[\"bbb\", \"eee\"]');
INSERT INTO `users` VALUES (3, '232', '{\"ccc\": \"cccc\", \"name\": \"eee\", \"level\": 2, \"title\": \"eee\"}', '[{\"ccc\": \"cccc\", \"name\": \"eee\", \"level\": 2, \"title\": \"eee\"}, {\"ccc\": \"cccc\", \"name\": \"eee\", \"level\": 2, \"title\": \"eee\"}, {\"ccc\": \"cccc\", \"name\": \"eee\", \"level\": 2, \"title\": \"eee\"}]', '[\"eee\", \"aaa\"]');

SET FOREIGN_KEY_CHECKS = 1;
