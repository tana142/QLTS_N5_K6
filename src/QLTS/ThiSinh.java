
package QLTS;public class ThiSinh {

    protected int sbd;
    protected String hoTen;
    protected Khoi khoi;
    protected DiaChi diaChi;
    protected String uuTien;

    public ThiSinh() {
    }

    public ThiSinh(int sbd, String hoTen, Khoi khoi, DiaChi diaChi, String uuTien) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.khoi = khoi;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public int getSbd() {
        return sbd;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Khoi getKhoi() {
        return khoi;
    }

    public void setKhoi(Khoi khoi) {
        this.khoi = khoi;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    
}

