/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author koputer 22
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class DataBarang {
    static Connection koneksi = null;
    static Statement st;
    static ResultSet rs;
    
    public static void main(String[] args) {
        koneksi = ConnectionDB.getConnection();
        String query = "select * from barang";
        try {
            st = koneksi.createStatement();
            rs = st.executeQuery(query);
            
            while (rs.next()) {                
                String kode = rs.getString("kode_barang");
                String nama = rs.getString("nama_barang");
                int stok = rs.getInt("stok");
                int harga = rs.getInt("harga");
                
                System.out.println("KODE BARANG :" + kode);
                System.out.println("NAMA BARANG :" + nama);
                System.out.println("STOK BARANG :" + stok);
                System.out.println("HARGA BARANG :" + harga);
                System.out.println("--------------------------");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
