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
public class Sach_Giao_Khoa extends Libarary {

    private String Tinhtrang;

    public Sach_Giao_Khoa() {
        super(null, 0, 0, null, 0, 0, 0);
    }

    public Sach_Giao_Khoa(String Tinhtrang, String MaSach, double Gia, int Soluong, String Nhaxuatban, int ngay, int thang, int nam) {
        super(MaSach, Gia, Soluong, Nhaxuatban, ngay, thang, nam);
        this.Tinhtrang = Tinhtrang;

    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        do {
            System.out.print("Nhap tinh trang sach [n(new) hay o[old]): ");
            this.Tinhtrang = sc.nextLine();
        } while (!"n".equals(this.Tinhtrang) && !"o".equals(this.Tinhtrang));
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }

    @Override
    public double thanhtien() {
        double thanhtien = 0;
        if (this.Tinhtrang.equals("n")) {
            thanhtien = super.thanhtien();
        } else {
            thanhtien = super.getGia() * super.getSoluong() * (50.0 / 100);
        }
        return thanhtien;
    }

    @Override
    public String toString() {
        return "Sach_Giao_Khoa{" + super.toString() + "Tinhtrang=" + Tinhtrang + '}';
    }

}
