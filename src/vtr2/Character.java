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
        ArrayList<String> attributesList = Attributes.getList();
        
        for(int i = 0; i < attributesList.size(); i++) {
            attributes.put(attributesList.get(i), Dots.ONE);
        }
                
        //Skills
        ArrayList<String> skillsList = Skills.getList();
        
        for(int i = 0; i < skillsList.size(); i++) {
            skills.put(skillsList.get(i), Dots.ZERO);
        }
                        
        //Specialties        
        specialties.add(new Specialty(Skills.COMPUTER, "Software Engineering"));
        specialties.add(new Specialty(Skills.COMPUTER, "Reverse Engineering"));
        specialties.add(new Specialty(Skills.ACADEMICS, "Libraries"));
        
        //Disciplines
        disciplines.put(Disciplines.DOMINATE, Dots.THREE);
        

        //Merits
        merits.put(Merits.ACUTE_SENSES, Dots.ONE);
                                
    }
    
    
    
}
