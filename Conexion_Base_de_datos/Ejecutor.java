/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexion_Base_de_datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author lenin
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    static Tabla tabla = new Tabla();
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Connection singleton = null;
       Conexion_normal normal = new Conexion_normal();
       normal.conexion();
       
       singleton = Conexion_Singleton.getConnection();
       
       String nombre;
       int id;
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id");
        id = sc.nextInt();
        System.out.println("Ingrese el nombre");
        nombre = sc.next();
        
        tabla.registrar(id, nombre);
        tabla.listar();
    }
    
}
