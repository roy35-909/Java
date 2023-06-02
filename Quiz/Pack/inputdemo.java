package beginnerjava;
import java.util.Scanner;
public class inputdemo{ 

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enetr any number: ");
        number = input.nextInt();

        System.out.println("Number= "+number);
    }
}