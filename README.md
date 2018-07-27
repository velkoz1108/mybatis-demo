# mybatis-demo
mybatis mysql json



-- 返回json文本的深度 输出结果
 select json_depth(coupon_rule_define) from coupon_rule; 
 
--  返回json文本的长度 输出结果 
 select json_length(coupon_rule_define) from coupon_rule;
 select json_length(open_times) from coupon;
 select json_length(item_scope) from coupon;
 
 
-- 返回json值得类型 输出结果
-- OBJECT
select json_type(coupon_rule_define) from coupon_rule;
-- ARRAY
 select json_type(item_scope) from coupon; 
 
 
--  判读是否是合法的json类型 
 SELECT JSON_VALID('hello') a, JSON_VALID('"hello"') b;

-- 查看存储的json有哪些key  基本数据类型的数组不行
select json_keys(open_times) from coupon; 


select json_search(open_times,'all','%3%') as a from coupon;


select json_extract(item_scope,'[0]') from coupon; 



select * from coupon where open_times -> '$.validDays ' = '3'

select json_extract(item_scope) from coupon;

select * from coupon where  item_scope ->> '$[0]' = 'hotel';


select * from coupon where open_times -> '$.end_time' >= now()

 ->> 可以去掉json的value的引号   -> 会带有引号
