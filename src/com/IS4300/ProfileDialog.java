package com.IS4300;

import javax.swing.*;
import java.awt.event.*;

public class ProfileDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonClose;
    private JPanel bottomPanel;
    private JScrollPane scrollPanel;

    ProfileDialog() {
        // Initialize the dialog
        setContentPane(contentPane);
        setModal(false);
        setTitle("My Profile");
        getRootPane().setDefaultButton(buttonClose);
        setSize(250, 200);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        // Close button action
        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}
