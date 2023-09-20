// write a java program to implement method overriding.

class Parent
{
void show()
{
System.out.println("Parent's show()");
}
}
class child extends Parent
{
void show()
{
super.show();
System.out.print("Child's show()");
}
}
public class prac6bp1
{
public static void main(String[] args)
{
child obj1 = new child();
obj1.show();
}
}