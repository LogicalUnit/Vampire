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
public class Ventrue extends Vampire {
    
    @Override
    public void customSetup() {
        //Attributes
        setTraitDots(Attributes.PRESENCE, Dots.FIVE);
        
        //Skills
        setTraitDots(Skills.PERSUASION, Dots.TWO);
        setTraitDots(Skills.COMPUTER, Dots.FOUR);
        
        //Disciplines
        setTraitDots(Disciplines.DOMINATE, Dots.THREE);
        setTraitDots(Disciplines.AUSPEX, Dots.TWO);
        
        //Merits
        setTraitDots(Merits.BLOODHOUND, Dots.TWO);
        
        //Specialties
        addSpecialty(Skills.COMPUTER, "Software Engineering");        
        addSpecialty(Skills.COMPUTER, "Reverse Engineering"); 
        
    }
}
