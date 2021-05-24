/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTS;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author buida
 */
public class ExecuteStatement {
    
    public static ArrayList<User> selectUser(){
        
        ArrayList<User> arr = new ArrayList<>();
        try {
            Statement stm = null;
            ResultSet rs = null;
            Connection  conn = ConnectionDataBase.getConnectDB();
            String s = " SELECT * FROM TaiKhoan";
            stm = conn.createStatement();
             rs = stm.executeQuery(s);
            while (rs.next()) {
                arr.add(new User(rs.getString(2), rs.getString(3)));
            }
            conn.close();
             
            return arr;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExecuteStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }
    
    public static ArrayList<ThiSinh> selectThiSinh(){
        ArrayList<ThiSinh> arrTS = new ArrayList<>();
        
        try {
            Statement stm = null;
            ResultSet rs = null;
            Connection  conn = ConnectionDataBase.getConnectDB();
            String s = "select SBD,HoTen,SoNha,Duong,Quan,ThanhPho,TenKhoi,Mon1,Mon2, Mon3, UuTien \n"
                + "	from ThiSinh inner join DiaChi on ThiSinh.SBD = DiaChi.IdDiaChi\n"
                + "	inner join Khoi on ThiSinh.IdKhoi = Khoi.IdKhoi";
            stm = conn.createStatement();
             rs = stm.executeQuery(s);
             
              while (rs.next()) {
            DiaChi dc = new DiaChi(Integer.valueOf(rs.getString(3)), rs.getString(4), rs.getString(5), rs.getString(6));
            Khoi k = new Khoi(rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            ThiSinh ts = new ThiSinh(Integer.valueOf(rs.getString(1)), rs.getString(2), k, dc, rs.getString(11));//5- 11
            arrTS.add(ts);
        }
              conn.close();
             
            return arrTS;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExecuteStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
