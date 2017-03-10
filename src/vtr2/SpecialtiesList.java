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
public class SpecialtiesList extends ArrayList<Specialty> {
    
    public ArrayList<String> getSpecialties(String skill) {
        
        ArrayList<String> result = new ArrayList<>();
        
        for(Specialty spec : this) {
            if (spec.skill.equals(skill))
            {
                result.add(spec.name);
            }
        }       
        
        return result;
    }
    
    public void addSpecialty(String skill, String specialty) {
        add(new Specialty(skill, specialty));
    }
}
