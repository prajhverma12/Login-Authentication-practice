package com.rcpl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginAuth 
{
    public static boolean loginauth(String user,String pass) 
    {
        try
        {
            Connection con = DbConnection.dbConnection();
            PreparedStatement pst = con.prepareStatement("select * from login where login_id=? and password=?");
            pst.setString(1, user);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                return true ;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false ;
    }
}
