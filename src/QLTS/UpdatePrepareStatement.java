/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTS;

import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author buida
 */

public class UpdatePrepareStatement {

    public static void updateDC(int id, int soNha, String duong, String quan, String thanhPho) {
        try {
            Connection conn = ConnectionDataBase.getConnectDB();
            String updatedc = "UPDATE DiaChi SET SoNha = ? , Duong = ? , Quan = ?, ThanhPho = ? "
                    + "		WHERE IdDiaChi = ?;";
            PreparedStatement preparedStatement = conn.prepareStatement(updatedc);
            preparedStatement.setInt(1, soNha);
            preparedStatement.setString(2, duong);
            preparedStatement.setString(3, quan);
            preparedStatement.setString(4, thanhPho);
            preparedStatement.setInt(5, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int updateTS(ThiSinh ts) {
        int idKhoi = 0;
        int sbd = ts.getSbd();
        String hoTen = ts.getHoTen().toString().trim();
        int soNha = ts.getDiaChi().getSoNha();
        String duong = ts.getDiaChi().getDuong().toString().trim();
        String quan = ts.getDiaChi().getQuan().toString().trim();
        String thanhPho = ts.getDiaChi().getThanhPho().toString().trim();
        String khoi = ts.getKhoi().getTenKhoi().toString().trim();
        String uuTien = ts.getUuTien().toString().trim();
        // sua trong sql
        if (khoi == "Khối A") {
            idKhoi = 1;
        } else if (khoi == "Khối B") {
            idKhoi = 2;
        } else {
            idKhoi = 3;
        }

        try {
            Connection conn = ConnectionDataBase.getConnectDB();
            String updatets = "UPDATE ThiSinh SET"
                    + "		HoTen = ?"
                    + "		,IdDiaChi = ?"
                    + "		,IdKhoi = ?"
                    + "		,UuTien = ?"
                    + "		WHERE SBD = ? ;";
//            
            updateDC(sbd, soNha, duong, quan, thanhPho);

            PreparedStatement preparedStatement = conn.prepareStatement(updatets);
            preparedStatement.setString(1, hoTen);
            preparedStatement.setInt(2, sbd);
            preparedStatement.setInt(3, idKhoi);
            preparedStatement.setString(4, uuTien);
            preparedStatement.setInt(5, sbd);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            conn.close();
            return rs;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    //delete
    public static void deleteDC(int id) {
        try {
            Connection conn = ConnectionDataBase.getConnectDB();
            String deletedc = "DELETE FROM DiaChi WHERE IdDiaChi = ?;";

            PreparedStatement preparedStatement = conn.prepareStatement(deletedc);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int deleteTS(ThiSinh ts) {

        int sbd = ts.getSbd();

        try {
            Connection conn = ConnectionDataBase.getConnectDB();
            String deletets = "DELETE FROM ThiSinh WHERE SBD = ?;";
//            
            deleteDC(sbd);

            PreparedStatement preparedStatement = conn.prepareStatement(deletets);
            preparedStatement.setInt(1, sbd);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            conn.close();
            return rs;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    //insert
    public static void insertDC( int soNha, String duong, String quan, String thanhPho) {
        try {
            Connection conn = ConnectionDataBase.getConnectDB();
            String updatedc = "INSERT INTO DiaChi( IdDiaChi, SoNha, Duong, Quan, ThanhPho)\n"
                    + "VALUES (NOT NULL,?,?,?,?);";

            PreparedStatement preparedStatement = conn.prepareStatement(updatedc);
            preparedStatement.setInt(1, soNha);
            preparedStatement.setString(2, duong);
            preparedStatement.setString(3, quan);
            preparedStatement.setString(4, thanhPho);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int insertTS(ThiSinh ts) {
        int idKhoi = 0;
        int sbd = ts.getSbd();
        String hoTen = ts.getHoTen().toString().trim();
        int soNha = ts.getDiaChi().getSoNha();
        String duong = ts.getDiaChi().getDuong().toString().trim();
        String quan = ts.getDiaChi().getQuan().toString().trim();
        String thanhPho = ts.getDiaChi().getThanhPho().toString().trim();
        String khoi = ts.getKhoi().getTenKhoi().toString().trim();
        String uuTien = ts.getUuTien().toString().trim();

        if (khoi == "Khối A") {
            idKhoi = 1;
        } else if (khoi == "Khối B") {
            idKhoi = 2;
        } else {
            idKhoi = 3;
        }

        try {
            Connection conn = ConnectionDataBase.getConnectDB();
            String updatets = "INSERT INTO ThiSinh( SBD, HoTen, IdDiaChi,IdKhoi,UuTien)\n"
                    + "VALUES (NOT NULL ,?,?,?,?);";
//            
            insertDC(soNha, duong, quan, thanhPho);

            PreparedStatement preparedStatement = conn.prepareStatement(updatets);
            preparedStatement.setString(1, hoTen);
            preparedStatement.setInt(2, sbd);
            preparedStatement.setInt(3, idKhoi);
            preparedStatement.setString(4, uuTien);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            conn.close();
            return rs;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
