/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.*;
import java.sql.*;
public class Return {
    public void ret() throws IOException{
        DataInputStream ds=new DataInputStream(System.in);
        try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav");
                    System.out.println("Enter the name of the book  you want to return: ");
                String bok=ds.readLine();
                System.out.println("Enter the number of copies you want to return:");
                int rc=Integer.parseInt(ds.readLine());
                    Statement stmt1 = con.createStatement();
                    Statement stmt = con.createStatement();
                    String q1 ="select * from booksledger where bookName='"+bok+"'";
                    ResultSet rs1=stmt.executeQuery(q1);
                    if(rs1.next()){
                        int z=rs1.getInt("Quantity")+rc;
                    String q2 =" update booksledger set Quantity ='"+z+"'where BookName='"+bok+"'";
                    int rs=stmt1.executeUpdate(q2);
                    if(rs>0){
                        
                     System.out.println("Book Returned Successfully");
                    }else{
                        System.out.println("Book Return not Successful");
                    }
                     
                }
                }
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
    }
}
