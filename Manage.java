/*>
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaDay21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class Manage {

    public static ArrayList<HangHoa> arr = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public void add(HangHoa hang_hoa) {
        arr.add(hang_hoa);
    }

    public void ShowList() {
        for (HangHoa hangHoa : arr) {
            hangHoa.output();
        }
    }

    public void ShowItems() {
        System.out.println("====Hang dien may====");
        for (HangHoa hangHoa : arr) {
            if (hangHoa instanceof HangDienMay) {
                hangHoa.output();
            }
        }
        System.out.println("====Hang thuc pham====");
        for (HangHoa hangHoa : arr) {
            if (hangHoa instanceof HangThucPham) {
                hangHoa.output();
            }
        }
        System.out.println("====Hang sanh su====");
        for (HangHoa hangHoa : arr) {
            if (hangHoa instanceof Hang_Sanh_su) {
                hangHoa.output();
            }
        }
    }

    public HangHoa search(String ma) {
        for (HangHoa hangHoa : arr) {
            if (hangHoa.getMahang().equalsIgnoreCase(ma)) {
                return hangHoa;
            }
        }
        return null;
    }

    public void sort_Name() {
     Collections.sort(arr,Comparator.comparing(HangHoa::getTenhang));
    }

    public void sort_SoHang() {
        Collections.sort(arr, Comparator.comparing(HangHoa::getSoluonton));
        Collections.reverse(arr);
    }

    public boolean check_mahang(String ma) {
        for (HangHoa hangHoa : arr) {
            if (hangHoa.getMahang().equalsIgnoreCase(ma)) {
                return true;
            }
        }
        return false;
    }

    public void listMenu() {
        int n;
        System.out.println("1. Nhap");
        System.out.println("2. Xuat");
        System.out.println("3. In tưng loai");
        System.out.println("4. Tim kiem theo ma");
        System.out.println("5. Sap xep theo ten hang");
        System.out.println("6. Sap xep theo hang ton");
        System.out.println("7. Xuat thuc pham kho ban");
        System.out.println("8.Exit");
        while (true) {
            while (true) {
                try {
                    System.out.print("Chon lua chon: ");
                    n = Integer.parseInt(sc.nextLine());
                    if (n > 0 && n < 9) {
                        break;
                    }
                } catch (Exception e) {
                }
            }
            switch (n) {
                case 1:
                    int m;
                    while (true) {
                        System.out.println("1.Hang dien may");
                        System.out.println("2.Hang thuc pham");
                        System.out.println("3.Hang sanh su");
                        try {
                            System.out.print("Chon lua chon: ");
                            m = Integer.parseInt(sc.nextLine());
                            if (m > 0 && m < 4) {
                                break;
                            }
                        } catch (Exception e) {
                        }
                    }
                    switch (m) {
                        case 1:
                            System.out.println("============");
                            HangDienMay hdm = new HangDienMay();
                            hdm.input(sc);
                            String ma_1;
                            while (true) {
                                try {

                                    if (check_mahang(hdm.getMahang()) == false) {
                                        add(hdm);
                                        break;
                                    } else {
                                        System.err.println("Ma hang da ton tai ");
                                        System.out.print("Nhap lai ma: ");
                                        ma_1 = sc.nextLine();
                                        hdm.setMahang(ma_1);
                                    }
                                } catch (Exception e) {
                                }
                            }

                            System.out.println("============");
                            break;
                        case 2:
                            System.out.println("============");
                            HangThucPham htp = new HangThucPham();
                            htp.input(sc);
                            String ma_2;
                            while (true) {
                                try {
                                    if (check_mahang(htp.getMahang()) == false) {
                                        add(htp);
                                        break;
                                    } else {
                                        System.err.println("Da ton tai ");
                                        System.out.print("Nhap lai ma: ");
                                        ma_2 = sc.nextLine();
                                        htp.setMahang(ma_2);
                                    }
                                } catch (Exception e) {
                                }
                            }
                            System.out.println("============");
                            break;
                        case 3:
                            System.out.println("============");
                            Hang_Sanh_su hss = new Hang_Sanh_su();
                            hss.input(sc);
                            String ma_3;
                            while (true) {
                                try {
                                    if (check_mahang(hss.getMahang()) == false) {
                                        add(hss);
                                        break;
                                    } else {
                                        System.err.println("Da ton tai ");
                                        System.out.print("Nhap lai ma: ");
                                        ma_3 = sc.nextLine();
                                        hss.setMahang(ma_3);
                                    }
                                } catch (Exception e) {
                                }
                            }
                            System.out.println("============");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("============");
                    ShowList();
                    System.out.println("============");
                    break;
                case 3:
                    ShowItems();
                    break;
                case 4:
                    String ma;
                    System.out.print("Nhap ma hang muon tim: ");
                    ma = sc.nextLine();
                    if (search(ma) != null) {
                        System.out.println("============");
                        search(ma).output();
                        System.out.println("============");
                    } else {
                        System.err.println("Khong tim thay");
                    }
                    break;
                case 5:
                    sort_Name();
                    for (HangHoa hangHoa : arr) {
                        hangHoa.output();
                    }
                    break;
                case 6:
                    sort_SoHang();
                    for (HangHoa hangHoa : arr) {
                        hangHoa.output();
                    }
                    break;
                case 7:
                    for (HangHoa hangHoa : arr) {
                        if (hangHoa instanceof HangThucPham) {
                            boolean Danhgia = hangHoa.Danhgia();
                            if (Danhgia) {
                                hangHoa.output();
                            }
                        }
                    }
                    break;
                case 8:
                    System.out.println("Exit thanh cong.");
                    System.exit(0);
                    break;

            }
        }
    }

    public static void main(String[] args) {
        Manage ma = new Manage();
        ma.listMenu();
    }
}
