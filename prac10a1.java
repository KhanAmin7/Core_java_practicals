import java.io.*;
class Employee
{
String name;
int id;
int salary;
BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
Employee()
{
try
{
}
System.out.println("Enter the id");
id=Integer.parseInt(br.readLine());
System.out.println("Enter name");
name=br.readLine();
System.out.println("Enter salary");
salary=Integer.parseInt(br.readLine());
catch(Exception e)
{
System.out.println(e);
}
}
void Show()
{
System.out.println("The output is");
System.out.println("id is:"+id);
System.out.println("name is:" +name);
System.out.println("Salary is:"+salary);
}
}
class prac10a1
{
public static void main(String args[])
{
Employee e1 = new Employee();
e1.Show();
}
}
