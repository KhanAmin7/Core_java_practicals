import java.util.Scanner;
class Rectangle
{
int length,width;
void get()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter length and width of rectangle");
length = s.nextInt();
width=s.nextInt();
}
void calcarea()
{
int area = length*width;
System.out.println("Area of Rectangle:"+area);
}
}
class prac4a
{
public static void main(String args[])
{
Rectangle r1 =new Rectangle();
r1.get();
r1.calcarea();
}
}
