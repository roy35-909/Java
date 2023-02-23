/*  
    Simanta Kumar Roy
    roy35-909@diu.edu.bd
    Daffodil International University

*/

public class LinkedList{

    public Node head;

    public LinkedList()
    {
        this.head = null;

    }

    // For add Data in Last position
    public void add(int data)
    {
        if(this.head == null)
            {
                Node obj = new Node(data);
                this.head = obj;
            }
        else{
                Node obj = this.head;
                while(obj.next!=null)
                {
                    obj = obj.next;
                }
                Node obj2 = new Node(data);
                obj.next = obj2;
        }

    }

    //For add data in first position

    public void add_in_first(int data)
    {
        Node newobj = new Node(data,this.head);
        this.head = newobj;
    }

    // Print Full Array 
    public void print(){

        Node obj = this.head;
        while(obj.next!=null)
        {
            System.out.print(obj.data);
            System.out.print(" ");
            obj = obj.next;
        }
        System.out.println(obj.data);

    }

    //Insert Data

    public void replace(int data,int pos)
    {
        if(pos==0)
        {
            this.head.data = data; // if the positon value is Zero thats means we want to add value in first positon ;
        }
        else{
        Node head = this.head;
        for(int i=0;i<pos-1;i++)  // Pos-1 means the head variable content one previous node ;
            {
                if(head.next ==null)
                    {
                        this.add(data);
                        break;
                    }
                head = head.next;
            }
            Node newobj = new Node(data,head.next.next);
            head.next = newobj;
        }
    }

    public void insert(int data,int pos)
        {
        Node head = this.head;
        if(pos==0)
        {
            this.add_in_first(data);
        }
        else{

        for(int i=0;i<pos-1;i++) // Pos-1 means the head variable content one previous node;
            {
                if(head.next ==null)
                    {
                        this.add(data);
                        break;
                    }
                head = head.next;
            }
            Node newobj = new Node(data,head.next);
            head.next = newobj;

        }

    }



    public static void main(String roy[])
    {

        LinkedList list1 = new LinkedList(); //Created Linked list object
        list1.add(23);
        list1.add(25);
        list1.add(26);
        list1.add(22);
        list1.add_in_first(8); // add in first position
        list1.insert(4,1); // Data position
        list1.replace(11,5);//data position
        list1.insert(5,0); // add in first position
        list1.print(); // Print the Full object
    }
}




//The Node Class

class Node{
    public int data;
    public Node next;


    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public Node(int data,Node next)
    {

        this.data = data;
        this.next = next;
    }
}