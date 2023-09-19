//  Write a java program to implement Multilevel inheritance.

class Iphone6 {
    void makeCalls() {
        System.out.println("Calling functionality...... ");
    }
}

class Iphone10 extends Iphone6 {
    void unlockPhoneByFaceId() {
        System.out.println("Unlocking phone by face id........");
    }
}

class Iphone12 extends Iphone10 {
    void supportFor5GNetwork() {
        System.out.println("5G Network support. ..... ");
    }

    public static void main(String args[]) {
        Iphone12 i = new Iphone12();
        i.makeCalls();
        i.unlockPhoneByFaceId();
        i.supportFor5GNetwork();
    }
}
