/*
 * Copyright (c) 2023 Geo-Studios - All Rights Reserved.
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.*;
import logic.circuits.binary.adder;
import logic.circuits.binary.subtractor;

public class main {

    public static void main(String[] args) {
        String[] operations = {
                "Binary Addition",
                "Binary SubtractFromA",
                "Binary SubtractFromB",
                "Hex Addition",
                "Hex SubtractFromA",
                "Hex SubtractFromB"
        };

        JFrame frame = new JFrame("Super Calc");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel textA = new JLabel("Input A");
        JTextField inputA = new JTextField("00000000000000000000000000000000", 26);
        JLabel textB = new JLabel("Input B");
        JTextField inputB = new JTextField("00000000000000000000000000000000", 26);
        JLabel oplabel = new JLabel("Avalible Operations");
        JComboBox operation = new JComboBox<>(operations);
        JButton button = new JButton("Calculate Sum");
        JLabel sumL = new JLabel("Binary Sum:");
        JTextField sum = new JTextField("00000000000000000000000000000000", 26);

        panel.add(textA);
        panel.add(inputA);
        panel.add(textB);
        panel.add(inputB);
        panel.add(oplabel);
        panel.add(operation);
        panel.add(button);
        panel.add(sumL);
        panel.add(sum);
        frame.add(panel);
        frame.setSize(331, 475);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        operation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (operation.getSelectedItem().toString().contains("Hex")){
                    sum.setText("0");
                    sumL.setText("Hex Sum: ");
                    inputA.setText("0");
                    inputB.setText("0");

                }
                if (operation.getSelectedItem().toString().contains("Binary")){
                    sum.setText("000000000000000000000000000000000");
                    sumL.setText("Binary Sum: ");
                    inputA.setText("000000000000000000000000000000000");
                    inputB.setText("000000000000000000000000000000000");


                }
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = inputA.getText();
                String b = inputB.getText();
                String sumr = "";

                if (operation.getSelectedItem() == "Binary Addition"){
                    sumr = "00000000000000000000000000000000";
                    sumr = logic.circuits.binary.adder.add(a, b, 0);
                }
                if (operation.getSelectedItem() == "Binary SubtractFromA"){
                    sumr = "00000000000000000000000000000000";
                    sumr = logic.circuits.binary.subtractor.subtractFromA(a, b);

                }
                if (operation.getSelectedItem() == "Binary SubtractFromB"){
                    sumr = "00000000000000000000000000000000";
                    sumr = logic.circuits.binary.subtractor.subtractFromB(a, b);

                }
                if (operation.getSelectedItem() == "Hex Addition"){
                    sumr = "0";
                    sumr = logic.circuits.hex.adder.add(a, b, 0);

                }
                if (operation.getSelectedItem() == "Hex SubtractFromA"){
                    sumr = "0";
                    sumr = logic.circuits.hex.subtractor.subtractFromA(a, b);

                }
                if (operation.getSelectedItem() == "Hex SubtractFromB"){
                    sumr = "0";
                    sumr = logic.circuits.hex.subtractor.subtractFromB(a, b);

                }

                sum.setText(sumr);
            }
        });


    }

}

