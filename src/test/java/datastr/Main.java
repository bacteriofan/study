package datastr;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList();

        myList.append("d");
        myList.append("c");
        myList.append("b");
        myList.delete("b");
        System.out.println(myList);
    }


}
