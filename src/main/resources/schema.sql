DROP TABLE IF EXISTS task;

CREATE TABLE task (
                      id bigserial  PRIMARY KEY,
                      title varchar(50) NOT NULL,
                      content varchar(100) NOT NULL,
                      dt_updated timestamp
);
INSERT INTO task(title,content,dt_updated)
values ('First task','Press ALT+F4',current_timestamp+interval '3 hours');
INSERT INTO task(title,content,dt_updated)
values ('Second task','Press ALT+F4 twice',current_timestamp+interval '3 hours');
INSERT INTO task(title,content,dt_updated)
values ('Third task','Press ALT+F4 3 thimes',current_timestamp+interval '3 hours');
select * from task;