/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import static Form.SuaThiSinh.arrTS;
import static Form.SuaThiSinh.executeStatement;
import QLTS.ExecuteStatement;
import QLTS.User;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author buida
 */
public class DangNhap extends java.awt.Frame {

    public static boolean Check;
    public static ArrayList<User> arrUser = new ArrayList<>();
    public static ArrayList<User> arrAdmin = new ArrayList<>();
    Dialog d;
    public static String tk;
    public static String mk ;
    static ExecuteStatement executeStatement;

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        arrUser = executeStatement.selectUser();
        arrAdmin = executeStatement.selectAdmin();
        txt_matkhau.setEchoChar('*');
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        txt_taikhoan = new java.awt.TextField();
        txt_matkhau = new java.awt.TextField();
        button_dangnhap = new java.awt.Button();

        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(390, 250));
        setSize(new java.awt.Dimension(390, 250));
        setTitle("Đăng nhập");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Đăng nhập");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 29, -1, -1));

        label2.setText("Tài khoản");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 95, -1, -1));

        label3.setText("Mật khẩu");
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        add(txt_taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 95, 130, -1));
        add(txt_matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 154, 130, -1));

        button_dangnhap.setLabel("Đăng nhập");
        button_dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dangnhapActionPerformed(evt);
            }
        });
        add(button_dangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button_dangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dangnhapActionPerformed

        
        tk = txt_taikhoan.getText().trim();
        mk = txt_matkhau.getText().trim();
        

        System.out.println("tk: " + tk);
        System.out.println("mk: " + mk);
        String check = "";
        for (int i = 0; i < arrUser.size(); i++) {
            if (arrUser.get(i).getUserName().toString().equals(tk)
                    && arrUser.get(i).getPassWord().toString().equals(mk)) {
                check = new String("user");
                
                break;
            }
        }
        for (int i = 0; i < arrAdmin.size(); i++) {
            if (arrAdmin.get(i).getUserName().toString().equals(tk)
                    && arrAdmin.get(i).getPassWord().toString().equals(mk)) {
                check = "admin";
                break;
            }
        }

        if (check.equals("user")) {
            System.out.println("Đăng nhập thành công user");
            //chuyen sang chuc nang
            showDialog("Bạn đang đăng nhập với tài khoản người dùng!","user");
        } else if (check.equals("admin")) {
            System.out.println("Đăng nhập thành công admin");
            
            showDialog("Bạn đang đăng nhập với tài khoản người quản trị!","admin");
            
            
        } else {
            System.out.println("Tài khoản hoặc mật khẩu không đúng");
            //thong bao dang nhap khong thanh cong
            d = new Dialog(this, "Thông báo", true);
            d.setLayout(new FlowLayout());
//        TextField t = new TextField();
            Button b = new Button("OK");
            b.setLocale(Locale.UK);
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    d.setVisible(false);
//                    ThongTinThiSinh ttts = new ThongTinThiSinh("user");
//                    ttts.show();
//                    dispose();
                }
            });
            d.add(new Label("Tài khoản hoặc mật khẩu không hợp lệ!      "));
            d.add(b);
            d.setSize(300, 150);
            d.setLocationRelativeTo(this);
            d.setVisible(true);
//            showDialog("Tài khoản hoặc mật khẩu không hợp lệ!");
            
        }
    }//GEN-LAST:event_button_dangnhapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
        
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button_dangnhap;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.TextField txt_matkhau;
    private java.awt.TextField txt_taikhoan;
    // End of variables declaration//GEN-END:variables

    public void showDialog(String s, String ad) {
        d = new Dialog(this, "Thông báo", true);
            d.setLayout(new FlowLayout());
//        TextField t = new TextField();
            Button b = new Button("OK");
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    d.setVisible(false);
                    ThongTinThiSinh ttts = new ThongTinThiSinh(ad);
                    ttts.show();
                    dispose();
                }
            });
            d.add(new Label(s));
            d.add(b);
            d.setSize(300, 150);
            d.setLocationRelativeTo(this);
            d.setVisible(true);
    }
}
