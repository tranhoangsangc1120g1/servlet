package bai10.baitap.bai1.models;

public class Customer {
    private String ten;
    private int tuoi;
    private String diachi;
    private String anh;

    public Customer(String ten, int tuoi, String diachi, String anh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}
