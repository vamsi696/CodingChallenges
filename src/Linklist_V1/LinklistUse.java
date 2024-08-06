package Linklist_V1;

public class LinklistUse {
    public static void Print(Node <Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        n2.next = n1;
        Print(n2);
    }
}
