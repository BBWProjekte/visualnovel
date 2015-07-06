/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CharacterOnePanel;
import controller.CharacterTwoPanel;
import controller.GameController;
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
public class GameCharacterTwo extends JFrame {

    //Classes
    GameModel gm;

    //Images
    private static final String IMG_PATH = "src/images/charTwo/charTwo_serious.png";
    private BufferedImage img;
    private File image = new File(IMG_PATH);

    //Components
    private JButton weiterButton = new JButton("Continue");
    private JLabel ausgabeText = new JLabel("<html>I am kinda hungry.</html>");
    private ImageIcon icon;
    private JLabel label;

    //Layouts
    private GridLayout gameLayout = new GridLayout(2, 1, 0, 0);
    private CharacterTwoPanel imagePanel = new CharacterTwoPanel();
    private JPanel gamePanel = new JPanel();

    //Music
    AudioInputStream audioInputStream;
    Clip clip;

    //div
    private int storyCounter = 0;

    public GameCharacterTwo(GameModel gm) {
        super("A spooky village");

        this.gm = gm;
        setUpGame();
    }

    public void setUpGame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(gameLayout);
        this.setBounds(200, 200, 620, 760);
        this.setResizable(false);

        startBackGroundMusic();

        try {
            img = ImageIO.read(image);
            icon = new ImageIcon(img);
            label = new JLabel(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        imagePanel.setVisible(true);
        imagePanel.add(label);

        //Listeners
        weiterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (storyCounter == 0) {
                    try {
                        img = ImageIO.read(new File("src/images/charTwo/charTwo_angry.png"));
                        icon = new ImageIcon(img);
                    } catch (IOException ex) {
                        ex.printStackTrace();

                    }
                    label.setIcon(icon);
                    ausgabeText.setText("<html>I really need some food now.</html>");
                    storyCounter++;
                } else if (storyCounter == 1) {
                    try {
                        img = ImageIO.read(new File("src/images/charTwo/charTwo_worried.png"));
                        icon = new ImageIcon(img);
                    } catch (IOException ex) {
                        ex.printStackTrace();

                    }
                    label.setIcon(icon);
                    ausgabeText.setText("<html>I don't think I will survive this game much longer.</html>");
                    weiterButton.setText("End");
                    storyCounter++;
                } else {
                    if (gm.isSoundBoolean() == true) {
                        stopBackGroundMusic();
                    }
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

    public void startBackGroundMusic() {
        String soundName = "chapterTwo.wav";
        if (gm.isSoundBoolean() == true) {
            try {
                audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stopBackGroundMusic() {
        clip.stop();
    }
}
