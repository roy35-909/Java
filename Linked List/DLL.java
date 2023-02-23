public class DLL{


    public Node head;

    public DLL()
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
                this.head.prev = null;
            }
        else{
                Node obj = this.head;
                while(obj.next!=null)
                {
                    obj = obj.next;
                }
                Node obj2 = new Node(data);
                obj2.prev = obj;
                obj.next = obj2;
        }

    }

    //For add data in first position

    public void add_in_first(int data)
    {
        Node newobj = new Node(data,this.head);
        newobj.prev = null;
        this.head = newobj;
    }

    // Print Full Array 
    public void print(){

        Node obj = this.head;
        while(obj.next!=null)
        {
            
            System.out.print(obj.prev);
            System.out.print("<-->");
            System.out.print(obj.data);
            System.out.print("<-->");
            System.out.print(obj.next);
            System.out.print("  |  ");
            
            obj = obj.next;
        }
            System.out.print(obj.prev);
            System.out.print("<-->");
            System.out.print(obj.data);
            System.out.print("<-->");
            System.out.print(obj.next);
            
            

    }



    

    
public static void main(String roy[])
{

    DLL obj = new DLL();
    obj.add(23);
    obj.add(67);
    obj.add(7);
    obj.add(78);
    obj.add(64);
    obj.add(71);
    obj.print();
}

}










//The Node Class
class Node{
    public Node prev;
    public int data;
    public Node next;


    public Node(int data){
        this.prev = null;
        this.data = data;
        this.next = null;
    }
    public Node(int data,Node next)
    {

        this.data = data;
        this.next = next;
    }
}