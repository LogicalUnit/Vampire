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
public class DisciplinesPanel extends JPanel {
    private JLabel disciplineLabel = new JLabel();
    
    public void refresh(Character vampire) {
        
        String result = "<html><table>";
               
        for (String discipline : vampire.getDisciplines()) {
            result += "<tr>";
            result += "<td>" + discipline + ": ";
            result += "<td>" + vampire.getDisciplineDots(discipline);
        }       
        
        result += "</table></html>";
        
        disciplineLabel.setText(result);
    }
    
    public DisciplinesPanel(Character vampire) {
        add(disciplineLabel);
        refresh(vampire);
    }
    
}
