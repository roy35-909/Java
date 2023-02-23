

public class Animal{

    public String name;
    public String home;
    public String mother;
    public Animal(){
        super();
        name = "Cat";
        home = "Dhaka";
        mother = "Cat mother";
    }

    public Animal(String names,String homes,String mothers)
        {
            
            this.name = names;
            this.home = homes;
            this.mother = mothers;

        }


    public static void main(String[] args)
    {
        Animal animal = new Animal("Dog","Delhi","Dog mother");


        System.out.println(animal.name);
        System.out.println(animal.home);
        System.out.println(animal.mother);
        
    }

}

