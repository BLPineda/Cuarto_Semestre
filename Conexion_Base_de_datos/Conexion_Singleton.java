/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_Base_de_datos;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author lenin
 */
public class Conexion_Singleton {
 private static Connection conexion=null;
 final static String driver="com.mysql.jdbc.Driver";
 final static String url="jdbc:mysql://localhost:3306/bdjava";
 final static String contraseña="Lenin1uno.";
 final static String usuario="Lenin"; 

 public static Connection getConnection() throws ClassNotFoundException, SQLException{
         if( conexion == null ){
            Class.forName(driver);
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Se conectó correctamente");
         }
     return conexion;
   }
}
