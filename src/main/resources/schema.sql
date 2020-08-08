DROP TABLE IF EXISTS `COMPANY`;

CREATE TABLE `COMPANY` (
    `company_id` int(11) not null primary key auto_increment,
    `name` varchar(64) not null,
    `location` varchar(200) not null,
);
