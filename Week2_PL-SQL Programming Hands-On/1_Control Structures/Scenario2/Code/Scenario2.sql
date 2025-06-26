ALTER TABLE Customers2 ADD IsVIP VARCHAR2(5);
BEGIN
    FOR rec IN (
        SELECT CustomerID, Balance FROM Customers2
    )
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers2
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        ELSE
            UPDATE Customers2
            SET IsVIP = 'FALSE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/
