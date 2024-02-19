/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaDay12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class TestBook {

    public static Scanner sc = new Scanner(System.in);

    public void inputSgK(ArrayList<Sach_Giao_Khoa> arr1, ArrayList<Libarary> arr3) {
        Sach_Giao_Khoa sgk = new Sach_Giao_Khoa();
        sgk.input(sc);
        arr1.add(sgk);
        arr3.add(sgk);
    }

    public void inputSTK(ArrayList<Sach_tham_khao> arr2, ArrayList<Libarary> arr3) {
        Sach_tham_khao stk = new Sach_tham_khao();
        stk.input(sc);
        arr2.add(stk);
        arr3.add(stk);
    }

    public void output(ArrayList<Sach_tham_khao> arr2, ArrayList<Sach_Giao_Khoa> arr1) {
        System.out.println("------------Sach giao khoa---------");
        for (Sach_Giao_Khoa sgk : arr1) {
            System.out.println(sgk.toString());
        }
        System.out.println("------------Sach tham khao---------");
        for (Sach_tham_khao stk : arr2) {
            System.out.println(stk.toString());

        }
    }

    public double tongtien(ArrayList<Sach_tham_khao> arr2, ArrayList<Sach_Giao_Khoa> arr1) {
        double sum1 = 0;
        double sum2 = 0;
        for (Sach_Giao_Khoa sgk : arr1) {
            sum1 += sgk.thanhtien();
        }
        for (Sach_tham_khao stk : arr2) {
            sum2 += stk.thanhtien();
        }
        return sum1 + sum2;
    }

    public double tbc(ArrayList<Sach_tham_khao> arr2) {
        double sum = 0;
        int dem = 0;
        for (Sach_tham_khao stk : arr2) {
            sum = sum + stk.getGia();
            dem++;
        }
        return sum / dem;
    }

    public void dsnxb(ArrayList<Libarary> arr3, Scanner sc) {
        boolean check;
        String n;
        System.out.print("Nhap nha xuat ban: ");
        n = sc.nextLine();
        for (Libarary lb : arr3) {
            if (n.equalsIgnoreCase(lb.getNhaxuatban())) {
                System.out.println(lb.toString());
            } else {
                System.out.println("Khong co.");
            }
        }

    }

    public static void main(String[] args) {
        TestBook tb = new TestBook();
        Libarary lb = new Libarary();
        ArrayList<Sach_tham_khao> arr2 = new ArrayList<>();
        ArrayList<Sach_Giao_Khoa> arr1 = new ArrayList<>();
        ArrayList<Libarary> arr3 = new ArrayList<>();
        Sach_Giao_Khoa sgk = new Sach_Giao_Khoa();
        Sach_tham_khao stk = new Sach_tham_khao();

        int n;
        while (true) {
            System.out.println("Chon chuc nang muon thuc hien: ");
            System.out.println("1: Nhap sach giao khoa");
            System.out.println("2: Nhap sach tham khao");
            System.out.println("3: Xuat danh sach cac loai sach");
            System.out.println("4: Tong tien");
            System.out.println("5: Trung binh cong don gia");
            System.out.println("6: Xuat ra danh sach nha xuat ban");
            System.out.println("7: Thoat chuong trinh");
            System.out.print("Chon chuc nang muon thuc hien: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    System.out.println("--------------------------------------");
                    tb.inputSgK(arr1, arr3);
                    break;
                case 2:
                    System.out.println("--------------------------------------");
                    tb.inputSTK(arr2, arr3);
                    break;
                case 3:
                    System.out.println("--------------------------------------");
                    tb.output(arr2, arr1);
                    break;
                case 4:
                    System.out.println("--------------------------------------");
                    System.out.println("Tong tien: " + tb.tongtien(arr2, arr1));
                    break;
                case 5:
                    System.out.println("--------------------------------------");
                    System.out.println("Trung binh cong: " + tb.tbc(arr2));
                    break;
                case 6:
                    System.out.println("--------------------------------------");
                    tb.dsnxb(arr3, sc);
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0); // Terminate the program
                    break;
            }
        }
    }
}
