/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;
//
//import static Form.XoaThiSinh.arrTS;
//import static Form.XoaThiSinh.executeStatement;
//import static Form.XoaThiSinh.index;
//import static Form.XoaThiSinh.index_begin;
//import static Form.XoaThiSinh.index_end;
import QLTS.ConnectionDataBase;
import QLTS.ExecuteStatement;
import QLTS.ThiSinh;
import QLTS.UpdatePrepareStatement;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ThongTinThiSinh extends java.awt.Frame {
    
    static ArrayList<ThiSinh> arrTS = new ArrayList<>();
    static ConnectionDataBase conn = new ConnectionDataBase();
    static UpdatePrepareStatement prepareStatement;
    static ExecuteStatement executeStatement;
    static final int MAX_LENGTH = 14;
    static int index = -1;
    static int index_begin = 0;
    static int index_end = MAX_LENGTH;
    private String data;
    
    public static Dialog d;
    public ThongTinThiSinh(String data) {
        
        initComponents();
        
        this.add(popupMenu_ChucNamg);
        btnBack.setEnabled(false);
        btnNext.setEnabled(true);
        this.data = data;
        if(this.data.equals("user")){
            this.menuChucNang.setEnabled(false);
        }
        loadForm(index_begin, index_end);
    }

    private ThongTinThiSinh() {}
    
    public void loadForm(int index_begin, int index_end) {
        
        arrTS = executeStatement.selectThiSinh();
        
        if (index_begin <= 0) {
            index_begin = 0;
            btnBack.setEnabled(false);
        } else {
            btnBack.setEnabled(true);
        }
        
        if (index_end >= arrTS.size()) {
            index_end = arrTS.size();
            btnNext.setEnabled(false);
        } else {
            btnNext.setEnabled(true);
        }
        
        String ss = "";
        for (int i = index_begin; i < index_end; i++) {
            ss += arrTS.get(i).getSbd() + "\t";
            ss += arrTS.get(i).getHoTen() + "\t";
            ss += arrTS.get(i).getKhoi().getTenKhoi() + "\t";
            ss += arrTS.get(i).getDiaChi().getThanhPho() + "\t";
            ss += arrTS.get(i).getUuTien() + "\t" + "\n";
        }
        if (ss != null) {
            tar_ttthisinh.setText(ss.toString());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu_ChucNamg = new java.awt.PopupMenu();
        menuItem_pu_Them = new java.awt.MenuItem();
        menuItem_pu_Sua = new java.awt.MenuItem();
        menuItem_pu_Xoa = new java.awt.MenuItem();
        menuItem_pu_DangXuat = new java.awt.MenuItem();
        menuItem_pu_Thoat = new java.awt.MenuItem();
        label1 = new java.awt.Label();
        tar_ttthisinh = new java.awt.TextArea();
        tf_sbd = new java.awt.TextField();
        btnTimKiem = new java.awt.Button();
        btnNext = new java.awt.Button();
        btnBack = new java.awt.Button();
        btnHienTatCa = new java.awt.Button();
        label2 = new java.awt.Label();
        menuBar1 = new java.awt.MenuBar();
        menuTrangChu = new java.awt.Menu();
        menuItemThongTinTS = new java.awt.MenuItem();
        menuItemDangXuat = new java.awt.MenuItem();
        menuItemThoat = new java.awt.MenuItem();
        menuChucNang = new java.awt.Menu();
        menuItemThem = new java.awt.MenuItem();
        menuItemSua = new java.awt.MenuItem();
        menuItemXoa = new java.awt.MenuItem();

        popupMenu_ChucNamg.setLabel("Chức năng");
        popupMenu_ChucNamg.setName("");

        menuItem_pu_Them.setLabel("Thêm thí sinh");
        menuItem_pu_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_pu_ThemActionPerformed(evt);
            }
        });
        popupMenu_ChucNamg.add(menuItem_pu_Them);

        menuItem_pu_Sua.setLabel("Sửa thí sinh");
        menuItem_pu_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_pu_SuaActionPerformed(evt);
            }
        });
        popupMenu_ChucNamg.add(menuItem_pu_Sua);

        menuItem_pu_Xoa.setLabel("Xóa thí sinh");
        menuItem_pu_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_pu_XoaActionPerformed(evt);
            }
        });
        popupMenu_ChucNamg.add(menuItem_pu_Xoa);

        menuItem_pu_DangXuat.setLabel("Đăng xuất");
        menuItem_pu_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_pu_DangXuatActionPerformed(evt);
            }
        });
        popupMenu_ChucNamg.add(menuItem_pu_DangXuat);

        menuItem_pu_Thoat.setLabel("Thoát");
        menuItem_pu_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_pu_ThoatActionPerformed(evt);
            }
        });
        popupMenu_ChucNamg.add(menuItem_pu_Thoat);

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Thông tin danh sách thí sinh");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("THÔNG TIN SINH VIÊN");

        btnTimKiem.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnTimKiem.setLabel("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnNext.setLabel("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBack.setLabel("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnHienTatCa.setBackground(new java.awt.Color(102, 255, 0));
        btnHienTatCa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnHienTatCa.setLabel("Hiện tất cả");
        btnHienTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienTatCaActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Thông tin thí sinh");

        menuTrangChu.setLabel("Trang chủ");

        menuItemThongTinTS.setLabel("Thông tin các thí sinh");
        menuItemThongTinTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemThongTinTSActionPerformed(evt);
            }
        });
        menuTrangChu.add(menuItemThongTinTS);

        menuItemDangXuat.setLabel("Đăng xuất");
        menuItemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDangXuatActionPerformed(evt);
            }
        });
        menuTrangChu.add(menuItemDangXuat);

        menuItemThoat.setLabel("Thoát chương trình");
        menuItemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemThoatActionPerformed(evt);
            }
        });
        menuTrangChu.add(menuItemThoat);

        menuBar1.add(menuTrangChu);

        menuChucNang.setLabel("Chức năng");
        menuChucNang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChucNangActionPerformed(evt);
            }
        });

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
                        .addGap(318, 318, 318)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262)
                        .addComponent(tf_sbd, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(tar_ttthisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnHienTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_sbd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(tar_ttthisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHienTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
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
        index_end += MAX_LENGTH;
        
        loadForm(index_begin, index_end);

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        btnNext.setEnabled(true);
        index_end = index_begin;
        index_begin -= MAX_LENGTH;
        
        loadForm(index_begin, index_end);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHienTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienTatCaActionPerformed
        btnBack.setEnabled(false);
        tf_sbd.setText("");
        
        if (arrTS.size() <= MAX_LENGTH) {
            btnNext.setEnabled(false);
        } else {
            btnNext.setEnabled(true);
        }
        
        index_begin = 0;
        index_end = MAX_LENGTH;
        loadForm(index_begin, index_end);
    }//GEN-LAST:event_btnHienTatCaActionPerformed

    private void menuItemThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThemActionPerformed
        new ThemThiSinh(this.data).setVisible(true);
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
            new SuaThiSinh(this.data).setVisible(true);
       
        dispose();
    }//GEN-LAST:event_menuItemSuaActionPerformed

    private void menuItemThongTinTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThongTinTSActionPerformed
        
    }//GEN-LAST:event_menuItemThongTinTSActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
         index = -1;

        try {
            int sbd = Integer.valueOf(tf_sbd.getText().toString());

            for (int i = 0; i < arrTS.size(); i++) {
                if (Integer.valueOf(arrTS.get(i).getSbd()) == sbd) {
                    index = i;
                }
            }
            String ss = "";
            if (index != -1) {
                btnBack.setEnabled(false);
                btnNext.setEnabled(false);

                ss += arrTS.get(index).getSbd() + "\t";
                ss += arrTS.get(index).getHoTen() + "\t";
                ss += arrTS.get(index).getKhoi().getTenKhoi() + "\t";
                ss += arrTS.get(index).getDiaChi().getThanhPho() + "\t";
                ss += arrTS.get(index).getUuTien() + "\t";

                tar_ttthisinh.setText(ss);
                tf_sbd.setText("");
                System.out.println("Tìm kiếm thí sinh với số báo danh " + sbd + " thành công");
            } else {
                showDialog("Số báo danh không tồn tại!");
//                System.out.println("Không có thí sinh với số báo danh "+sbd);
//                JOptionPane.showConfirmDialog(this, "Không tìm thấy thí sinh","Thông báo",JOptionPane.OK_OPTION);
            }
        } catch (Exception e) {
//            System.out.println("Bạn cần nhập giá trị");
            showDialog("Hãy nhập số báo danh vào ô tìm kiếm!");
        }


    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void menuItemXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemXoaActionPerformed
        new XoaThiSinh(this.data).setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemXoaActionPerformed

    private void menuItemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDangXuatActionPerformed
        // TODO add your handling code here:
        DangNhap dn = new DangNhap();
        dn.show();
        dispose();
    }//GEN-LAST:event_menuItemDangXuatActionPerformed

    private void menuChucNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChucNangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuChucNangActionPerformed

    private void menuItemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_menuItemThoatActionPerformed

    private void menuItem_pu_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_pu_ThemActionPerformed
        // TODO add your handling code here:
        ThemThiSinh t = new ThemThiSinh(this.data);
        t.show();
        dispose();
    }//GEN-LAST:event_menuItem_pu_ThemActionPerformed

    private void menuItem_pu_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_pu_SuaActionPerformed
        // TODO add your handling code here:
        SuaThiSinh s = new SuaThiSinh(this.data);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItem_pu_SuaActionPerformed

    private void menuItem_pu_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_pu_XoaActionPerformed
        // TODO add your handling code here:
        XoaThiSinh xoa = new XoaThiSinh(this.data);
        xoa.show();
        dispose();
    }//GEN-LAST:event_menuItem_pu_XoaActionPerformed

    private void menuItem_pu_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_pu_DangXuatActionPerformed
        // TODO add your handling code here:
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItem_pu_DangXuatActionPerformed

    private void menuItem_pu_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_pu_ThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_menuItem_pu_ThoatActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        popupMenu_ChucNamg.show(this, evt.getX(), evt.getY());
    }//GEN-LAST:event_formMouseClicked

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
    private java.awt.Label label2;
    private java.awt.MenuBar menuBar1;
    private java.awt.Menu menuChucNang;
    private java.awt.MenuItem menuItemDangXuat;
    private java.awt.MenuItem menuItemSua;
    private java.awt.MenuItem menuItemThem;
    private java.awt.MenuItem menuItemThoat;
    private java.awt.MenuItem menuItemThongTinTS;
    private java.awt.MenuItem menuItemXoa;
    private java.awt.MenuItem menuItem_pu_DangXuat;
    private java.awt.MenuItem menuItem_pu_Sua;
    private java.awt.MenuItem menuItem_pu_Them;
    private java.awt.MenuItem menuItem_pu_Thoat;
    private java.awt.MenuItem menuItem_pu_Xoa;
    private java.awt.Menu menuTrangChu;
    private java.awt.PopupMenu popupMenu_ChucNamg;
    private java.awt.TextArea tar_ttthisinh;
    private java.awt.TextField tf_sbd;
    // End of variables declaration//GEN-END:variables
public void showDialog(String s) {
        d = new Dialog(this, "Thông báo", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("OK");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
                d.dispose();
//                    setVisible(true);
//                    SuaThiSinh sts = new SuaThiSinh("user");
//                    sts.show();
            }
        });
        d.add(new Label(s));
        d.add(b);
        d.setSize(300, 150);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }
}
