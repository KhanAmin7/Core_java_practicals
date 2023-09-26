import java.util.*;
public class prac8d{
   public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements to store in array:");
    int n = sc.nextInt();
    int num[]= new int [n];
    System.out.println("Enter the elements for the array");
    for(int i=0;i<n;i++){
        num[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(num[i]<num[j]){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;

            }
        }
        
    }
    System.out.println("\nSorted List");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+ " ");
    
    }
    
    
   }

}