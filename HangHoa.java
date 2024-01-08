/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaDay21;

import java.util.Scanner;

/**
 *
 * @author This PC
 */
abstract class HangHoa {

    protected String mahang;
    protected String tenhang = "xxx";
    protected int soluonton;
    protected int dongia;

    public void input(Scanner sc) {
        System.out.print("Nhap ma hang: ");
        this.mahang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        this.tenhang = sc.nextLine();
        while (true) {
            try {
                System.out.print("Nhap so luong ton: ");
                this.soluonton = Integer.parseInt(sc.nextLine());
                if (this.soluonton >= 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Lon hon 0");
            }
        }
        while (true) {
            try {
                System.out.print("Nhap don gia: ");
                this.dongia = Integer.parseInt(sc.nextLine());
                if (this.dongia >= 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Lon hon 0");
            }
        }
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public int getSoluonton() {
        return soluonton;
    }

    public void setSoluonton(int soluonton) {
        this.soluonton = soluonton;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public void output() {
        System.out.println("Ma hang: "+this.mahang);
        System.out.println("Ten hang: "+this.tenhang);
        System.out.println("So luong ton: "+this.soluonton);
        System.out.println("Don gia: "+this.dongia);
    }
    public abstract boolean Danhgia(); 

}
