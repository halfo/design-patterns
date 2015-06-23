package io.github.halfo;

public class Main {
    public static void main(String[] args) {
        // I don't have a smart phone, so I'm gonna order one, yay :D
        Gadget myGadget = new GadgetFactory().makeGadget("Phone");
        myGadget.showInfo();
    }
}
