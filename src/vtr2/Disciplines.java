/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

import java.util.ArrayList;

/**
 *
 * @author John
 */
public class Disciplines {
    public static final String ANIMALISM = "Animalism";
    public static final String AUSPEX = "Auspex";
    public static final String CELERITY = "Celerity";
    public static final String DOMINATE = "Dominate";
    public static final String MAJESTY = "Majesty";
    public static final String NIGHTMARE = "Nightmare";
    public static final String OBFUSCATE = "Obfuscate";
    public static final String PROTEAN = "Protean";
    public static final String RESILIENCE = "Resilience";
    public static final String VIGOR = "Vigor";
    
    public static ArrayList<String> getList() {
        ArrayList<String> disciplines = new ArrayList<>();
        
        disciplines.add(ANIMALISM);
        disciplines.add(AUSPEX);
        disciplines.add(CELERITY);
        disciplines.add(DOMINATE);
        disciplines.add(MAJESTY);
        disciplines.add(NIGHTMARE);
        disciplines.add(OBFUSCATE);
        disciplines.add(PROTEAN);
        disciplines.add(RESILIENCE);
        disciplines.add(VIGOR);
        
        return disciplines;        
    }
}
