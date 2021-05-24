/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import static Form.XoaThiSinh.arrTS;
import static Form.XoaThiSinh.executeStatement;
import static Form.XoaThiSinh.index;
import static Form.XoaThiSinh.index_begin;
import static Form.XoaThiSinh.index_end;
import QLTS.ConnectionDataBase;
import QLTS.ExecuteStatement;
import QLTS.ThiSinh;
import QLTS.UpdatePrepareStatement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ThongTinThiSinh extends java.awt.Frame {

    static ArrayList<ThiSinh> arrTS = new ArrayList<>();
    static ConnectionDataBase conn = new ConnectionDataBase();
    static UpdatePrepareStatement prepareStatement;
    static ExecuteStatement executeStatement;
    static final int MAX_LENGTH = 15;
    static int index = -1;
    static int index_begin = 0;
    static int index_end = MAX_LENGTH;
    
    public ThongTinThiSinh() {
        
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        tar_ttthisinh = new java.awt.TextArea();
        tf_sbd = new java.awt.TextField();
        btnTimKiem = new java.awt.Button();
        btnNext = new java.awt.Button();
        btnBack = new java.awt.Button();
        btnHienTatCa = new java.awt.Button();
        menuBar1 = new java.awt.MenuBar();
        menuTrangChu = new java.awt.Menu();
        menuItemThongTinTS = new java.awt.MenuItem();
        menuItemThoat = new java.awt.MenuItem();
        menuChucNang = new java.awt.Menu();
        menuItemThem = new java.awt.MenuItem();
        menuItemSua = new java.awt.MenuItem();
        menuItemXoa = new java.awt.MenuItem();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("THÔNG TIN THÍ SINH");

        btnTimKiem.setLabel("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnNext.setLabel("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnBack.setLabel("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnHienTatCa.setLabel("Hiện tất cả");
        btnHienTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienTatCaActionPerformed(evt);
            }
        });

        menuTrangChu.setLabel("Trang chủ");

        menuItemThongTinTS.setLabel("Thông tin các thí sinh");
        menuItemThongTinTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemThongTinTSActionPerformed(evt);
            }
        });
        menuTrangChu.add(menuItemThongTinTS);

        menuItemThoat.setLabel("Thoát chương trình");
        menuTrangChu.add(menuItemThoat);

        menuBar1.add(menuTrangChu);

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

        menuItemXoa.setLabel("Xóa thí sinh");
        menuItemXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemXoaActionPerformed(evt);
            }
        });
        menuChucNang.add(menuItemXoa);

        menuBar1.add(menuChucNang);

        setMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_sbd, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnHienTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tar_ttthisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_sbd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(tar_ttthisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        btnBack.setEnabled(true);
        index_begin = index_end;
        index_end +=MAX_LENGTH;

        loadForm(index_begin, index_end);

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        btnNext.setEnabled(true);
        index_end = index_begin;
        index_begin -=MAX_LENGTH;

        loadForm(index_begin, index_end);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHienTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienTatCaActionPerformed
        btnBack.setEnabled(false);
        tf_sbd.setText("");

        if(arrTS.size() <= MAX_LENGTH)
        btnNext.setEnabled(false);
        else btnNext.setEnabled(true);

        index_begin = 0;
        index_end = MAX_LENGTH;
        loadForm(index_begin,index_end);
    }//GEN-LAST:event_btnHienTatCaActionPerformed

    private void menuItemThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThemActionPerformed
        new ThemThiSinh().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemThemActionPerformed

    private void menuItemSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSuaActionPerformed
//        try {
//            new SuaThiSinh().setVisible(true);
//        } catch (SQLException ex) {
//            Logger.getLogger(XoaThiSinh.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(XoaThiSinh.class.getName()).log(Level.SEVERE, null, ex);
//        }
        dispose();
    }//GEN-LAST:event_menuItemSuaActionPerformed

    private void menuItemThongTinTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThongTinTSActionPerformed
        
    }//GEN-LAST:event_menuItemThongTinTSActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        index = -1;
        btnBack.setEnabled(false);
        btnNext.setEnabled(false);
        try{
            int sbd = Integer.valueOf(tf_sbd.getText().toString());
            
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
                tf_sbd.setText("");
                System.out.println("Tìm kiếm thí sinh với số báo danh "+sbd+" thành công");
            }else{
                tar_ttthisinh.setText("");
                System.out.println("Không có thí sinh với số báo danh "+sbd);
            }
        }catch (Exception e){
            System.out.println("Bạn cần nhập giá trị");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void menuItemXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemXoaActionPerformed
        new XoaThiSinh().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemXoaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinThiSinh().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBack;
    private java.awt.Button btnHienTatCa;
    private java.awt.Button btnNext;
    private java.awt.Button btnTimKiem;
    private java.awt.Label label1;
    private java.awt.MenuBar menuBar1;
    private java.awt.Menu menuChucNang;
    private java.awt.MenuItem menuItemSua;
    private java.awt.MenuItem menuItemThem;
    private java.awt.MenuItem menuItemThoat;
    private java.awt.MenuItem menuItemThongTinTS;
    private java.awt.MenuItem menuItemXoa;
    private java.awt.Menu menuTrangChu;
    private java.awt.TextArea tar_ttthisinh;
    private java.awt.TextField tf_sbd;
    // End of variables declaration//GEN-END:variables
}
