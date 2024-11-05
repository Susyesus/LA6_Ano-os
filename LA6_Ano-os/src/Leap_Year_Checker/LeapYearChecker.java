package Leap_Year_Checker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JTextField yearTextField;
    private JPanel LeapYearChecker;
    private JButton checkYearButton;

    LeapYearChecker(){
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearTextField.getText());
                boolean leap;
                //tfYear.setText("");
                // if the year is divided by 4
                if (year % 4 == 0) {

                    // if the year is century
                    if (year % 100 == 0) {

                        // if year is divided by 400
                        // then it is a leap year
                        if (year % 400 == 0)
                            leap = true;
                        else
                            leap = false;
                    }

                    // if the year is not century
                    else
                        leap = true;
                }

                else
                    leap = false;
                if(leap){
                    JOptionPane.showMessageDialog(null,"Leap year");
                }else{
                    JOptionPane.showMessageDialog(null,"Not a leap year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker lyc = new LeapYearChecker();
        lyc.setContentPane(lyc.LeapYearChecker);
        lyc.setSize(400,200);
        lyc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        lyc.setVisible(true);
    }
}
