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
public class Vampire {
    
    DottedTrait attributes = new DottedTrait();
    DottedTrait skills = new DottedTrait();
    DottedTrait disciplines = new DottedTrait();
    DottedTrait merits = new DottedTrait();
    
    SpecialtiesList specialties = new SpecialtiesList();
    
    //ArrayList<Specialty> specialties = new ArrayList<>();
    
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
        ArrayList<String> result = specialties.getSpecialties(skill);                        
        return result;
    }
    
    public ArrayList<String> getDisciplines() {
        ArrayList<String> result = new ArrayList<>();
        result.addAll(disciplines.keySet());
        return result;
    }
    
    public ArrayList<String> getMerits() {
        ArrayList<String> result = new ArrayList<>();
        result.addAll(merits.keySet());
        return result;
    }
    
    public Vampire() {
        setup();
        customSetup();
    }
    
    public void setup() {
                
        for (String attribute : Attributes.getList()) {
            attributes.put(attribute, Dots.ONE);
        }        
                
     
        for (String skill : Skills.getList()) {
            skills.put(skill, Dots.ZERO);
        }
                                                                                                       
    }
    
    //Override me with custom attributes, skills, etc.
    public void customSetup() {};
    
    
    
}
