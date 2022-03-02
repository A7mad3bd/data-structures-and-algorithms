package linked;

public class linked<T> {
    Node head;

    public linked(){
        this.head = null;
    }

    public void inseert(T v){
        Node newNode = new Node(v);
        newNode.next = this.head;
        this.head = newNode;
    }

public boolean includes(T v){
        boolean flag=false;
         Node pointer = this.head;
    while(pointer != null){
        if(v.equals(pointer.value)){
            flag=  true;
        }
        pointer = pointer.next;
    }
    return flag;
}


    public String toString(){
        String S="";
        Node pointer = this.head;
        while(pointer != null)
        {
            S+="{ "+ pointer.value+" } -> ";
            pointer = pointer.next;
        }
        S+="NULL";
        return S.toString();
    }

}
