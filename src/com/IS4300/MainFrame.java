package com.IS4300;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel rootPanel;
    private JTabbedPane tabbedPane;
    private JPanel bottomPanel;
    private JPanel requestPanel;
    private JPanel rolePanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton createButton;
    private JButton viewProfileButton;
    private JTextArea textArea1;
    private JTextField textField4;
    private JTextField textField5;
    private JButton submitButton;
    private ProfileDialog profileDialog = new ProfileDialog();

    MainFrame() {
        // Set JFrame title
        super("IS4300 HW6");
        // Some standard swing stuff
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        // Add view profile button action
        viewProfileButton.addActionListener(e -> {
            // Spawns a JDialog
            if (!profileDialog.isVisible()) {
                profileDialog.setVisible(true);
            }
        });
    }
}
