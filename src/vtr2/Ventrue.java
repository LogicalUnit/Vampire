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
        setAttributeDots(Attributes.PRESENCE, Dots.TWO);
        
        //Skills
        setSkillDots(Skills.PERSUASION, Dots.TWO);
        setSkillDots(Skills.COMPUTER, Dots.FOUR);
        
        //Disciplines
        setDisciplineDots(Disciplines.DOMINATE, Dots.THREE);
        setDisciplineDots(Disciplines.AUSPEX, Dots.TWO);
        
        //Merits
        setMeritDots(Merits.BLOODHOUND, Dots.TWO);
        
        //Specialties
        addSpecialty(Skills.COMPUTER, "Software Engineering");        
        addSpecialty(Skills.COMPUTER, "Reverse Engineering"); 
        
    }
}
