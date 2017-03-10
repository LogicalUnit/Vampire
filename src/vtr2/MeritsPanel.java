/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.JPanel;
import javax.swing.JLabel;
//import java.util.ArrayList;
import javax.swing.BorderFactory;

/**
 *
 * @author John
 */
public class MeritsPanel extends JPanel {
    
    private JLabel meritsLabel = new JLabel();
    
    public MeritsPanel(Vampire vampire) {
        setBorder(BorderFactory.createTitledBorder(Merits.Meta.NAME.toUpperCase()));    
        add(meritsLabel);
        refresh(vampire);
    }
    
    private String meritString(String merit, Vampire vampire) {
        String result = "<tr><td width=100>" + merit + ":<td>" + vampire.getMeritDots(merit);
        return result;
    }
    
    public void refresh(Vampire vampire) {
        
        String result = "<html><table>";
               
        for(String merit : vampire.getMerits()) {
            result += meritString(merit, vampire);
        }                
        
        result += "</table></html>";
        
        meritsLabel.setText(result);
        
    }
    
}
