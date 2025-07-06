package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        // Create a new employee object
        Employee emp = new Employee("John Doe", "IT");

        // Open session and save the employee
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(emp);  // Save employee
            tx.commit();
            System.out.println("Employee saved with ID: " + emp.getId());
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        // Close the SessionFactory
        HibernateUtil.getSessionFactory().close();
    }
}
