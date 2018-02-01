CREATE TABLE time_entries (
  id         BIGINT(20) NOT NULL AUTO_INCREMENT,
  project_id BIGINT(20),
  user_id    BIGINT(20),
  date       DATE,
  hours      INT,

  PRIMARY KEY (id)
)
  ENGINE = innodb
<<<<<<< HEAD
  DEFAULT CHARSET = utf8;
=======
  DEFAULT CHARSET = utf8;
>>>>>>> 36a1e68ddc0a7612a7cd2fafb42c6bd9fee91964
