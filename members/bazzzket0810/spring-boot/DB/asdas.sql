CREATE DATABASE  IF NOT EXISTS `circumstence`
USE `circumstence`;

DROP TABLE IF EXISTS `pie`;

CREATE TABLE `pie`
(
    `user`         varchar(255) NOT NULL,
    `my_percent`   int          NOT NULL,
    `left_percent` int          NOT NULL,
    UNIQUE KEY `user_UNIQUE` (`user`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
SET character_set_client = @saved_cs_client;

INSERT INTO `pie` VALUES ('basket0810', 6, 94);
