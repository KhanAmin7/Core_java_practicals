//  Demonstrate the use of constructors in java.
import java.util.Scanner;
class prac4b
{
int id;
String name;
float salary;
prac4b()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter ID: ");
id= s.nextInt();
System.out.println("Enter Name: ");
name= s.next();
System.out.println("Enter Salary: ");
salary= s.nextFloat();
}
void display()
{
System.out.println("ID: " +id+ " Name: " +name+ " Salary: " +salary);
}
public static void main(String args[])
{
prac4b e = new prac4b();
e.display();
}
}