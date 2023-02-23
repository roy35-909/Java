public class Mammal extends Animal{

    public int legs;

    public Mammal(){
        super("Bat","Dhaka","Bat mother");
        this.legs = 4;
        
    }
    public Mammal(int l){
        super();
        this.legs = l;
        
    }

    public static void main(String[] diu)
    {

        Mammal mammal = new Mammal(3);

        System.out.println(mammal.name);
        System.out.println(mammal.home);
        System.out.println(mammal.mother);
        System.out.println(mammal.legs);
    }



}