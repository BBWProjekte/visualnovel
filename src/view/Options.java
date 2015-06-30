/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author 5ia13jathomas
 */
public class Options extends JFrame {

    JCheckBox soundOn = new JCheckBox("Check this to restart music.");
    JButton saveButton = new JButton("SAVE");
    JLabel musicText = new JLabel("<html>WARNING!!<br>Due technical difficulties has the music been turned off.<br>Please select the checkbox if you want to restart it.<br>Otherwise just click save.</html>");
    
    private boolean checked = false;
    private  MainMenu menu;
    
    //Layouts
    private GridLayout creditLayout = new GridLayout(5, 2, 0, 0);
    
    public Options( MainMenu menu){
        super("Options");
        this.menu=menu;
        setUp();
    }
    
    public void setUp(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(creditLayout);
        this.setBounds(200, 200, 400, 350);
        this.setResizable(false);
        
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // MainMenu menu = new MainMenu();
                if(soundOn.isSelected()){
                menu.stopBackGroundMusic();
               
                }else{
                    menu.setShouldTheMusicPlay(true);
                   menu.startBackGroundMusic();
                  
                }
                dispose();
                menu.setVisible(true);
            }
        });
        
        
        this.add(musicText);
        this.add(soundOn);
        
        
        this.add(saveButton);
        
    }
    
}
