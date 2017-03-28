/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import java.awt.GridLayout;

/**
 *
 * @author John
 */
public class MeritsPanel extends JPanel implements ActionListener {
    
    private ArrayList<DottedEntry> merits = new ArrayList<>();
    private JComboBox<Object> combo;
    
    public MeritsPanel(Vampire vamp) {
        
        for(String merit : Merits.getList()) {
            merits.add(new DottedEntry(merit));
        }
        
        setLayout(new GridLayout(12,1));
        
        refresh(vamp);
        
    }
    
    private void paint() {
        
        removeAll();
        
        ArrayList<String> choices = new ArrayList<>();
        
        for (DottedEntry merit : merits) {
            if(merit.getDots().ordinal() > 0) {
                add(merit);                
            } else {
                choices.add(merit.getName());
            }
        }
        
        combo = new JComboBox(choices.toArray());
        add(combo);
        
        JButton button = new JButton("Add Merit");
        button.addActionListener(this);
        add(button);
        
        updateUI();
        
    }
    
    public void refresh(Vampire vamp) {
        
        for(DottedEntry merit : merits) {
            merit.refresh(vamp);
        }
        
        paint();
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        String newMerit = (String)combo.getSelectedItem();
        
        for(DottedEntry merit : merits) {
            if(merit.getName().equals(newMerit)) {
                merit.setDots(Dots.ONE);
            }
        }
        
        paint();
        
    }
    
//    private JLabel meritsLabel = new JLabel();
//    
//    public MeritsPanel(Vampire vampire) {
//        setBorder(BorderFactory.createTitledBorder(Merits.Meta.NAME.toUpperCase()));    
//        add(meritsLabel);
//        refresh(vampire);
//    }
//    
//    private String meritString(String merit, Vampire vampire) {
//        String result = "<tr><td width=100>" + merit + ":<td>" + vampire.getTraitDots(merit);
//        return result;
//    }
//    
//    public void refresh(Vampire vampire) {
//        
//        String result = "<html><table>";
//               
//        for(String merit : Merits.getList()) {
//            result += meritString(merit, vampire);
//        }                
//        
//        result += "</table></html>";
//        
//        meritsLabel.setText(result);
//        
//    }
    
}
