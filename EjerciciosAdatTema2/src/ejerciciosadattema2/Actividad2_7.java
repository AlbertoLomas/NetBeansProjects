/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Canales-PC
 */
public class Actividad2_7 {
    public static void main(String args[]){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conexion = DriverManager.getConnection("jdbc:odbc:Mysql-odbc");
            Statement sentencia = conexion.createStatement();
            String sql ="select apellido, oficio, salario from empleados where dept_no=1";
            ResultSet resul = sentencia.executeQuery(sql);
            while(resul.next()){
                System.out.printf("%s, %s, %d %n", resul.getString(1), resul.getString(2), resul.getInt(3));
            }
            resul.close();
            sentencia.close();
            conexion.close();
        }catch(ClassNotFoundException cn){
            cn.printStackTrace();
        }catch(SQLException e){
           e.printStackTrace(); 
        }   
    }
}
