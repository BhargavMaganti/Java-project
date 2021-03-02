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
public class Update {
    
    public void Updation() throws IOException{
        int w=0;
         DataInputStream ds=new DataInputStream(System.in);
                 do{
                     System.out.println("Select an option to Update :\n1.SerialID\n2.Book name\n3.Author name\n4.Price\n5.Quantity\n6.ISBN\n7.Quit");
                 w=Integer.parseInt(ds.readLine());
                 switch(w){
                     case 1:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav")) {
                System.out.println("updated SerialID");
                int id=Integer.parseInt(ds.readLine());
                
                System.out.println("Enter the name of the book");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update booksledger set SerialID ='"+id+"'where BookName='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("Updated Successfully");
                }
                else
                {
                    System.out.println("Update not Successful");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;
                     case 2:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav")) {
                System.out.println("Enter the SerialID of the book");
                int id=Integer.parseInt(ds.readLine());
                System.out.println("updated Book Name");
                String dbname=ds.readLine();
                
            
                
                Statement stmt=con.createStatement();
                String q1=
                       " update booksledger set BookName ='"+dbname+"'where SerialID='"+id+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("Updated Successfully");
                }
                else
                {
                    System.out.println("Update not Successful");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                     break;
                     case 3:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav")) {
                System.out.println("updated Author Name");
                String Abname=ds.readLine();
                
                System.out.println("Enter the name of the book");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update booksledger set Author ='"+Abname+"'where BookName='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("Updated Successfully");
                }
                else
                {
                    System.out.println("Update not Successful");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;
                     case 4:try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav")) {
                System.out.println("updated Price");
                float p=Float.parseFloat(ds.readLine());
                
                System.out.println("Enter the name of the book");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update booksledger set price ='"+p+"'where BookName='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("updated successfully");
                }
                else
                {
                    System.out.println("couldn't update");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;
                     case 5:
                         try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav")) {
                System.out.println("updated Quantity");
                int Qt=Integer.parseInt(ds.readLine());
                
                System.out.println("Enter the name of the book");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update booksledger set Quantity='"+Qt+"'where BookName='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("Updated Successfully");
                }
                else
                {
                    System.out.println("Update not Successful");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                    
                    break;
                     case 6:     try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","bhargav")) {
                System.out.println("updated ISBN");
                 String is=ds.readLine();
                
                System.out.println("Enter the name of the book");
                String dbname=ds.readLine();
                Statement stmt=con.createStatement();
                String q1=
                       " update booksledger set ISBN='"+is+"'where BookName='"+dbname+"'";
                        
                int x=stmt.executeUpdate(q1);
                if(x>0)
                {
                    System.out.println("Updated Successfully");
                }
                else
                {
                    System.out.println("Update not Successful");
}           }
}
catch(  ClassNotFoundException | SQLException | IOException e)
{
System.out.println(e);
}
                         
                 }
                 }while(w!=7);
                    
    }
    
}
