/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTS;

/**
 *
 * @author buida
 */
public class Khoi {
    protected String tenKhoi;
    protected String mon1;
    protected String mon2;
    protected String mon3;

    public Khoi(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }

    
    public Khoi(String tenKhoi, String mon1, String mon2, String mon3) {
        this.tenKhoi = tenKhoi;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public String getTenKhoi() {
        return tenKhoi;
    }

    public void setTenKhoi(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }

    public String getMon1() {
        return mon1;
    }

    public void setMon1(String mon1) {
        this.mon1 = mon1;
    }

    public String getMon2() {
        return mon2;
    }

    public void setMon2(String mon2) {
        this.mon2 = mon2;
    }

    public String getMon3() {
        return mon3;
    }

    public void setMon3(String mon3) {
        this.mon3 = mon3;
    }

   
    
}
