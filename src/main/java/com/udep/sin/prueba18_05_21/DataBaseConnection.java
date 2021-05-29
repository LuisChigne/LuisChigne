/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//holi
package com.udep.sin.prueba18_05_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author luis
 */
public class DataBaseConnection {
    protected static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException
    {
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bd_peliculas?user=root&password=");
    return con;
    }
}
