-- scenario 1

declare

    customer_age number;

begin

    for loan in (select * from loans) loop

        select trunc(months_between(sysdate, dob) / 12)
        into customer_age
        from customers
        where customerid = loan.customerid;

        if customer_age > 60 then

            update loans
            set interestrate = interestrate - 1
            where loanid = loan.loanid;

        end if;

    end loop;

    commit;

end;
/