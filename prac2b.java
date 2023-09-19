// reversing a string and palindrome

// https://www.youtube.com/watch?v=ElIa5TOiC1U
import java.util.*;
class prac2b {
    public static void main (String args[]){
        String s, t="";
        Scanner in = new Scanner(System.in);
        System.out.println("enter a sring:");
        s= in.nextLine();
        int len= s.length();
        // starting from the end...going till the number is greater or equal to 0........iterating reverse
        for(int i=len-1;i>=0;i--)
        t=t+s.charAt(i);
        System.out.println(t);
        // if(s.equals(t)){
        //     System.out.println("palindrome");

        // }
        // else{
        //     System.out.println("not a palindrome");
    // }
        

    }
    
}
