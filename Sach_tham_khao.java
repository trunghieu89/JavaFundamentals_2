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
public class Sach_tham_khao extends Libarary {

    private double thue;

    public Sach_tham_khao() {
        super(null, 0, 0, null, 0, 0, 0);
    }

    public Sach_tham_khao(double thue, String MaSach, double Gia, int Soluong, String Nhaxuatban, int ngay, int thang, int nam) {
        super(MaSach, Gia, Soluong, Nhaxuatban, ngay, thang, nam);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public double thanhtien() {

        return super.thanhtien() + thue;

    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Nhap thue: ");
        this.thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Sach_tham_khao{" + super.toString() + "thue=" + thue + '}';
    }

}
