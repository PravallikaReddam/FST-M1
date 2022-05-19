select customer_id, max(purchase_amount) maxPurchaseAmount from orders group by customer_id;
select salesman_id,max(PURCHASE_AMOUNT) from orders where order_date = '17-AUG-12' group by salesman_id, order_date;
select customer_id, order_date, max(purchase_amount) maxPurchaseAmount from orders group by customer_id, order_date having max(purchase_amount) in(2030, 3450, 5760, 6000);