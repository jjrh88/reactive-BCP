CREATE TABLE IF NOT EXISTS Item(
    id bigint auto_increment,
    title VARCHAR(100) NOT NULL,
    rating double
);

CREATE TABLE IF NOT EXISTS UserItem(
   id bigint auto_increment,
   username VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS ReviewItem(
    id bigint auto_increment,
    itemid bigint NOT NULL,
    userid bigint NOT NULL
);