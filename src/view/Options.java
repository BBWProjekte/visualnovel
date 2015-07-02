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
import model.GameModel;

/**
 *
 * @author 5ia13jathomas
 */
public class Options extends JFrame {

    //Classes
    private  MainMenu menu;
    private GameModel gm;
    
    //Components
    private JCheckBox soundOn = new JCheckBox("Check to disable / keep it disabled.");
    private JButton saveButton = new JButton("SAVE");
    private JLabel musicText = new JLabel("<html>Check the box to disable the music.<br>If it already is disabled, check it to keep it that way.<br><strong>Warning: Music will start if you don't check the box.</strong></html>");

    //Layouts
    private GridLayout creditLayout = new GridLayout(5, 2, 0, 0);
    
    //div
    private boolean checked = false;
    
    public Options( MainMenu menu, GameModel gm){
        super("Options");
        this.menu=menu;
        this.gm = gm;
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
                    gm.setSoundBoolean(true);
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
