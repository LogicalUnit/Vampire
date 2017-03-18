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

/**
 *
 * @author John
 */
public class DisciplinesPanel extends JPanel {
    
    public class Discipline extends JPanel implements ChangeListener {
               
        private JLabel label = new JLabel();
        private DotSpinner spinner = new DotSpinner();
        
        
        public void stateChanged(ChangeEvent e) {                   
            Dots dots = (Dots)spinner.getValue();                                    
            vamp.setDisciplineDots(label.getText(), dots);
        }
        
        public void refresh() {
            Dots dots = vamp.getDisciplineDots(label.getText());
            
            if(dots == null) {
                dots = Dots.ZERO;
            }
            
            spinner.setValue(dots);
        }
        
        public Discipline(String discipline) {
            label.setText(discipline);
            label.setPreferredSize(new Dimension(80, 20));
            
            spinner.addChangeListener(this);
            
            add(label);
            add(spinner);
        }                                       
    }
    
    ArrayList<Discipline> disciplines = new ArrayList<>();    
    private Vampire vamp;
    
    public void refresh(Vampire vampire) {
        this.vamp = vampire;

        for (Discipline disc : disciplines) {
            disc.refresh();
        }                    
    }      
                       
    
    
    public DisciplinesPanel(Vampire vampire) {
        setBorder(BorderFactory.createTitledBorder(Disciplines.Meta.NAME.toUpperCase()));    
        
        setLayout(new GridLayout(10,1));
        
        for (String discipline : Disciplines.getList()) {
            Discipline newItem = new Discipline(discipline);
            disciplines.add(newItem);
            add(newItem);
        }
                
        refresh(vampire);
    }
    
}
