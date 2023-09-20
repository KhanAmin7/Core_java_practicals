//prog for method overloading by changing the data type of parameters
class Calculate{
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,int b,double c){
        return a+b+c;

    }}
    public class prac6ap2{
        public static void main (String args[]) {
            Calculate obj=new Calculate();
           double r1= obj.add(2,3,7);
           System.out.println(r1);
    }

}
