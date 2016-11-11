/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

/**
 *
 * @author John
 */
public enum Dots {
    
    ZERO, ONE, TWO, THREE, FOUR, FIVE; //use ordinal() to get integer
                                  
    public static Dots toDots(int ordinal) 
    {
        if (ordinal >= 0 && ordinal <= 5)
            return Dots.values()[ordinal];                        

        return null;
    }
}
