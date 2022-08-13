/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica_Bases_De_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lenin
 */
public class Conexiones_bases_de_datos {
 final static String driver="com.mysql.jdbc.Driver";
 public static Connection getConnectionMySQL() throws ClassNotFoundException, SQLException{
    Connection conexion=null;
    String url="jdbc:mysql://localhost:3306/bdjava";
    String contraseña="Lenin1uno.";
    String usuario="Lenin"; 
    
     if( conexion == null ){
            Class.forName(driver);
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Se conectó correctamente a MySQL");
         }
     return conexion;
   }
 
 public static Connection getConnectionMariaDB() throws ClassNotFoundException, SQLException{
     Connection conexion = null;
     String usuarioMaria = "root";
     String contraseñaMaria = "Contraseña";
     String urlMaria="jdbc:mysql://localhost:3307/javabd";
     
        if( conexion == null ){
            Class.forName(driver);
            conexion = DriverManager.getConnection(urlMaria,usuarioMaria,contraseñaMaria);
            System.out.println("Se conectó correctamente a MariaDB");
         }
     return conexion;
   }

 
}
