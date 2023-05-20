public class Var{
    String name = "Simanta kumar roy";
    static int year =2023;

    public static void main(String roy[])
    {
        Var obj1 = new Var();
        System.out.println(obj1.name);
        System.out.println(obj1.year);
        obj1.year = 2024;
        obj1.name = "Sourav Kumar Roy";
        Var obj2 = new Var();
        System.out.println(obj2.name);
        System.out.println(obj2.year);
        Var.year = 2025;
        obj2.name =  "Sourav Kumar Roy";
        System.out.println(obj2.year);
        System.out.println(obj1.year);
        System.out.println(obj2.name);
    } 

}