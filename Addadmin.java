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
public class Addadmin {
    public int addadmin() throws IOException, ClassNotFoundException, SQLException{
        try{
        DataInputStream ds=new DataInputStream(System.in);
                        System.out.println("Admin Specific ID:");
                        int si=Integer.parseInt(ds.readLine());
                        System.out.println("Admin Name:");
                        String sid=ds.readLine();
                        System.out.println("Password:");
                        String pass=ds.readLine();
                        System.out.println("Re-Enter Password: ");
                        String repass = ds.readLine();
                     if(pass.equals(repass)){
                         
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "bhargav")) {
              
                Statement stmt = con.createStatement();
                String q1 = "insert into login values('"+ si + "','" + sid + "','" + pass + "')";
                int x = stmt.executeUpdate(q1);
                if (x > 0)
                    System.out.println("Success");
                            
                            else  {
                    System.out.println("Failed");
                    con.close();
                }
            }
            return 1;
            }
            else{
                System.out.println("Try again......");
            }}
                   
catch(  ClassNotFoundException | SQLException e)
{
System.out.println(e);
}
        return 0;
        
    }
}
