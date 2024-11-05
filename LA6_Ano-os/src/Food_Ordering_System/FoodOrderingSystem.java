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

    private JCheckBox[] foods = {cBurger,cFries,cTea,cPizza,cSundae,cSoftDrinks};
    private JRadioButton[] bgDiscount = {rb5,rb10,rb15,rbNone};
    FoodOrderingSystem (){
        DecimalFormat df = new DecimalFormat("#.00");

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalFood;
                for(JCheckBox cb: foods){
                    if(cb.isSelected()){
                        if(cb)
                    }
                }
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
