/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.CharacterOnePanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.GameModel;

/**
 *
 * @author 5ia13jathomas
 */
public class GameCharacterFour extends JFrame {

    //Classes
    private GameModel gm;

    //Components
    private ImageIcon icon;
    private JLabel label = new JLabel("<html>This episode has not been released yet.<br><italic>Release: 08.07.2015</italic></html>");
    private JButton weiterButton = new JButton("End");
    
    public GameCharacterFour(GameModel gm) {
        super("Not released yet.");

        this.gm = gm;
        
        setUpGame();
    }

    public void setUpGame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(2,0));
        this.setBounds(200, 200, 300, 200);
        this.setResizable(false);
        this.add(label);
        this.add(weiterButton);
        
        //Listeners
        weiterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
