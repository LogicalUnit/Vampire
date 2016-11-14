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
    public static final String BRAWL = "Brawl";
    public static final String DRIVE = "Drive";
    public static final String FIREARMS = "Firearms";
    public static final String LARCENY = "Larceny";
    public static final String STEALTH = "Stealth";
    public static final String SURVIVAL = "Survival";
    public static final String WEAPONRY = "Weaponry";    
    
    //Names, Social
    public static final String ANIMAL_KEN = "Animal Ken";
    public static final String EMPATHY = "Empathy";
    public static final String EXPRESSION = "Expression";
    public static final String INTIMIDATION = "Intimidation";
    public static final String PERSUASION = "Persuasion";
    public static final String SOCIALISE = "Socialise";
    public static final String STREETWISE = "Streetwise";
    public static final String SUBTERFUGE = "Subterfuge";
    
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
        skills.add(BRAWL);
        skills.add(DRIVE);
        skills.add(FIREARMS);
        skills.add(LARCENY);
        skills.add(STEALTH);
        skills.add(SURVIVAL);
        skills.add(WEAPONRY);
        
        skills.add(ANIMAL_KEN);
        skills.add(EMPATHY);
        skills.add(EXPRESSION);
        skills.add(INTIMIDATION);
        skills.add(PERSUASION);
        skills.add(SOCIALISE);
        skills.add(STREETWISE);
        skills.add(SUBTERFUGE);
        
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
            
            case ATHLETICS: 
            case BRAWL:
            case DRIVE:
            case FIREARMS:
            case LARCENY:
            case STEALTH: 
            case SURVIVAL:
            case WEAPONRY: return Types.PHYSICAL;
            
            case ANIMAL_KEN:
            case EMPATHY:
            case EXPRESSION:
            case INTIMIDATION: 
            case PERSUASION: 
            case SOCIALISE:
            case STREETWISE: 
            case SUBTERFUGE: return Types.SOCIAL;
                                                        
        }
        
        return null;
    }
            
    
}
