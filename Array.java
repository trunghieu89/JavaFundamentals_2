/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Array {

    public static int[] arr;
    public static Scanner sc = new Scanner(System.in);

    public void input(int n) {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
//            Random rd = new Random();
//            arr[i] = rd.nextInt() % 11;
            arr[i] = Integer.parseInt(sc.nextLine());
        }
    }

    public void output() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
    }

    public void Add_Element(int index, int value) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = value;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        arr = newArr;
    }

    public void Delete_Element(int index) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        arr = newArr;
    }

    public void Find_indexMax() {
        int index_Max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index_Max] < arr[i]) {
                index_Max = i;
            }

        }
        System.out.println("Vi tri max la: " + index_Max);

    }

    public void Hoan_Vi() {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int tam = arr[i];
            arr[i] = arr[j];
            arr[j] = tam;
            i++;
            j--;
        }
    }

    public void Delete_SoAm() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index_newArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[index_newArr] = arr[i];
                index_newArr++;
            }
        }
        arr = newArr;
    }

    public void Check_increase() {
        boolean check = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (!check) {
            System.out.println("Khong tang dan");
        } else {
            System.out.println("Tang dan");
        }
    }

    public void Count() {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <=arr[i + 1]) {                    
                count++;
            }
        }
        System.out.println("So lan chan dong la: " + count);
    }

    public static void main(String[] args) {

        System.out.print("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        Array a = new Array();
        a.input(n);
        System.out.print("Mang gom: ");
        a.output();
//        System.out.print("Sau khi add: ");
//        a.Add_Element(2, 7);
//        a.output();
//        System.out.print("Sau khi delete: ");
//        a.Delete_Element(3);
//        a.output();
//        a.Find_indexMax();
//        System.out.print("Sau khi hoan vi: ");
//        a.Hoan_Vi();
//        a.output();
//        System.out.print("Sau khi xoa so am: ");
//        a.Delete_SoAm();
//        a.output();
//        a.Check_increase();
        a.Count();
    }
}
