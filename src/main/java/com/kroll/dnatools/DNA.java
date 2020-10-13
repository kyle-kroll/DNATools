/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kroll.dnatools;

/**
 *
 * @author kyle
 */
public class DNA {
    private String id;
    private String type;
    private String sequence;
    
    public DNA(String id, String type, String sequence) {
        this.id = id;
        this.type = type;
        this.sequence = sequence;
    }
    
    public void setID(String id) {
        this.id = id;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setSequence(String type) {
        this.sequence = type;
    }
    
    public String getID() {
        return this.id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getSequence() {
        return this.sequence;
    }
    
}
