// Program to count the letters, spaces, numbers and other characters of a input
// String
import java.util.Scanner;

class prac3b {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scan.nextLine();
        
        int spaces = 0;
        int numbers = 0;
        int letters = 0;
        int others = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                spaces++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isLetter(ch)) {
                letters++;
            } else {
                others++;
            }
        }

        System.out.println("Total:");
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other characters: " + others);
    }
}
