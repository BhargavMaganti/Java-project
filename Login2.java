/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.*;
import java.sql.*;
public class Login2 {
    public static String username;
    public  static String password;
     public static int login2() throws IOException {
            DataInputStream ds=new DataInputStream(System.in);
     
      System.out.println("---------------------------------------------------");
      System.out.println("Username :");
     username= ds.readLine();
      System.out.println("password :");
       password=ds.readLine();
     
     
     try{
  
         Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav")){
              
         Statement stmt=con.createStatement();
         String q1=" select * from userdetails where username='"+username+"'and password='"+password+"'";
        ResultSet rs=stmt.executeQuery(q1);
       if(rs.next()){
           System.out.println("Login success");
           System.out.println("---------------------------------------------------");
           return 0;
          }else{
           System.out.println("Incorrect Password or Username ");
           System.out.println("---If you donot have an accounut please SignUp---");
           System.out.println("---------------------------------------------------");
           return 1;
       }
        
            }
     
     }catch(ClassNotFoundException | SQLException e){
        System.out.println(e);
     }
        return 1;  
 }
    
}
