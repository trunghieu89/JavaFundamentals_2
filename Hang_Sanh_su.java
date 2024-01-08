/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaDay21;

import static JavaDay21.HangThucPham.date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class Hang_Sanh_su extends HangHoa {

    private String nha_san_xuat;
    private Date ngay_nhap_kho;
    public static SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
    public Hang_Sanh_su() {
    }

    public Hang_Sanh_su(String nha_san_xuat, Date ngay_nhap_kho) {
        this.nha_san_xuat = nha_san_xuat;
        this.ngay_nhap_kho = ngay_nhap_kho;
    }
   
    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Nhap nha san xuat: ");
        this.nha_san_xuat = sc.nextLine();
        while (true) {
            try {
                this.ngay_nhap_kho = new Date();
                System.out.print("Nhap ngay nhap kho: ");
                this.ngay_nhap_kho = df.parse(sc.nextLine());
                if (this.ngay_nhap_kho.before(date)) {
                    break;
                }
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Nha san xuat: " + this.nha_san_xuat);
        System.out.println("Ngay nhap kho(dd/mm/yyyy) : " + df.format(this.ngay_nhap_kho));
    }
    public double So_ngay_ton_kho() {
        double diff = date.getTime() - this.ngay_nhap_kho.getTime();
        int soNgay = (int) (diff / (24 * 60 * 60 * 1000));
        return soNgay;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean Danhgia() {
        if (super.soluonton > 50 && So_ngay_ton_kho() > 10) {
            return false;
        } else {
            return true;
        }
    }

}
