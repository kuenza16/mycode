
public class LinkedList {
    class Node{
        int data;
        Node next;
    
    }
    Node head;
    Node tail;
    
    


    public void insert(int data){
        Node node = new Node();
        node.next = null;
        node.data =data;

        if(head ==null){
            head = node;
        }else{
            Node n = head;
            while(n.next!=null){
                n = n.next;

            }
            n.next = node;
        }
        

    }
    public  void PrintList(){
        Node n = head;
        if(n == null){
            System.out.println("its a null linkedlist");
        }else{
            while(n.next !=null){
                System.out.println(n.data);
                n = n.next;
               
            }
            System.out.println(n.data);

        }
        
    }
    public void insertAtstart(int data){
        Node node = new Node();
        node.next =null;
        node.data=data;
        node.next =head;
        head =node;
    }
    public void insertAt(int index,int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index==0){
            insertAtstart(data);
        }else{
            Node n = head;
            for (int i =0;i<index-1;i++){
                n =n.next;
            }
            node.next = n.next;
            n.next = node;

        }

    }
public void delete(int data){
    if (data==0) {
        head = head.next;
        
    } else {
        Node n = head;
        Node n1 = null;
        for (int i =0; i<data-1;i++){
            n= n.next;


        }
        n1 = n.next;
        n.next = n1.next;
        n1=null;
        // System.out.println(n1.data);
        
    }

}
    


    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.insert(3);
        linkedlist.insert(4);
        linkedlist.insert(5);
        linkedlist.insert(7);
        linkedlist.insertAtstart(16);
        linkedlist.insertAt(0, 01);
        linkedlist.delete(3);
        linkedlist.PrintList();
        
    }
    
}
