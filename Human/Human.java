public class Human{

public String name;
public int age;
public boolean status;
public float height;
public float weight;
public String hear_color;


public Human(){
    this.name = null;
    this.age = 0;
    this.status=false;
    this.height=0;
    this.weight = 0;
    this.hear_color = null;
}

public Human(String name,int age,boolean status){
    this.name = name;
    this.age = age;
    this.status= status;
    this.height=0;
    this.weight = 0;
    this.hear_color = null;
}
public void get_basic(){

    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.status);
    System.out.println(this.height);
    System.out.println(this.weight);
    System.out.println(this.hear_color);

}

public static void main(String[] roy)
{

    Human man = new Human("Simanta Kumar Roy",22,false);
    man.weight=50.8f;
    man.hear_color = "Black";
    man.height = 5.8f;
    man.get_basic();

}



}