CREATE TABLE if not exists `gacha_hero` (
  `id` int(11) NOT NULL DEFAULT '0',
  `gacha_id` int(11) DEFAULT NULL,
  `hero_id` int(11) DEFAULT NULL,
  `probability` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE if not exists `hero` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(16) DEFAULT NULL,
  `attack` int(11) DEFAULT NULL,
  `defense` int(11) DEFAULT NULL,
  `hp` int(11) DEFAULT NULL,
  `rare` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;