/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktail;

/**
 *
 * @author user
 */


public class Nuts extends Ingredients implements Display {
    
    private double volume;

    public Nuts(double volume, String name, double calories) {
        super(name, calories);
        this.volume = volume;
    }

 
     public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    @Override
    public String getInfo(){
       return super.getName()+", Volume Of Nuts : "+this.getVolume()+" gm";
   }
    
    @Override
    public void disply_details()
    {
       System.out.println("Nuts Added ");
       System.out.println(getInfo());
     }
    
}
