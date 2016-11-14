/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

/**
 *
 * @author John
 */
public class Ventrue extends Character {
        
    public void customSetup() {
        attributes.put(Attributes.PRESENCE, Dots.THREE);
        skills.put(Skills.PERSUASION, Dots.FOUR);
        //Disciplines
        disciplines.put(Disciplines.DOMINATE, Dots.THREE);
        
        specialties.add(new Specialty(Skills.COMPUTER, "Software Engineering"));        
                
    }
}
