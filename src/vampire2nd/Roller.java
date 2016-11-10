/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vampire2nd;

import java.util.Random;




/**
 *
 * @author John
 */
public class Roller {
    
    
    public enum Result {
        DRAMATIC_FAILURE, FAILURE, SUCCESS, EXCEPTIONAL_SUCCESS;
    }
    
    static Random randomGenerator = new Random();
    
    public static int roll(int dice){
                
        int successes = 0;               
        
        for (int i = 0; i < dice; i++) {
            int random = randomGenerator.nextInt(10) + 1;
            
            while(random == 10) {
                successes++;
                random = randomGenerator.nextInt(10) + 1;
            }
            
            if (random == 8 || random == 9){
                successes++;
            }
                
        }
        
        return successes;
    }
            
    
    public static boolean testCheck(CharacterSheet character) {
        
        int wits = character.getAttributeByName(CharacterSheet.ATTR_NAME_WITS).getDots().ordinal();
        int computer = character.getSkillByName(CharacterSheet.SKILL_COMPUTER).getDots().ordinal();
        
        int result = Roller.roll(wits + computer);
        
        if (result > 0)
            return true;
                
        return false;
    }
    
    public static Result skillRoll(CharacterSheet character, String attribute, String skill, int modifier) {
        
        int attribute_dice = character.getAttributeByName(attribute).getDots().ordinal();
        int skill_dice = character.getSkillByName(skill).getDots().ordinal();
        
        int total_dice = attribute_dice + skill_dice + modifier;
        
        //Chance die
        if (total_dice < 0)
        {
            int result = randomGenerator.nextInt(10) + 1;
            
            if(result == 0)
                return Result.DRAMATIC_FAILURE;
            
            if (result == 10)
                return Result.SUCCESS;
            
            return Result.FAILURE;
                        
        }
        
        int result = Roller.roll(total_dice);        
        
        if (result == 0)
            return Result.FAILURE;
        
        if (result >= 5)
            return Result.EXCEPTIONAL_SUCCESS;
                
        return Result.SUCCESS;
    }
    
    public static Result attributeRoll(CharacterSheet character, String attribute1, String attribute2, int modifier) {
        
        int attribute_1_dice = character.getAttributeByName(attribute1).getDots().ordinal();
        int attribute_2_dice = character.getAttributeByName(attribute2).getDots().ordinal();
        
        int total_dice = attribute_1_dice + attribute_2_dice + modifier;
                        
       //Chance die
        if (total_dice < 0)
        {
            int result = randomGenerator.nextInt(10) + 1;
            
            if(result == 0)
                return Result.DRAMATIC_FAILURE;
            
            if (result == 10)
                return Result.SUCCESS;
            
            return Result.FAILURE;
                        
        }
        
        int result = Roller.roll(total_dice);        
        
        if (result == 0)
            return Result.FAILURE;
        
        if (result >= 5)
            return Result.EXCEPTIONAL_SUCCESS;
                
        return Result.SUCCESS;
                             
    }
    
    //Computer Skills    
    public static Result internetSearch(CharacterSheet character, int modifier) {        
        return skillRoll(character, CharacterSheet.ATTR_NAME_WITS, CharacterSheet.SKILL_COMPUTER, modifier);
    }
    public static Result programming(CharacterSheet character, int modifier) {
        return skillRoll(character, CharacterSheet.ATTR_NAME_INTELLIGENCE, CharacterSheet.SKILL_COMPUTER, modifier);
    }
    
}
