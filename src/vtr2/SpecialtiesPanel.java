/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.BorderFactory;

/**
 *
 * @author John
 */
public class SpecialtiesPanel extends JPanel {
    private JLabel specialtyLabel = new JLabel();
    
    public SpecialtiesPanel(Character vampire) {
        setBorder(BorderFactory.createTitledBorder(Specialty.Meta.NAME.toUpperCase()));   
        add(specialtyLabel);
        refresh(vampire);
    }
    
    public void refresh(Character vampire) {
        
        String result = "<html><table>";       
        
        for (String skill : Skills.getList()) {
           
            for(String specialty : vampire.getSpecialties(skill)) {
                result += "<tr><td>" + skill + ":<td>" + specialty;                
            }
        }
        
        result += "</table></html>";
        
        specialtyLabel.setText(result);
    }
}
