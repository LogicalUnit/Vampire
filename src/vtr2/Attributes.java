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
public class Attributes {
    
    //Names
    public static final String INTELLIGENCE = "Intelligence";
    public static final String STRENGTH = "Strength";
    public static final String PRESENCE = "Presence";
    public static final String WITS = "Wits";
    public static final String DEXTERITY = "Dexterity";
    public static final String MANIPULATION = "Manipulation";
    public static final String RESOLVE = "Resolve";
    public static final String STAMINA = "Stamina";
    public static final String COMPOSURE = "Composure";
    
    //Rows
    public static final String POWER = "Power";
    public static final String FINESSE = "Finesse";
    public static final String RESISTANCE = "Resistance";  
    
    //Columns
    public static final String MENTAL = "Mental";
    public static final String PHYSICAL = "Physical";
    public static final String SOCIAL = "Social";
          
    
    public static String getAttributeByTypes(String row, String col) {
        
        switch(row) {
            case POWER:
                switch (col) {
                    case MENTAL: return INTELLIGENCE;
                    case PHYSICAL: return STRENGTH;
                    case SOCIAL: return PRESENCE;                    
                }
            case FINESSE:
                switch (col) {
                    case MENTAL: return WITS;
                    case PHYSICAL: return DEXTERITY;
                    case SOCIAL: return MANIPULATION;                    
                }
            case RESISTANCE:
                switch(col) {
                    case MENTAL: return RESOLVE;
                    case PHYSICAL: return STAMINA;
                    case SOCIAL: return COMPOSURE;                    
                }            
        }
        
        return null;
    }
           
}
