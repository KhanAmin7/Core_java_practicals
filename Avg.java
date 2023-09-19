import java.util.Scanner;

public class Avg {
    public static void main (String args[]){
        float a,b,avg;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a= scan.nextFloat();
        System.out.println("Enter the second number: ");
        b=scan.nextFloat();
        avg=(a+b)/2; //calculating average of two numbers using arithmetic mean formula
        System.out.print("The Average is "+avg);//displaying result on screen
    }
}
