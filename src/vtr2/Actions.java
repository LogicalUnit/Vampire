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
public class Actions {
    
    public enum Result {
        DRAMATIC_FAILURE, FAILURE, SUCCESS, EXCEPTIONAL_SUCCESS;
    }
    
    public static Result skillCheck(Vampire character, String attribute, String skill, int modifier) {
    
        int attribute_dice = character.getAttributeDots(attribute).ordinal();
        int skill_dice = character.getSkillDots(skill).ordinal();
        int unskilled_penalty = 0;
        
        if (skill_dice == 0) {
            if (Skills.getSkillType(skill) == Skills.Types.MENTAL) {
                unskilled_penalty = -3;
            } else {
                unskilled_penalty = -1;
            }
        }
        
        int total_dice = attribute_dice + skill_dice + unskilled_penalty + modifier;
        
        //chance die
        if (total_dice <= 0) {
            int roll = Roller.rollOneDie();
            
            if (roll == 10) {
                return Result.SUCCESS;
            }
            
            if (roll == 0) {
                return Result.DRAMATIC_FAILURE;
            }
            
            return Result.FAILURE;
        }
        
        int successes = Roller.rollDice(total_dice);
        
        if (successes == 0)
            return Result.FAILURE;
        
        if (successes >= 5)
            return Result.EXCEPTIONAL_SUCCESS;
        
        return Result.SUCCESS;
    
    }
    
    public static Result attributeCheck(Vampire character, String attribute1, String attribute2, int modifier) {
        
        int attribute_1_dice = character.getAttributeDots(attribute1).ordinal();
        int attribute_2_dice = character.getAttributeDots(attribute2).ordinal();
        
        int total_dice = attribute_1_dice + attribute_2_dice + modifier;
        
        //chance die
        if (total_dice <= 0) {
            int roll = Roller.rollOneDie();
            
            if (roll == 10) {
                return Result.SUCCESS;
            }
            
            if (roll == 0) {
                return Result.DRAMATIC_FAILURE;
            }
            
            return Result.FAILURE;
        }
        
        int successes = Roller.rollDice(total_dice);
        
        if (successes == 0)
            return Result.FAILURE;
        
        if (successes >= 5)
            return Result.EXCEPTIONAL_SUCCESS;
        
        return Result.SUCCESS;
        
    }
    
    //Computer Skills    
    public static Result internetSearch(Vampire character, int modifier) {        
        return skillCheck(character, Attributes.WITS, Skills.COMPUTER, modifier);
    }
    public static Result programming(Vampire character, int modifier) {
        return skillCheck(character, Attributes.INTELLIGENCE, Skills.COMPUTER, modifier);
    }
    
}
