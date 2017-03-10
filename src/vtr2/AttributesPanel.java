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

/**
 *
 * @author John
 */
public class AttributesPanel extends JPanel {
    
    public class Attribute extends JPanel implements ChangeListener {
        private JLabel label = new JLabel();
        private JSpinner spinner = new JSpinner(new SpinnerListModel(Dots.values()));
        
        public Attribute(String label) {
            this.label.setText(label);
            this.label.setPreferredSize(new Dimension(80,20));                                    
            add(this.label);
            
            this.spinner.addChangeListener(this);
            this.spinner.setPreferredSize(new Dimension(80,20));
            add(this.spinner);            
        }
        
        public void stateChanged(ChangeEvent e) {
            System.out.println(label.getText() + ": " + spinner.getValue());
        }
    }
                
    public AttributesPanel(Vampire vampire) {        
                
        setBorder(BorderFactory.createTitledBorder(Attributes.Meta.NAME.toUpperCase()));    
                
        setLayout(new GridLayout(3,4));
        
        add(new JLabel(Attributes.Rows.POWER));
        add(new Attribute(Attributes.INTELLIGENCE));
        add(new Attribute(Attributes.STRENGTH));
        add(new Attribute(Attributes.PRESENCE));
        
        add(new JLabel(Attributes.Rows.FINESSE));
        add(new Attribute(Attributes.WITS));
        add(new Attribute(Attributes.DEXTERITY));
        add(new Attribute(Attributes.MANIPULATION));
        
        add(new JLabel(Attributes.Rows.RESISTANCE));
        add(new Attribute(Attributes.RESOLVE));
        add(new Attribute(Attributes.STAMINA));
        add(new Attribute(Attributes.COMPOSURE));
    }    
}
