create or replace procedure updateemployeebonus(

    dept in varchar2,
    bonus in number

)
is

begin

    update employees
    set salary = salary + (salary * bonus / 100)
    where department = dept;

    commit;

end;
/

begin
    updateemployeebonus('IT',10);
end;
/