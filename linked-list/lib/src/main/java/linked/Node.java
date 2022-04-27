package linked;

public class Node<ls> {
    ls value;
    Node next;

    public Node(ls value) {
        this.value = value;
    }

    public ls getValue() {
        return value;
    }
}
