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
    public static final String BLOODHOUND = "Bloodhound";
    
    public class Meta  {
        public static final String NAME = "Merits";
    }
    
    public static ArrayList<String> getList() {
        ArrayList<String> merits = new ArrayList<>();
        
        merits.add(ACUTE_SENSES);
        merits.add(BLOODHOUND);
        
        return merits;
    }
    
}
