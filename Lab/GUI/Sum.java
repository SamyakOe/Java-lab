package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Sum {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sum Calculator");
        frame.setSize(300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel num1 = new JLabel("Enter the first number:");
        JTextField num1Field = new JTextField(10);
        JLabel num2 = new JLabel("Enter the second number:");
        JTextField num2Field = new JTextField(10);

        JButton sumBtn = new JButton("Calculate Sum");
        JLabel result = new JLabel("Result will appear here");

        sumBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(num1Field.getText());
                    int b = Integer.parseInt(num2Field.getText());
                    int sum = a + b;
                    result.setText("Sum= " + sum);
                } catch (NumberFormatException ex) {
                    result.setText("Invalid entry!!");
                }
            }
        });

        frame.add(num1);
        frame.add(num1Field);
        frame.add(num2);
        frame.add(num2Field);
        frame.add(sumBtn);
        frame.add(result);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
