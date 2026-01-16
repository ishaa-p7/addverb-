package org.example;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final String url;
    private static final String username;
    private static final String password;


    public static void main(String[] args) {
      try{  Class.forName("com.mysql.cj.jdbc.Driver");
        }
      catch(ClassNotFoundException e){
          e.printStackTrace();
      }
    }

}