/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janes.thomas
 */
public class TestModel {
    
    long _value;

    public TestModel(){
        zurückSetzen();
    }

    public void zurückSetzen(){
        this._value = 0;
    }

    public void berechneWurzel(long wert){
        this._value =  (wert * wert);
    }

    public long getWurzel(){
        return this._value;
    }
}