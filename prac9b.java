class AgeException extends Exception{
    AgeException (String s){
        super(s);
    }
}
class checkAge {
    void validate(int age) throws AgeException{
        if(age <18){
            throw new AgeException("You are not elidgible for driving");
        }
    }
}

class prac9b{
    public static void main(String args[]){
        checkAge check = new checkAge();
        try{
            check.validate(20);
            System.out.println("You are elidgible for driving");
        }
        catch(AgeException e){
            System.out.println("Exception occured: "+e);

        }
        finally{
            System.out.println("thank you");
        }

    }
}