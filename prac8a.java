public class prac8a {
    public static void main (String args[]){
        int a[][]={{13,14,15},{12,4,7},{18,17,9}};
        int b[][]={{1,4,15},{2,14,7},{8,7,9}};
        int c[][]=new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }


    }
    
}
