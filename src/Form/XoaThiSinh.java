/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import static Form.SuaThiSinh.arrTS;
import QLTS.ConnectionDataBase;
import QLTS.ExecuteStatement;
import QLTS.ThiSinh;
import QLTS.UpdatePrepareStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class XoaThiSinh extends java.awt.Frame {

    static ArrayList<ThiSinh> arrTS = new ArrayList<>();
    static ConnectionDataBase conn = new ConnectionDataBase();
    static UpdatePrepareStatement prepareStatement;
    static ExecuteStatement executeStatement;
    static int index = -1;
    static int index_begin = 0;
    static int index_end = 5;
    
    public XoaThiSinh() {
        initComponents();
        
        btnBack.setEnabled(false);
        btnNext.setEnabled(true);
        loadForm(index_begin,index_end);
        
    }
    
    public void loadForm(int index_begin, int index_end){
        
        arrTS = executeStatement.selectThiSinh();
        
        if(index_begin <=0){
            index_begin = 0;
            btnBack.setEnabled(false);
        }else btnBack.setEnabled(true);
        
        if(index_end >= arrTS.size()){
            index_end = arrTS.size();
            btnNext.setEnabled(false);
        }else btnNext.setEnabled(true);
        
        
        String ss = "";
        for(int i =index_begin ;i<index_end;i++){
            ss += arrTS.get(i).getSbd() + "\t";
            ss += arrTS.get(i).getHoTen() + "\t";
            ss += arrTS.get(i).getKhoi().getTenKhoi() + "\t";
            ss += arrTS.get(i).getDiaChi().getThanhPho() + "\t";
            ss += arrTS.get(i).getUuTien() + "\t"+"\n";
        }
        if(ss != null)
            tar_ttthisinh.setText(ss.toString());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        tar_ttthisinh = new java.awt.TextArea();
        xoaThiSinh = new java.awt.Label();
        tfTimKiem = new java.awt.TextField();
        btnTimKiem = new java.awt.Button();
        btnXoa = new java.awt.Button();
        label5 = new java.awt.Label();
        button1 = new java.awt.Button();
        btnHienTatCa = new java.awt.Button();
        btnBack = new java.awt.Button();
        btnNext = new java.awt.Button();
        tf_sbd = new java.awt.TextField();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menuChucNang = new java.awt.Menu();
        menuItemThem = new java.awt.MenuItem();
        menuItemSua = new java.awt.MenuItem();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setText("label1");

        xoaThiSinh.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        xoaThiSinh.setText("XÓA THÍ SINH");

        tfTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTimKiemActionPerformed(evt);
            }
        });

        btnTimKiem.setLabel("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnXoa.setLabel("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label5.setText("SBD:");

        button1.setLabel("button1");

        btnHienTatCa.setLabel("Hiện tất cả");
        btnHienTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienTatCaActionPerformed(evt);
            }
        });

        btnBack.setLabel("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setLabel("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        tf_sbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sbdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_sbd, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btnHienTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tar_ttthisinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(xoaThiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(xoaThiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(tar_ttthisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_sbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        add(panel1, java.awt.BorderLayout.CENTER);

        menu1.setLabel("Thông tin thí sinh");
        menuBar1.add(menu1);

        menuChucNang.setLabel("Chức năng");

        menuItemThem.setLabel("Thêm thí sinh");
        menuItemThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemThemActionPerformed(evt);
            }
        });
        menuChucNang.add(menuItemThem);

        menuItemSua.setLabel("Sửa thí sinh");
        menuItemSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSuaActionPerformed(evt);
            }
        });
        menuChucNang.add(menuItemSua);

        menuBar1.add(menuChucNang);

        setMenuBar(menuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
         
        index = -1;
        btnBack.setEnabled(false);
        btnNext.setEnabled(false);
        try{
            int sbd = Integer.valueOf(tfTimKiem.getText().toString());
            
            for(int i=0;i<arrTS.size();i++){
                if(Integer.valueOf(arrTS.get(i).getSbd()) == sbd) index = i;
            }
            String ss = "";
            if(index !=-1){
                ss += arrTS.get(index).getSbd() + "\t";
                ss += arrTS.get(index).getHoTen() + "\t";
                ss += arrTS.get(index).getKhoi().getTenKhoi() + "\t";
                ss += arrTS.get(index).getDiaChi().getThanhPho() + "\t";
                ss += arrTS.get(index).getUuTien() + "\t";

                tar_ttthisinh.setText(ss);
                tfTimKiem.setText("");
                System.out.println("Tìm kiếm thí sinh với số báo danh "+sbd+" thành công");
            }else{
                tar_ttthisinh.setText("");
                System.out.println("Không có thí sinh với số báo danh "+sbd);
            }
        }catch (Exception e){
            System.out.println("Bạn cần nhập giá trị");
        }
        
        
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnHienTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienTatCaActionPerformed
        btnBack.setEnabled(false);
        tfTimKiem.setText("");
        tf_sbd.setText("");
        
        if(arrTS.size() <= 5)
            btnNext.setEnabled(false);
        else btnNext.setEnabled(true); 
        
        index_begin = 0;
        index_end = 5;
        loadForm(index_begin,index_end);
    }//GEN-LAST:event_btnHienTatCaActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        btnBack.setEnabled(true);
        index_begin = index_end;
        index_end +=5;
        
        loadForm(index_begin, index_end);
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      
        btnNext.setEnabled(true);
        index_end = index_begin;
        index_begin -=5;
        
        loadForm(index_begin, index_end);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTimKiemActionPerformed
        
    }//GEN-LAST:event_tfTimKiemActionPerformed

    private void tf_sbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sbdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sbdActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        
        try{
            int sbd = Integer.valueOf(tf_sbd.getText().toString());
            for(int i=0;i<arrTS.size();i++){
                if(sbd == arrTS.get(i).getSbd()){
                    UpdatePrepareStatement.deleteTS(arrTS.get(i));
                    System.out.println("Xoa thanh cong");
                    //Load lại danh sách thí sinh
                    index_begin = 0;
                    index_end = 5;
                    loadForm(index_begin,index_end);
                    tf_sbd.setText("");
                }
            }
        }catch(Exception e){
            System.out.println("Số bao danh không được để trống");
        }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void menuItemThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThemActionPerformed
        new ThemThiSinh().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemThemActionPerformed

    private void menuItemSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSuaActionPerformed
        try {
            new SuaThiSinh().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(XoaThiSinh.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XoaThiSinh.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_menuItemSuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XoaThiSinh().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBack;
    private java.awt.Button btnHienTatCa;
    private java.awt.Button btnNext;
    private java.awt.Button btnTimKiem;
    private java.awt.Button btnXoa;
    private java.awt.Button button1;
    private java.awt.Label label1;
    private java.awt.Label label5;
    private java.awt.Menu menu1;
    private java.awt.MenuBar menuBar1;
    private java.awt.Menu menuChucNang;
    private java.awt.MenuItem menuItemSua;
    private java.awt.MenuItem menuItemThem;
    private java.awt.Panel panel1;
    private java.awt.TextArea tar_ttthisinh;
    private java.awt.TextField tfTimKiem;
    private java.awt.TextField tf_sbd;
    private java.awt.Label xoaThiSinh;
    // End of variables declaration//GEN-END:variables
}
