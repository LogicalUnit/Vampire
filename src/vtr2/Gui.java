/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author John
 */
public class Gui implements Runnable {
    
    private JFrame mainFrame;    
    private AttributesPanel attributes;
    //private Character vampire = new Character();
    //private Character vampire = new Ventrue();
    private Character vampire = new Gangrel();
    
    public Gui () {
        
        SwingUtilities.invokeLater(this);
        
    }
    
    public void run() {
        mainFrame = new JFrame("Vampire");
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        
        attributes = new AttributesPanel(vampire);
        
        //mainFrame.add(new JLabel("test"));
        
        mainFrame.add(attributes);
        
        
        mainFrame.pack();
	mainFrame.setVisible(true);
    }
    
    
}
