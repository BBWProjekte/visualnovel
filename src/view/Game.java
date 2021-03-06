package view;

import controller.GameController;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.GameModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janes.thomas
 */
public class Game extends JFrame {

    //Classes
    private GameModel gm;

    //Components
    JButton characterOne = new JButton("Charakter 1");
    JButton characterTwo = new JButton("Charakter 2");
    JButton characterThree = new JButton("Charakter 3");
    JButton characterFour = new JButton("Charakter 4");
    
    //Layouts
    JPanel buttonPanel = new JPanel();

    public Game(GameModel gm) {
        super("The Game");
        
        this.gm = gm;
        setUp();
    }

    public void setUp() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(2,1,0,0));
        this.setBounds(200, 200, 500, 200);
        this.setResizable(false);

        buttonPanel.setLayout(new FlowLayout());

        //Listeners
        characterOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameCharacterOne char1 = new GameCharacterOne(gm);
                char1.setVisible(true);
            }
        });
        characterTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameCharacterTwo char2 = new GameCharacterTwo(gm);
                char2.setVisible(true);
            }
        });
        characterThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameCharacterThree char3 = new GameCharacterThree(gm);
                char3.setVisible(true);
            }
        });
        characterFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameCharacterFour char4 = new GameCharacterFour(gm);
                char4.setVisible(true);
            }
        });
        
        buttonPanel.add(characterOne);
        buttonPanel.add(characterTwo);
        buttonPanel.add(characterThree);
        buttonPanel.add(characterFour);
        
        this.add(buttonPanel);
        
    }
}
