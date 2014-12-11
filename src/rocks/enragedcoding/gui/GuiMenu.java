package rocks.enragedcoding.gui;

import rocks.enragedcoding.lib.MathLib;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: chris
 * @Date: December, 10 2014
 * @Time: 11:11 PM
 */
public class GuiMenu extends JFrame {
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
    private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8;
    private JButton jButton1, jButton2;

    public GuiMenu() {
        int WINDOW_WIDTH = 322;
        int WINDOW_HEIGHT = 303;
        setResizable(false);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        String WINDOW_TITLE = "Weekly Wage Calculator";
        setTitle(WINDOW_TITLE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        constructPanel();
        setVisible(true);
    }

    /**
     * constructPanel method
     * builds the panel (gui area)
     */
    private void constructPanel() {
        JPanel jPanel1 = new JPanel();
        add(jPanel1);
        constructLabels();
        constructTexts();
        constructButtons();
        jPanel1.add(jLabel9);
        jPanel1.add(textField8);
        jPanel1.add(jLabel1);
        jPanel1.add(textField1);
        jPanel1.add(jLabel2);
        jPanel1.add(textField2);
        jPanel1.add(jLabel3);
        jPanel1.add(textField3);
        jPanel1.add(jLabel4);
        jPanel1.add(textField4);
        jPanel1.add(jLabel5);
        jPanel1.add(textField5);
        jPanel1.add(jLabel6);
        jPanel1.add(textField6);
        jPanel1.add(jLabel7);
        jPanel1.add(textField7);
        jPanel1.add(jLabel8);
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);

    }

    /**
     * constructLabels method
     * builds the labels
     */
    private void constructLabels() {
        jLabel1 = new JLabel("Please enter hours worked Monday: ");
        jLabel2 = new JLabel("Please enter hours worked Tuesday: ");
        jLabel3 = new JLabel("Please enter hours worked Wednesday: ");
        jLabel4 = new JLabel("Please enter hours worked Thursday: ");
        jLabel5 = new JLabel("Please enter hours worked Friday: ");
        jLabel6 = new JLabel("Please enter hours worked Saturday: ");
        jLabel7 = new JLabel("Please enter hours worked Sunday: ");
        jLabel8 = new JLabel("Total: $0.00");
        jLabel9 = new JLabel("Please enter your income per hour: ");
    }

    /**
     * constructButtons method
     * builds the buttons
     */
    private void constructButtons() {
        jButton1 = new JButton("Calculate");
        jButton1.addActionListener(new jButton1Click());
        jButton2 = new JButton("Reset");
        jButton2.addActionListener(new jButton2Click());
    }

    /**
     * constructTexts methods
     * builds the text boxes
     */
    private void constructTexts() {
        int TEXT_LENGTH = 5;
        textField1 = new JTextField(TEXT_LENGTH);
        textField2 = new JTextField(TEXT_LENGTH);
        textField3 = new JTextField(TEXT_LENGTH);
        textField4 = new JTextField(TEXT_LENGTH);
        textField5 = new JTextField(TEXT_LENGTH);
        textField6 = new JTextField(TEXT_LENGTH);
        textField7 = new JTextField(TEXT_LENGTH);
        textField8 = new JTextField(12); // people can make a lot of money!
    }

    private class jButton1Click implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MathLib payHandler = new MathLib();
            payHandler.setWage(Double.parseDouble(textField8.getText()));
            payHandler.addIncome(1, Double.parseDouble(textField1.getText()));
            payHandler.addIncome(2, Double.parseDouble(textField2.getText()));
            payHandler.addIncome(3, Double.parseDouble(textField3.getText()));
            payHandler.addIncome(4, Double.parseDouble(textField4.getText()));
            payHandler.addIncome(5, Double.parseDouble(textField5.getText()));
            payHandler.addIncome(6, Double.parseDouble(textField6.getText()));
            payHandler.addIncome(7, Double.parseDouble(textField7.getText()));
            jLabel8.setText("Total: $" + payHandler.getPay());
        }
    }

    private class jButton2Click implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MathLib payHandler = new MathLib();
            payHandler.setWage(0.0);
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField7.setText("");
            textField8.setText("");
            jLabel8.setText("Total: $0.0");
        }
    }
}
