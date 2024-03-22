CREATE OR REPLACE FUNCTION getMinBal (accno int, year1 int, month1 int) 
RETURNS NUMERIC
LANGUAGE  PLPGSQL
AS $$
DECLARE 
	minBal NUMERIC;
 	tbal numeric;
	currentBal NUMERIC;
	tranxtype text;
	minBal1 NUmeric;
	getBalCursor CURSOR (ano int, yr int, mn int) FOR
    SELECT t.amount, a.account_balance,t.transaction_type
    FROM ashish_transactions AS t
    JOIN ashish_accounts AS a ON t.account_no = a.account_no
    WHERE (t.account_no = ano
        AND EXTRACT(Year FROM t.transaction_date) = yr
        AND EXTRACT(Month FROM t.transaction_date) = mn);

BEGIN
	OPEN getBalCursor (accno,year1,month1);
	loop
	fetch getBalCursor into tbal,currentBal,tranxtype;
	exit when not found;
	minBal:=currentBal;
	case
	when tranxtype='deposit' then
		currentBal:=currentBal-tbal;
		raise notice ' % currentBal',currentBal;
	when tranxtype='withdrawal' then
		currentBal:=currentBal+tbal;
		raise notice ' % currentBal',currentBal;	
	end case;
		if(currentBal < minBal) then
		raise notice 'runnig if ';
			minBal1:= currentBal;
			raise notice '% minbal', minBal1;
		end if;
	
	end loop;
	close getBalCursor;
	return minBal1;
	end;
	$$;
