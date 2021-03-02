/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.io.*;
import java.sql.*;
import java.util.Date;
public class Purchase {
    public static String user;
    public  static String pass;
    
    public void Buy() throws IOException {
        
        float total=0;
        int j=0,g=0;
        
        DataInputStream ds=new DataInputStream(System.in);
        System.out.println("would you like to: \n1.Display books in database\n2.Search by ");
                  int b=Integer.parseInt(ds.readLine());
                    switch(b){
                        case 1:try {
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
                    do{
                      String usr=Login2.username;
                      String pwd=Login2.password;
                    System.out.println("Enter the name of the book you want to purchase :");
                    String pbook=ds.readLine();
                    System.out.println("How many copies of book  :");
                    int cp=Integer.parseInt(ds.readLine());
                    Statement stmt1 = con.createStatement();
                    Statement stmt2 = con.createStatement();
                    String q2 ="select * from booksledger where BookName='"+pbook+"'";
                    String q1=" select * from userdetails where username='"+usr+"'and password='"+pwd+"'";
                    ResultSet rs = stmt1.executeQuery(q2);
                    ResultSet rs1 = stmt2.executeQuery(q1);
                    if(rs1.next()){
                    if(rs.next()){
                        
                        if(cp<=rs.getInt("Quantity")){
                            float z=rs.getFloat("Price")*cp;
                            total=total+z;
                          
                        }
                        System.out.println("Would you like to purchase more books :\n1.Yes\n2.No");
                        j=Integer.parseInt(ds.readLine());
                            if(j==2){
                            Date dt=new Date();
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("\t\t\tDigital Library");
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("Customer Name    : "+rs1.getString(1)+"            "+dt);
                            System.out.println("Customer Mobile  : "+rs1.getString(2));
                            System.out.println("---------------------------------------------------------------------"); 
                            
                            System.out.println("Total amount including taxes :"+total);
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("\t\t\tThank you");
                            System.out.println("\t\t\tVisit Again...!");
                            total=0;
                        }
                        
                    }
                    }
                     }while(j!=2);
                }
                   
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
                        break;
                        case 2:do{
                                 System.out.println("Select a search method: \n1.Book name\n2.Author name\n3.ISBN\n4.Quit");
                                g=Integer.parseInt(ds.readLine());
                                switch(g){
                                    case 1:try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav");
                   do{
                    System.out.println("Enter the name of the book you want to purchase :");
                    String pbook=ds.readLine();
                    System.out.println("How many copies of book  :");
                    int cp=Integer.parseInt(ds.readLine());
                    Statement stmt1 = con.createStatement();
                    Statement stmt = con.createStatement();
                    String q2 ="select * from booksledger where BookName='"+pbook+"'";
                     String usr=Login2.username;
                      String pwd=Login2.password;
                    String q1=" select * from userdetails where username='"+usr+"'and password='"+pwd+"'";
                    ResultSet rs = stmt1.executeQuery(q2);
                    ResultSet rs1 = stmt.executeQuery(q1);
                    if(rs1.next()){
                    if(rs.next()){
                        if(cp<=rs.getInt("Quantity")){
                            float z=rs.getFloat("Price")*cp;
                            total=total+z;
                          
                        }
                        System.out.println("Would you like to purchase more books :\n1.Yes\n2.No");
                        j=Integer.parseInt(ds.readLine());
                            if(j==2){
                            Date dt=new Date();
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("\t\t\tDigital Library");
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("Customer Name    : "+rs1.getString(1)+"            "+dt);
                            System.out.println("Customer Mobile  : "+rs1.getString(2));
                            System.out.println("---------------------------------------------------------------------"); 
                            
                            System.out.println("Total amount including taxes :"+total);
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("\t\t\tThank you");
                            System.out.println("\t\t\tVisit Again...!");
                            total=0;
                        }
                    }
                    }
                     }while(j!=2);
                }
                   
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
                                    break;
                                    case 2:try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav");
                   do{
                    System.out.println("Enter the name of the Author  :");
                    String Abook=ds.readLine();
                    System.out.println("Books available :");
                    for(int f=0;f<100;f++){
                    Statement stmt =con.createStatement();
                   
                    String q1="select * from booksledger where Author='"+Abook+"' and SerialID='"+f+"'";
                    
                    ResultSet rs1 = stmt.executeQuery(q1);
                    
                    if(rs1.next()){
                   
                       System.out.println("-"+rs1.getString("BOOKNAME"));
                    }
                    }
                 System.out.println("Enter the name of the Book  :");
                   String pbook=ds.readLine();
                    System.out.println("How many copies of book  :");
                   int cp=Integer.parseInt(ds.readLine());
                    Statement stmt2 =con.createStatement();
                   Statement stmt1 = con.createStatement();
                   String q2 ="select * from booksledger where BookName='"+pbook+"'";
                   String usr=Login2.username;
                    String pwd=Login2.password;
                    String q3=" select * from userdetails where username='"+usr+"'and password='"+pwd+"'";
                  
                   
                   ResultSet rs = stmt1.executeQuery(q2);
                    ResultSet rs1 = stmt2.executeQuery(q3);
                    if(rs1.next()){
                   if(rs.next()){
                       if(cp<=rs.getInt("Quantity")){
                          float z=rs.getFloat("Price")*cp;
                            total=total+z;
                         
                        }
                       System.out.println("Would you like to purchase more books :\n1.Yes\n2.No");
                        j=Integer.parseInt(ds.readLine());
                            if(j==2){
                            Date dt=new Date();
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("\t\t\tDigital Library");
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("Customer Name    : "+rs1.getString(1)+"            "+dt);
                            System.out.println("Customer Mobile  : "+rs1.getString(2));
                            System.out.println("---------------------------------------------------------------------"); 
                            
                            System.out.println("Total amount including taxes :"+total);
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("\t\t\tThank you");
                            System.out.println("\t\t\tVisit Again...!");
                            total=0;
                       }
                       
                   }
                    }
                     }while(j!=2);
                   
                }
                   
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
                                      break;
                                    case 3:try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav");
                   do{
                    System.out.println("Enter the ISBN :");
                    String pbook=ds.readLine();
                    Statement stmt1 = con.createStatement();
                    Statement stmt = con.createStatement();
                    String q2 ="select * from booksledger where ISBN='"+pbook+"'";
                    String usr=Login2.username;
                    String pwd=Login2.password;
                    String q1=" select * from userdetails where username='"+usr+"'and password='"+pwd+"'";
                    ResultSet rs = stmt1.executeQuery(q2);
                    ResultSet rs1 = stmt.executeQuery(q1);
                    if(rs1.next()){
                    if(rs.next()){
                    System.out.println("-"+rs.getString("BOOKNAME"));
                    System.out.println("How many copies of book  :");
                    int cp=Integer.parseInt(ds.readLine());
                        if(cp<=rs.getInt("Quantity")){
                            float z=rs.getFloat("Price")*cp;
                            total=total+z;
                          
                        }
                        System.out.println("Would you like to purchase more books :\n1.Yes\n2.No");
                        j=Integer.parseInt(ds.readLine());
                            if(j==2){
                            Date dt=new Date();
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("\t\t\tDigital Library");
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("Customer Name    : "+rs1.getString(1)+"            "+dt);
                            System.out.println("Customer Mobile  : "+rs1.getString(2));
                            System.out.println("---------------------------------------------------------------------"); 
                            
                            System.out.println("Total amount including taxes :"+total);
                            System.out.println("---------------------------------------------------------------------"); 
                            System.out.println("\t\t\tThank you");
                            System.out.println("\t\t\tVisit Again...!");
                            total=0;
                        }
                        
                    }
                    }
                     }while(j!=2);
                }
                   
                catch(ClassNotFoundException | SQLException e) {
                    e.getMessage();
                }
                                    break;
                                        
                                }
                        }while(g!=4);
                            
                    }
    }
    
}
