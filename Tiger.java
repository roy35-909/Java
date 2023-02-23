class Tiger extends Mammal{

    public String color;

    public Tiger()
    {

        this.color = null;
    }
    public Tiger(String color)
    {
        super();
        this.color = color;
    }
    public void changeName(String name)
        {

            this.name = name;
        }

    public static void main(String[] diu)
    {
        Tiger tiger = new Tiger("black");

        System.out.println(tiger.name);
        System.out.println(tiger.home);
        System.out.println(tiger.mother);
        System.out.println(tiger.legs);
        System.out.println(tiger.color);
        tiger.changeName("Roy");
        System.out.println(tiger.name);

    }

}