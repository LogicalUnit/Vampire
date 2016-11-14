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
public class SpecialtyPanel extends JPanel {
    private JLabel specialtyLabel = new JLabel();
    
    public SpecialtyPanel(Character vampire) {
        add(specialtyLabel);
        refresh(vampire);
    }
    
    public void refresh(Character vampire) {
        
        String result = "<html><table>";       
        
        for (String skill : Skills.getList()) {
           
            for(String specialty : vampire.getSpecialties(skill)) {
                result += "<tr>";
                result += "<td>" + skill + ": ";
                result += "<td>" + specialty;
            }
        }
        
        result += "</table></html>";
        
        specialtyLabel.setText(result);
    }
}
