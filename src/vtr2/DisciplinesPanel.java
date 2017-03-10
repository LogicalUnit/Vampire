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
public class DisciplinesPanel extends JPanel {
    private JLabel disciplineLabel = new JLabel();
    
    private String disciplineString(String discipline, Vampire vampire) {
        String result = "<tr><td width=100>" + discipline + ":<td>" + vampire.getDisciplineDots(discipline);
        return result;
    }
    
    public void refresh(Vampire vampire) {
        
        String result = "<html><table>";
               
        for (String discipline : vampire.getDisciplines()) {
            result += disciplineString(discipline, vampire);           
        }       
        
        result += "</table></html>";
        
        disciplineLabel.setText(result);
    }
    
    public DisciplinesPanel(Vampire vampire) {
        setBorder(BorderFactory.createTitledBorder(Disciplines.Meta.NAME.toUpperCase()));    
        add(disciplineLabel);
        refresh(vampire);
    }
    
}
