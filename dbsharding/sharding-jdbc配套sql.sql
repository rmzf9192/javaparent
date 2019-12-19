create database order_db character set 'UTF8' collate 'utf8_general_ci';

DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1` (
	`order_id` bigint(20) NOT NULL COMMENT '订单id',
	`price` decimal(10, 2) NOT NULL COMMENT '订单价格',
	`user_id` bigint(20) NOT NULL COMMENT '下单用户id',
	`status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
	PRIMARY KEY USING BTREE (`order_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `t_order_2`;

CREATE TABLE `t_order_2` (
	`order_id` bigint(20) NOT NULL COMMENT '订单id',
	`price` decimal(10, 2) NOT NULL COMMENT '订单价格',
	`user_id` bigint(20) NOT NULL COMMENT '下单用户id',
	`status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
	PRIMARY KEY USING BTREE (`order_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

create database order_db_1 character set 'UTF8' collate 'utf8_general_ci';
create database order_db_2 character set 'UTF8' collate 'utf8_general_ci';

DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1` (
	`order_id` bigint(20) NOT NULL COMMENT '订单id',
	`price` decimal(10, 2) NOT NULL COMMENT '订单价格',
	`user_id` bigint(20) NOT NULL COMMENT '下单用户id',
	`status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
	PRIMARY KEY USING BTREE (`order_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `t_order_2`;

CREATE TABLE `t_order_2` (
	`order_id` bigint(20) NOT NULL COMMENT '订单id',
	`price` decimal(10, 2) NOT NULL COMMENT '订单价格',
	`user_id` bigint(20) NOT NULL COMMENT '下单用户id',
	`status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
	PRIMARY KEY USING BTREE (`order_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

SELECT * FROM t_order_1;

SELECT * FROM t_order_2;
SELECT order_id,user_id from t_order_1 order by user_id;

SELECT * FROM t_order_1;
SELECT * FROM t_order_2;

create database user_db character set 'UTF8' collate 'utf8_general_ci';
DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
	`user_id` bigint(20) NOT NULL COMMENT '用户id',
	`fullname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
	`user_type` char(1) DEFAULT NULL COMMENT '用户类型',
	PRIMARY KEY USING BTREE (`user_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

SELECT * FROM t_user;

CREATE TABLE `t_dict` (
	`dict_id` bigint(20) NOT NULL COMMENT '字典id',
	`type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典类型',
	`code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典编码',
	`value` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典值',
	PRIMARY KEY USING BTREE (`dict_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;
-- sharding 案例
-- 店铺数据库
create database store_db character set 'UTF8' collate 'utf8_general_ci';
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
	`id` bigint(20) NOT NULL COMMENT 'id',
	`region_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地理区域编码',
	`region_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地理区域名称',
	`level` tinyint(1) NULL DEFAULT NULL COMMENT '地理区域级别(省、市、县)',
	`parent_region_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上级地理区域编码',
	PRIMARY KEY USING BTREE (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `region`
VALUES (1, '110000', '北京', 0, NULL);

INSERT INTO `region`
VALUES (2, '410000', '河南省', 0, NULL);

INSERT INTO `region`
VALUES (3, '110100', '北京市', 1, '110000');

INSERT INTO `region`
VALUES (4, '410100', '郑州市', 1, '410000');

DROP TABLE IF EXISTS `store_info`;

CREATE TABLE `store_info` (
	`id` bigint(20) NOT NULL COMMENT 'id',
	`store_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '店铺名称',
	`reputation` int(11) NULL DEFAULT NULL COMMENT '信誉等级',
	`region_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '店铺所在地',
	PRIMARY KEY USING BTREE (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `store_info`
VALUES (1, 'XX零食店', 4, '110100');

INSERT INTO `store_info`
VALUES (2, 'XX饮品店', 3, '410100');

-- 商品数据库
create database product_db_1 character set 'UTF8' collate 'utf8_general_ci';
create database product_db_2  character set 'UTF8' collate 'utf8_general_ci';
DROP TABLE IF EXISTS `product_descript_1`;
CREATE TABLE `product_descript_1` (
	`id` bigint(20) NOT NULL COMMENT 'id',
	`product_info_id` bigint(20) NULL DEFAULT NULL COMMENT '所属商品id',
	`descript` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品描述',
	`store_info_id` bigint(20) NULL DEFAULT NULL COMMENT '所属店铺id',
	PRIMARY KEY USING BTREE (`id`),
	INDEX `FK_Reference_2` USING BTREE(`product_info_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `product_descript_2`;

CREATE TABLE `product_descript_2` (
	`id` bigint(20) NOT NULL COMMENT 'id',
	`product_info_id` bigint(20) NULL DEFAULT NULL COMMENT '所属商品id',
	`descript` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品描述',
	`store_info_id` bigint(20) NULL DEFAULT NULL COMMENT '所属店铺id',
	PRIMARY KEY USING BTREE (`id`),
	INDEX `FK_Reference_2` USING BTREE(`product_info_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `product_info_1`;

CREATE TABLE `product_info_1` (
	`product_info_id` bigint(20) NOT NULL COMMENT 'id',
	`store_info_id` bigint(20) NULL DEFAULT NULL COMMENT '所属店铺id',
	`product_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
	`spec` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '规 格',
	`region_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产地',
	`price` decimal(10, 0) NULL DEFAULT NULL COMMENT '商品价格',
	`image_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片',
	PRIMARY KEY USING BTREE (`product_info_id`),
	INDEX `FK_Reference_1` USING BTREE(`store_info_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `product_info_2`;

CREATE TABLE `product_info_2` (
	`product_info_id` bigint(20) NOT NULL COMMENT 'id',
	`store_info_id` bigint(20) NULL DEFAULT NULL COMMENT '所属店铺id',
	`product_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
	`spec` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '规 格',
	`region_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产地',
	`price` decimal(10, 0) NULL DEFAULT NULL COMMENT '商品价格',
	`image_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片',
	PRIMARY KEY USING BTREE (`product_info_id`),
	INDEX `FK_Reference_1` USING BTREE(`store_info_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `region`;

CREATE TABLE `region` (
	`id` bigint(20) NOT NULL COMMENT 'id',
	`region_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地理区域编码',
	`region_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地理区域名称',
	`level` tinyint(1) NULL DEFAULT NULL COMMENT '地理区域级别(省、市、县)',
	`parent_region_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上级地理区域编码',
	PRIMARY KEY USING BTREE (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `region`
VALUES (1, '110000', '北京', 0, NULL);

INSERT INTO `region`
VALUES (2, '410000', '河南省', 0, NULL);

INSERT INTO `region`
VALUES (3, '110100', '北京市', 1, '110000');

INSERT INTO `region`
VALUES (4, '410100', '郑州市', 1, '410000');

SELECT * FROM product_info_1;
SELECT * FROM product_info_2;

SELECT * FROM product_descript_1;
SELECT * FROM product_descript_2;