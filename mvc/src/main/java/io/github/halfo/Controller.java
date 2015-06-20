package io.github.halfo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller {
    private Model model;
    private View view;

    public Controller (Model model, View view) {
        this.model = model;
        this.view = view;

        this.view.addCalculateListener(new CalculateListener());

    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int firstNumber, secondNumber;

            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getsecondNumber();

                model.addTwoNumbers(firstNumber, secondNumber);

                view.setResult(model.getResult());
            } catch (Exception ex) {
                view.setResult(0);
            }
        }
    }
}
