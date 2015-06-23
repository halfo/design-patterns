package io.github.halfo;

public class GadgetFactory {
    public Gadget makeGadget(String newGadgetType) {
        if (newGadgetType.equals("Phone")) {
            return new Phone();
        } else if (newGadgetType.equals("Phablet")) {
            return new Phablet();
        } else if (newGadgetType.equals("Tablet")) {
            return new Tablet();
        }

        return null;
    }
}
