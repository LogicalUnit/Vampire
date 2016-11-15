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
    public class Rows {
        public static final String POWER = "Power";
        public static final String FINESSE = "Finesse";
        public static final String RESISTANCE = "Resistance";  
    }
    
    //Columns
    public class Cols {
        public static final String MENTAL = "Mental";
        public static final String PHYSICAL = "Physical";
        public static final String SOCIAL = "Social";
    }
    
    public class Meta {
        public static final String NAME = "Attributes";
    }
    
    public static ArrayList<String> getList() {
        ArrayList<String> attributes = new ArrayList<String>();
        
        attributes.add(INTELLIGENCE);
        attributes.add(STRENGTH);
        attributes.add(PRESENCE);
        attributes.add(WITS);
        attributes.add(DEXTERITY);
        attributes.add(MANIPULATION);
        attributes.add(RESOLVE);
        attributes.add(STAMINA);
        attributes.add(COMPOSURE);
        
        return attributes;
    }
          
    
    public static String getAttributeByTypes(String row, String col) {
        
        switch(row) {
            case Rows.POWER:
                switch (col) {
                    case Cols.MENTAL: return INTELLIGENCE;
                    case Cols.PHYSICAL: return STRENGTH;
                    case Cols.SOCIAL: return PRESENCE;                    
                }
            case Rows.FINESSE:
                switch (col) {
                    case Cols.MENTAL: return WITS;
                    case Cols.PHYSICAL: return DEXTERITY;
                    case Cols.SOCIAL: return MANIPULATION;                    
                }
            case Rows.RESISTANCE:
                switch(col) {
                    case Cols.MENTAL: return RESOLVE;
                    case Cols.PHYSICAL: return STAMINA;
                    case Cols.SOCIAL: return COMPOSURE;                    
                }            
        }
        
        return null;
    }
           
}
