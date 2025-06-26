BEGIN
    FOR rec IN (
        SELECT l.LoanID, l.InterestRate, c.DOB
        FROM Loans2 l
        JOIN Customers c ON l.CustomerID = c.CustomerID
    )
    LOOP
        IF FLOOR(MONTHS_BETWEEN(SYSDATE, rec.DOB)/12) > 60 THEN
            UPDATE Loans2
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;
        END IF;
    END LOOP;
    COMMIT;
END;
/
