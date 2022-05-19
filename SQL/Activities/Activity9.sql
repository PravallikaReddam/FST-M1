select * from customers;


select s.salesman_name, cu.customer_name 
from salesman s 
inner join customers cu 
on s.salesman_id = cu.salesman_id;


select * 
from customers c
left join salesman s 
on c.salesman_id = s.salesman_id
where c.grade < 300
order by c.CUSTOMER_ID;



select * 
from customers c
left join salesman s 
on c.salesman_id = s.salesman_id
where s.COMMISSION > 12
order by c.CUSTOMER_ID;



select o.order_no, o.purchase_amount, o.order_date, c.customer_name, c.city, c.grade,s.salesman_id,s.salesman_name,s.commission 
from orders o 
inner join customers c 
on o.CUSTOMER_ID = c.CUSTOMER_ID
inner join salesman s 
on o.salesman_id = s.salesman_id;