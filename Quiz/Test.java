class Test{

    public int x = 500;
    public int y = 100;

    protected int sum(){

        return x+y;
    }

 

}

class Roy extends Test{

    protected int sum(){

            return x-y;
        }

    
   public static void main(String[] args)
    {

        Test o = new Roy();

       
        
        System.out.println(o.sum());
    }


}