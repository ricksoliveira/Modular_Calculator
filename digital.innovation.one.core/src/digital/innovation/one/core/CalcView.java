package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import digital.innovation.one.utils.Calculadora;

public class CalcView {

    private JPanel panelMain;
    private JTextField textField1;
    private JButton button_equal;
    private JButton button_num3;
    private JButton button_num7;
    private JButton button_num6;
    private JButton button_num8;
    private JButton button_num4;
    private JButton button_num1;
    private JButton button_num0;
    private JButton button_num9;
    private JButton button_num5;
    private JButton button_num2;
    private JButton button_float;
    private JButton button_div;
    private JButton button_mult;
    private JButton button_sub;
    private JButton button_sum;
    private JButton button_clear;
    private JLabel labelText;
    private JButton button_invert;

    public CalcView() {

        final String[] op = {""};
        final boolean[] dot = {false};
        final double[] num1 = new double[1];
        final double[] num2 = new double[1];
        Calculadora c1 = new Calculadora();

        button_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                labelText.setText("");
                dot[0] = false;
            }
        });
        button_num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonSevenTxt = button_num7.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonSevenTxt);
            }
        });
        button_num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonEightTxt = button_num8.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonEightTxt);
            }
        });
        button_num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNineTxt = button_num9.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonNineTxt);
            }
        });
        button_num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonFourTxt = button_num4.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonFourTxt);
            }
        });
        button_num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonFiveTxt = button_num5.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonFiveTxt);
            }
        });
        button_num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonSixTxt = button_num6.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonSixTxt);
            }
        });
        button_num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonOneTxt = button_num1.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonOneTxt);
            }
        });
        button_num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonTwoTxt = button_num2.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonTwoTxt);
            }
        });
        button_num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonThreeTxt = button_num3.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonThreeTxt);
            }
        });
        button_num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonZeroTxt = button_num0.getText();
                String currentTxt = textField1.getText();
                textField1.setText(currentTxt + buttonZeroTxt);
            }
        });
        button_float.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField1.getText().equals("")){
                    if(!dot[0]){
                        String buttonDotTxt = button_float.getText();
                        String currentTxt = textField1.getText();
                        textField1.setText(currentTxt + buttonDotTxt);
                        dot[0] = true;
                    }
                }
            }
        });
        button_sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op[0] = "sum";
                dot[0] = false;
                String currentTxt = textField1.getText();
                num1[0] = Double.parseDouble(currentTxt);
                labelText.setText(currentTxt + " + ");
                textField1.setText("");
            }
        });
        button_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op[0] = "sub";
                dot[0] = false;
                String currentTxt = textField1.getText();
                num1[0] = Double.parseDouble(currentTxt);
                labelText.setText(currentTxt + " - ");
                textField1.setText("");
            }
        });
        button_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op[0] = "mult";
                dot[0] = false;
                String currentTxt = textField1.getText();
                num1[0] = Double.parseDouble(currentTxt);
                labelText.setText(currentTxt + " * ");
                textField1.setText("");
            }
        });
        button_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op[0] = "div";
                dot[0] = false;
                String currentTxt = textField1.getText();
                num1[0] = Double.parseDouble(currentTxt);
                labelText.setText(currentTxt + " / ");
                textField1.setText("");
            }
        });
        button_invert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentTxt = textField1.getText();
                double invert = Double.parseDouble(currentTxt);
                textField1.setText(Double.toString(invert * -1));
            }
        });
        button_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String currentLabel = labelText.getText();
                String currentTxt = textField1.getText();
                num2[0] = Double.parseDouble(currentTxt);
                textField1.setText("");

                switch(op[0]){
                    case "sum":
                        labelText.setText(currentLabel + currentTxt + " = " + c1.sum(num1[0], num2[0]));
                        op[0] = "";
                        break;

                    case "div":
                        labelText.setText(currentLabel + currentTxt + " = " + c1.div(num1[0], num2[0]));
                        op[0] = "";
                        break;

                    case "mult":
                        labelText.setText(currentLabel + currentTxt + " = " + c1.mult(num1[0], num2[0]));
                        op[0] = "";
                        break;

                    case "sub":
                        labelText.setText(currentLabel + currentTxt + " = " + c1.sub(num1[0], num2[0]));
                        op[0] = "";
                        break;

                    default:
                        System.out.println("oi");
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setContentPane(new CalcView().panelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setSize(350, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
