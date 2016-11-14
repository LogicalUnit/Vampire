/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import javax.swing.JPanel;


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
    private DisciplinesPanel disciplines;
    private MeritsPanel merits;
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
        mentalSkills = new SkillsPanel(vampire, Skills.Types.MENTAL);
        physicalSkills = new SkillsPanel(vampire, Skills.Types.PHYSICAL);
        socialSkills = new SkillsPanel(vampire, Skills.Types.SOCIAL);
        disciplines = new DisciplinesPanel(vampire);
        merits = new MeritsPanel(vampire);
        

        attributes.setBorder(BorderFactory.createTitledBorder("Attributes".toUpperCase()));

        JPanel skillsPanel = new JPanel();
        skillsPanel.setBorder(BorderFactory.createTitledBorder("Skills".toUpperCase()));
        skillsPanel.setLayout(new GridLayout(3,1));
        skillsPanel.add(mentalSkills);
        skillsPanel.add(physicalSkills);
        skillsPanel.add(socialSkills);
        
       
        mainFrame.setLayout(new BorderLayout());       
        mainFrame.add(attributes, BorderLayout.NORTH);        
        mainFrame.add(skillsPanel, BorderLayout.WEST);
        mainFrame.add(disciplines, BorderLayout.CENTER);
        mainFrame.add(merits, BorderLayout.EAST);        
        
        
        
        
        mainFrame.pack();
	mainFrame.setVisible(true);
    }
    
    
}
