/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
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
import javax.swing.JTextField;

/**
 *
 * @author janes.thomas
 */
public class GameView extends JFrame {

    //Classes
    static GameController controller;

    //Images
    private static final String IMG_PATH = "src/images/photo.png";
    private BufferedImage img;

    //Files
    private File image = new File(IMG_PATH);

    //Visible components
    private JButton startButton = new JButton("Start the Game");
    private JButton optionButton = new JButton("Options");
    private JButton creditButton = new JButton("Credits");
    private JButton leaveGameButton = new JButton("Exit Game");
    private ImageIcon icon;
    private JLabel label;

    //Frames
    private JFrame newGame = new JFrame();

    //Layouts
    private GridLayout buttonLayout = new GridLayout(5, 1, 0, 0);

    public GameView() {
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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(buttonLayout);
        this.setBounds(200, 200, 250, 250);
        this.setResizable(false);
        try {
            img = ImageIO.read(image);
            icon = new ImageIcon(img);
            label = new JLabel(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Listeners
        startButton.addActionListener(new ActionListener() {
            /**
             * Calls the openGameWindow method
             *
             * @param e the ActionEvent
             */
            public void actionPerformed(ActionEvent e) {
                openGameWindow(e);
            }
        });
        leaveGameButton.addActionListener(new CloseListener());

        //Adding components to window
        this.add(startButton);
        this.add(optionButton);
        this.add(creditButton);
        this.add(leaveGameButton);
        this.add(label);

    }

    /**
     * Resets the window
     */
    public void resetView() {
    }

    /**
     * Opens the actual game window after the button has been clicked
     *
     * @param e the ActionEvent
     */
    public void openGameWindow(ActionEvent e) {
        System.exit(0);
    }

}
