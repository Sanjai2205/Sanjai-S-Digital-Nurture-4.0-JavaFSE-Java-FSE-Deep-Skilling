BEGIN
    FOR rec IN (
        SELECT c.Name AS CustomerName, l.LoanID, l.EndDate
        FROM Loans2 l
        JOIN Customers2 c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        INSERT INTO LoanReminders (CustomerName, LoanID, DueDate, ReminderMessage)
        VALUES (
            rec.CustomerName,
            rec.LoanID,
            rec.EndDate,
            'Reminder: Dear ' || rec.CustomerName ||
            ', your loan (ID: ' || rec.LoanID || ') is due on ' ||
            TO_CHAR(rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;
    COMMIT;
END;
/
