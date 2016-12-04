package com.IS4300;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create an instance of the JFrame, which shows the GUI
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MainFrame();
            }
        });
    }
}
