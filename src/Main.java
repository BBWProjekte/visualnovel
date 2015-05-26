/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janes.thomas
 */
public class Main {
    
        static TestController controller;

    /**
     * Diese Klasse wird nur dazu benutzt alle nötigen
     * Komponenten zu Initialisieren und die erste
     * View anzuzeigen
     */
    public static void main(String [] args){
        controller = new TestController();

        controller.showView();
    }
}    