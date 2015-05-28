
import java.awt.FlowLayout;
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
public class Game extends JFrame{

    public Game(){
        super("The Game");
        
        setUp();
    }
    
    public void setUp(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBounds(200, 200, 250, 250);
        this.setResizable(false);
    }
}
