/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_14_irvanpebrian_xiirpl3;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SMKN 4 BANDUNG
 */
public class KoneksiDatabase {
    
public static Connection getConnection(){
      
    String host  = "localhost";
    String port = "3306";
    String username = "root";
    String password = "";
    String db = "db_inventaris";
    
    String konek = "jdbc:mysql://"+host+":"+port+"/"
            +db;
    
    System.out.println(konek);
    Connection koneksi = null;
    
      try {
          Class.forName("com.mysql.jdbc.Driver");
          koneksi = DriverManager.getConnection(konek,username,password);
          
          System.out.println("Koneksi Berhasil");
          
      } catch (Exception e) {
          e.printStackTrace();
          
          JOptionPane.showMessageDialog(null,"Koneksi Database Gagal");
          koneksi = null;
      }
    return koneksi;
      
  }
    
    
}

