package Percobaan1;

import org.w3c.dom.Node;

/**
 * Node20
 */
public class Node20 {

    int data,jarak;
    Node20 next,prev;
    Node20(Node20 prev, int data, int jarak, Node20 next){
        this.data = data;
        this.jarak = jarak;
        this.next = next;
        this.prev = prev;
    }
}