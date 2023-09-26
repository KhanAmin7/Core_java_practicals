import java.io.*;
import java.util.*;

class prac10b {
    public static void main(String[] args) {
        String s1, s2, s3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        s1 = sc.nextLine();
        System.out.println("Enter the address:");
        s2 = sc.nextLine();
        System.out.println("Enter the number:");
        s3 = sc.nextLine();

        FileOutputStream fos = null; // Declare the variable outside the try-catch block

        try {
            fos = new FileOutputStream("amin.txt");
            byte b1[] = (s1 + "\n").getBytes();
            fos.write(b1);
            byte b2[] = (s2 + "\n").getBytes();
            fos.write(b2);
            byte b3[] = (s3 + "\n").getBytes();
            fos.write(b3);
            System.out.println("Data written to 'amin.txt' successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            // Handle the exception as needed (e.g., exit the program or provide an error message)
        } finally {
            // Close the FileOutputStream in the finally block to ensure it's always closed
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
