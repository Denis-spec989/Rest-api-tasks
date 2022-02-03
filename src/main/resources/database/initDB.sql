DROP TABLE IF EXISTS task;

CREATE TABLE task (
                      id bigserial  PRIMARY KEY,
--    user_id biginteger
                      title varchar(50) NOT NULL,
                      content varchar(100) NOT NULL,
                      dt_updated timestamp
);

INSERT INTO task(id,title,content,dt_updated)
values (1,'First task','Press ALT+F4',current_timestamp+interval '3 hours');

select * from task;