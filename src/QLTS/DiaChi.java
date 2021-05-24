/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTS;

import java.util.Scanner;

/**
 *
 * @author buida
 */
public class DiaChi {
    protected int soNha;
    protected String duong;
    protected String quan;
    protected String thanhPho;

    public DiaChi() {
    }

    public DiaChi(int soNha, String duong, String quan, String thanhPho) {
        this.soNha = soNha;
        this.duong = duong;
        this.quan = quan;
        this.thanhPho = thanhPho;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }
//    public void NhapDiaChi(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so nha: ");
//        soNha = sc.nextInt();
//        sc.nextLine();
//        duong = sc.nextLine();
//        quan = sc.nextLine();
//        thanhPho = sc.nextLine();
//    }
//
//    public void HienThiDC(){
//        
//    }
    
    @Override
    public String toString() {
        return "DiaChi{" + "soNha=" + soNha + ", duong=" + duong + ", quan=" + quan + ", thanhPho=" + thanhPho + '}';
    }
    
    
}
