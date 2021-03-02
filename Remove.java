/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.*;
import java.sql.*;


/**
 *
 * @author bhargav
 */
public class Remove {
    public void delection(){
        DataInputStream ds=new DataInputStream(System.in);
        try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav")) {
                System.out.println("Enter the name of the book");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " delete from booksledger where BookName='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("Deleted Successfully");
                }
                else
                {
                    System.out.println("Delete not successful");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
    }
    
}
