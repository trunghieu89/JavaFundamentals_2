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
public class HangDienMay extends HangHoa {

    private int thang_bao_hanh;
    private int cong_suat;
    private double Vat = 0.1;

    public HangDienMay() {
    }

    public HangDienMay(int thang_bao_hanh, int cong_suat) {
        this.thang_bao_hanh = thang_bao_hanh;
        this.cong_suat = cong_suat;
    }

    /**
     *
     * @param sc
     */
    @Override
    public void input(Scanner sc) {
        super.input(sc);
        while (true) {
            try {
                System.out.print("Nhap thang bao hanh: ");
                this.thang_bao_hanh = Integer.parseInt(sc.nextLine());
                if (this.thang_bao_hanh >= 0) {
                    break;

                }
            } catch (Exception e) {
            }

        }
        while (true) {
            try {
                System.out.print("Nhap kW: ");
                this.cong_suat = Integer.parseInt(sc.nextLine());
                if (this.cong_suat >= 0) {
                    break;

                }
            } catch (Exception e) {
            }
        }

    }

    @Override
    public void output() {
        super.output();
        System.out.println("Thang bao hanh: " + this.thang_bao_hanh);
        System.out.println("Cong suat: " + this.cong_suat);
    }

    @Override
    public boolean Danhgia() {
        if (super.getSoluonton() < 3) {
            return false; // ban dc
        } else {
            return true;// khong ban dc
        }
    }
}
