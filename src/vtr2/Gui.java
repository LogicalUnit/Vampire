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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;


/**
 *
 * @author John
 */
public class Gui implements Runnable {
    
    private JFrame mainFrame;    

    private AttributesPanel attributesPanel;
    private SkillsPanel skillsPanel;
    private DisciplinesPanel disciplinesPanel;
    private MeritsPanel meritsPanel;   
    private SpecialtiesPanel specialtiesPanel;

    private Vampire vampire; 
    
    public Gui (Vampire vampire) {
        
        this.vampire = vampire;
        
        SwingUtilities.invokeLater(this);
        
    }
    
    public void run() {
        mainFrame = new JFrame("Vampire");
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
                
        attributesPanel = new AttributesPanel(vampire);
        skillsPanel = new SkillsPanel(vampire);
        disciplinesPanel = new DisciplinesPanel(vampire);
        meritsPanel = new MeritsPanel(vampire);
        specialtiesPanel = new SpecialtiesPanel(vampire);
        
        mainFrame.setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.Y_AXIS));
        //mainFrame.setLayout(new FlowLayout());
//        

        JPanel traitsColumn1 = new JPanel();
        //traitsColumn1.setLayout(new BoxLayout(traitsColumn1, BoxLayout.Y_AXIS));
        traitsColumn1.setLayout(new GridLayout(3,1));
        traitsColumn1.add(disciplinesPanel);
        traitsColumn1.add(meritsPanel);
        traitsColumn1.add(specialtiesPanel);
//        
        JPanel otherTraits = new JPanel();
        otherTraits.setBorder(BorderFactory.createTitledBorder("OTHER TRAITS"));
        otherTraits.setLayout(new GridLayout(1,2));
        otherTraits.add(traitsColumn1);
        otherTraits.add(new JPanel());        
                
        JPanel intermediatePanel = new JPanel();
//        intermediatePanel.setLayout(new GridLayout(1,2));
        intermediatePanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        intermediatePanel.add(skillsPanel, c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.fill = GridBagConstraints.VERTICAL;                
        intermediatePanel.add(otherTraits, c);        
        
               
        mainFrame.add(attributesPanel);
        mainFrame.add(intermediatePanel);
       
       

        mainFrame.pack();
	mainFrame.setVisible(true);
    }
    
    
}
