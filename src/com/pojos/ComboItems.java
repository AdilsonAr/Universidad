/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojos;

/**nombre de clase:ComboItems
 * fecha: 20-10-2019
 * @author Adilson Arbuez
 * copyRight: Adilson Arbuez
 * version: 1.0
 */
public class ComboItems {
    private  int value;
    private String label;

    public ComboItems() {
    }

    public ComboItems(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
    
    
}
