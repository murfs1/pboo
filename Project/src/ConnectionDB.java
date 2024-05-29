/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author koputer 22
 */

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    static Connection koneksi = null;
    static String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/project";
    static String username = "root";
    static String pwd = "";
    
    public static Connection getConnection(){
        if(koneksi == null){
            try{
                Class.forName(jdbc);
                koneksi = DriverManager.getConnection(url, username, pwd);
                System.out.println("Koneksi Berhasil");
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return koneksi;
    }
}
