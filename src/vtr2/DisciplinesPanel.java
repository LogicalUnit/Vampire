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
        
        setLayout(new GridLayout(12,1));
        
        for (String discipline : Disciplines.getList()) {
            Discipline newItem = new Discipline(discipline);
            disciplines.add(newItem);
            add(newItem);            
        }
        
        add(newButton(SHOW_COMMAND));
        add(newButton(HIDE_COMMAND));
        
                
        refresh(vampire);
    }
    
    private int visibleDisciplines = 10;
    private static final String SHOW_COMMAND = "Show";
    private static final String HIDE_COMMAND = "Hide";
    
    private JButton newButton(String command) {
        JButton button = new JButton(command);
        button.setActionCommand(command);
        button.addActionListener(this);
        return button;
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        switch(ae.getActionCommand()){
            case SHOW_COMMAND: 
                visibleDisciplines++; 
                if (visibleDisciplines > 10)
                    visibleDisciplines = 10;
                break;
            case HIDE_COMMAND:
                visibleDisciplines--;
                if(visibleDisciplines < 0)
                    visibleDisciplines = 0;
                break;                        
        }
        
        for(int i = 0; i < 10; i++) {
            if(i < visibleDisciplines) {
                disciplines.get(i).setVisible(true);
            } else {            
                disciplines.get(i).setVisible(false);
            }
        }
        
    }
    
}
