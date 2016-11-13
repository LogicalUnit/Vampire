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
   
    public static ArrayList<String> getList() {
        ArrayList<String> skills = new ArrayList<String>();
        
        skills.add(ACADEMICS);
        skills.add(COMPUTER);
        skills.add(CRAFTS);
        skills.add(INVESTIGATION);
        skills.add(MEDECINE);
        skills.add(OCCULT);
        skills.add(POLITICS);
        skills.add(SCIENCE);
        
        skills.add(ATHLETICS);
        
        skills.add(ANIMAL_KEN);
        
        return skills;
    }
               
    
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
