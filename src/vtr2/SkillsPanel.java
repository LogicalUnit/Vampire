/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class SkillsPanel extends JPanel {
    
    private JLabel skillsLab = new JLabel();
    private String type;
    
    public SkillsPanel(String type, Character vampire) {
        this.type = type;
        add(skillsLab);
        refresh(vampire);       
    }
    
    public void refresh(Character vampire) {
        ArrayList<String> skillsList = Skills.getList();
        String result = "<html><table>";
        
        for(int i = 0; i < skillsList.size(); i++) {
            
            String skill = skillsList.get(i);
            
            if (Skills.getSkillType(skill) == type) {
                
                result += "<tr>";
                result += "<td>" + skill + ":";
                result += "<td>" + vampire.getSkillDots(skill);
                        
            }
                        
        }
        
        result += "</table></html>";
        skillsLab.setText(result);
        
    }
    
}
