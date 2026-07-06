-- there was no column for vip, so i added one... 
-- if this approach was wrong then i am open for constructive feedbacks 

alter table customers
add isvip varchar2(5);


-- affter creating the vip column we below is solution for the scenario 2

declare

begin

    for customer in (select * from customers) loop

        if customer.balance > 10000 then

            update customers
            set isvip = 'TRUE'
            where customerid = customer.customerid;

        end if;

    end loop;

    commit;

end;
/