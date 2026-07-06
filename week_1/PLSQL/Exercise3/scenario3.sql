create or replace procedure transferfunds(

    sourceaccount in number,
    targetaccount in number,
    amount in number

)
is

    balance number;

begin

    select balance
    into balance
    from accounts
    where accountid = sourceaccount;

    if balance >= amount then

        update accounts
        set balance = balance - amount
        where accountid = sourceaccount;

        update accounts
        set balance = balance + amount
        where accountid = targetaccount;

        commit;

        dbms_output.put_line('Transfer Successful');

    else

        dbms_output.put_line('Insufficient Balance');

    end if;

end;
/


begin
    transferfunds(1,2,500);
end;
/