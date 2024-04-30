package LinkedListt;

class Nodee{
    int data;
    Node next;
    public Nodee(int data, Node next){
        this.data=data;
        this.next=next;
    }
}
public class linktro {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Node head = null;
        Node tail = null;
        for (int i = 0; i < arr.length; i++) {
            Node temp = new Node(arr[i], null);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        // printing the linkedList
        Node mover=head;
        while (mover !=null){
            System.out.print(mover.data+" ");
            mover=mover.next;

        }

    }
}
