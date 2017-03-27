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
public class DisciplinesPanel extends JPanel {
    
    private JComboBox<Object> combo;
    
    private Vampire vamp;
    
    public DisciplinesPanel(Vampire vamp) {
        this.vamp = vamp;
        
       combo = new JComboBox<>(Disciplines.getList().toArray());
                             
        
        add(combo);
    }
        
}
