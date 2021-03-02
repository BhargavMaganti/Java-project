/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author bhargav
 */
public class Insert {
    public void insertion() throws IOException{
    DataInputStream ds=new DataInputStream(System.in);
    System.out.println("Serial id :");
                        String sid=ds.readLine();
                        System.out.println("Enter book name:");
                        String bname=ds.readLine();
                        System.out.println("Enter author name:");
                        String author=ds.readLine();
                        System.out.println("Enter price:");
                        float price=Float.parseFloat(ds.readLine());
                        System.out.println("Enter quantity:");
                        int Qty=Integer.parseInt(ds.readLine());
                        System.out.println("Enter ISBN number:");
                        String isb=ds.readLine();
                    try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav")) {
                Statement stmt=con.createStatement();
                String q1=
                        "insert into booksledger values('"+sid+"','"+bname+"','"+author+"','"+price+"','"+Qty+"','"+isb+"')";
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("Insert success");
                }
                else
                {
                    System.out.println("Insert unsuccess");
}           }
}
catch(  ClassNotFoundException | SQLException e)
{
System.out.println(e);
}
    }
}
