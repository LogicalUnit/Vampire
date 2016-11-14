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
            String result = name + ":<td>" + vamp.getAttributeDots(name);
            return result;
        }
    
    public void refresh(Character vampire) {
        String result = "<html><table>";
                
                result += "<tr>";
                result += "<td>"; //empty cell
                result += "<td>" + Attributes.Cols.MENTAL.toUpperCase() + "<td>";
                result += "<td>" + Attributes.Cols.PHYSICAL.toUpperCase() + "<td>";
                result += "<td>" + Attributes.Cols.SOCIAL.toUpperCase() + "<td>";               
                result += "<tr>";
                result += "<td>" + Attributes.Rows.POWER.toUpperCase();
                result += "<td>" + attrString(Attributes.INTELLIGENCE, vampire);
                result += "<td>" + attrString(Attributes.STRENGTH, vampire); 
                result += "<td>" + attrString(Attributes.PRESENCE, vampire);
                result += "<tr>";
                result += "<td>" + Attributes.Rows.FINESSE.toUpperCase();
                result += "<td>" + attrString(Attributes.WITS, vampire); 
                result += "<td>" + attrString(Attributes.DEXTERITY, vampire);
                result += "<td>" + attrString(Attributes.MANIPULATION, vampire);
                result += "<tr>";
                result += "<td>" + Attributes.Rows.RESISTANCE.toUpperCase();
                result += "<td>" + attrString(Attributes.RESOLVE, vampire); 
                result += "<td>" + attrString(Attributes.STAMINA, vampire);
                result += "<td>" + attrString(Attributes.COMPOSURE, vampire);
                result += "</table></html>";
        
        attrLab.setText(result);                
    }
    
    public AttributesPanel(Character vampire) {        
        add(attrLab);
        refresh(vampire);             
    }
    
}
