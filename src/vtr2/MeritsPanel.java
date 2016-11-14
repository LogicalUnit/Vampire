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
public class MeritsPanel extends JPanel {
    
    private JLabel meritsLabel = new JLabel();
    
    public MeritsPanel(Character vampire) {
        add(meritsLabel);
        refresh(vampire);
    }
    
    public void refresh(Character vampire) {
        
        String result = "<html><table>";
               
        for(String merit : vampire.getMerits()) {
            result += "<tr>";
            result += "<td>" + merit + ": ";
            result += "<td>" + vampire.getMeritDots(merit);
        }                
        
        result += "</table></html>";
        
        meritsLabel.setText(result);
        
    }
    
}
