// Program to find smallest and largest element from an array
public class prac3a {
    public static void main (String args[]){
        int a[] = new int[]{12,45,22,13,9,21,98,77,66};
        int min =a[0];
        int max =a[0];
        for(int i=1;i<a.length;i++){
                       if(max<a[i]){
                        max =a[i];
        }
        if(min>a[i]){
            min= a[i];
        }
        

    }
    System.out.println("Greatest no:"+max);
        System.out.println("Smallest no:"+min);
    
}
}
