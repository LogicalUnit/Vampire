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
import java.awt.GridLayout;

/**
 *
 * @author John
 */
public class SpecialtiesPanel extends JPanel {
    //private JLabel specialtyLabel = new JLabel();
    
    public SpecialtiesPanel(Vampire vampire) {
        //setBorder(BorderFactory.createTitledBorder(Specialty.Meta.NAME.toUpperCase()));   
        //add(specialtyLabel);
        setLayout(new GridLayout(12,1));
        
        refresh(vampire);
    }
    
    public void refresh(Vampire vamp) {

        removeAll();
        
        setBorder(BorderFactory.createTitledBorder(Specialty.Meta.NAME.toUpperCase()));        
                
        for (Specialty spec : vamp.getSpecialties()) {
            String text = spec.skill.toUpperCase() + ": " + spec.specialty;
            add(new JLabel(text));
        }
        
        updateUI();
        
    }
}
