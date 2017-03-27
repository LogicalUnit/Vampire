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
    
    public class Discipline extends DottedEntry {
        
        public Discipline(String name) {
            super(name);
        }
        
        public void refresh(Vampire vamp) {
            setDots(vamp.getDisciplineDots(getName()));
        }
    }
    
    
    private JComboBox<Object> combo;
    //private JButton button;
  
    private ArrayList<Discipline> disciplines = new ArrayList<>();
    
    public void refresh(Vampire vamp) {
        
        removeAll();
       
        disciplines.clear();
        
        for(String disc : Disciplines.getList()){
            Dots dots = vamp.getDisciplineDots(disc);
            
            if (dots != Dots.ZERO) {
                Discipline newItem = new Discipline(disc);
                disciplines.add(newItem);
                add(newItem);
                newItem.refresh(vamp);
            }
        }
        
       //add(button);
        updateUI();
    }
    
    public void actionPerformed(ActionEvent ae) {
       refresh(new Gangrel());
       System.out.println("Button Pushed");
    }
    
    public DisciplinesPanel(Vampire vamp) {
        
       setLayout(new GridLayout(12,1));
        
       combo = new JComboBox<>(Disciplines.getList().toArray());
                             
       JButton button = new JButton("Change");
       button.addActionListener(this);
       //add(combo);
       
      
       refresh(vamp);
        add(button);
    }
        
}
