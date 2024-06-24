import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterUI extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JTextField text1 = new JTextField();
        text1.setBounds(10, 60, 130, 30);

        JTextField text2 = new JTextField();
        text2.setEditable(false);
        text2.setBounds(150, 60, 130, 30);

        panel.add(text1);
        panel.add(text2);

        JButton buttonForDecimal = new JButton("Decimal");
        buttonForDecimal.setBackground(Color.BLUE);
        buttonForDecimal.setForeground(Color.WHITE);
        buttonForDecimal.setFont(new Font("Times new Roman", Font.BOLD, 15));
        buttonForDecimal.setBounds(30, 140, 104, 30);

        buttonForDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = text1.getText();
                try{
                    int res = Integer.parseInt(number);
                    int result = Converter.binaryToDecimal(res);
                    String resultString = Integer.toString(result);
                    text2.setText(resultString);
                }
                catch(Exception exp){
                    text2.setText("Invalid");
                }
            }
        });

        JButton buttonForBinary = new JButton("Binary");
        buttonForBinary.setBackground(Color.BLACK);
        buttonForBinary.setForeground(Color.WHITE);
        buttonForBinary.setFont(new Font("Times new Roman", Font.BOLD, 15));
        buttonForBinary.setBounds(144, 140, 104, 30);

        buttonForBinary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = text1.getText();
                try{
                    int n = Integer.parseInt(number);
                    int res = Converter.decimalToBinary(n);
                    String result = String.valueOf(res);
                    text2.setText(result);
                }
                catch(Exception exp){
                    text2.setText("Invalid Error");
                }
            }
        });

        JButton clearScreen = new JButton("Clear");
        clearScreen.setBackground(Color.WHITE);
        clearScreen.setForeground(Color.BLACK);
        clearScreen.setFont(new Font("Times new Roman", Font.BOLD, 10));
        clearScreen.setBounds(30, 180, 220, 30);

        clearScreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
                text2.setText("");
            }
        });

        panel.add(buttonForDecimal);
        panel.add(buttonForBinary);
        panel.add(clearScreen);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocation(500, 100);
        frame.setVisible(true);
    }
}
