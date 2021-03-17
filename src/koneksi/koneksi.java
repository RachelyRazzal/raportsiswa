/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;
public class koneksi {

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection koneksi;
    public Connection connect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi berhasil");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal koneksi"+ex);
        }
        
        String url = "jdbc:mysql://localhost/raport";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        } catch (SQLException ex) {
            System.out.println("Gagal Koneksi Database");
        }
        return koneksi;
    }
}