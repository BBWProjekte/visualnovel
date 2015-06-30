package view;

import controller.GameController;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

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


    //Visible components
    JButton characterOne = new JButton("Charakter 1");
    JButton characterTwo = new JButton("Charakter 2");
    JButton characterThree = new JButton("Charakter 3");
    JButton characterFour = new JButton("Charakter 4");

    public Game() {
        super("The Game");
        setUp();
    }

    public void setUp() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBounds(200, 200, 500, 500);
        this.setResizable(false);

        this.add(characterOne);
        this.add(characterTwo);
        this.add(characterThree);
        this.add(characterFour);

        //Listeners
        characterOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameCharacterOne char1 = new GameCharacterOne();
                char1.setVisible(true);
            }
        });
        characterTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameCharacterOne char1 = new GameCharacterOne();
                char1.setVisible(true);
            }
        });
        characterThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameCharacterOne char1 = new GameCharacterOne();
                char1.setVisible(true);
            }
        });
        characterFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameCharacterOne char1 = new GameCharacterOne();
                char1.setVisible(true);
            }
        });
        
        
    }
}
