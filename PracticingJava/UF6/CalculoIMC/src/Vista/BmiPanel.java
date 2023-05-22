/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Model.dividir;
import Model.multiplicar;
import Model.restar;
import Model.sumar;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shas4605
 */
public class BmiPanel extends JPanel implements ActionListener {

    private sumar modelSumar;
    private restar modelRestar;
    private multiplicar modelMulti;
    private dividir modelDividir;
    private JTextField tfNum1;
    private JTextField tfNum2;
    private JTextField tfBMi;
    private ActionListener listener;

    public BmiPanel() {
        listener = this;
        initComponents();
        doClear();
    }

    private void initComponents() {
        this.setLayout(new BorderLayout());

        JLabel lbHeader = new JLabel("BMI Calculator");
        lbHeader.setHorizontalAlignment(JLabel.CENTER);
        this.add(lbHeader, BorderLayout.NORTH);
        JPanel form_principal = createBmiForm();
        this.add(form_principal, BorderLayout.CENTER);

    }

    private JPanel createBmiForm() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));

        panel.add(new JLabel("num1"));
        tfNum1 = new JTextField(20);
        panel.add(tfNum1);

        panel.add(new JLabel("num2"));
        tfNum2 = new JTextField(20);
        panel.add(tfNum2);

        JButton sumar = new JButton("Sumar");
        sumar.addActionListener(listener);
        sumar.setActionCommand("sumar");
        panel.add(sumar);

        JButton restar = new JButton("Restar");
        restar.addActionListener(listener);
        restar.setActionCommand("restar");
        panel.add(restar);

        JButton multi = new JButton("Multi");
        multi.addActionListener(listener);
        multi.setActionCommand("multi");
        panel.add(multi);
        
        JButton dividir = new JButton("Dividir");
        dividir.addActionListener(listener);
        dividir.setActionCommand("dividir");
        panel.add(dividir);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(listener);
        btnClear.setActionCommand("clear");
        panel.add(btnClear);
        
        JButton n = new JButton("");
        n.addActionListener(listener);
        n.setActionCommand("");
        panel.add(n);


        panel.add(new JLabel("Result"));
        tfBMi = new JTextField(20);
        tfBMi.setEditable(false);
        panel.add(tfBMi);

        return panel;

    }

    private void doClear() {
        tfNum1.setText("0.0");
        tfNum2.setText("0.0");
        tfBMi.setText("0.0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        switch (action) {
            case "clear":
                doClear();
                break;
            case "sumar":
                doCalculateSumar();
                break;
            case "restar":
                doCalculateRestar();
                break;
            case "multi":
                doCalculateMulti();
                break;
            case "dividir":
                doCalculateDividir();
                break;
        }
    }

    private void doCalculateSumar() {
        String num1 = tfNum1.getText();
        String num2 = tfNum2.getText();

        double num1_1 = Double.parseDouble(num1);
        double num2_2 = Double.parseDouble(num2);

        modelSumar = new sumar(num1_1, num2_2);

        double result = modelSumar.sumarCalc();

        tfBMi.setText(String.valueOf(result));

    }

    private void doCalculateRestar() {
        String num1 = tfNum1.getText();
        String num2 = tfNum2.getText();

        double num1_1 = Double.parseDouble(num1);
        double num2_2 = Double.parseDouble(num2);

        modelRestar = new restar(num1_1, num2_2);

        double result = modelRestar.restarCalc();

        tfBMi.setText(String.valueOf(result));

    }

    private void doCalculateMulti() {
        String num1 = tfNum1.getText();
        String num2 = tfNum2.getText();

        double num1_1 = Double.parseDouble(num1);
        double num2_2 = Double.parseDouble(num2);

        modelMulti = new multiplicar(num1_1, num2_2);

        double result = modelMulti.multiCalc();

        tfBMi.setText(String.valueOf(result));

    }
    
    
    private void doCalculateDividir() {
        String num1 = tfNum1.getText();
        String num2 = tfNum2.getText();

        double num1_1 = Double.parseDouble(num1);
        double num2_2 = Double.parseDouble(num2);

        modelDividir = new dividir(num1_1, num2_2);

        double result = modelDividir.dividirCalc();

        tfBMi.setText(String.valueOf(result));

    }

}
