/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;

/**
 *
 * @author John
 */
public class DottedEntry extends JPanel {
    private JLabel name = new JLabel();
    private DotSpinner spinner = new DotSpinner();
    
    public DottedEntry(String name) {
        this.name.setText(name);
        this.name.setPreferredSize(new Dimension(80,20));
        
        add(this.name);
        add(this.spinner);
    }
    
    public String getName() {
        return name.getText();
    }
    
    public Dots getDots() {
        return (Dots)spinner.getValue();
    }
    
    public void setDots(Dots dots) {
        spinner.setValue(dots);
    }
}
