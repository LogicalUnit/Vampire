/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vampire2nd;

import java.util.Arrays;
import java.util.Vector;



/**
 *
 * @author John
 */
public class CharacterSheet {
    
    
    
    public static final String ATTR_ROW_POWER = "power";
    public static final String ATTR_ROW_FINESSE = "finesse";
    public static final String ATTR_ROW_RESISTANCE = "resistance";
    
    public static final String ATTR_COL_MENTAL = "mental";
    public static final String ATTR_COL_PHYSICAL = "physical";
    public static final String ATTR_COL_SOCIAL = "social";
    
    public static final String ATTR_NAME_INTELLIGENCE = "intelligence";
    public static final String ATTR_NAME_WITS = "wits";
    public static final String ATTR_NAME_RESOLVE = "resolve";

    public static final String ATTR_NAME_STRENGTH = "strength";
    public static final String ATTR_NAME_DEXTERITY = "dexterity";
    public static final String ATTR_NAME_STAMINA = "stamina";

    public static final String ATTR_NAME_PRESENCE = "presence";
    public static final String ATTR_NAME_MANIPULATION = "manipulation";
    public static final String ATTR_NAME_COMPOSURE = "composure";
    
    
    public static final String[] ATTR_TYPE_COLS =                        {  ATTR_COL_MENTAL,    ATTR_COL_PHYSICAL,  ATTR_COL_SOCIAL};        
    public static final String[] ATTR_TYPE_ROWS = { ATTR_ROW_POWER,      // Intelligence        Strength            Presence
                                                    ATTR_ROW_FINESSE,    // Wits                Dexterity           Manipulation    
                                                    ATTR_ROW_RESISTANCE};// Resolve             Stamina             Composure
        
    
    public static final String SKILL_ACADEMICS = "academics";
    public static final String SKILL_COMPUTER = "computer";
    public static final String SKILL_CRAFTS = "crafts";
    public static final String SKILL_INVESTIGATION = "investigation";
    public static final String SKILL_MEDECINE = "medecine";
    public static final String SKILL_OCCULT = "occult";
    public static final String SKILL_POLITICS = "politics";
    public static final String SKILL_SCIENCE = "science";
    
    
    private Attribute[][] matrix = new Attribute[ATTR_TYPE_ROWS.length][ATTR_TYPE_COLS.length];
    private Vector<Skill> mental = new Vector<Skill>();
    
    
    public CharacterSheet() {
        setup();
    }
        
    public enum Dots {
               
        ZERO, ONE, TWO, THREE, FOUR, FIVE; //use ordinal() to get integer
             
                     
        public static Dots toDots(int ordinal) throws Exception
        {
            if (ordinal >= 0 && ordinal <= 5)
                return Dots.values()[ordinal];                        
            
            throw new Exception("Dots must be between 0 and 5");
        }
        
    }
    
    public class Attribute {
          
        private String name;
        private Dots dots;  
        
        public Attribute(String name, Dots dots){
            this.name = name;
            this.dots = dots;            
        }
        
        public String getName() {
            return name;
        }
        
        public Dots getDots() {
            return dots;
        }        
                     
    }
    
    public class Skill {
        
        private String name;
        private Dots dots;
        
        public Skill(String name, Dots dots) {
            this.name = name;
            this.dots = dots;
        }
        
        public String getName() {
            return name;
        }
        
        public Dots getDots() {
            return dots;
        }
    }
    
    public Attribute getAttributeByTypes(String row, String col) {
        return matrix[getAttrRow(row)][getAttrCol(col)];
    }

    public Attribute getAttributeByInts(int row, int col) {
        return matrix[row][col];
    }

    public Attribute getAttributeByName(String name) {
        for(int i = 0; i < ATTR_TYPE_ROWS.length; i++) {
            for (int j = 0; j < ATTR_TYPE_COLS.length; j++) {
                Attribute attr = matrix[i][j];
                if (attr.getName() == name) {
                    return attr;
                }                   
            }
        }

        return null;
    }
    
    public Skill getSkillByName(String name) {
        for (int i = 0; i < mental.size(); i++) {
            Skill skill = mental.get(i);
            if (skill.getName() == name)
                return skill;
        }
        
        return null;
    }
    
    public void setup()
    {
       matrix[getAttrRow(ATTR_ROW_POWER)][getAttrCol(ATTR_COL_MENTAL)] = new Attribute(ATTR_NAME_INTELLIGENCE, Dots.THREE);
       matrix[getAttrRow(ATTR_ROW_FINESSE)][getAttrCol(ATTR_COL_MENTAL)] = new Attribute(ATTR_NAME_WITS, Dots.ONE);
       matrix[getAttrRow(ATTR_ROW_RESISTANCE)][getAttrCol(ATTR_COL_MENTAL)] = new Attribute(ATTR_NAME_RESOLVE, Dots.ONE);

       matrix[getAttrRow(ATTR_ROW_POWER)][getAttrCol(ATTR_COL_PHYSICAL)] = new Attribute(ATTR_NAME_STRENGTH, Dots.ONE);
       matrix[getAttrRow(ATTR_ROW_FINESSE)][getAttrCol(ATTR_COL_PHYSICAL)] = new Attribute(ATTR_NAME_DEXTERITY, Dots.ONE);
       matrix[getAttrRow(ATTR_ROW_RESISTANCE)][getAttrCol(ATTR_COL_PHYSICAL)] = new Attribute(ATTR_NAME_STAMINA, Dots.ONE);

       matrix[getAttrRow(ATTR_ROW_POWER)][getAttrCol(ATTR_COL_SOCIAL)] = new Attribute(ATTR_NAME_PRESENCE, Dots.FOUR);
       matrix[getAttrRow(ATTR_ROW_FINESSE)][getAttrCol(ATTR_COL_SOCIAL)] = new Attribute(ATTR_NAME_MANIPULATION, Dots.ONE);
       matrix[getAttrRow(ATTR_ROW_RESISTANCE)][getAttrCol(ATTR_COL_SOCIAL)] = new Attribute(ATTR_NAME_COMPOSURE, Dots.TWO);
       
       mental.add(new Skill(SKILL_ACADEMICS, Dots.THREE));
       mental.add(new Skill(SKILL_COMPUTER, Dots.TWO));
       mental.add(new Skill(SKILL_CRAFTS, Dots.ONE));
       mental.add(new Skill(SKILL_INVESTIGATION, Dots.ONE));
       mental.add(new Skill(SKILL_MEDECINE, Dots.THREE));
       mental.add(new Skill(SKILL_OCCULT, Dots.TWO));
       mental.add(new Skill(SKILL_POLITICS, Dots.THREE));
       mental.add(new Skill(SKILL_SCIENCE, Dots.ONE));
        
    }
    
                
    static public int getAttrRow(String row) {        
        return Arrays.asList(ATTR_TYPE_ROWS).indexOf(row);
    }
    
    static public int getAttrCol(String col) {
        return Arrays.asList(ATTR_TYPE_COLS).indexOf(col);
    }
          
}
