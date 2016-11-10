/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vampire2nd;

//This is a modification
//Check the user settings

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
            
    //Names, Pysical
    public static final String ATHLETICS = "Athletics";
    
    //Names, Social
    public static final String ANIMAL_KEN = "Animal Ken";
    
    //Types
    public static final String MENTAL = "Mental";
    public static final String PHYSICAL = "Physical";
    public static final String SOCIAL = "Social";
    
    public static final String ERROR = "Skill Error";
    
    
    public static String getSkillType(String name) {
        switch(name) {
            case ACADEMICS:
            case COMPUTER:
            case CRAFTS:
            case INVESTIGATION: 
            case MEDECINE:
            case OCCULT:
            case POLITICS:
            case SCIENCE: return MENTAL;
            
            case ATHLETICS: return PHYSICAL;
            
            case ANIMAL_KEN: return SOCIAL;
                                    
            default: //do nothing                            
        }
        
        return ERROR;
    }
            
    
}
