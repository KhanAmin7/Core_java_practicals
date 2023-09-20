// Create a class Student used to initialise roll no, create another class test used to initialise the
// semester 1 and semester 2 marks of the student. An interface named Sports consist of one
// method to display the sports marks.Both the Test class and Sports interface are derived by the
// Results class.Show the implementation of multiple inheritance

class Student
{
int rollno;
public void getNumber(int n){
rollno=n;
}
public void putNumber(){
System.out.println("Roll No:"+rollno);
}
}
class Test extends Student
{
float sem1,sem2;
public void getMarks(float s1, float s2){
sem1=s1;
sem2=s2;
}
public void putMarks(){
System.out.println("marks obtained:");
System.out.println("Sem1="+sem1);
System.out.println("Sem2="+sem2);
}
}
interface Sports{
float sportmk=6.0f;
void putMarks();
}
class Result extends Test implements Sports
{
float total;
public void putMarks()
{
System.out.println("Sports marks="+sportmk);
}
public void display()
{
total=sem1+sem2+sportmk;
putNumber();
super.putMarks(); //method of Test class called
}
}
class prac5d
{
public static void main(String[] args)
{
Result r=new Result();
r.getNumber(2);
r.getMarks(53.4f,46.7f);
r.display();
r.putMarks(); //method of interface sports called
System.out.println("Total score="+r.total);
}
}
