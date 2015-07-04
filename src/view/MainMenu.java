package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import controller.CloseListener;
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
import model.GameModel;

/**
 *
 * @author Janes Thomas
 */
public class MainMenu extends JFrame implements ActionListener {

    //Classes
    static GameController controller;
    private GameModel gm = new GameModel();

    //Images
    private static final String IMG_PATH = "src/images/photo.png";
    private BufferedImage img;
    private File image = new File(IMG_PATH);

    //Components
    private JButton startButton = new JButton("Start the Game");
    private JButton optionButton = new JButton("Options");
    private JButton creditButton = new JButton("Credits");
    private JButton leaveGameButton = new JButton("Exit Game");
    private ImageIcon icon;
    private JLabel label;

    //Layouts
    private GridLayout buttonLayout = new GridLayout(5, 1, 0, 0);
    
    //Music
    AudioInputStream audioInputStream;
    Clip clip;

    public MainMenu() {
        super("VisualNovel");

        initForm();
    }

    public static void main(String[] args) {
        controller = new GameController();
        controller.showView();
    }

    /**
     * Initializes the window
     */
    private void initForm() {
        //Initializing the window
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(buttonLayout);
        this.setBounds(200, 200, 250, 250);
        this.setResizable(false);
        startBackGroundMusic();

        try {
            img = ImageIO.read(image);
            icon = new ImageIcon(img);
            label = new JLabel(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Listeners
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Game game = new Game(gm);
                game.setVisible(true);
            }
        });
        creditButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Credits credits = new Credits();
                credits.setVisible(true);
            }
        });
        leaveGameButton.addActionListener(new CloseListener());

        optionButton.addActionListener(this);

        //Adding components to window
        this.add(startButton);
        this.add(optionButton);
        this.add(creditButton);
        this.add(leaveGameButton);
        this.add(label);

    }

    public void startBackGroundMusic() {
        String soundName = "song.wav";
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
        gm.setSoundBoolean(false);
        clip.stop();
    }

    /**
     * Resets the window
     */
    public void resetView() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        stopBackGroundMusic();
        Options options = new Options(this,gm);
        options.setVisible(true);
    }
}
