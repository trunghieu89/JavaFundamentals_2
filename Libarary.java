/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaDay12;

import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class Libarary {

    private String MaSach;
    private double Gia;
    private int Soluong;
    private String Nhaxuatban;
    private int ngay, thang, nam;

    public Libarary() {
    }

    public Libarary(String MaSach, double Gia, int Soluong, String Nhaxuatban, int ngay, int thang, int nam) {
        this.MaSach = MaSach;
        this.Gia = Gia;
        this.Soluong = Soluong;
        this.Nhaxuatban = Nhaxuatban;

        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;

    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public String getNhaxuatban() {
        return Nhaxuatban;
    }

    public void setNhaxuatban(String Nhaxuatban) {
        this.Nhaxuatban = Nhaxuatban;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double thanhtien() {
        return getSoluong() * getGia();
    }

    public void input(Scanner sc) {
        System.out.print("Nhap Ma Sach: ");
        this.MaSach = sc.nextLine();
        System.out.print("Nhap ngay / thang / nam san xuat: ");
        this.ngay = Integer.parseInt(sc.nextLine());
        this.thang = Integer.parseInt(sc.nextLine());
        this.nam = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong");
        this.Soluong=Integer.parseInt(sc.nextLine());
        System.out.print("Gia sach: ");
        this.Gia = Double.parseDouble(sc.nextLine());
        System.out.print("Nha xuat ban: ");
        this.Nhaxuatban = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Libarary{" + "MaSach=" + MaSach + ", Gia=" + Gia + ", Soluong=" + Soluong + ", Nhaxuatban=" + Nhaxuatban + ", ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + '}';
    }

   
   
}
