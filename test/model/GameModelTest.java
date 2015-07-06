/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author 5ia13jathomas
 */
public class GameModelTest {
    
    private GameModel gm;
    
    @Before
    public void setUp() {
       gm = new GameModel();
    }
    
    @Test
    public void testSound() {
        assertTrue(gm.isSoundBoolean());
    }
}