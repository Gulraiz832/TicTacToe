/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Comparator;

/**
 *
 * @author gulraiz
 */
public class Descion implements Comparable<Descion> {
    String name;
    int row;
    int col;
    int priority;
    public int compareTo(Descion d){
        return d.priority-this.priority;
    }
}
