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
//import javax.swing.BorderFactory;
import java.awt.Component;

/**
 *
 * @author John
 */
public class SkillsPanel extends JPanel {
    
    private JLabel skillsLab = new JLabel();
    private String type;
    private int penalty;
    
    public SkillsPanel(Character vampire, String type, int penalty) {
        this.type = type;
        this.penalty = penalty;
        add(skillsLab);
        refresh(vampire);           
    }
    
    public void refresh(Character vampire) {
       
        String result = "<html>";
                result += "<center>" + type.toUpperCase() + "<br>";
                result += "(" + penalty + " unskilled)" + "</center>";
                result += "<table>";
        
        for (String skill : Skills.getList()) {
            if (Skills.getSkillType(skill) == type) {
                
                result += "<tr>";
                result += "<td width=\"100\">" + skill + ":";
                result += "<td width=\"40\">" + vampire.getSkillDots(skill);
                        
            }
        }             
        
        result += "</table></html>";
        skillsLab.setText(result);
        
    }
    
}
