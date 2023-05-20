import java.util.Scanner;
class Node{

    public String id;
    private String name;
    private String dep;
    private int age;
    private String address;
    public int isvisited = 0;
    public int isadded = 0;


    public Node(String id,String name, String dep, int age){
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.age = age;
    }
    public Node(String id,String name, String dep, int age,String address){

        //this.id = id;
        //this.name = name;
        //this.dep = dep;
        //this.age = age;

        this(id,name,dep,age); // :) 
        this.address = address;
    }

    public Node(String id){

        this.id = id;

    }
    public void print(){
        System.out.println(this.id);
        //System.out.println(this.name);
        //System.out.println(this.dep);
        //System.out.println(this.age);
        //System.out.println(this.address);
    }
  
}

class Queue{

    public int visit = -1;
    public int insert = 0;
    public int node ;
    public Node[] queue;
    public Queue(int node){
        this.node = node;
         queue = new Node[this.node];
    };
    

    public void add(Node n){
        
        queue[insert] = n;
        queue[insert].isadded = 1;
        insert+=1;
    }

    public Node nextVisit(){
        this.visit+=1;
        if(this.visit<node)
        {
        return queue[this.visit];
        }
        else{
            return null;
        }
    }
    public Node doVisit(){
        queue[visit].print();
        queue[visit].isvisited = 1;
        return queue[visit];
    }
}

class Bfs{

   private static int node_number = 7;
   private static Node[] nodes = new Node[node_number];
   
    public Bfs(int n){
        this.node_number = n;
    
    for(int i=0;i<this.node_number;i++)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Your Id : ");
        String id = input.nextLine();
        //System.out.print("Your Name : ");
        //String name = input.nextLine();
        //System.out.print("Your Department : ");
        //String dep = input.nextLine();
        //System.out.print("Your Address : ");
        //String address = input.nextLine();
        //System.out.print("Your Age : ");
        //int age = input.nextInt();
      
        this.nodes[i] = new Node(id);
    }

    }
   public int whereIsMyNode(Node n)
   {
    for(int i=0;i<this.node_number;i++)
    {
        if(this.nodes[i].id == n.id)
        {
            return i;
        }
    }
    return -1;
   }

   private int[][] matrix = {
    {0,1,0,1,0,0,0},
    {1,0,1,1,0,1,0},
    {0,1,0,1,1,1,0},
    {1,1,1,0,1,0,0},
    {0,0,1,1,0,0,1},
    {0,1,1,0,0,0,0},
    {0,1,0,0,1,0,0}
   };


   


  public static void main(String agrs[])
    {

        Bfs s = new Bfs(7);
        Queue q = new Queue(7);

        q.add(s.nodes[0]);

        
        while(q.nextVisit()!=null)
        {
           Node n = q.doVisit();
           int pos = s.whereIsMyNode(n);

           

           for(int i=0;i<s.node_number;i++)
           {
            //System.out.println(s.matrix[pos][i]);
            if(s.matrix[pos][i]==1 && s.nodes[i].isadded!=1 && s.nodes[i].isvisited!=1)
            {
                q.add(s.nodes[i]);
            }

           }

        }

 
    }



}