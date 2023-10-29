public class tugasInsertion {
    
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static Node head;
    
    static void insertSorted(int x) {
        Node newNode = new Node(x);
        
        if (head == null || x < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            
            while (current.next != null && current.next.data < x) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    static void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        head = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(7);
        Node node5 = new Node(10);
        
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        System.out.println("LinkedList awal:");
        printLinkedList();
        
        int x = 7;
        System.out.println("Menyisipkan " + x + " ke dalam LinkedList:");
        insertSorted(x);
        
        System.out.println("Hasil penyisipan:");
        printLinkedList();
    }
}
