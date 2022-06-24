package datastr;

public class MyLinkedList<R> {
    private Node<R> head;

    public void append(R d) {
        if (this.head == null) {
            this.head = new Node(d);
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Node(d);
        }
    }

    //deletes the first occurrence
    public void delete(R key) {
        //handling of HEAD of a list
        if (this.head != null && this.head.data.equals(key)) {
            this.head = this.head.next;
            return;
        }
        //other cases
        Node current = this.head;
        while (current.next != null) {
            if (current.next.data.equals(key)) {
                current.next = current.next.next;
                break;
            } else {
                current = current.next;
            }
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node last = this.head;
        if (last == null) {
            return "There is no data";
        } else {
            while (last != null) {
                builder.append(last.data).append(" ");
                last = last.next;
            }
            return builder.toString();
        }
    }

    private class Node<T> {
        T data;
        Node next = null;

        Node(T data) {
            this.data = data;
        }
    }
}
