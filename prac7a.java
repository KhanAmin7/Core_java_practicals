import mypackage.Calculator;
public class prac7a
{
public static void main(String args[])
{
Calculator c=new Calculator();
System.out.println("Addition= "+c.add(2,5));
System.out.println("Subtraction= "+c.sub(2,5));
System.out.println("Multiplication= "+c.multi(2,5));
System.out.println("Division= "+c.div(10,5));
System.out.println("Average= "+c.avg(2,5));
}
}
