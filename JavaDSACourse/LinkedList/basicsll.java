package JavaDSACourse.LinkedList;

public class basicsll {
    //Length Of Linked List
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;

    }
    // Display Recursively

    public static void displayr(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayr(head.next);

    }

    // display reverse Linked List
    public static void displayreverse(Node head) {
        if (head == null) return;
        displayreverse(head.next);
        System.out.print(head.data + " ");


    }

    //Display using head node (esse Head preserve nhi rehta hai )
    public static void display1(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    // Display by function using temp node
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    //    creating list node
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);
//        System.out.println(a.next);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(9);
        Node e = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        System.out.println(a.next.next.data);

        // For Linked List Display
//        Node temp =a;
//        for (int i =1;i<=5;i++){
//            System.out.print(temp.data + " => ");
//            temp=temp.next;
//        }


// For Linked List Display by While Loop
//        Node temp =a;
//        while (temp != null)
//        {
//            System.out.print(temp.data + " ");
//            temp=temp.next;
//        }
        displayr(a);
        System.out.println();
        displayreverse(a);
        System.out.println();
        System.out.println(length(a));


    }
}
