# Write your MySQL query statement below
select activity_date as day ,count(distinct user_id) as active_users From Activity
WHERE activity_date BETWEEN DATE('2019-06-28') AND DATE('2019-07-27')
GROUP BY activity_date;