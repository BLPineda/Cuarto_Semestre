/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fabrica_Bases_De_Datos;


import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class Ejecutor_FabricaBasesDeDatos {

    /**
     * @param args the command line arguments
     */
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ShapeFactoryBasesDeDatos factory = new ShapeFactoryBasesDeDatos();
        System.out.println("Seleccione opción\n1.MySQL.\n2.MariaDB");
        int eleccion = sc.nextInt();
        switch(eleccion){
            case 1: Shape_Bases_De_Datos shape1 = factory.getShape("MySQL");
        shape1.Connectarse();
        break;
            case 2: Shape_Bases_De_Datos shape2 = factory.getShape("MariaDB");
        shape2.Connectarse();
        break;
//            case 3: Shape_Bases_De_Datos shape3 = factory.getShape("Circle");
//        shape3.draw();
//        break;
            default: System.out.println("La opción que seleccionó no existe");
            break;
        }    
    }
    
}
