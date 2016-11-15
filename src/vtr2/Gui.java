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

    private AttributesPanel attributesPanel;
    private SkillsPanel mentalSkillsPanel;
    private SkillsPanel physicalSkillsPanel;
    private SkillsPanel socialSkillsPanel;
    private DisciplinesPanel disciplinesPanel;
    private MeritsPanel meritsPanel;    

    private Character vampire; 
    
    public Gui (Character vampire) {
        
        this.vampire = vampire;
        
        SwingUtilities.invokeLater(this);
        
    }
    
    public void run() {
        mainFrame = new JFrame("Vampire");
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
                
        attributesPanel = new AttributesPanel(vampire);
        mentalSkillsPanel = new SkillsPanel(vampire, Skills.Types.MENTAL, -3);
        physicalSkillsPanel = new SkillsPanel(vampire, Skills.Types.PHYSICAL, -1);
        socialSkillsPanel = new SkillsPanel(vampire, Skills.Types.SOCIAL, -1);
        disciplinesPanel = new DisciplinesPanel(vampire);
        meritsPanel = new MeritsPanel(vampire);

        attributesPanel.setBorder(BorderFactory.createTitledBorder(Attributes.Meta.NAME.toUpperCase()));

        JPanel skillsPanel = new JPanel();
        skillsPanel.setBorder(BorderFactory.createTitledBorder(Skills.Meta.NAME.toUpperCase()));
        skillsPanel.setLayout(new GridLayout(3,1));
        skillsPanel.add(mentalSkillsPanel);
        skillsPanel.add(physicalSkillsPanel);
        skillsPanel.add(socialSkillsPanel);
        


        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(attributesPanel, BorderLayout.NORTH);        
        mainFrame.add(skillsPanel, BorderLayout.WEST);                              
        mainFrame.add(disciplinesPanel, BorderLayout.CENTER);
        mainFrame.add(meritsPanel, BorderLayout.EAST);
       

        mainFrame.pack();
	mainFrame.setVisible(true);
    }
    
    
}
