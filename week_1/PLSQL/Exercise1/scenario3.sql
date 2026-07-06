declare

begin

    for loan in (

        select c.name, l.enddate
        from customers c
        join loans l
        on c.customerid = l.customerid
        where l.enddate between sysdate and sysdate + 30

    ) loop

        dbms_output.put_line(
            'Reminder : ' ||
            loan.name ||
            ' your loan is due on ' ||
            loan.enddate
        );

    end loop;

end;
/

-- note that before running this we need to set server output 'on' in oracle sql developer
-- learned this the hard way...