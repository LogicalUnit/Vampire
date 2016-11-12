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
public class Character {
    
    DottedTrait attributes = new DottedTrait();
    DottedTrait skills = new DottedTrait();
    DottedTrait disciplines = new DottedTrait();
    DottedTrait merits = new DottedTrait();
    
    ArrayList<Specialty> specialties = new ArrayList<Specialty>();
    
    public Dots getAttributeDots(String name) {
        return attributes.get(name);
    }
    
    public Dots getSkillDots(String name) {
        return skills.get(name);
    }
    
    public Dots getDisciplineDots(String name) {
        return disciplines.get(name);
    }
    
    public Dots getMeritDots(String name) {
        return merits.get(name);
    }
    
    public ArrayList<String> getSpecialties(String skill) {
        ArrayList<String> result = new ArrayList<String>();
        
        for (int i = 0; i < specialties.size(); i++) {
            Specialty spec = specialties.get(i);
            if (spec.skill == skill)
            {
                result.add(spec.name);
            }
        }
        
        return result;
    }
    
    public Character() {
        setup();
    }
    
    public void setup() {
        
        //Attributes
        attributes.put(Attributes.INTELLIGENCE, Dots.THREE);
        attributes.put(Attributes.STRENGTH, Dots.ONE);
        attributes.put(Attributes.PRESENCE, Dots.ONE);
        attributes.put(Attributes.WITS, Dots.ONE);        
        attributes.put(Attributes.DEXTERITY, Dots.ONE);
        attributes.put(Attributes.MANIPULATION, Dots.ONE);
        attributes.put(Attributes.RESOLVE, Dots.ONE);
        attributes.put(Attributes.STAMINA, Dots.ONE);
        attributes.put(Attributes.COMPOSURE, Dots.TWO);
        
        //Mental Skills
        skills.put(Skills.ACADEMICS, Dots.ZERO);
        skills.put(Skills.COMPUTER, Dots.ONE);
        skills.put(Skills.CRAFTS, Dots.ZERO);
        skills.put(Skills.INVESTIGATION, Dots.ZERO);
        skills.put(Skills.MEDECINE, Dots.ZERO);
        skills.put(Skills.OCCULT, Dots.ZERO);
        skills.put(Skills.POLITICS, Dots.ZERO);
        skills.put(Skills.SCIENCE, Dots.ZERO);
        
        //Physical Skills
        skills.put(Skills.ATHLETICS, Dots.ZERO);
        
        //Social Skills        
        skills.put(Skills.ANIMAL_KEN, Dots.ZERO);
        
        //Specialties        
        specialties.add(new Specialty(Skills.COMPUTER, "Software Engineering"));
        specialties.add(new Specialty(Skills.COMPUTER, "Reverse Engineering"));
        specialties.add(new Specialty(Skills.ACADEMICS, "Libraries"));
        
        //Disciplines
        disciplines.put(Disciplines.DOMINATE, Dots.THREE);
        

        //Merits
        merits.put(Merits.ACUTE_SENSES, Dots.FIVE);
                                
    }
    
    
    
}
