/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Anditeguh
 */
public class koneksi {
    
    Connection connect;
    Statement sttmnt;
    ResultSet rslt;
    private static Connection koneksi;  
    public static Connection getKoneksi(){
        try{
            String url = "jdbc:mysql://localhost:8889/db_aplikasi_penjualan_kaos";
            String user = "root";
            String password = "root";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url,user,password);
            System.out.println("Koneksi berhasil");
            
        }catch(Exception e){
            System.out.println("Koneksi Gagal");
        }return koneksi;
    
    }
 
    
   
    
}
