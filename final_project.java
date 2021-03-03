
package javaproject;
import java.io.*;
import java.sql.SQLException;
public class final_project {    
 public static void main(String[] args)throws IOException, ClassNotFoundException, SQLException{      
     int i ;
      DataInputStream ds=new DataInputStream(System.in);
       System.out.println("------WELCOME TO DIGITAL BOOK STORE------");
       System.out.println("1.Admin\n2.Customer");
      int vi=Integer.parseInt(ds.readLine());
      
      if(vi==1){
          System.out.println("Please verify your login address");
       if(Login.login()==1){
        do{
        System.out.println("Which operation do you to perform :");
        System.out.println("1.Insert  a book");
        System.out.println("2.Remove  a book");
        System.out.println("3.upadate a book");
        System.out.println("4.Add an admin");
        System.out.println("5.display");
        System.out.println("6.Quit");
         i=Integer.parseInt(ds.readLine());
         switch(i){
             case 1:
                 Insert in=new Insert();
                in.insertion();
                break;
             case 2:   
                 Remove re=new Remove();
                 re.delection();
                 break;
             case 3:
                 Update up=new Update();
                 up.Updation();
             break;
             case 5:
                 Display di=new Display();
                 di.Disp();
                 break;
             case 4 :
                Addadmin ad=new Addadmin();
                ad.addadmin();
                 break;
         }
        
            }while(i != 6);
            
            }
      }else if(vi==2){
          System.out.println("1.SignUp\n2.SignIn");
          int u=Integer.parseInt(ds.readLine());
          SignUp lg=new SignUp();
          Login2 lj=new Login2();
          if(u==2){
        if(lj.login2()==0){
           int t;
        do{
             System.out.println("Which operation do you to perform :");
             System.out.println("1.Purchase a book");
             System.out.println("2.Return a book");
             System.out.println("3.Quit  ");
             
             t=Integer.parseInt(ds.readLine());
             switch(t){
            case 1:
                Purchase pr=new Purchase();
                pr.Buy();
                break;
            case 2:
              
                Return rt=new Return();
                rt.ret();
                break;
                
        }
        }while(t!=3);
       }
          }else if(u==1){
              if(lg.signup()==1){
              if(lj.login2()==0){
           int t;
        do{
             System.out.println("Which operation do you to perform :");
             System.out.println("1.Purchase a book");
             System.out.println("2.Return a book");
             System.out.println("3.Quit  ");
             
             t=Integer.parseInt(ds.readLine());
             switch(t){
            case 1:
                Purchase pr=new Purchase();
                pr.Buy();
                break;
            case 2:
              
                Return rt=new Return();
                rt.ret();
                break;
                
        }
        }while(t!=3);
       }
           
       }
          }
            }
      
}}
         
        

