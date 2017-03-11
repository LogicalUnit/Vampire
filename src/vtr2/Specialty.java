/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtr2;

/**
 *
 * @author John
 */
public class Specialty {
       
    public Specialty(String skill, String specialty) {
        this.skill = skill; //The skill to which the specialty applies
        this.specialty = specialty; //The name of the specialty. This can be an arbitrary string.
    }

    String skill;
    String specialty;
    
    public class Meta {
        public static final String NAME = "Specialties";
    }
}
