/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;


import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.FlowLayout;

/**
 *
 * @author John
 */
public class AttributesPanel extends JPanel {
    
    public class AttributesGroup extends JPanel {
        private JLabel textLabel = new JLabel();
        
        public void setText(String text) {
            textLabel.setText(text);
        }
        
        public AttributesGroup() {
            setBorder(BorderFactory.createLineBorder(Color.BLACK));
            add(textLabel);
        }
    }

    private JLabel rowLabels = new JLabel();
    private AttributesGroup mentalGroup = new AttributesGroup();
    private AttributesGroup physicalGroup = new AttributesGroup();
    private AttributesGroup socialGroup = new AttributesGroup();       
    
    private String attrString(String name, Character vamp) {
            String result = "<td>" + name + ":<td>" + vamp.getAttributeDots(name);
            return result;
        }
    
    public void refresh(Character vampire) {
        
          String labels = "<html>";
                    labels += Attributes.Rows.POWER + ":<br>";
                    labels += Attributes.Rows.FINESSE + ":<br>";
                    labels += Attributes.Rows.RESISTANCE + ":";
                    labels += "</html>";
                    
                    rowLabels.setText(labels);
                    
         String mentalAttributes = "<html><table>";
                    mentalAttributes += "<tr>";
                    mentalAttributes += attrString(Attributes.INTELLIGENCE, vampire);
                    mentalAttributes += "<tr>";
                    mentalAttributes += attrString(Attributes.WITS, vampire);
                    mentalAttributes += "<tr>";
                    mentalAttributes += attrString(Attributes.RESOLVE, vampire);
                    mentalAttributes += "</table></html>";
         
         mentalGroup.setText(mentalAttributes);
         
         String physicalAttributes = "<html><table>";
                    physicalAttributes += "<tr>";
                    physicalAttributes += attrString(Attributes.STRENGTH, vampire);
                    physicalAttributes += "<tr>";
                    physicalAttributes += attrString(Attributes.DEXTERITY, vampire);
                    physicalAttributes += "<tr>";
                    physicalAttributes += attrString(Attributes.STAMINA, vampire);
                    physicalAttributes += "</table></html>";
         
         physicalGroup.setText(physicalAttributes);
         
         String socialAttributes = "<html><table>";
                    socialAttributes += "<tr>";
                    socialAttributes += attrString(Attributes.PRESENCE, vampire);
                    socialAttributes += "<tr>";
                    socialAttributes += attrString(Attributes.MANIPULATION, vampire);
                    socialAttributes += "<tr>";
                    socialAttributes += attrString(Attributes.COMPOSURE, vampire);
         
         socialGroup.setText(socialAttributes);
                
     
    }
    
    public AttributesPanel(Character vampire) {        
                
        setBorder(BorderFactory.createTitledBorder(Attributes.Meta.NAME.toUpperCase()));    
        setLayout(new FlowLayout());
        add(rowLabels);
        add(mentalGroup);
        add(physicalGroup);
        add(socialGroup);
        
        refresh(vampire);             
    }
    
}
