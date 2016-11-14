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
        
        for(Specialty spec : specialties) {
            if (spec.skill == skill)
            {
                result.add(spec.name);
            }
        }       
        
        return result;
    }
    
    public ArrayList<String> getDisciplines() {
        ArrayList<String> result = new ArrayList<String>();
        result.addAll(disciplines.keySet());
        return result;
    }
    
    public ArrayList<String> getMerits() {
        ArrayList<String> result = new ArrayList<String>();
        result.addAll(merits.keySet());
        return result;
    }
    
    public Character() {
        setup();
        customSetup();
    }
    
    public void setup() {
        
        //Attributes
        ArrayList<String> attributesList = Attributes.getList();
        
        for (String attribute : attributesList) {
            attributes.put(attribute, Dots.ONE);
        }
        
                
        //Skills
        ArrayList<String> skillsList = Skills.getList();
        
        for (String skill : skillsList) {
            skills.put(skill, Dots.ZERO);
        }
        
                        
        
        
        
               
                                
    }
    
    //Override me with custom attributes, skills, etc.
    public void customSetup() {};
    
    
    
}
