/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import java.util.ArrayList;

/**
 *
 * @author John
 */
public class Vampire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Character vampire = new Gangrel();
        //Gui test = new Gui(vampire);
        
        ArrayList<String> disciplinesList = Disciplines.getList();
        
        for(String discipline : disciplinesList) {
            System.out.println(discipline);
        }
      
        
    }
    
}
