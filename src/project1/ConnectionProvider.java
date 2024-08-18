/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;
import java.sql.*;


/**
 *
 * @author rohan
 */
public class ConnectionProvider {
       public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:33061/college","root","1234567890");
            return con;
        }
        catch(Exception e)
        {
            return null;
        
        }
    
    }
    
    
}
