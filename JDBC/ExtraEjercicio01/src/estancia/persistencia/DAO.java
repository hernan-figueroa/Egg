/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import java.sql.*;


/**
 *
 * @author Hernan
 */
public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "estancias_exterior";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws Exception{
        
        try {
            Class.forName(DRIVER);
            
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/"+DATABASE +"?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);            
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void desconectarBase() throws Exception{
        try {
            if (conexion != null) {
                conexion.close();
            }
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
                        
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();  
        }
    }
    
    protected void consultarBase(String sql)throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);    
        } catch (Exception e) {
            throw e;
        }
    }
}
