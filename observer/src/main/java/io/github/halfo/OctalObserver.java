package io.github.halfo;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " +
                           Integer.toOctalString(subject.getState())); 
    }
}
