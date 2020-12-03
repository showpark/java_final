/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Lee, Won-Joo
 */
public class DB_MAN {
    String strDriver = "oracle.jdbc.driver.OracleDriver";
    String strURL = "jdbc:oracle:thin:@localhost:1521";      //Orcale DB connection(localhost)
    //String strURL = "jdbc:sqlserver://10.40.41.55:1433;DatabaseName=Product";      //Orcale DB connection(localhost)
    String strUser = "INHATC";          //Oracle DB User ID
    String strPWD = "inha1958";         //Oracle DB Password
    
    Connection DB_con;      //DB Connection
    Statement DB_stmt;      //To store statement for DB Connection
    ResultSet DB_rs;        //To store result of SQL Execution
   
   public void dbOpen() throws IOException{
       try{
           Class.forName(strDriver);            //Load JDBC-ODBC bridge driver
                                                //Setting DSN Prooerties in driver
           DB_con = DriverManager.getConnection(strURL, strUser, strPWD);   
           DB_stmt = DB_con.createStatement();  //To create statement for DB Connection
       }catch (Exception e){
           System.out.println("SQLException : " + e.getMessage());
       }
   }
   
   public void dbClose() throws IOException{
       try{
           DB_stmt.close();         //Exit Statement Connection
           DB_con.close();          //Exit DB Connection
       }catch (Exception e){
           System.out.println("SQLException : " + e.getMessage());
       }
   }
}


