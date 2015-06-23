/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.GameController;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author 5ia13tibonomelli
 */
public class Ingame extends JFrame{
    
    private GameController controller = new GameController();
    
    JButton weiterButton = new JButton("Weiter");
    JTextPane ausgabeText = new JTextPane();
    JPanel textPanel;
    JPanel gamePanel;
    
    private GridLayout gameLayout = new GridLayout(2, 1);
    
    public Ingame() {
        super("In Game");
        
        setUpGame();
    }
    
    public void setUpGame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(gameLayout);
        this.setBounds(200, 200, 500, 500);
        this.setResizable(false);
               
        gamePanel = new JPanel();
        gamePanel.setLayout(new FlowLayout());
        
        textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout());
        textPanel.add(ausgabeText);
        textPanel.add(weiterButton);
        
        this.add(gamePanel);
        this.add(textPanel);
        
    }
    
    /*public void setUpGridBag() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setSize(50,50);
        GridBagLayout layout = new GridBagLayout();
        
        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(textPanel, gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(weiterButton, gbc);
        
        
        textPanel.add(panel);
        
        this.setVisible(true);
    }*/ 
    
    
}
