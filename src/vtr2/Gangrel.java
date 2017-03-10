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
public class Gangrel extends Vampire {
    
    @Override
    public void customSetup() {
        attributes.put(Attributes.STRENGTH, Dots.FOUR);
        skills.put(Skills.ANIMAL_KEN, Dots.THREE);
        disciplines.put(Disciplines.ANIMALISM, Dots.TWO);
        //Merits
        merits.put(Merits.ACUTE_SENSES, Dots.ONE);
        
        //Specialties        
                
        specialties.addSpecialty(Skills.ACADEMICS, "Libraries");
        specialties.addSpecialty(Skills.BRAWL, "Drunken Boxing");
        specialties.addSpecialty(Skills.FIREARMS, "Rifles");
    }

}
