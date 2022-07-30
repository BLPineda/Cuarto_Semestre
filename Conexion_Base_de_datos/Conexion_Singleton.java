/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_Base_de_datos;
import java.sql.*;
/**
 *
 * @author lenin
 */
public class Conexion_Singleton {
 private static Connection con=null;
   public static Connection getConnection(){
      try{
         if( con == null ){
            String driver="com.mysql.jdbc.Driver"; 
            String url="jdbc:mysql://localhost:3306/bdjava";
            String contraseña="Lenin1uno.";
            String usuario="Lenin";
            Class.forName(driver);
            con = DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conection Succesfull");
         }
     }
     catch(ClassNotFoundException | SQLException ex){
        ex.printStackTrace();
     }
     return con;
   }

}
