//  Write a java program to implement Single level inheritance.
class Parent {
    int parentVar;

    Parent() {
        parentVar = 10;
        System.out.println("This is the Parent class constructor");
    }

    void parentMethod() {
        System.out.println("This is a method from the Parent class");
    }
}

class Child extends Parent {
    int childVar;

    Child() {
        childVar = 20;
        System.out.println("This is the Child class constructor");
    }

    void childMethod() {
        System.out.println("This is a method from the Child class");
    }
}

public class prac5a {
    public static void main(String[] args) {
        Child childObj = new Child();

        System.out.println("Child Variable: " + childObj.childVar);
        System.out.println("Parent Variable (inherited): " + childObj.parentVar);

        childObj.childMethod();
        childObj.parentMethod();
    }
}
