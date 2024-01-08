/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaDay21;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class HangThucPham extends HangHoa {

    private String nhacungcap;
    public static Date date = new Date();
    private Date ngay_san_xuat = date;
    private Date ngay_het_han = ngay_san_xuat;
    private double Vat = 5 / 100;
    public static SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");

    public HangThucPham() {
    }

    public HangThucPham(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Nhap nha cung cap: ");
        this.nhacungcap = sc.nextLine();
        while (true) {
            try {
                this.ngay_san_xuat = new Date();
                System.out.print("Nhap ngay san xuat (dd/mm/yyyy): ");
                this.ngay_san_xuat = df.parse(sc.nextLine());
                if (this.ngay_san_xuat.before(date)) {
                    break;
                }
            } catch (Exception e) {
                System.err.print("Lon hon ngay hien tai");
            }
        }
        while (true) {
            try {
                this.ngay_het_han = new Date();
                System.out.print("Nhap ngay het han (dd/mm/yyyy): ");
                this.ngay_het_han = df.parse(sc.nextLine());
                if (this.ngay_het_han.after(date)) {
                    break;
                }
            } catch (Exception e) {
                System.err.print("Nho hon ngay hien tai");
            }
        }

    }

    @Override
    public void output() {
        super.output();
        System.out.println("Nha cung cap: " + this.nhacungcap);
        System.out.println("Ngay san xuat: " + df.format(this.ngay_san_xuat));
        System.out.println("Ngay het han: " + df.format(this.ngay_het_han));
    }

    @Override
    public boolean Danhgia() {
        if (super.soluonton > 0 && this.ngay_het_han.after(date)) {
            return true;// kho ban
        } else {
            return false;// ban duoc
    
        }
    }
}
