class Student extends Human{
    String stu_id=null;
    String university_name = null;


    public Student(String name,String skin_color, String dob, String stu_id, String university_name)
    {
        super(name,skin_color,dob);
        this.stu_id = stu_id;
        this.university_name = university_name;
    }


    public static void main(String roy[])
        {
            Student stu1 = new Student("Simanta Kumar Roy","Black","05-12-2002","221-35-909","Daffodil intenational university");
            System.out.println(stu1.name);
            System.out.println(stu1.skin_color);
            System.out.println(stu1.dob);
            System.out.println(stu1.stu_id);
            System.out.println(stu1.university_name);
        }
}

class Human{

    String name = null;
    String skin_color=null;
    String dob = null;
    String nid =null;

    public Human(String name,String skin_color, String dob)
    {
        this.name = name;
        this.skin_color = skin_color;
        this.dob = dob;
    }
    public Human(String nid)
    {
        this.nid = nid;
    }
}