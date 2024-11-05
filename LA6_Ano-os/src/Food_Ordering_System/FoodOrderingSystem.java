package Food_Ordering_System;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FoodOrderingSystem extends  JFrame{
    private JPanel FoodOrderingSystem;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    private final JCheckBox[] foods = {cPizza,cBurger,cFries,cSoftDrinks,cTea,cSundae};
    private final JRadioButton[] bgDiscount = {rb5,rb10,rb15,rbNone};
    private final double[] prices = {100,80,65,55,50,40};
    private final double[] discounts = { 0.05, 0.1, 0.15,0.0};
    FoodOrderingSystem (){
        DecimalFormat df = new DecimalFormat("#.00");

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double totalFood = 0;
                double discount = 0;
                int ctr = 0;
                int discCtr = 0;
                for(JCheckBox cb: foods){
                    if(cb.isSelected()){
                        totalFood += prices[ctr];
                    }
                    ctr++;
                }
                for (JRadioButton rb: bgDiscount){

                    if(rb.isSelected()) {
                        discount = discounts[discCtr];
                        break;
                    }
                    discCtr++;

                }
                totalFood = totalFood - (totalFood*discount);

                JOptionPane.showMessageDialog(null,"Total: " + df.format(totalFood));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.FoodOrderingSystem);
        app.setSize(500,400);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
