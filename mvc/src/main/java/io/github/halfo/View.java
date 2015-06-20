package io.github.halfo;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JPanel mainPanel;
    private JTextField firstNumber;
    private JLabel addSign;
    private JTextField secondNumber;
    private JTextField showResult;
    private JButton calculateButton;

    View() {
        init();

        mainPanel.add(firstNumber);
        mainPanel.add(addSign);
        mainPanel.add(secondNumber);

        showResult.setEditable(false);
        mainPanel.add(showResult);

        mainPanel.add(calculateButton);

        this.add(mainPanel);
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        mainPanel = new JPanel();
        firstNumber = new JTextField(10);
        addSign = new JLabel("+");
        secondNumber = new JTextField(10);
        showResult = new JTextField(10);
        calculateButton = new JButton("Calculate");
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getsecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public void setResult(long result) {
        showResult.setText(Long.toString(result));
    }

    public void addCalculateListener(ActionListener listenCalculateButton) {
        calculateButton.addActionListener(listenCalculateButton);
    }
}
