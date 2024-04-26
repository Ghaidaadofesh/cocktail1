/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktail;

/**
 *
 * @author user
 */

public class Cup {
    private double capacity;
    private int volume = 90;

    public Cup(double capacity) {
        this.capacity = capacity;
        this.volume = 0; 
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
   
    public String getInfo(){
        return"Cup Capacity = "+this.capacity + "Cup Volume = "+ this.capacity;
    }
    
}
   



