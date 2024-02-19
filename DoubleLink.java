/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleLinkList;

import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class DoubleLink {

    Node head, tail;

    public void input(int n) {

        for (int i = 0; i < n; i++) {
            int x;
            Scanner sc = new Scanner(System.in);
            x = Integer.parseInt(sc.nextLine());
            Node newNode = new Node(x);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            }
        }
    }

    public void output() {
        Node tam = head;
        while (tam != null) {
            System.out.print(tam.value + "<-->");
            tam = tam.next;
        }
        System.out.println("null");
    }

    public void output_nguoc() {
        Node tam = tail;
        while (tam != null) {
            System.out.print(tam.value + "<-->");
            tam = tam.previous;

        }
        System.out.println("null");
    }

    public void Tong() {
        Node tam = tail;
        int total = 0;
        while (tam != null) {
            total = total + tam.value;
            tam = tam.previous;

        }
        System.out.println("Tong: " + total);
    }

    public void count_le() {
        Node tam = tail;
        int count = 0;
        while (tam != null) {
            if (tam.value % 2 != 0) {
                count++;
            }
            tam = tam.previous;

        }
        System.out.println("So le: " + count);
    }

    public boolean dx() {
        Node tam = head;
        Node tam_2 = tail;
        while (tam != tam_2) {
            if (tam.value != tam_2.value) {
                return false;
            }
            tam = tam.next;
            tam_2 = tam_2.previous;
        }
        return true;
    }

    public static void main(String[] args) {
        DoubleLink dl = new DoubleLink();
        dl.input(7);
        dl.output();
        dl.output_nguoc();
        dl.Tong();
        dl.count_le();
        if (dl.dx() == true) {
            System.out.println("Doi xung");
        } else {
            System.out.println("Khong Doi xung");
        }
    }
}
