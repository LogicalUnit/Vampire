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
        mentalSkills.setBorder(BorderFactory.createTitledBorder("Mental"));
//        mentalSkills.setAlignmentX(Component.LEFT_ALIGNMENT);
        physicalSkills = new SkillsPanel(Skills.Types.PHYSICAL, vampire);
        physicalSkills.setBorder(BorderFactory.createTitledBorder("Physical"));
//        physicalSkills.setAlignmentX(Component.LEFT_ALIGNMENT);
        socialSkills = new SkillsPanel(Skills.Types.SOCIAL, vampire);
        socialSkills.setBorder(BorderFactory.createTitledBorder("Social"));
//        socialSkills.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JPanel attributesPanel = new JPanel();
        attributesPanel.setBorder(BorderFactory.createTitledBorder("Attributes"));
        attributesPanel.add(attributes);

        JPanel skillsPanel = new JPanel();
        skillsPanel.setBorder(BorderFactory.createTitledBorder("Skills"));
        skillsPanel.setLayout(new GridLayout(3,1));
        skillsPanel.add(mentalSkills);
        skillsPanel.add(physicalSkills);
        skillsPanel.add(socialSkills);
        
        mainFrame.setLayout(new BorderLayout());
        //mainFrame.add(new JPanel());
        mainFrame.add(attributesPanel, BorderLayout.NORTH);        
        mainFrame.add(skillsPanel, BorderLayout.WEST);
        //mainFrame.add(new JPanel());
        
        
        
        
        mainFrame.pack();
	mainFrame.setVisible(true);
    }
    
    
}
