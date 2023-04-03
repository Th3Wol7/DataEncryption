

public class Node {

    private HashDictionary data;
    private Node next;

    public Node() {

    }

    public Node(HashDictionary data) {
        this.data = data;
        next = null;
    }

    public Node(Node other) {
        this.data = other.data;
        this.next = other.next;

    }

    public HashDictionary getData() {
        return data;
    }

    public void setData(HashDictionary data) {
        this.data = data;

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return data + "\n+nextNode";
    }
}
