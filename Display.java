/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.*;
import java.sql.*;
public class Display {
    public void Disp() throws IOException{
       
        
                 try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav");
                    Statement stmt = con.createStatement();
                    
                      
                    
                    for(int f=1;f<100;f++){
                    String q1 = "select * from booksledger where SerialID='"+f+"'";
                    ResultSet x = stmt.executeQuery(q1);
                    if(x.next()){
                        
                        System.out.println("Book ID    : " + x.getInt("SerialID"));
                        System.out.println("Book Name  : " + x.getString("BookName"));
                        System.out.println("Author Name: " + x.getString("Author"));
                        System.out.println("Price      : " + x.getFloat("price"));
                        System.out.println("Copies     : " + x.getInt("Quantity"));
                        System.out.println("ISBN       : " + x.getString("isbn")+"\n");
                                          
                    }
                    
                    }
                }
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
        
    }
    
    }

