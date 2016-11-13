/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author John
 */
public class AttributesPanel extends JPanel {
    
    private JLabel attrLab = new JLabel();
    
    private String attrString(String name, Character vamp) {
            String result = name + ": <td>" + vamp.getAttributeDots(name).ordinal();
            return result;
        }
    
    public void refresh(Character vampire) {
        String result = "<html><table border=0 cellpadding=3 cellspacing=3" +  
                "<tr>" +
                "<td>" + attrString(Attributes.INTELLIGENCE, vampire) + 
                "<td>" +attrString(Attributes.STRENGTH, vampire) + 
                "<td>" +attrString(Attributes.PRESENCE, vampire) + 
                "<tr>" +
                "<td>" +attrString(Attributes.WITS, vampire) + 
                "<td>" +attrString(Attributes.DEXTERITY, vampire) + 
                "<td>" +attrString(Attributes.MANIPULATION, vampire) + 
                "<tr>" +
                "<td>" +attrString(Attributes.RESOLVE, vampire) + 
                "<td>" +attrString(Attributes.STAMINA, vampire) + 
                "<td>" +attrString(Attributes.COMPOSURE, vampire) + "</table></html>";
        attrLab.setText(result);                
    }
    
    public AttributesPanel(Character vampire) {        
        add(attrLab);
        refresh(vampire);             
    }
    
}
