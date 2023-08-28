package com.systechafrica;

import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        App app = new App();
        int sum = app.sum();
        LOGGER.info("Hello World!"+sum);

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sum() {
        // user input > separated from core logic
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number"));

        //core logic
        return add(a, b);
    }
}
// if test fails in the test file => app will not build?