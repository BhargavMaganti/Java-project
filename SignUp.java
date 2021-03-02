
package javaproject;
import java.io.*;
import java.sql.*;

public class SignUp {
    DataInputStream ds = new DataInputStream(System.in);

    public int signup() throws IOException {
        try {
            System.out.println("Enter Your Name: ");
            String name = ds.readLine();
            System.out.println("Enter Mobile. No: ");
            String mob = ds.readLine();
            System.out.println("Enter Username: ");
            String uname = ds.readLine();
            System.out.println("Enter Password: ");
            String pass = ds.readLine();
            System.out.println("Enter Re-Password: ");
            String repass = ds.readLine();
            if(pass.equals(repass)){
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "bhargav")) {
              
                Statement stmt = con.createStatement();
                String q1 = "insert into userdetails values('"+ name + "','" + mob + "','" + uname + "','" + pass + "')";
                int x = stmt.executeUpdate(q1);
                if (x > 0)
                    System.out.println("Account created Successfully");
                            
                            else  {
                    System.out.println("Failed to create an Account");
                    con.close();
                }
            }
            return 1;
            }
            else{
                System.out.println("Try again......");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return 0;
        
        
        
    }
}
