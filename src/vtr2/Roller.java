/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import java.util.Random;


/**
 *
 * @author John
 */
public class Roller {
        
    
    static Random randomiser = new Random();
    
    public static int rollOneDie() {
        return randomiser.nextInt(10) + 1;
    }
    
    public static int rollDice(int number){
                
        int successes = 0;               
        
        for (int i = 0; i < number; i++) {
            int die = rollOneDie();
            
            while(die == 10) {
                successes++;
                die = rollOneDie();
            }
            
            if (die == 8 || die == 9){
                successes++;
            }
                
        }
        
        return successes;
    }
                
}
