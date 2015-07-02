package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.GameModel;
import view.MainMenu;

/**
 *
 * @author janes.thomas
 */
public class GameController {
 
    private MainMenu _view;
    private GameModel _model;

    public GameController(){
        this._model = new GameModel();
        this._view = new MainMenu();

        addListener();
    }
    public void showView(){
        this._view.setVisible(true);
    }
/**
     * Die Listener, die wir aus den Internen Klassen generieren
     * werden der View bekannt gemacht, sodass diese mit
     * uns (dem Controller) kommunizieren kann
     */
    private void addListener(){
    }
    
    
}
