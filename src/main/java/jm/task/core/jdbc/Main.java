package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory = Util.getSessionFactory();
            System.out.println("SessionFactory created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
