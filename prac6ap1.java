//Program for method overloading by changing number of parameters
class Calculate{
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;

    }}
    public class prac6ap1{
        public static void main (String args[]) {
            Calculate obj=new Calculate();
           int r1= obj.add(2,3);
           System.out.println(r1);
    }

}
