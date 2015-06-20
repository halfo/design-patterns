package io.github.halfo;

/*
 * A simple calculator program
 * It takes two integer number and returns their sum
 */

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        view.setVisible(true);
    }
}
