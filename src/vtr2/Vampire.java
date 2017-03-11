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
      
    
    public Dots getAttributeDots(String name) {
        return attributes.get(name);
    }
    
    public void setAttributeDots(String attribute, Dots dots) {
        attributes.put(attribute, dots);
    }
    
    public Dots getSkillDots(String name) {
        return skills.get(name);
    }
    
    public void setSkillDots(String skill, Dots dots) {
        skills.put(skill, dots);
    }
    
    public Dots getDisciplineDots(String name) {
        return disciplines.get(name);
    }
    
    public void setDisciplineDots(String discipline, Dots dots) {
        disciplines.put(discipline, dots);
    }
    
    public Dots getMeritDots(String name) {
        return merits.get(name);
    }
    
    public void setMeritDots(String merit, Dots dots) {
        merits.put(merit, dots);
    }
    
    public ArrayList<String> getSpecialties(String skill) {
        ArrayList<String> result = new ArrayList<>();
        
        for(Specialty spec : specialties) {
            if (spec.skill.equals(skill))
            {
                result.add(spec.specialty);
            }
        }       
        
        return result;
    }
    
    public void addSpecialty(String skill, String specialty) {
        specialties.add(new Specialty(skill, specialty));
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
