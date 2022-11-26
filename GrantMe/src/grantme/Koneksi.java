/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grantme;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
import java.sql.Connection;
public class Koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        // cek apakah koneksi null 
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost/grant_me";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("koneksi berhasil");
            } catch (SQLException t) {
                System.out.println("Error Membuat Koneksi");
            }
        }
        return koneksi;
    }
    public static void main(String[] args) {
        getKoneksi();
    }
}
