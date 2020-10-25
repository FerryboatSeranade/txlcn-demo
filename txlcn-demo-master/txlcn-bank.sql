create database `tx-manager`;
use `tx-manager`;
CREATE TABLE `t_logger` (
                            `id` bigint(20) NOT NULL AUTO_INCREMENT,
                            `group_id` varchar(64) NOT NULL,
                            `unit_id` varchar(32) NOT NULL,
                            `tag` varchar(50) NOT NULL,
                            `content` varchar(1024) NOT NULL,
                            `create_time` varchar(30) NOT NULL,
                            `app_name` varchar(128) NOT NULL,
                            PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
CREATE TABLE `t_tx_exception` (
                                  `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                  `group_id` varchar(64) DEFAULT NULL,
                                  `unit_id` varchar(32) DEFAULT NULL,
                                  `mod_id` varchar(128) DEFAULT NULL,
                                  `transaction_state` tinyint(4) DEFAULT NULL,
                                  `registrar` tinyint(4) DEFAULT NULL,
                                  `remark` varchar(4096) DEFAULT NULL,
                                  `ex_state` tinyint(4) DEFAULT NULL COMMENT '0 未解决 1已解决',
                                  `create_time` datetime DEFAULT NULL,
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;


create database `bank-provider`;
use `bank-provider`;
CREATE TABLE `t_bank` (
                          `id` int(11) DEFAULT NULL,
                          `money` int(11) DEFAULT NULL,
                          `user` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `bank-provider`.t_bank (id, money, user) VALUES ('1', '100', 'a');



create database `bank-consumer`;
use `bank-consumer`;
CREATE TABLE `t_bank` (
                          `id` int(11) DEFAULT NULL,
                          `money` int(11) DEFAULT NULL,
                          `user` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `bank-consumer`.t_bank (id, money, user) VALUES ('1', '100', 'a');

