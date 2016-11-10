/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vampire2nd;

import java.util.HashMap;
/**
 *
 * @author John
 */
public class Character {
    
    HashMap<String, Dots> attributes = new HashMap<String, Dots>();
    HashMap<String, Dots> skills = new HashMap<String, Dots>();
    
    public Dots getAttributeDots(String name) {
        return attributes.get(name);
    }
    
    public Dots getSkillDots(String name) {
        return skills.get(name);
    }
    
    public Character() {
        setup();
    }
    
    public void setup() {
        
        attributes.put(Attributes.INTELLIGENCE, Dots.THREE);
        attributes.put(Attributes.STRENGTH, Dots.ONE);
        attributes.put(Attributes.PRESENCE, Dots.ONE);
        attributes.put(Attributes.WITS, Dots.ONE);
        attributes.put(Attributes.DEXTERITY, Dots.ONE);
        attributes.put(Attributes.MANIPULATION, Dots.ONE);
        attributes.put(Attributes.RESOLVE, Dots.ONE);
        attributes.put(Attributes.STAMINA, Dots.ONE);
        attributes.put(Attributes.COMPOSURE, Dots.TWO);
        
        skills.put(Skills.ACADEMICS, Dots.ZERO);
        skills.put(Skills.COMPUTER, Dots.ONE);
        skills.put(Skills.CRAFTS, Dots.ZERO);
        skills.put(Skills.INVESTIGATION, Dots.ZERO);
        skills.put(Skills.MEDECINE, Dots.ZERO);
        skills.put(Skills.OCCULT, Dots.ZERO);
        skills.put(Skills.POLITICS, Dots.ZERO);
        skills.put(Skills.SCIENCE, Dots.ZERO);
        
        skills.put(Skills.ATHLETICS, Dots.ZERO);
        
        skills.put(Skills.ANIMAL_KEN, Dots.ZERO);
                                
    }
    
    
    
}
