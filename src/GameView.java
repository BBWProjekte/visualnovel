/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author janes.thomas
 */
public class GameView extends JFrame{
    
    static GameController controller;
    
    private JButton startButton = new JButton("Start the Game");
    private JButton optionButton = new JButton("Options");
    private JButton creditButton = new JButton("Credits");
    private JButton leaveGameButton = new JButton("Exit Game");
    
    private JFrame newGame = new JFrame();

    public GameView(){
        super("VisualNovel");

        initForm();
    }
    
        public static void main(String [] args){
        controller = new GameController();

        controller.showView();
    }

    /**
     * Die JForm initialisieren und alle Steuerelemente
     * darauf positionieren
     */
    private void initForm(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBounds(200, 200, 500, 500);
        
        startButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                openGameWindow(e);
            }
        });
        leaveGameButton.addActionListener(new CloseListener());
        
        this.add(startButton);
        this.add(optionButton);
        this.add(creditButton);
        this.add(leaveGameButton);

    }

    public void resetView(){}
    
    public void openGameWindow(ActionEvent e){
        System.exit(0);
    }
    
}