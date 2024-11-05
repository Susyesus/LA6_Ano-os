package Simple_Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JTextField tfResult;
    private JButton btnCompute;
    private JPanel SimpleCalculator;

    SimpleCalculator(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float n1 = Float.parseFloat(tfNumber1.getText());
                float n2 = Float.parseFloat(tfNumber2.getText());

                if((String)cbOperations.getSelectedItem() == "+"){
                    tfResult.setText(""+(n1+n2));
                } else if ((String)cbOperations.getSelectedItem() == "-") {
                    tfResult.setText(""+(n1-n2));
                }else if ((String)cbOperations.getSelectedItem() == "*") {
                    tfResult.setText(""+(n1*n2));
                }else if ((String)cbOperations.getSelectedItem() == "/") {
                    tfResult.setText(""+(n1/n2));
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.SimpleCalculator);
        app.setSize(600,200);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
