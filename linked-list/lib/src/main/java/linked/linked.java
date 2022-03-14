package linked;

import java.util.ArrayList;

public class linked<ls> {
    Node head;
    Node next;


    public linked() {
        this.head = null;
    }

    public void inseert(ls v) {
        Node newNode = new Node(v);
        newNode.next = this.head;
        this.head = newNode;
    }

    public boolean includes(ls v) {
        boolean flag = false;
        Node pointer = this.head;
        while (pointer != null) {
            if (v.equals(pointer.value)) {
                flag = true;
            }
            pointer = pointer.next;
        }
        return flag;
    }

    public void insertBefore(Node given_ptr, String val) {
        if (head == given_ptr) {
            Node n = new Node(val);
            n.next = head;
            head = n;
        } else {
            Node p = null;
            for (Node n = head; n != given_ptr;
                 p = n, n = n.next)
                ;
            Node m = new Node(val);
            m.next = p.next;
            p.next = m;
        }
    }

    public void insertAfter(Node prev_node, String new_data) {
        if (prev_node == null) {
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void append(String new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }


    public String kthFromEnd(int k) throws IllegalArgumentException {
        Node kth = this.head;
        int index = size() - k - 1;
        int i = 0;
        if (k < 0 || k > size() - 1) {
            return "Index Not Exist";
        } else {
            while (i != index) {
                i++;
                kth = kth.next;
            }
        }
        if (k > 0 || k < size() - 1)
            System.out.println("Happy Path");
        return String.valueOf(kth.value);
    }


    public String toString() {
        String S = "";
        Node pointer = this.head;
        while (pointer != null) {
            S += "{ " + pointer.value + " } -> ";
            pointer = pointer.next;
        }
        S += "NULL";
        return S.toString();
    }


    public int size() {
        int Size = 0;
        Node N = head;
        while (N != null) {
            Size++;
            N = N.next;
        }
        return Size;
    }

    public static linked zip_list(linked list1, linked list2) {

        Node pointer = list1.head;
        Node pointer1 = list2.head;
        linked list3 = new linked();

        boolean flag = true;
        while (flag) {
            if (pointer == null && pointer1 == null)
                flag = false;
            if (pointer != null) {
                list3.append((String) pointer.getValue());
                pointer = pointer.next;
            }

            if (pointer1 != null) {
                list3.append((String) pointer1.getValue());
                pointer1 = pointer1.next;
            }


        }
        return list3;
    }

    public boolean Palindrome(){
        boolean isPalindrome=true;
        ArrayList<String> copy_reverse=new ArrayList<>();
        Node n1=head;
        while(n1!=null){
            copy_reverse.add((String) n1.value);
            n1=n1.next;
        }
        reverseArrayList(copy_reverse);
        Node n2=head;
        for(int i=0;i<copy_reverse.size();i++){
            if(copy_reverse.get(i)==n2.value){
                n2=n2.next;
            }
            else{
                isPalindrome=false;
            }
        }
        return isPalindrome;
    }
    public ArrayList<String> reverseArrayList(ArrayList<String> alist)
    {

        for (int i = 0; i < alist.size() / 2; i++) {
            String temp = alist.get(i);
            alist.set(i, alist.get(alist.size() - i - 1));
            alist.set(alist.size() - i - 1, temp);
        }
        return alist;
    }
}





