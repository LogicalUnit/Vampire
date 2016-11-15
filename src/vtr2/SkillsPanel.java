/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
//import javax.swing.BorderFactory;
import java.awt.Component;
import javax.swing.BorderFactory;

/**
 *
 * @author John
 */
public class SkillsPanel extends JPanel {
    
    public class SkillsGroup extends JPanel {
        
        JLabel textLabel = new JLabel();
        
        public void setText(String text) {
            textLabel.setText(text);
        }
        
        public SkillsGroup() {
            setBorder(BorderFactory.createLineBorder(Color.BLACK));            
            add(textLabel);            
        }
    
    }               
    
    private SkillsGroup mentalGroup = new SkillsGroup();
    private SkillsGroup physicalGroup = new SkillsGroup();
    private SkillsGroup socialGroup = new SkillsGroup();
    
    public SkillsPanel(Character vampire) {
         setBorder(BorderFactory.createTitledBorder(Skills.Meta.NAME.toUpperCase()));    
         setLayout(new FlowLayout());
         add(mentalGroup);
         add(physicalGroup);
         add(socialGroup);
         refresh(vampire);
    }
    
    private String skillString(String skill, Character vampire) {
        String result = "<td>" + skill + ":<td>" + vampire.getSkillDots(skill);
        return result;
    }
    
    public void refresh(Character vampire) {
        
        String mentalString = "<html><center>";
                mentalString += Skills.Types.MENTAL.toUpperCase() + "<br>(-3 unskilled)<br>";
                mentalString += "</center><table>";
                
        String physicalString = "<html><center>";
                physicalString += Skills.Types.PHYSICAL.toUpperCase() + "<br>(-1 unskilled)<br>";
                physicalString += "</center><table>";
                
        String socialString = "<html><center>";
                socialString += Skills.Types.SOCIAL.toUpperCase() + "<br>(-1 unskilled)<br>";
                socialString += "</center><table>";
        
        for(String skill : Skills.getList()) {
            
            switch (Skills.getSkillType(skill)) {
                case Skills.Types.MENTAL: 
                    mentalString += "<tr>" + skillString(skill, vampire);
                    break;                    
                case Skills.Types.PHYSICAL: 
                    physicalString += "<tr>" + skillString(skill, vampire);
                    break;
                case Skills.Types.SOCIAL: 
                    socialString += "<tr>" + skillString(skill, vampire);
                    break;                    
            }
            
        }
        
        mentalString += "</table></html>";
        physicalString += "</table></html>";
        socialString += "</table></html>";
        
        mentalGroup.setText(mentalString);
        physicalGroup.setText(physicalString);
        socialGroup.setText(socialString);        
        
    }
    
}
