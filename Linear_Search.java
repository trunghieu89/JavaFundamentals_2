/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Linear_Search {

    public static ArrayList<Integer> position = new ArrayList<>();

    public void linear_search(int arr[], int k) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                position.add(i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Not find");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6, 5, 2, 1};
        Linear_Search ls = new Linear_Search();
        System.out.print("Vi tri: ");
        int k = 10;
        ls.linear_search(arr, k);
        for (int i = 0; i < position.size(); i++) {
            System.out.print(position.get(i) + " ");

        }
    }
}
