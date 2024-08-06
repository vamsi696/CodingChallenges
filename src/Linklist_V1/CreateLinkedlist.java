package Linklist_V1;

import generics.Pair;

import java.util.Scanner;

public class CreateLinkedlist {
    public static Node<Integer> LinklistUse(){
        Node<Integer> h1 = new Node<>(10);
        Node<Integer> h2 = new Node<>(20);
        Node<Integer> h3 = new Node<>(30);
        Node<Integer> h4 = new Node<>(40);

        h1.next = h2;
        System.out.println("h1 " + h1 + " data " + h1.data + " next " + h1.next);
        h2.next = h3;
        System.out.println("h2 " + h2 + " data " + h2.data + " next " + h2.next);
        h3.next = h4;
        System.out.println("h3 " + h3 + " data " + h3.data + " next " + h3.next);
        System.out.println("h4 " + h4 + " data " + h4.data + " next " + h4.next);
        return h1;
    }
        public static Node<Integer> takeInput(){
            Scanner sr = new Scanner(System.in);
            int data = sr.nextInt();
            Node<Integer> head = null;
            while (data != -1){
                Node<Integer> currentNode = new Node<>(data);
                if (head == null){
                    head = currentNode;
                }else {
                    Node<Integer> tail = head;
                    while (tail.next != null){
                        tail = tail.next;
                    }
                    tail.next = currentNode;
                }
                data = sr.nextInt();
            }
            return head;
        }
    public static void Print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
     Node<Integer> head = takeInput();
     Print(head);
//     Node<Integer> n1 = new Node(10);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
    }
}
