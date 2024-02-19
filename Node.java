/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleLinkList;

/**
 *
 * @author This PC
 */
public class Node {

    int value;
    Node next;
    Node previous;

    public Node(int value, Node next, Node previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
        if (next != null) {
            next.next = this;
        }
        if (previous != null) {
            previous.previous = this;
        }
    }

    public Node(int value) {
        this.value = value;
        next = previous = null;
    }

}
