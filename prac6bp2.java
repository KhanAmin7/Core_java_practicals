// Create a class Super which takes one variable of type integer as
// input, create another class Sub which takes an integer input and extends the super class. Both
// the classes have a display method which prints the input value. Implement the use of Super
// keyword in the derived class
class Super
{
int x;
Super (int x)
{
this.x = x;
}
void display()
{
System.out.println("Super x = " +x);
}
}
class Sub extends Super
{
int y;
Sub (int x, int y)
{
super(x);
this.y = y;
}
void display()
{
System.out.println("Super x = " + x);
System.out.println("Sub y = "+y);
}
}
class prac6bp2
{
public static void main(String args[])
{
Sub s1 = new Sub(100, 200);
s1.display();
}
}
