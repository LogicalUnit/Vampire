/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import java.awt.Dimension;

/**
 *
 * @author John
 */
public class DotSpinner extends JSpinner {
    
    public DotSpinner() {
        super(new SpinnerListModel(Dots.values()));
        setPreferredSize(new Dimension(80,20));
    }
}
