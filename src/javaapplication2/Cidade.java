/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author tryCaaatch
 */
public class Cidade {
    private int defesas;
    private Trajeto[] c;

    public Cidade(int defesas, Trajeto[] c) {
        this.defesas = defesas;
        this.c = c;
    }

    public int getDefesas() {
        return defesas;
    }
    
    

    public Trajeto[] getC() {
        return c;
    }
    
    
    
    
    
}
