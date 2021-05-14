/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import QLTS.ConnectionDataBase;
import QLTS.DiaChi;
import QLTS.ExecuteStatement;
import QLTS.Khoi;
import QLTS.ThiSinh;
import QLTS.UpdatePrepareStatement;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SuaThiSinh extends java.awt.Frame {

    static ConnectionDataBase connect = new ConnectionDataBase();
    static int index = 1;
    static ArrayList<ThiSinh> arrTS = new ArrayList<>();
    static UpdatePrepareStatement prepareStatement;
    static ExecuteStatement executeStatement;

    /**
     * Creates new form SuaThiSinh
     */
    public SuaThiSinh() throws SQLException, ClassNotFoundException {
        initComponents();
        choice1.addItem("Khối A");
        choice1.addItem("Khối B");
        choice1.addItem("Khối C");

        choice_ut.addItem("Nhóm 1");
        choice_ut.addItem("Nhóm 2");
        choice_ut.addItem("Nhóm 3");

        arrTS = executeStatement.selectThiSinh();
//        Connection conn = (Connection) connect.getConnectDB();
//        Statement stm = null;
//        ResultSet rs = null;
//        String s = "select SBD,HoTen,SoNha,Duong,Quan,ThanhPho,TenKhoi,Mon1,Mon2, Mon3, UuTien \n"
//                + "	from ThiSinh inner join DiaChi on ThiSinh.IdDiaChi = DiaChi.IdDiaChi\n"
//                + "	inner join Khoi on ThiSinh.IdKhoi = Khoi.IdKhoi";
//        stm = conn.createStatement();
//        rs = stm.executeQuery(s);

//        ResultSet rs = executeStatement.selectThiSinh();
//        while (rs.next()) {
//            DiaChi dc = new DiaChi(Integer.valueOf(rs.getString(3)), rs.getString(4), rs.getString(5), rs.getString(6));
//            Khoi k = new Khoi(rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
//            ThiSinh ts = new ThiSinh(Integer.valueOf(rs.getString(1)), rs.getString(2), k, dc, rs.getString(11));//5- 11
//            arrTS.add(ts);
//        }
//        conn.close();
        String ss = "";
//                textField1.setText("");
        //hien thi danh sach thi sinh
//        for (int j = 0; j < 20; j++) {
//            for (int i = 0; i < arrTS.size(); i++) {
            int i = 0;
                int sbd = arrTS.get(i).getSbd();
                String hoTen = arrTS.get(i).getHoTen().trim();
                int soNha = Integer.valueOf(arrTS.get(i).getDiaChi().getSoNha());
                String duong = arrTS.get(i).getDiaChi().getDuong().trim();
                String quan = arrTS.get(i).getDiaChi().getQuan().trim();
                String thanhPho = arrTS.get(i).getDiaChi().getThanhPho().trim();
                String khoi = arrTS.get(i).getKhoi().getTenKhoi().trim();
                String uuTien = arrTS.get(i).getUuTien().trim();
////                String sbd,hoTen,khoi,thanhPho,uuTien;
////                String ss;
//////                sbd = String.format("%-8s", Integer.valueOf(arrTS.get(i).getSbd()));
////                sbd = String.format("%-20s",arrTS.get(i).getSbd());
////                hoTen = String.format("|%-30s|", arrTS.get(i).getHoTen().trim());
////                khoi = String.format("|%10s|", arrTS.get(i).getKhoi().getTenKhoi().trim());;
////                thanhPho = String.format("%-15s", arrTS.get(i).getDiaChi().getThanhPho().trim());
////                uuTien = String.format("%-10s", arrTS.get(i).getUuTien().trim());
////                ss = "\n";
                tar_ttthisinh.setText(tar_ttthisinh.getText() + sbd + "\t" + hoTen + "\t" +khoi + "\t" +thanhPho + "\t" +uuTien + "\n");
//            }
//        }
int vtri = i;String schoice = "", uchoice = "";
            txt_sbd.setText(arrTS.get(vtri).getSbd() + "");
            txt_hoten.setText(arrTS.get(vtri).getHoTen() + "");
            txt_sonha.setText(String.valueOf(arrTS.get(vtri).getDiaChi().getSoNha()));
            txt_duong.setText(arrTS.get(vtri).getDiaChi().getDuong());
            txt_quan.setText(arrTS.get(vtri).getDiaChi().getQuan());
            txt_thanhpho.setText(arrTS.get(vtri).getDiaChi().getThanhPho());
            schoice += arrTS.get(vtri).getKhoi().getTenKhoi().toString().trim();
            uchoice += arrTS.get(vtri).getUuTien().toString().trim();
            
            //set index choice
            if (schoice.equals("Khối A")) {
                choice1.select("Khối A");
            } else if (schoice.equals("Khối B")) {
                choice1.select("Khối B");
            } else {
                choice1.select("Khối C");
            }
            //set index choice uu tien
            if (uchoice.equals("Nhóm 1")) {

                choice_ut.select("Nhóm 1");
            } else if (uchoice.equals("Nhóm 2")) {
                choice_ut.select("Nhóm 2");
            } else {
                choice_ut.select("Nhóm 3");
            }
            

        if (index == 0) {
            btn_back.setEnabled(false);
        }
        if (index == arrTS.size() - 1) {
            btn_next.setEnabled(false);
        }

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
        txt_timkiem = new java.awt.TextField();
        txt_hoten = new java.awt.TextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        panel1 = new java.awt.Panel();
        label6 = new java.awt.Label();
        txt_sonha = new java.awt.TextField();
        txt_quan = new java.awt.TextField();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        txt_thanhpho = new java.awt.TextField();
        label9 = new java.awt.Label();
        txt_duong = new java.awt.TextField();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        btn_timkiem = new java.awt.Button();
        label5 = new java.awt.Label();
        txt_sbd = new java.awt.TextField();
        label12 = new java.awt.Label();
        btn_sua = new java.awt.Button();
        tar_ttthisinh = new java.awt.TextArea();
        btn_next = new java.awt.Button();
        btn_back = new java.awt.Button();
        choice1 = new java.awt.Choice();
        choice_ut = new java.awt.Choice();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("SỬA THÍ SINH");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 240, 50));

        label2.setText("Thông tin thí sinh: ");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_timkiemKeyTyped(evt);
            }
        });
        add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 90, -1));
        add(txt_hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 170, -1));

        label3.setText("Ưu tiên:");
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, -1));

        label4.setText("Họ tên:");
        add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, -1));
        label4.getAccessibleContext().setAccessibleName("Họ tên");

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label6.setText("Số nhà");
        panel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        txt_sonha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sonhaKeyTyped(evt);
            }
        });
        panel1.add(txt_sonha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 50, -1));
        panel1.add(txt_quan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, -1));

        label7.setText("Quận");
        panel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        label8.setText("Thành phố");
        panel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));
        panel1.add(txt_thanhpho, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 60, -1));

        label9.setText("Đường");
        panel1.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));
        panel1.add(txt_duong, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 60, -1));

        add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 260, 90));

        label10.setText("Địa chỉ:");
        add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, -1));

        label11.setText("Khối:");
        add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 40, -1));

        btn_timkiem.setLabel("Tìm kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });
        add(btn_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        label5.setText("SBD:");
        add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 40, -1));
        label5.getAccessibleContext().setAccessibleName("SBD");

        txt_sbd.setEditable(false);
        add(txt_sbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, -1));

        label12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label12.setText("SỬA THÍ SINH");
        add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 240, 50));

        btn_sua.setLabel("Sửa");
        btn_sua.setName(""); // NOI18N
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        tar_ttthisinh.setColumns(5);
        tar_ttthisinh.setEditable(false);
        tar_ttthisinh.setRows(89);
        add(tar_ttthisinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 420, 170));

        btn_next.setLabel("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        btn_back.setLabel("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        choice1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                choice1PropertyChange(evt);
            }
        });
        add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 120, -1));
        add(choice_ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 120, -1));

        menu1.setLabel("Thông tin thí sinh");
        menuBar1.add(menu1);

        menu2.setLabel("Thêm thí sinh");
        menuBar1.add(menu2);

        menu3.setLabel("Sửa thí sinh");
        menuBar1.add(menu3);

        menu4.setLabel("Xóa thí sinh");
        menuBar1.add(menu4);

        setMenuBar(menuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed

        int idKhoi = 0;
        int sbd = Integer.valueOf(txt_sbd.getText().trim());
        String hoTen = txt_hoten.getText();
        int soNha = Integer.valueOf(txt_sonha.getText().trim());
        String duong = txt_duong.getText().trim();
        String quan = txt_quan.getText().trim();
        String thanhPho = txt_thanhpho.getText().trim();
        String khoi = choice1.getSelectedItem().toString();
        String uuTien = choice_ut.getSelectedItem().toString();
//        String mon1,mon2,mon3;
        // sua trong sql
//        if(khoi == "Khối A"){
//            idKhoi = 1;
//            mon1 = "Toán";
//            mon2 = "Lý";
//            mon3 = "Hóa";
//        }else if(khoi == "Khối B"){
//            idKhoi = 2;
//            mon1 = "Toán";
//            mon2 = "Hóa";
//            mon3 = "Sinh";
//        }else {
//            idKhoi = 3;
//            mon1 = "Văn";
//            mon2 = "Sử";
//            mon3 = "Địa";
//        }
        DiaChi dc = new DiaChi(soNha, duong, quan, thanhPho);
        Khoi k = new Khoi(khoi);
        ThiSinh TS = new ThiSinh(sbd, hoTen, k, dc, uuTien);
        int check = UpdatePrepareStatement.updateTS(TS);
        if (check != -1) {
            System.out.println("sua thanh cong");
            arrTS = executeStatement.selectThiSinh();

            String ss = "";
            String schoice = "", uchoice = "";
            ss += arrTS.get(index).getSbd() + "\t";
            ss += arrTS.get(index).getHoTen() + "\t";
            ss += arrTS.get(index).getKhoi().getTenKhoi() + "\t";
            ss += arrTS.get(index).getDiaChi().getThanhPho() + "\t";
            ss += arrTS.get(index).getUuTien() + "\t";

            tar_ttthisinh.setText(ss);
            txt_sbd.setText(arrTS.get(index).getSbd() + "");
            txt_hoten.setText(arrTS.get(index).getHoTen() + "");
            txt_sonha.setText(String.valueOf(arrTS.get(index).getDiaChi().getSoNha()));
            txt_duong.setText(arrTS.get(index).getDiaChi().getDuong());
            txt_quan.setText(arrTS.get(index).getDiaChi().getQuan());
            txt_thanhpho.setText(arrTS.get(index).getDiaChi().getThanhPho());
            schoice = arrTS.get(index).getKhoi().getTenKhoi().toString().trim();
            uchoice = arrTS.get(index).getUuTien().toString().trim();

            //set index choice
            if (schoice.equals("Khối A")) {
                choice1.select("Khối A");
            } else if (schoice.equals("Khối B")) {
                choice1.select("Khối B");
            } else {
                choice1.select("Khối C");
            }
            //set index choice uu tien
            if (uchoice.equals("Nhóm 1")) {
                choice_ut.select("Nhóm 1");
            } else if (uchoice.equals("Nhóm 2")) {
                choice_ut.select("Nhóm 2");
            } else {
                choice_ut.select("Nhóm 3");
            }

        } else {
            System.out.println("sua that bai");
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void choice1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_choice1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_choice1PropertyChange

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        // TODO add your handling code here:
        int vtri = 0;
        int sbd = Integer.valueOf(txt_timkiem.getText());
        boolean tk = false;
        for (int i = 0; i < arrTS.size(); i++) {
            if (Integer.valueOf(arrTS.get(i).getSbd()) == sbd) {
                tk = true;
                vtri = i;
                index = i;
                break;
            }
        }
        if (tk == true) {
            String ss = "";
            String schoice = "", uchoice = "";
            ss += arrTS.get(vtri).getSbd() + "\t";
            ss += arrTS.get(vtri).getHoTen() + "\t";
            ss += arrTS.get(vtri).getKhoi().getTenKhoi() + "\t";
            ss += arrTS.get(vtri).getDiaChi().getThanhPho() + "\t";
            ss += arrTS.get(vtri).getUuTien() + "\t";

            tar_ttthisinh.setText(ss);
            txt_sbd.setText(arrTS.get(vtri).getSbd() + "");
            txt_hoten.setText(arrTS.get(vtri).getHoTen() + "");
            txt_sonha.setText(String.valueOf(arrTS.get(vtri).getDiaChi().getSoNha()));
            txt_duong.setText(arrTS.get(vtri).getDiaChi().getDuong());
            txt_quan.setText(arrTS.get(vtri).getDiaChi().getQuan());
            txt_thanhpho.setText(arrTS.get(vtri).getDiaChi().getThanhPho());
            schoice += arrTS.get(vtri).getKhoi().getTenKhoi().toString().trim();
            uchoice += arrTS.get(vtri).getUuTien().toString().trim();

            //set index choice
            if (schoice.equals("Khối A")) {
                choice1.select("Khối A");
            } else if (schoice.equals("Khối B")) {
                choice1.select("Khối B");
            } else {
                choice1.select("Khối C");
            }
            //set index choice uu tien
            if (uchoice.equals("Nhóm 1")) {

                choice_ut.select("Nhóm 1");
            } else if (uchoice.equals("Nhóm 2")) {
                choice_ut.select("Nhóm 2");
            } else {
                choice_ut.select("Nhóm 3");
            }

        } else {
            tar_ttthisinh.setText("Số báo danh không hợp lệ");
            txt_sbd.setText("");
            txt_hoten.setText("");
            txt_sonha.setText("");
            txt_duong.setText("");
            txt_quan.setText("");
            txt_thanhpho.setText("");
            choice1.select(0);
            choice_ut.select(0);

        }
        if (index == 0) {
            btn_back.setEnabled(false);
        }
        if (index == arrTS.size() - 1) {
            btn_next.setEnabled(false);
        }

    }//GEN-LAST:event_btn_timkiemActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:

        System.out.println(index);
        btn_next.setEnabled(true);
        if (index >= 1) {
            btn_back.setEnabled(true);
            index -= 1;
            if (index == 0) {
                btn_back.setEnabled(false);
            }
            String ss = "";
            String schoice = "", uchoice = "";
            ss += arrTS.get(index).getSbd() + "\t";
            ss += arrTS.get(index).getHoTen() + "\t";
            ss += arrTS.get(index).getKhoi().getTenKhoi() + "\t";
            ss += arrTS.get(index).getDiaChi().getThanhPho() + "\t";
            ss += arrTS.get(index).getUuTien() + "\t";

            tar_ttthisinh.setText(ss);
            txt_sbd.setText(arrTS.get(index).getSbd() + "");
            txt_hoten.setText(arrTS.get(index).getHoTen() + "");
            txt_sonha.setText(String.valueOf(arrTS.get(index).getDiaChi().getSoNha()));
            txt_duong.setText(arrTS.get(index).getDiaChi().getDuong());
            txt_quan.setText(arrTS.get(index).getDiaChi().getQuan());
            txt_thanhpho.setText(arrTS.get(index).getDiaChi().getThanhPho());
            schoice += arrTS.get(index).getKhoi().getTenKhoi().toString().trim();
            uchoice += arrTS.get(index).getUuTien().toString().trim();

            //set index choice
            if (schoice.equals("Khối A")) {
                choice1.select("Khối A");
            } else if (schoice.equals("KhốiB")) {
                choice1.select("Khối B");
            } else {
                choice1.select("Khối C");
            }
            //set index choice uu tien
            if (uchoice.equals("Nhóm 1")) {

                choice_ut.select("Nhóm 1");
            } else if (uchoice.equals("Nhóm 2")) {
                choice_ut.select("Nhóm 2");
            } else {
                choice_ut.select("Nhóm 3");
            }
        } else {
            btn_back.setEnabled(false);
        }
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:

        System.out.println(index);

        btn_back.setEnabled(true);

        if (index < arrTS.size() - 1) {
            btn_next.setEnabled(true);
            index += 1;
            if (index == arrTS.size() - 1) {
                btn_next.setEnabled(false);
            }

            String ss = "";
            String schoice = "", uchoice = "";
            ss += arrTS.get(index).getSbd() + "\t";
            ss += arrTS.get(index).getHoTen() + "\t";
            ss += arrTS.get(index).getKhoi().getTenKhoi() + "\t";
            ss += arrTS.get(index).getDiaChi().getThanhPho() + "\t";
            ss += arrTS.get(index).getUuTien() + "\t";

            tar_ttthisinh.setText(ss);
            txt_sbd.setText(arrTS.get(index).getSbd() + "");
            txt_hoten.setText(arrTS.get(index).getHoTen() + "");
            txt_sonha.setText(String.valueOf(arrTS.get(index).getDiaChi().getSoNha()));
            txt_duong.setText(arrTS.get(index).getDiaChi().getDuong());
            txt_quan.setText(arrTS.get(index).getDiaChi().getQuan());
            txt_thanhpho.setText(arrTS.get(index).getDiaChi().getThanhPho());
            schoice += arrTS.get(index).getKhoi().getTenKhoi().toString().trim();
            uchoice += arrTS.get(index).getUuTien().toString().trim();

            //set index choice
            if (schoice.equals("Khối A")) {
                choice1.select("Khối A");
            } else if (schoice.equals("Khối B")) {
                choice1.select("Khối B");
            } else {
                choice1.select("Khối C");
            }
            //set index choice uu tien
            if (uchoice.equals("Nhóm 1")) {

                choice_ut.select("Nhóm 1");
            } else if (uchoice.equals("Nhóm 2")) {
                choice_ut.select("Nhóm 2");
            } else {
                choice_ut.select("Nhóm 3");
            }
        } else {
            btn_next.setEnabled(false);
        }

    }//GEN-LAST:event_btn_nextActionPerformed

    private void txt_timkiemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_timkiemKeyTyped

    private void txt_sonhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sonhaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sonhaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SuaThiSinh().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SuaThiSinh.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SuaThiSinh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_back;
    private java.awt.Button btn_next;
    private java.awt.Button btn_sua;
    private java.awt.Button btn_timkiem;
    private java.awt.Choice choice1;
    private java.awt.Choice choice_ut;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.Panel panel1;
    private java.awt.TextArea tar_ttthisinh;
    private java.awt.TextField txt_duong;
    private java.awt.TextField txt_hoten;
    private java.awt.TextField txt_quan;
    private java.awt.TextField txt_sbd;
    private java.awt.TextField txt_sonha;
    private java.awt.TextField txt_thanhpho;
    private java.awt.TextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
