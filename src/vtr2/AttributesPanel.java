/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;


import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.BorderFactory;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.SwingConstants;

/**
 *
 * @author John
 */
public class AttributesPanel extends JPanel {
    
    public class Attribute extends JPanel implements ChangeListener {
        private JLabel label = new JLabel();             
        private DotSpinner spinner = new DotSpinner();
        
        public Attribute(String label) {            
            this.label.setText(label);            
            this.label.setPreferredSize(new Dimension(80,20));                                    
            add(this.label);
            
            this.spinner.addChangeListener(this);          
            add(this.spinner);            
        }
        
        public void stateChanged(ChangeEvent e) {                       
            Dots dots = (Dots)spinner.getValue();
            vamp.setAttributeDots(label.getText(), dots);           
        }
        
        public void refresh() {
            spinner.setValue(vamp.getAttributeDots(label.getText()));
        }
    }
    
    private Vampire vamp = new Vampire();
    ArrayList<Attribute> attributes = new ArrayList<>();
    
    public void refresh(Vampire vamp) {
        this.vamp = vamp;
        
        for(Attribute attr : attributes) {
            attr.refresh();
        }
    }
    
    private void addAttribute(String name) {
        Attribute newItem = new Attribute(name);
        attributes.add(newItem);
        add(newItem);
    }
                
    public AttributesPanel(Vampire vampire) {  
                               
        setBorder(BorderFactory.createTitledBorder(Attributes.Meta.NAME.toUpperCase()));    
                
        setLayout(new GridLayout(3,4));
        
        add(new JLabel(Attributes.Rows.POWER, SwingConstants.CENTER));
        addAttribute(Attributes.INTELLIGENCE);
        addAttribute(Attributes.STRENGTH);
        addAttribute(Attributes.PRESENCE);
        
        add(new JLabel(Attributes.Rows.FINESSE, SwingConstants.CENTER));
        addAttribute(Attributes.WITS);
        addAttribute(Attributes.DEXTERITY);
        addAttribute(Attributes.MANIPULATION);
        
        add(new JLabel(Attributes.Rows.RESISTANCE, SwingConstants.CENTER));
        addAttribute(Attributes.RESOLVE);
        addAttribute(Attributes.STAMINA);
        addAttribute(Attributes.COMPOSURE);
        
        refresh(vampire);
    }    
}
