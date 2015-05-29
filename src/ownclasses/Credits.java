package ownclasses;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janes.thomas
 */
public class Credits extends JFrame {

    JLabel creditOneLabel = new JLabel("Idea: Teeto");
    JLabel creditTwoLabel = new JLabel("Doubt: Grey");
    JLabel creditThreeLabel = new JLabel("Story: Teeto");
    JLabel creditFourLabel = new JLabel("Support: Jesus");
    JLabel creditFiveLabel = new JLabel("Useless: JUSO");
    JLabel creditSixLabel = new JLabel("Concept Art: Google");
    JLabel creditSevenLabel = new JLabel("Character Design: Google");
    JLabel creditEightLabel = new JLabel("Pre-Coding: Grey");
    JLabel creditNineLabel = new JLabel("Does not last long in bed: every nerd");
    JLabel creditTenLabel = new JLabel("Thank you.");
    
    
    //Layouts
    private GridLayout creditLayout = new GridLayout(5, 2, 0, 0);
    
    public Credits(){
        super("Credits");
        setUp();
    }
    
    public void setUp(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(creditLayout);
        this.setBounds(200, 200, 500, 500);
        this.setResizable(false);
        
        this.add(creditOneLabel);
        this.add(creditTwoLabel);
        this.add(creditThreeLabel);
        this.add(creditFourLabel);
        this.add(creditFiveLabel);
        this.add(creditSixLabel);
        this.add(creditSevenLabel);
        this.add(creditEightLabel);
        this.add(creditNineLabel);
        this.add(creditTenLabel);
    }
}
