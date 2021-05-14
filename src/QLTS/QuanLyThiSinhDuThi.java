/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTS;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author buida
 */
public class QuanLyThiSinhDuThi {

    public static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;

    }

    static void nhapts(ThiSinh ts) throws IOException {
        System.out.println("Nhap thong tin cua thi sinh: ");
        System.out.print("SBD: ");
        ts.sbd = Integer.valueOf(nhapgt());
        System.out.print("Ho va ten: ");
        ts.hoTen = nhapgt();
        int checkKhoi = nhapKhoi();
        if (checkKhoi == 1) {
            ts.khoi = new Khoi("A", "Toan", "Ly", "Hoa");
        } else if (checkKhoi == 2) {
            ts.khoi = new Khoi("B", "Toan", "Hoa", "Sinh");
        } else if (checkKhoi == 3) {
            ts.khoi = new Khoi("C", "Van", "Su", "Dia");
        }

//
        int soNha;
        String duong, quan, thanhPho;
//
        System.out.println("Dia chi: ");
        System.out.print("So nha: ");
        soNha = Integer.valueOf(nhapgt());
        System.out.print("Duong: ");
        duong = nhapgt();
        System.out.print("Quan: ");
        quan = nhapgt();
        System.out.print("Thanh pho: ");
        thanhPho = nhapgt();
        System.out.print("Uu tien: ");
        ts.uuTien = nhapgt();

    }

    static void hienthi(ThiSinh ts) {
        System.out.println("--------------------");
        System.out.println("SBD: " + ts.sbd);

        System.out.println("Ho ten: " + ts.hoTen);
        System.out.println("Khoi : " + ts.khoi.getTenKhoi());
        System.out.println("Mon 1: " + ts.khoi.getMon1());
        System.out.println("Mon 2: " + ts.khoi.getMon2());
        System.out.println("Mon 3: " + ts.khoi.getMon3());
        System.out.println("Dia chi: " + ts.diaChi);
        System.out.println("Uu tien: " + ts.uuTien);
    }

    static boolean ssxau(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) {
            return false;
        } else {
            return true;
        }
    }

    static int timKiemSBD(int sbd, ThiSinh ts[]){
        for (int i =0; i < ts.length; i++) {
            if(ts[i].getSbd() == sbd){
                return i;
            }
        }
        return -1;
        
    }
    
    static int nhapKhoi() throws IOException {
        String kt;
        System.out.print("Khoi thi: ");
        do {
            kt = nhapgt();
            if (ssxau(kt, "A") && ssxau(kt, "B") && ssxau(kt, "C")) {
                System.out.print("Ban chi co the nhapA/B/C: ");
            }
        } while (ssxau(kt, "A") && ssxau(kt, "B") && ssxau(kt, "C"));
        if (ssxau(kt, "A") == false) {
            return 1;
        } else if (ssxau(kt, "B") == false) {
            return 2;
        } else if (ssxau(kt, "C") == false) {
            return 3;
        } else {
            return 0;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int n, a = 0, b = 0, c = 0;
        System.out.print("So luong thi sinh: ");
        n = Integer.valueOf(nhapgt()).intValue();
        ThiSinh TS[] = new ThiSinh[n];
        System.out.println("--------NHAP THONG TIN---------");
        for (int i = 0; i < n; i++) {
            TS[i] = new ThiSinh();
            nhapts(TS[i]);
        }

        System.out.println("----------HIEN THI------------- ");
        for (int i = 0; i < n; i++) {
            hienthi(TS[i]);
            System.out.println("");
        }
        
        int sbd;
        System.out.println("Nhap sbd thi sinh can tim kiem: "); sbd =  Integer.valueOf(nhapgt()).intValue();
        
        if(timKiemSBD(sbd, TS) == -1){
            System.out.println("Khong co thi sinh nay trong danh sach!");
        }else {
            System.out.println("Thong tin sinh vien can tim kiem: ");hienthi(TS[timKiemSBD(sbd, TS)]);
        }
                
    }

}
