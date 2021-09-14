package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try{
            Connection conn= DriverManager.getConnection("jdbc:sqlite:/Users/manindersingh/Documents/ManinderSQLite/test.db");
            Statement statement=conn.createStatement();
            statement.execute("Create table IF NOT EXISTS "
                                +"contacts (name text, phone integer, email text)");
            //statement.execute("insert into contacts values ('Maninder',80543,'singh.maninder981@gmail.com')");
            //statement.execute("insert into contacts values ('Gurjeet',12343,'ergurjeet.maninder981@gmail.com')");
//            statement.execute("insert into contacts values ('tester',780543,'maninder981@gmail.com')");
//            statement.execute("insert into contacts values ('Anmol',980543,'mani981@gmail.com')");
//            statement.execute("insert into contacts values ('ratinder',7880543,'ratinder@gmail.com')");
            //statement.execute("Select * from contacts");
            //ResultSet results= statement.getResultSet(); or
            ResultSet results= statement.executeQuery("select * from contacts where name='Maninder'");
            while(results.next()){
                System.out.println(results.getString("name")+" "+
                                    results.getInt("phone")+" "+
                                    results.getString("email"));

            }
            results.close();
            System.out.println("Connection Successful");
            statement.close();
            conn.close();


        }catch (Exception e){
            System.out.println(e);
        }

       // System.out.println("Maninder");
    }
}
