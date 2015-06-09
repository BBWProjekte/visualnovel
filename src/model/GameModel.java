package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janes.thomas
 */
public class GameModel {
    
    private int wrongAnswers;
    
    //Other kind of variables
    private boolean IsCharacterOne = false;
    private boolean IsCharacterTwo = false;
    private boolean IsCharacterThree = false;
    private boolean IsCharacterFour = false;
    
    
    
    

    /**
     * @return the wrongAnswers
     */
    public int getWrongAnswers() {
        return wrongAnswers;
    }

    /**
     * @param wrongAnswers the wrongAnswers to set
     */
    public void setWrongAnswers(int wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    /**
     * @return the IsCharacterOne
     */
    public boolean isIsCharacterOne() {
        return IsCharacterOne;
    }

    /**
     * @param IsCharacterOne the IsCharacterOne to set
     */
    public void setIsCharacterOne(boolean IsCharacterOne) {
        this.IsCharacterOne = IsCharacterOne;
    }

    /**
     * @return the IsCharacterTwo
     */
    public boolean isIsCharacterTwo() {
        return IsCharacterTwo;
    }

    /**
     * @param IsCharacterTwo the IsCharacterTwo to set
     */
    public void setIsCharacterTwo(boolean IsCharacterTwo) {
        this.IsCharacterTwo = IsCharacterTwo;
    }

    /**
     * @return the IsCharacterThree
     */
    public boolean isIsCharacterThree() {
        return IsCharacterThree;
    }

    /**
     * @param IsCharacterThree the IsCharacterThree to set
     */
    public void setIsCharacterThree(boolean IsCharacterThree) {
        this.IsCharacterThree = IsCharacterThree;
    }

    /**
     * @return the IsCharacterFour
     */
    public boolean isIsCharacterFour() {
        return IsCharacterFour;
    }

    /**
     * @param IsCharacterFour the IsCharacterFour to set
     */
    public void setIsCharacterFour(boolean IsCharacterFour) {
        this.IsCharacterFour = IsCharacterFour;
    }
}