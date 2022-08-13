/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica_Bases_De_Datos;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lenin
 */
public class Conexion_MySql implements Shape_Bases_De_Datos{

    @Override
    public void Connectarse() throws ClassNotFoundException, SQLException{
        Connection mysql = null;
        mysql = Conexiones_bases_de_datos.getConnectionMySQL();
    }
}
