package Linklist_V1;

import java.util.Scanner;

public class OptimizeTakeInput {
    public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if (head == null){
                head = currentNode;
                tail = currentNode;
            }else {
                tail.next = currentNode;
                tail = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void Print(Node<Integer> head){
        while (head != null){
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
