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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Dimension;
import javax.swing.JButton;


/**
 *
 * @author John
 */
public class DisciplinesPanel extends JPanel implements ActionListener {
        
    
    private JComboBox<Object> combo;      
    private ArrayList<DottedEntry> disciplines = new ArrayList<>();    
    
    public void refresh(Vampire vamp) {
                
        
        for(DottedEntry disc : disciplines) {
            disc.refresh(vamp);
        }
        
        paint();                     
    }
    
    private void paint() {
        
        removeAll();
        
        ArrayList<String> choices = new ArrayList<>();
        
        for(DottedEntry disc : disciplines) {
            if(disc.getDots().ordinal() > 0) {
                add(disc);                
            } else {
                choices.add(disc.getName());
            }
        }
        
        combo = new JComboBox<>(choices.toArray());
        add(combo);
        
        JButton button = new JButton("Add Discipline");
        button.addActionListener(this);
        add(button);
        
        updateUI();
    }
    
    public void fillVampire(Vampire vamp) {
        
        for(DottedEntry disc : disciplines) {
            vamp.setTraitDots(disc.getName(), disc.getDots());                        
        }        
    }
        
    
    public void actionPerformed(ActionEvent ae) {
       
        String newDisc = (String)combo.getSelectedItem();
        
        for(DottedEntry disc : disciplines) {
            if (disc.getName().equals(newDisc)) {
                disc.setDots(Dots.ONE);
            }
        }
        
        paint();     
    }
    
    
    public DisciplinesPanel(Vampire vamp) {
       
        for(String disc : Disciplines.getList()) {
           disciplines.add(new DottedEntry(disc));
       } 
        
       setLayout(new GridLayout(12,1));
                                                                   
       refresh(vamp);     
    }
        
}
