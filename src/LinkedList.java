public class LinkedList { // Class of linked list
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Display() {
        // Node current will point to head
        Node node = head;

        while (node != null) {
            // Prints each node by incrementing pointer
            System.out.println(node.getData());
            node = node.getNext();
        }
        System.out.println();
    }

    public HashDictionary retrieve (int position) {
        // Node current will point to head
        Node node = head;
        for (int i = 0; i != position;i++){
            node = node.getNext();
        }
        // System.out.println();
        return node.getData();
    }

    void addToList(HashDictionary p) // Add hash in a new list
    {
        Node newNode = new Node(p);
        newNode.setData(p);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            head = newNode;
            newNode.setNext(temp);
        }
        this.size++;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}