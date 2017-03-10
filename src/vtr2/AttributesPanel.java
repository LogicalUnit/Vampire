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
    
    private String attributeString(String name, Vampire vamp) {
            String result = "<tr><td width=100>" + name + ":<td>" + vamp.getAttributeDots(name);
            return result;
        }
    
    public void refresh(Vampire vampire) {
        
          String labels = "<html><table>";
                    labels += "<tr><td>" + Attributes.Rows.POWER;
                    labels += "<tr><td>" + Attributes.Rows.FINESSE;
                    labels += "<tr><td>" + Attributes.Rows.RESISTANCE;
                    labels += "</table></html>";
                    
                    rowLabels.setText(labels);
                    
         String mentalAttributes = "<html><table>";
                    mentalAttributes += attributeString(Attributes.INTELLIGENCE, vampire);
                    mentalAttributes += attributeString(Attributes.WITS, vampire);
                    mentalAttributes += attributeString(Attributes.RESOLVE, vampire);
                    mentalAttributes += "</table></html>";
         
         mentalGroup.setText(mentalAttributes);
         
         String physicalAttributes = "<html><table>";
                    physicalAttributes += attributeString(Attributes.STRENGTH, vampire);
                    physicalAttributes += attributeString(Attributes.DEXTERITY, vampire); 
                    physicalAttributes += attributeString(Attributes.STAMINA, vampire); 
                    physicalAttributes += "</table></html>";
         
         physicalGroup.setText(physicalAttributes);
         
         String socialAttributes = "<html><table>";
                    socialAttributes += attributeString(Attributes.PRESENCE, vampire); 
                    socialAttributes += attributeString(Attributes.MANIPULATION, vampire); 
                    socialAttributes += attributeString(Attributes.COMPOSURE, vampire); 
                    socialAttributes += "</table></html>";
         
         socialGroup.setText(socialAttributes);
                
     
    }
    
    public AttributesPanel(Vampire vampire) {        
                
        setBorder(BorderFactory.createTitledBorder(Attributes.Meta.NAME.toUpperCase()));    
        setLayout(new FlowLayout());
        add(rowLabels);
        add(mentalGroup);
        add(physicalGroup);
        add(socialGroup);
        
        refresh(vampire);             
    }
    
}
