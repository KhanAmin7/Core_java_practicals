class prac9a{
    public static void main (String args[]){
        StringBuffer str= new StringBuffer("Object Language");
        System.out.println("Initial String: "+str);
        for(int i=0;i<str.length();i++){
            System.out.println("Character at postion "+i+ " is " +str.charAt(i));
            
            

        }
        String chstr= new String(str.toString());
            int pos= chstr.indexOf("Language");
            str.insert(pos, " Oriented");
            System.out.println("String after insertion: "+str);

            str.setCharAt(6, '-');
            System.out.println(str);

            str.append(" Improves security");
            System.out.println("After appending: "+str);
    }
}