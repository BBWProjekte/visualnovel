/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author janes.thomas
 */
public class TestView extends JFrame{
    
       private JLabel lbl1 = new JLabel("Eingabe: ");
    private JTextField txtEingabe = new JTextField(3);
    private JButton cmdCalc = new JButton("Wurzen Berechnen >");
    private JTextField txtErg = new JTextField(5);
    private JButton cmdClear = new JButton("Zurüclsetzen");

    public TestView(){
        super("Wurzel Berechnen");

        initForm();
    }

    /**
     * Die JForm initialisieren und alle Steuerelemente
     * darauf positionieren
     */
    private void initForm(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBounds(200, 200, 500, 100);

        this.add(lbl1);
        this.add(txtEingabe);
        this.add(cmdCalc);
        this.add(txtErg);
        this.add(cmdClear);

    }

    public void resetView(){
        this.txtEingabe.setText("");
        this.txtErg.setText("");
    }

    public String getEingabe(){
        return this.txtEingabe.getText();
    }

    public void setErgebnis(String erg){
        this.txtErg.setText(erg);
    }

    /**
     * Funktionen bereitstellen, mit denen man später aus
     * dem Controller die nötigen Listener hinzufügen kann
     */
    public void setWurzelBerechnenListener(ActionListener l){
        this.cmdCalc.addActionListener(l);
    }

    public void setResetFormListener(ActionListener l){
        this.cmdClear.addActionListener(l);
    }
}