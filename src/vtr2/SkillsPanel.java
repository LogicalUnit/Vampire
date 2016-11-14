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
    private JLabel title = new JLabel();
    private String type;
    
    public SkillsPanel(String type, Character vampire) {
        this.type = type;
//        setBorder(BorderFactory.createTitledBorder(type));
        title.setText(type.toUpperCase());
        
//        setLayout(new BorderLayout());
//        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        //add(title, BorderLayout.NORTH);
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
