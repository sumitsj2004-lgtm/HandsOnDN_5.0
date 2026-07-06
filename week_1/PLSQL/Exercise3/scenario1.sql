create or replace procedure processmonthlyinterest
is
begin

    update accounts
    set balance = balance + (balance * 0.01)
    where accounttype = 'Savings';

    commit;

end;
/

begin
    processmonthlyinterest;
end;
/