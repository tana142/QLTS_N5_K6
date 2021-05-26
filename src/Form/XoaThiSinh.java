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
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
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
    static final int MAX_LEG = 13;
    static int index = -1;
    static int index_begin = 0;
    static int index_end = MAX_LEG;
    private String data;
    public static Dialog d;
    public static final Button b = new Button("OK");
    public static final Button b1 = new Button("NO");
    int check;

    public XoaThiSinh(String data) {
        initComponents();

        btnBack.setEnabled(false);
        btnNext.setEnabled(true);
        this.data = data;
        if (this.data.equals("user")) {
            this.menuChucNang.setEnabled(false);
        }
        loadForm(index_begin, index_end);
        this.add(popupMenu_ChucNamg);

    }

    public void xoaTS(ThiSinh ts) {
                UpdatePrepareStatement.deleteTS(ts);
    }

    private XoaThiSinh() {
    }

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu_ChucNamg = new java.awt.PopupMenu();
        menuItem_pu_TTTS = new java.awt.MenuItem();
        menuItem_pu_Sua = new java.awt.MenuItem();
        menuItem_pu_Them = new java.awt.MenuItem();
        menuItem_pu_DangXuat = new java.awt.MenuItem();
        menuItem_pu_Thoat = new java.awt.MenuItem();
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

        menuItem_pu_TTTS.setLabel("Trang chủ");
        menuItem_pu_TTTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_pu_TTTSActionPerformed(evt);
            }
        });
        popupMenu_ChucNamg.add(menuItem_pu_TTTS);

        menuItem_pu_Sua.setLabel("Sửa thí sinh");
        menuItem_pu_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_pu_SuaActionPerformed(evt);
            }
        });
        popupMenu_ChucNamg.add(menuItem_pu_Sua);

        menuItem_pu_Them.setLabel("Thêm thí sinh");
        menuItem_pu_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_pu_ThemActionPerformed(evt);
            }
        });
        popupMenu_ChucNamg.add(menuItem_pu_Them);

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

        setTitle("Xóa thí sinh");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1MouseClicked(evt);
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

        btnTimKiem.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnTimKiem.setLabel("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 51, 0));
        btnXoa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnXoa.setLabel("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label5.setText("SBD:");

        button1.setLabel("button1");

        btnHienTatCa.setBackground(new java.awt.Color(102, 255, 0));
        btnHienTatCa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnHienTatCa.setLabel("Hiện tất cả");
        btnHienTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienTatCaActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBack.setLabel("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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

        try {
            int sbd = Integer.valueOf(tfTimKiem.getText().toString());

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
                tfTimKiem.setText("");
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

    private void btnHienTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienTatCaActionPerformed
        btnBack.setEnabled(false);
        tfTimKiem.setText("");
        tf_sbd.setText("");

        if (arrTS.size() <= MAX_LEG) {
            btnNext.setEnabled(false);
        } else {
            btnNext.setEnabled(true);
        }

        index_begin = 0;
        index_end = MAX_LEG;
        loadForm(index_begin, index_end);
    }//GEN-LAST:event_btnHienTatCaActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        btnBack.setEnabled(true);
        index_begin = index_end;
        index_end += MAX_LEG;

        loadForm(index_begin, index_end);

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        btnNext.setEnabled(true);
        index_end = index_begin;
        index_begin -= MAX_LEG;

        loadForm(index_begin, index_end);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTimKiemActionPerformed

    }//GEN-LAST:event_tfTimKiemActionPerformed

    private void tf_sbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sbdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sbdActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int count = 0;
        System.out.println("check " +check);
        try {
            int sbd = Integer.valueOf(tf_sbd.getText().toString());
            for (int i = 0; i < arrTS.size(); i++) {
                if (sbd == arrTS.get(i).getSbd()) {
                    ThiSinh ts = new ThiSinh();
                    ts = arrTS.get(i);

                    d = new Dialog(this, "Thông báo", true);
                    d.setLayout(new FlowLayout());
                     b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            check = -1000;
                            d.setVisible(false);
                            System.out.println("check b " +check);
                        }
                    });

                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            check = 1;
                            d.setVisible(false);
                            System.out.println("check b1 " +check);
                        }
                    });
                   
                    d.add(new Label("Bạn có chắc muốn xóa thí sinh này!                  "));
                    d.add(b);
                    d.add(b1);
                    System.out.println("check sx " +check);
                    d.setSize(300, 150);
                    d.setLocationRelativeTo(this);
                    d.setVisible(true);
                    count++;
                    if (check != 1) {
                        xoaTS(ts);
                        showDialog("Xóa thí sinh thành công!                               ");
                        index_begin = 0;
                    index_end = MAX_LEG;
                    loadForm(index_begin, index_end);
                    tf_sbd.setText("");
                    
                    }
                    
                    

                }
            }
            if (count == 0) {
                showDialog("Không tìm thấy thí sinh!                      ");
            }

        } catch (Exception e) {
            System.out.println("Số bao danh không được để trống");
            showDialog("Bạn chưa nhập số báo danh cần xóa!                  ");
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void menuItemThongTinTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThongTinTSActionPerformed
            ThongTinThiSinh ttts = new  ThongTinThiSinh(this.data);
            ttts.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_menuItemThongTinTSActionPerformed

    private void menuItemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDangXuatActionPerformed
        // TODO add your handling code here:
        DangNhap dn = new DangNhap();
        dn.show();
        dispose();
    }//GEN-LAST:event_menuItemDangXuatActionPerformed

    private void menuItemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_menuItemThoatActionPerformed

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

    private void menuItemXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemXoaActionPerformed
        new XoaThiSinh(this.data).setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemXoaActionPerformed

    private void menuChucNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChucNangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuChucNangActionPerformed

    private void menuItem_pu_TTTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_pu_TTTSActionPerformed
        // TODO add your handling code here:
        ThongTinThiSinh ttts = new ThongTinThiSinh(this.data);
        ttts.show();
        dispose();
    }//GEN-LAST:event_menuItem_pu_TTTSActionPerformed

    private void menuItem_pu_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_pu_SuaActionPerformed
        // TODO add your handling code here:
        SuaThiSinh s = new SuaThiSinh(this.data);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItem_pu_SuaActionPerformed

    private void menuItem_pu_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_pu_ThemActionPerformed
        // TODO add your handling code here:
        ThemThiSinh t = new ThemThiSinh(this.data);
        t.show();
        dispose();
    }//GEN-LAST:event_menuItem_pu_ThemActionPerformed

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

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
        // TODO add your handling code here:
        popupMenu_ChucNamg.show(this, evt.getX(), evt.getY());
    }//GEN-LAST:event_panel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
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
    private java.awt.MenuItem menuItem_pu_TTTS;
    private java.awt.MenuItem menuItem_pu_Them;
    private java.awt.MenuItem menuItem_pu_Thoat;
    private java.awt.Menu menuTrangChu;
    private java.awt.Panel panel1;
    private java.awt.PopupMenu popupMenu_ChucNamg;
    private java.awt.TextArea tar_ttthisinh;
    private java.awt.TextField tfTimKiem;
    private java.awt.TextField tf_sbd;
    private java.awt.Label xoaThiSinh;
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
