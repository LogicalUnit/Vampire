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
        //Attributes        
        setTraitDots(Attributes.STRENGTH, Dots.FOUR);
        
        //Skills
        setTraitDots(Skills.ANIMAL_KEN, Dots.THREE);
        
        //Disciplines
        setTraitDots(Disciplines.ANIMALISM, Dots.TWO);
        
        //Merits
        setTraitDots(Merits.ACUTE_SENSES, Dots.ONE);
        
        //Specialties                        
        addSpecialty(Skills.ACADEMICS, "Libraries");
        addSpecialty(Skills.BRAWL, "Drunken Boxing");
        addSpecialty(Skills.FIREARMS, "Rifles");
    }

}
