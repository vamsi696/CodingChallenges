package Linklist_V1;

import java.util.Scanner;

public class TakeInput {
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
    }
}
