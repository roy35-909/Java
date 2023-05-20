class Bird{
    private String color = "Green";
    protected int age = 1;
    public int number;
    public static int count = 0;
    public Bird(int num){
        this.number = num;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void eat(){
        System.out.println("Bird Is eating");
    }
    public void makeSound(){
        System.out.println("Bird is making sound");
}
}
class Parrot extends Bird{
    public Parrot(){
     
        super(++count);   
    }
    public void makeSound(){
        super.makeSound();
        System.out.println("Bird is chirping");
    }
    public void eat(){
        System.out.println("Number of Parrot is "+number);
        
    }
 
}
class Tester{
    public static void main(String [] args){
        Parrot p1 = new Parrot();
        p1.eat();
        p1.makeSound();
        System.out.println("Color of the parrot is "+p1.getColor());
        p1.setColor("Blue");
        System.out.println("Color of the parrot is "+p1.getColor());

        System.out.println("Age of the parrot is "+p1.age+" years");
        Parrot p2 = new Parrot();
        p2.eat();
        p2.makeSound();
        System.out.println("Color of the parrot is "+p2.getColor());
        p2.setColor("Red");
        System.out.println("Color of the parrot is "+p2.getColor());


    
        System.out.println("Age of the Parrot2 is "+p2.age+" Years");
}
}