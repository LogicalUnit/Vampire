/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author John
 */
public class Vampire {
    //   
    HashMap<String,Dots> traits = new HashMap<>();
    ArrayList<Specialty> specialties = new ArrayList<>();
    
    public void setTraitDots(String name, Dots dots) {
        traits.put(name, dots);
    }
    
    public Dots getTraitDots(String name) {
        return traits.get(name);
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
    
    
    public Vampire() {
        setup();
        customSetup();
    }
    
    public void setup() {
                
        for (String attribute : Attributes.getList()) {
            setTraitDots(attribute, Dots.ONE);
        }                             
     
        for (String skill : Skills.getList()) {
            setTraitDots(skill, Dots.ZERO);
        }
        
        for (String disc : Disciplines.getList()) {
            setTraitDots(disc, Dots.ZERO);
        }
        
        for(String merit : Merits.getList()) {
            setTraitDots(merit, Dots.ZERO);
        }
                                                                                                       
    }
    
    //Override me with custom attributes, skills, etc.
    public void customSetup() {};
    
    
    
}
