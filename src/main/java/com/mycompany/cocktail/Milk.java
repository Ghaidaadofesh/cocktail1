/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktail;

/**
 *
 * @author user
 */
public class Milk extends Ingredients implements Display , IngredientColor{
    private double volume;
    private Colors color = new Colors(255,255,255,255); 

    public Milk(String name, double calories) {
        super(name, calories);
    }

    public Milk(String name,double calories,double volume, Colors color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    @Override
    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
    
    @Override
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public  String getInfo(){
        return super.getInfo()+", Volume of the Milk: "+this.getVolume()+" ml";
    }
    @Override
     public void disply_details()
     {
         System.out.println("Milk Added ");
         System.out.println(getInfo());
     }
}
