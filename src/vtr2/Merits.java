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
public class Merits {
    
    public static final String ACUTE_SENSES = "Acute Senses";
    public static final String ATROCIOUS = "Atrocious";
    public static final String BLOODHOUND = "Bloodhound";
    public static final String CACOPHANY_SAVVY = "Cacophany Savvy";
    public static final String CLAWS_OF_THE_UNHOLY = "Claws of the Unholy";
    public static final String CLOSE_FAMILY = "Close Family";
    public static final String CUTTHROAT = "Cutthroat";
    
    public class Meta  {
        public static final String NAME = "Merits";
    }
               
    
    public static ArrayList<String> getList() {
        ArrayList<String> merits = new ArrayList<>();
        
        merits.add(ACUTE_SENSES);
        merits.add(ATROCIOUS);
        merits.add(BLOODHOUND);
        merits.add(CACOPHANY_SAVVY);
        merits.add(CLAWS_OF_THE_UNHOLY);
        merits.add(CLOSE_FAMILY);
        merits.add(CUTTHROAT);
        
        return merits;
    }
    
}
