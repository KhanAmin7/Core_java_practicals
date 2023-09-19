// area and cercumference of a circle
import java.util.Scanner;
class prac1a{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Radius");
        float radius = sc.nextFloat();
        float area= 3.14f*radius*radius;
        float circum= 2*3.14f*radius;
        System.out.println("Area" +area);
        System.out.println("Circumference" +circum);
    }
}