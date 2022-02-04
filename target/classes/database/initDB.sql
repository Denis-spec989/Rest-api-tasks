DROP TABLE IF EXISTS task;

CREATE TABLE task (
                      id bigserial  PRIMARY KEY,
--    user_id biginteger
                      title varchar(50) NOT NULL,
                      content varchar(100) NOT NULL,
                      dt_updated timestamp
);
