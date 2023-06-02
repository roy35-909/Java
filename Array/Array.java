import java.util.Scanner;
import java.lang.Math;
class Array{


    public static void main(String [] args)
    {
       
        
        //Array Basic 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Size of Array : ");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter The Element No. "+i+" = ");
            array[i]=input.nextInt();
        } 
        for(int i:array){
            System.out.println("Element of Index  = "+i);
            if(i%2 == 0){
                System.out.println("Element is Even");
            }
            else{
                System.out.println("Element is Odd");
            }
        }



        //Type Conversion 
        double a = 4.99;
        int x = (int) a;
        System.out.println(x);

        // Math Class

        // import java.lang.Math

        int abs = -100;
        System.out.println("Absulute Value of x is"+Math.abs(abs)); // Output 100

        double z = 3.34;
        System.out.println("Value of z is "+ z); // Output :4
        System.out.println("Ceil of z is "+ Math.ceil(z)); // Output :4
        System.out.println("floor of z is "+ Math.floor(z));//Output : 3

        //The Math.round() method rounds a float or double to the nearest integer using normal math round rules (either up or down). Here is a Java Math.round() example:
        double roundsDown = 3.45;
        double roundsUp = 3.5;
        System.out.println("Round value of 3.45 is : "+Math.round(roundsDown)); //Output : 3
        System.out.println("Round value of 3.5 is : "+Math.round(roundsUp)); //Output : 4


        System.out.println("Square root of 4 is : "+ Math.sqrt(4));
        System.out.println("2^4 is : "+ Math.pow(2,4));
        System.out.println("exp of 4 is : "+ Math.exp(4));
        System.out.println("log(4) is : "+ Math.log(4));
        System.out.println("log10(4 is) : "+ Math.log10(4));


        System.out.println("Value of PI is : "+Math.PI);
        System.out.println("Value of E is : "+Math.E);


      
    }
}
