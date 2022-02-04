INSERT INTO task(title,content,dt_updated)
values ('First task','Press ALT+F4',current_timestamp+interval '3 hours');
INSERT INTO task(title,content,dt_updated)
values ('Second task','Press ALT+F4 twice',current_timestamp+interval '3 hours');
INSERT INTO task(title,content,dt_updated)
values ('Third task','Press ALT+F4 3 thimes',current_timestamp+interval '3 hours');
select * from task;