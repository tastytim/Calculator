package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {

    Calculator parent;
    char selectedAction = ' ';
    double currentResult = 0;
    final double zero = 0;

    public CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButtonClicked = (JButton) e.getSource();
        String displayFieldText = parent.displayField.getText();
        double displayValue = 0;
        if (!"".equals(displayFieldText)) {
            displayValue = Double.parseDouble(displayFieldText);
        }
        Object src = e.getSource();
        if (src == parent.jButtonPlus) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.jButtonMinus) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.jButtonDivide) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.jButtonMultiple) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.jButtonCancel) {
            selectedAction = 'C';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.jButtonEqual) {
            if (selectedAction == '+') {
                currentResult += displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            }
        } else {
            String clickedButtonLabel = jButtonClicked.getText();
            parent.displayField.setText(displayFieldText+clickedButtonLabel);
        }
    }
}
