/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

/**
 *
 * @author John
 */
public class Gui implements Runnable {
    
    private JFrame mainFrame;    
    private AttributesPanel attributes;
    private SkillsPanel mentalSkills;
    private SkillsPanel physicalSkills;
    private SkillsPanel socialSkills;
    //private Character vampire = new Character();
    //private Character vampire = new Ventrue();
    private Character vampire; 
    
    public Gui (Character vampire) {
        
        this.vampire = vampire;
        
        SwingUtilities.invokeLater(this);
        
    }
    
    public void run() {
        mainFrame = new JFrame("Vampire");
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        
        attributes = new AttributesPanel(vampire);
        mentalSkills = new SkillsPanel(Skills.Types.MENTAL, vampire);
        physicalSkills = new SkillsPanel(Skills.Types.PHYSICAL, vampire);
        socialSkills = new SkillsPanel(Skills.Types.SOCIAL, vampire);        
        
        mainFrame.setLayout(new FlowLayout());
        mainFrame.add(attributes);
        mainFrame.add(mentalSkills);
        mainFrame.add(physicalSkills);
        mainFrame.add(socialSkills);
        
        
        mainFrame.pack();
	mainFrame.setVisible(true);
    }
    
    
}
