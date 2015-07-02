/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GameController;
import controller.CharacterOnePanel;
import exception.PhotoReadException;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author 5ia13jathomas
 */
public class GameCharacterOne extends JFrame {

    //Images
    private static final String IMG_PATH = "src/images/charOne/charOne_happy.gif";
    private BufferedImage img;
    private File image = new File(IMG_PATH);

    //Components
    private ImageIcon icon;
    private JLabel label;
    private JButton weiterButton = new JButton("Continue");
    private JLabel ausgabeText = new JLabel("<html>Hey, I am a tutorial character. This is going to be easy.<br><br>Click 'Continue' to kill me.</html>");

    //Layouts
    private CharacterOnePanel imagePanel = new CharacterOnePanel();
    private JPanel gamePanel = new JPanel();
    private GridLayout gameLayout = new GridLayout(2, 1, 0, 0);

    //div
    private int storyCounter = 0;   
    
    public GameCharacterOne() {
        super("In Game");

        setUpGame();
    }

    public void setUpGame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(gameLayout);
        this.setBounds(200, 200, 620, 760);
        this.setResizable(false);

        try {
            img = ImageIO.read(image);
            icon = new ImageIcon(img);
            label = new JLabel(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }

        imagePanel.setVisible(true);
        imagePanel.add(label);

        //Listeners
        weiterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (storyCounter == 0) {
                    try {
                        img = ImageIO.read(new File("src/images/charOne/charOne_dead.gif"));
                        icon = new ImageIcon(img);
                    } catch (IOException ex) {
                        ex.printStackTrace();

                    }
                    label.setIcon(icon);
                    ausgabeText.setText("<html><strong>*cough*</strong>  I...I guess you understand it.<br><br>I...I need to go.");
                    weiterButton.setText("End");
                    storyCounter++;
                } else {
                    dispose();
                }
            }
        });

        gamePanel.setLayout(new GridLayout(2, 1, 0, 0));
        gamePanel.add(ausgabeText);
        gamePanel.add(weiterButton);

        this.add(imagePanel);
        this.add(gamePanel);

    }

}
