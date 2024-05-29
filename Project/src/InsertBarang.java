/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author koputer 22
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertBarang {
    static Connection koneksi = null;
    static PreparedStatement ps;
    
    public static void main(String[] args){
         koneksi = ConnectionDB.getConnection();
         
         Scanner sc = new Scanner(System.in);
         System.out.println("KODE BARANG : ");
         String kode = sc.next();
         System.out.println("NAMA BARANG : ");
         String nama = sc.next();
         System.out.println("STOK BARANG : ");
         int stok = sc.nextInt();
         System.out.println("HARGA BARANG : ");
         int harga = sc.nextInt();
         
         String query = "INSERT INT0 BARANG VALUES(?,?,?,?)";
         
        try {
            ps = koneksi.prepareStatement(query);
            ps.setString(1, kode);
            ps.setString(2, nama);
            ps.setInt(3, stok);
            ps.setInt(4, harga);
            
            if(ps.executeUpdate() > 0){
                System.out.println("Berhasil Tambah Barang");
            }
        } catch (SQLException ex) {
            
        }
    }
}
