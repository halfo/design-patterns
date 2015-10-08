package io.github.halfo;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver hexaObserver = new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15"); 
        subject.setState(15);

        subject.unsubscribe(hexaObserver);
        System.out.println("\nSecond state change: 10");  
        subject.setState(10);
    }
}
