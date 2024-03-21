select ashish_get_past_balance(1001, '2023-02-19');

CREATE OR REPLACE FUNCTION getMinBal (accno int, year1 int, month1 int) 
RETURNS NUMERIC
LANGUAGE  PLPGSQL
AS $$
DECLARE 
	minBal NUMERIC;
	currentBal NUMERIC;
	getBalCursor CURSOR (ano int, yr int, mn int) FOR
	SELECT * FROM ashish_transactions WHERE (account_no = ano AND 
	(SELECT EXTRACT(Year FROM transaction_date) FROM ashish_transactions)
	AND (SELECT EXTRACT(Month FROM transaction_date)));
	
BEGIN
	OPEN getBalCursor (accno,year1,month1);
	loop
	fetch amount from getBalCursor into currentBal;
	exit when not found;
	if(currentBal < minBal) 
	minBal = currentBal;
	end if;
	end loop;
	