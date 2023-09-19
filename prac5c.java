//  Write a java program to implement Hierarchical Inheritance.
//Every employee in a company receives an average salary or payout of INR 30,000, The
// interns are entitled to a 25% increase in this average payout and a 50% increase for the full
// timers and show the new salary structure upon the increment.0
//parent class
class Employee {
double salary = 30000;
void displaySalary() {
System.out.println("Employee Salary: Rs. " +salary);
}
}
//child class
class FullTimeEmployee extends Employee {
double hike = 0.50;
void incrementSalary() {
salary = salary + (salary*hike);
}
}
//child class
class InternEmployee extends Employee {
double hike = 0.25;
void incrementSalary() {
salary = salary + (salary*hike);
}
}
class prac5c{
public static void main(String args[]) {
// object created
FullTimeEmployee emp1 = new FullTimeEmployee();
InternEmployee emp2 = new InternEmployee();
System.out.println("Salary of a full-time employee before incrementing: ");
emp1.displaySalary();
System.out.println("Salary of a intern before incrementing: ");
emp2.displaySalary();
// salary incremented
emp1.incrementSalary();
emp2.incrementSalary();
System.out.println("Salary of a full-time employee before incrementing: ");
emp1.displaySalary();
emp2.displaySalary();
}
}
