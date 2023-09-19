//  Write a program to accept integer values for a, b and c which are coefficients
// of quadratic equation and find the solution of quadratic equation.
import java.util.Scanner;
import java.lang.Math;
class prac1b{
    public static void main (String args[]){
        float a, b, c, d;
        double x1, x2, v;
        System.out.println("Enter the values of A , B and C : ");
        Scanner s= new Scanner(System.in);
        a =s.nextFloat();
        b =s.nextFloat();
        c =s.nextFloat();
        System.out.println("the value of coefficient are ="+a + "b="+b + "c="+ c );
        d= b*b-4*a*c;
        if(d>0){
            x1= +b-Math.sqrt(d)/2*a;
            x2= -b-Math.sqrt(d)/2*a;
            System.out.println("roots are real and distinct");
            System.out.println(x1);
            System.out.println(x2);


        }
        else if(d==0){
            System.out.println("roots are real and equal");
            v= -b/(2*a);
            System.out.println(v);
            }
        else{
            System.out.println("imaginary number");
        }

        }

    }


