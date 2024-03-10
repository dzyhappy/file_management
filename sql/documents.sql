/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : file_management

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 09/03/2024 15:46:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for documents
-- ----------------------------
DROP TABLE IF EXISTS `documents`;
CREATE TABLE `documents`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '档案id',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '档案名称',
  `type_id` int NULL DEFAULT NULL COMMENT '档案类型id，使用去掉JX的纯数字代码',
  `file_location` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '存储',
  `overview` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '档案概述及备注',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `quick_name`(`name` ASC) USING BTREE COMMENT '档案名速查'
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of documents
-- ----------------------------
INSERT INTO `documents` VALUES (1, '计算机学院教师信息表', 201, 'abcdefg', '计算机学院教师信息表');
INSERT INTO `documents` VALUES (2, '计算机学院竞赛奖励汇总', 602, 'asdasdasd', '计算机学院竞赛奖励汇总（2021.11-2022.10）');
INSERT INTO `documents` VALUES (3, '教师培养汇总', 203, 'dfdsgfhgjhgj', '教师培养汇总（2014-2023）');
INSERT INTO `documents` VALUES (4, '2023版本科人才培养方案-软件工程', 301, 'ewrwtyghdfghgdf', '2023版本科人才培养方案-软件工程');
INSERT INTO `documents` VALUES (5, '2023上课计算机学院情况统计表', 201, 'dsfffdggggg', '2021级');
INSERT INTO `documents` VALUES (6, 'hahaha', 105, 'hahaha', 'hahaha');
INSERT INTO `documents` VALUES (9, 'hahaha', 105, 'hahaha', 'hahaha');
INSERT INTO `documents` VALUES (10, '状百人元必', 8798, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra placerat ex, sit amet bibendum velit hendrerit nec. Vivamus porttitor in sapien sed feugiat. Sed nec enim sodales, efficitur ipsum quis, dignissim felis. Praesent id odio tempor, vestibulum metus vitae, lobortis risus. Fusce non eleifend tortor. Quisque euismod vehicula tellus at pharetra. Maecenas suscipit non massa sed ullamcorper. Aliquam lacinia tristique augue eget rhoncus. Donec luctus eleifend sem, vitae sollicitudin libero accumsan quis. Nulla facilisi. Fusce enim urna, accumsan ut justo aliquam, blandit mattis nibh. Aenean nec varius sem. Morbi eu justo nibh.Suspendisse ac lobortis ante. Nullam vitae elit mauris. Sed vel est a nunc tincidunt faucibus. Aenean at eros eu eros vulputate finibus. Integer eu vestibulum arcu. Praesent ultricies magna eu dolor tristique euismod. Etiam sed consequat mi. Maecenas elementum, sapien vitae rhoncus ornare, odio lorem vehicula sapien, vel fermentum orci lorem id erat. Integer vitae porta nulla. Duis et cursus risus, vel laoreet sem.Sed dictum fringilla enim quis elementum. Maecenas interdum leo ut lorem euismod, non rhoncus sapien hendrerit. Nulla tempor placerat lacus, nec molestie felis efficitur id. Aliquam erat volutpat. Pellentesque eget malesuada erat, ut eleifend enim. Morbi mattis nulla vitae porta interdum. In varius ante nec tellus venenatis, at hendrerit mi ultricies.Vivamus eget nisi id nisl volutpat molestie. Praesent at tempor ipsum. Vestibulum eget tristique orci. Sed condimentum orci vitae diam rutrum auctor. Morbi gravida fringilla sapien, vel dapibus dui porttitor id. Praesent commodo id metus ac cursus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam finibus ullamcorper lobortis. Aenean ac purus in elit commodo egestas a sed sapien.', 'anim consequat sed irure sit');
INSERT INTO `documents` VALUES (11, '状百人元必', 8798, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra placerat ex, sit amet bibendum velit hendrerit nec. Vivamus porttitor in sapien sed feugiat. Sed nec enim sodales, efficitur ipsum quis, dignissim felis. Praesent id odio tempor, vestibulum metus vitae, lobortis risus. Fusce non eleifend tortor. Quisque euismod vehicula tellus at pharetra. Maecenas suscipit non massa sed ullamcorper. Aliquam lacinia tristique augue eget rhoncus. Donec luctus eleifend sem, vitae sollicitudin libero accumsan quis. Nulla facilisi. Fusce enim urna, accumsan ut justo aliquam, blandit mattis nibh. Aenean nec varius sem. Morbi eu justo nibh.Suspendisse ac lobortis ante. Nullam vitae elit mauris. Sed vel est a nunc tincidunt faucibus. Aenean at eros eu eros vulputate finibus. Integer eu vestibulum arcu. Praesent ultricies magna eu dolor tristique euismod. Etiam sed consequat mi. Maecenas elementum, sapien vitae rhoncus ornare, odio lorem vehicula sapien, vel fermentum orci lorem id erat. Integer vitae porta nulla. Duis et cursus risus, vel laoreet sem.Sed dictum fringilla enim quis elementum. Maecenas interdum leo ut lorem euismod, non rhoncus sapien hendrerit. Nulla tempor placerat lacus, nec molestie felis efficitur id. Aliquam erat volutpat. Pellentesque eget malesuada erat, ut eleifend enim. Morbi mattis nulla vitae porta interdum. In varius ante nec tellus venenatis, at hendrerit mi ultricies.Vivamus eget nisi id nisl volutpat molestie. Praesent at tempor ipsum. Vestibulum eget tristique orci. Sed condimentum orci vitae diam rutrum auctor. Morbi gravida fringilla sapien, vel dapibus dui porttitor id. Praesent commodo id metus ac cursus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam finibus ullamcorper lobortis. Aenean ac purus in elit commodo egestas a sed sapien.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas pharetra placerat ex, sit amet bibendum velit hendrerit nec. Vivamus porttitor in sapien sed feugiat. Sed nec enim sodales, efficitur ipsum quis, dignissim felis. Praesent id odio tempor, vestibulum metus vitae, lobortis risus. Fusce non eleifend tortor. Quisque euismod vehicula tellus at pharetra. Maecenas suscipit non massa sed ullamcorper. Aliquam lacinia tristique augue eget rhoncus. Donec luctus eleifend sem, vitae sollicitudin libero accumsan quis. Nulla facilisi. Fusce enim urna, accumsan ut justo aliquam, blandit mattis nibh. Aenean nec varius sem. Morbi eu justo nibh.Suspendisse ac lobortis ante. Nullam vitae elit mauris. Sed vel est a nunc tincidunt faucibus. Aenean at eros eu eros vulputate finibus. Integer eu vestibulum arcu. Praesent ultricies magna eu dolor tristique euismod. Etiam sed consequat mi. Maecenas elementum, sapien vitae rhoncus ornare, odio lorem vehicula sapien, vel fermentum orci lorem id erat. Integer vitae porta nulla. Duis et cursus risus, vel laoreet sem.Sed dictum fringilla enim quis elementum. Maecenas interdum leo ut lorem euismod, non rhoncus sapien hendrerit. Nulla tempor placerat lacus, nec molestie felis efficitur id. Aliquam erat volutpat. Pellentesque eget malesuada erat, ut eleifend enim. Morbi mattis nulla vitae porta interdum. In varius ante nec tellus venenatis, at hendrerit mi ultricies.Vivamus eget nisi id nisl volutpat molestie. Praesent at tempor ipsum. Vestibulum eget tristique orci. Sed condimentum orci vitae diam rutrum auctor. Morbi gravida fringilla sapien, vel dapibus dui porttitor id. Praesent commodo id metus ac cursus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam finibus ullamcorper lobortis. Aenean ac purus in elit commodo egestas a sed sapien.', 'anim consequat sed irure sit');

SET FOREIGN_KEY_CHECKS = 1;
