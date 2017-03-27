/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.BorderFactory;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

/**
 *
 * @author John
 */
public class SkillsPanel extends JPanel {
    
    public class Skill extends DottedEntry {
        
        public Skill(String name) {
            super(name);
        }
        
        public void refresh(Vampire vamp) {
            setDots(vamp.getSkillDots(getName()));
        }
    }
    
    ArrayList<Skill> skills = new ArrayList<>();
    
    private void addSkill(String name, JPanel group) {
        Skill newItem = new Skill(name);
        skills.add(newItem);
        group.add(newItem);        
    }    
                  
    private JPanel mentalGroup = new JPanel();
    private JPanel physicalGroup = new JPanel();
    private JPanel socialGroup = new JPanel();
    
    public SkillsPanel(Vampire vampire) {
         setBorder(BorderFactory.createTitledBorder(Skills.Meta.NAME.toUpperCase()));           
         setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));                
         
         mentalGroup.setLayout(new GridLayout(9,1));
         mentalGroup.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
         mentalGroup.add(new JLabel(Skills.Types.MENTAL.toUpperCase(), SwingConstants.CENTER));   
         //mentalGroup.add(new JLabel("(-3 Unskilled)", SwingConstants.CENTER));
         addSkill(Skills.ACADEMICS, mentalGroup);
         addSkill(Skills.COMPUTER, mentalGroup);
         addSkill(Skills.CRAFTS, mentalGroup);
         addSkill(Skills.INVESTIGATION, mentalGroup);
         addSkill(Skills.MEDECINE, mentalGroup);
         addSkill(Skills.OCCULT, mentalGroup);
         addSkill(Skills.POLITICS, mentalGroup);
         addSkill(Skills.SCIENCE, mentalGroup);                  
         add(mentalGroup);
         
         physicalGroup.setLayout(new GridLayout(9,1));
         physicalGroup.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
         physicalGroup.add(new JLabel(Skills.Types.PHYSICAL.toUpperCase(), SwingConstants.CENTER));
         //physicalGroup.add(new JLabel("(-1 Unskilled)", SwingConstants.CENTER));
         addSkill(Skills.ATHLETICS, physicalGroup);
         addSkill(Skills.BRAWL, physicalGroup);
         addSkill(Skills.DRIVE, physicalGroup);
         addSkill(Skills.FIREARMS, physicalGroup);
         addSkill(Skills.LARCENY, physicalGroup);
         addSkill(Skills.STEALTH, physicalGroup);
         addSkill(Skills.SURVIVAL, physicalGroup);
         addSkill(Skills.WEAPONRY, physicalGroup);                  
         add(physicalGroup);
         
         socialGroup.setLayout(new GridLayout(9,1));
         socialGroup.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
         socialGroup.add(new JLabel(Skills.Types.SOCIAL.toUpperCase(), SwingConstants.CENTER));
         //socialGroup.add(new JLabel("(-1 Unskilled)", SwingConstants.CENTER));
         addSkill(Skills.ANIMAL_KEN, socialGroup);
         addSkill(Skills.EMPATHY, socialGroup);
         addSkill(Skills.EXPRESSION, socialGroup);
         addSkill(Skills.INTIMIDATION, socialGroup);
         addSkill(Skills.PERSUASION, socialGroup);
         addSkill(Skills.SOCIALISE, socialGroup);
         addSkill(Skills.STREETWISE, socialGroup);
         addSkill(Skills.SUBTERFUGE, socialGroup);
         //add(Box.createRigidArea(new Dimension(5,7)));
         add(socialGroup);
         
         refresh(vampire);
    }
          
    public void refresh(Vampire vamp) {              
        
        for(Skill skill : skills) {
            skill.refresh(vamp);
        }        
    }
    
}
