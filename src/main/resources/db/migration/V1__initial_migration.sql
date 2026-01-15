CREATE TABLE users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
CREATE TABLE profiles (
    id BIGINT PRIMARY KEY,
    bio VARCHAR(255),
    phone_number VARCHAR(50),
    date_of_birth DATE,
    loyalty_points INT,
    CONSTRAINT fk_profile_user FOREIGN KEY (id) REFERENCES users(id)
);
CREATE TABLE addresses (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    street VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(100),
    zip VARCHAR(20),
    user_id BIGINT,
    CONSTRAINT fk_address_user FOREIGN KEY (user_id) REFERENCES users(id)
);
CREATE TABLE tags (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100)
);
CREATE TABLE user_tags (
    user_id BIGINT NOT NULL,
    tag_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, tag_id),
    CONSTRAINT fk_user_tags_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_user_tags_tag FOREIGN KEY (tag_id) REFERENCES tags(id)
);
