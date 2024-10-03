package library.management.system;

import java.sql.*;
public class Con{
    Connection c;
    Statement s;
    Con(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///LibraryManagementSystem","root","RAyhaan@16");
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
    }
}