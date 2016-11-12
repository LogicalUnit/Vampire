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
public class Skills {
    
    //Names, Mental
    public static final String ACADEMICS = "Academics";
    public static final String COMPUTER = "Computer";
    public static final String CRAFTS = "Crafts";
    public static final String INVESTIGATION = "Investigation";
    public static final String MEDECINE = "Medecine";
    public static final String OCCULT = "Occult";
    public static final String POLITICS = "Politics";
    public static final String SCIENCE = "Science";
            
    //Names, Physical
    public static final String ATHLETICS = "Athletics";
    
    //Names, Social
    public static final String ANIMAL_KEN = "Animal Ken";
    
    public class Types {        
        public static final String MENTAL = "Mental";
        public static final String PHYSICAL = "Physical";
        public static final String SOCIAL = "Social";
    }
    //Types
   
               
    
    public static String getSkillType(String name) {
        switch(name) {
            case ACADEMICS:
            case COMPUTER:
            case CRAFTS:
            case INVESTIGATION: 
            case MEDECINE:
            case OCCULT:
            case POLITICS:
            case SCIENCE: return Types.MENTAL;
            
            case ATHLETICS: return Types.PHYSICAL;
            
            case ANIMAL_KEN: return Types.SOCIAL;
                                                        
        }
        
        return null;
    }
            
    
}
