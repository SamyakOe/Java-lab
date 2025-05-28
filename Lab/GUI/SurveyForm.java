
package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SurveyForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Basic Survey Form");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Input Fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(15);

        JLabel genderLabel = new JLabel("Gender:");
        String[] genderOptions = {"Male", "Female", "Other"};
        JComboBox<String> genderBox = new JComboBox<>(genderOptions);

        JLabel feedbackLabel = new JLabel("Feedback:");
        JTextArea feedbackArea = new JTextArea(5, 15);
        feedbackArea.setLineWrap(true);
        feedbackArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(feedbackArea);

        JButton submitButton = new JButton("Submit");

        // Set component max sizes for better layout
        nameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        ageField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        genderBox.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        scrollPane.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));

        // Center alignment
        for (JComponent c : new JComponent[]{nameLabel, nameField, ageLabel, ageField, genderLabel, genderBox, feedbackLabel, scrollPane, submitButton}) {
            c.setAlignmentX(Component.CENTER_ALIGNMENT);
        }

        // Add components to panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(Box.createVerticalStrut(10));
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(Box.createVerticalStrut(10));
        panel.add(genderLabel);
        panel.add(genderBox);
        panel.add(Box.createVerticalStrut(10));
        panel.add(feedbackLabel);
        panel.add(scrollPane);
        panel.add(Box.createVerticalStrut(15));
        panel.add(submitButton);

        // Button Action
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String gender = (String) genderBox.getSelectedItem();
                String feedback = feedbackArea.getText();

                String message = "Survey Details:\n"
                        + "Name: " + name + "\n"
                        + "Age: " + age + "\n"
                        + "Gender: " + gender + "\n"
                        + "Feedback: " + feedback;

                JOptionPane.showMessageDialog(frame, message, "Survey Submission", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
