/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion_Base_de_datos;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lenin
 */
public class Tabla {
public void registrar (int id, String nombre) throws ClassNotFoundException, SQLException{
    Connection conexion = null;
    try{
        conexion = Conexion_Singleton.getConnection();
        boolean valid = conexion.isValid(50000);
        System.out.println(valid ? "Funciona correctamente" : "No funciona correctamente");
        PreparedStatement st = conexion.prepareStatement("insert into Ejercicio (id, Nombre) values (?, ?);");
        st.setInt(1, id);
        st.setString(2, nombre);
        st.executeUpdate();
        st.close();
    }catch(java.sql.SQLException sql){
        System.out.println("Error: " + sql);
    }finally{
        if(conexion != null){
            if(conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
public void listar() throws SQLException, ClassNotFoundException{
             Connection conexion = null;
    try{
        conexion = Conexion_Singleton.getConnection();
        boolean valid = conexion.isValid(50000);
        System.out.println(valid ? "Funciona correctamente" : "No funciona correctamente");
        PreparedStatement st = conexion.prepareStatement("select * from Ejercicio");
        
        ResultSet resultados = st.executeQuery();
        List<Estudiante> lista = new ArrayList();
        while(resultados.next()){
            Estudiante estudiante = new Estudiante();
            estudiante.setId(resultados.getInt("id"));
            estudiante.setNombre(resultados.getString("nombre"));
            lista.add(estudiante);
        }
        for (Estudiante estudiante : lista){
            System.out.println(estudiante.getId() + " " + estudiante.getNombre());
        }
        st.close();
    }catch(java.sql.SQLException sql){
        System.out.println("Error: " + sql);
    }finally{
        if(conexion != null){
            if(conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
}
