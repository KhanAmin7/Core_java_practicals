class TA extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("This is thread 1 "+ "i= "+i);
        }
    }
}
class TB extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("This is thread 2 "+ "i= "+i);
        }
    }
}
class TC extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("This is thread 3 "+ "i= "+i);
        }
    }
}
public class prac7b{
    public static void main (String args[]){
        TA t = new TA();
        TB tt =new TB ();
        TC ttt= new TC();
        t.start();
        tt.start();
        ttt.start();


    }
}