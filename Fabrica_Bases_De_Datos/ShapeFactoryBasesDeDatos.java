/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica_Bases_De_Datos;

/**
 *
 * @author lenin
 */
public class ShapeFactoryBasesDeDatos {
    public Shape_Bases_De_Datos getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("MySQL")){
            return new Conexion_MySql();
        }else if (shapeType.equalsIgnoreCase("MariaDB")){
            return new Conexion_MariaDB();}
//        }else if (shapeType.equalsIgnoreCase("Circle")){
//            return new Circle();
//        }
 
        return null;
    }
}

