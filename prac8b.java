public class prac8b {
    public static void main (String args[]){
        int a[][]={{13,14,15},{12,4,7}};
        int b[][]={{1,4,15},{2,14,7}};
        int c[][]=new int [2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                // c[i][j]=0;
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }


    }
    
}

