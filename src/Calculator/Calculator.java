package Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(500);
    JButton jButton0 = new JButton("0");
    JButton jButton1 = new JButton("1");
    JButton jButton2 = new JButton("2");
    JButton jButton3 = new JButton("3");
    JButton jButton4 = new JButton("4");
    JButton jButton5 = new JButton("5");
    JButton jButton6 = new JButton("6");
    JButton jButton7 = new JButton("7");
    JButton jButton8 = new JButton("8");
    JButton jButton9 = new JButton("9");
    JButton jButtonEqual = new JButton("=");
    JButton jButtonPoint = new JButton(".");
    JButton jButtonPlus = new JButton("+");
    JButton jButtonDivide =new JButton("/");
    JButton jButtonMinus = new JButton("-");
    JButton jButtonMultiple = new JButton("*");
    JButton jButtonCancel = new JButton("C");

    public Calculator() {

        BorderLayout borderLayout = new BorderLayout();
        windowContent.setLayout(borderLayout);

        windowContent.add("North", displayField);

        JPanel jPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(4,3);
        jPanel.setLayout(gridLayout);



        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);
        jPanel.add(jButton6);
        jPanel.add(jButton7);
        jPanel.add(jButton8);
        jPanel.add(jButton9);
        jPanel.add(jButtonPoint);
        jPanel.add(jButton0);
        jPanel.add(jButtonEqual);
        windowContent.add("Center",jPanel);

        JPanel jPanel2 = new JPanel();
        GridLayout gridLayout1 = new GridLayout(5,1);
        jPanel2.setLayout(gridLayout1);

        jPanel2.add(jButtonPlus);
        jPanel2.add(jButtonMinus);
        jPanel2.add(jButtonMultiple);
        jPanel2.add(jButtonDivide);
        jPanel2.add(jButtonCancel);

        windowContent.add("East",jPanel2);

        JFrame jFrame = new JFrame("Calculator");
        jFrame.setContentPane(windowContent);
        jFrame.setSize(270,400);
        jFrame.setVisible(true);

        CalculatorEngine calculatorEngine = new CalculatorEngine(this);
        jButton0.addActionListener(calculatorEngine);
        jButton1.addActionListener(calculatorEngine);
        jButton2.addActionListener(calculatorEngine);
        jButton3.addActionListener(calculatorEngine);
        jButton4.addActionListener(calculatorEngine);
        jButton5.addActionListener(calculatorEngine);
        jButton6.addActionListener(calculatorEngine);
        jButton7.addActionListener(calculatorEngine);
        jButton8.addActionListener(calculatorEngine);
        jButton9.addActionListener(calculatorEngine);
        jButtonEqual.addActionListener(calculatorEngine);
        jButtonPoint.addActionListener(calculatorEngine);
        jButtonMultiple.addActionListener(calculatorEngine);
        jButtonPlus.addActionListener(calculatorEngine);
        jButtonMinus.addActionListener(calculatorEngine);
        jButtonDivide.addActionListener(calculatorEngine);
        jButtonCancel.addActionListener(calculatorEngine);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
