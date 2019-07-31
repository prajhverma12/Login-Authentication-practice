package com.rcpl.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection 
{
    static Connection con ;
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wtp16kiit","root","password");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static Connection dbConnection() 
    {
        return con ;
    }
}
