import java.util.*;

class Employee {
    String name;
    int id;
    int salary;
    Scanner s;

    Employee() {
        s = new Scanner(System.in);
        try {
            System.out.println("Enter the id");
            id = s.nextInt();
            System.out.println("Enter name");
            name = s.next();
            System.out.println("Enter salary");
            salary = s.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void Show() {
        System.out.println("The output is");
        System.out.println("id is:" + id);
        System.out.println("name is:" + name);
        System.out.println("Salary is:" + salary);
    }
}

class prac10a2 {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.Show();
    }
}
