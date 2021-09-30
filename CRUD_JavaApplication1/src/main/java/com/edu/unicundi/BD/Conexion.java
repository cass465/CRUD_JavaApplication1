/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unicundi.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cass465
 */
public class Conexion {
    public static Connection getConection(){
        String url = "jdbc:sqlserver//localhost:1433;" + "database=Autos;" + "user=sa;" + "password=XVV254;";
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch(SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
