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
    private SkillsPanel skillsPanel;
    private DisciplinesPanel disciplinesPanel;
    private MeritsPanel meritsPanel;   
    private SpecialtyPanel specialtyPanel;

    private Character vampire; 
    
    public Gui (Character vampire) {
        
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
        specialtyPanel = new SpecialtyPanel(vampire);
        
        
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(attributesPanel, BorderLayout.NORTH);        
        mainFrame.add(skillsPanel, BorderLayout.WEST);                              
        mainFrame.add(disciplinesPanel, BorderLayout.CENTER);
        mainFrame.add(meritsPanel, BorderLayout.EAST);
        mainFrame.add(specialtyPanel, BorderLayout.SOUTH);
       

        mainFrame.pack();
	mainFrame.setVisible(true);
    }
    
    
}
