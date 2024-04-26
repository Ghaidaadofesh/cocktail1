/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktail;
import java.util.ArrayList;


/**
 *
 * @author user
 */

import java.awt.Color;
import java.util.ArrayList;

public class Blender  {
    
  private double capacity;
  private double volume;
  private ArrayList<Ingredients> i ;
 

    public Blender( double capacity) {
        this.capacity = capacity;
        this.volume = 480;
        i = new ArrayList <>();
        System.out.println("The Blender Is Empty Right Now");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    
    public void blend(  ){
       System.out.println("Cocktail Is Blended using these Ingredients ");
        disply_details();
     
    }

    public static Color blend( Colors color1, Colors color2 ) {
        int blendedRed = (color1.getRed() + color2.getRed()) / 2;
        int blendedGreen = (color1.getGreen() + color2.getGreen()) / 2;
        int blendedBlue = (color1.getBlue() + color2.getBlue()) / 2;
        int blendedAlpha = (color1.getAlpha() + color2.getAlpha()) / 2;

        return new Color(blendedRed, blendedGreen, blendedBlue, blendedAlpha);
        
    }
    
    public double getTotalCalories() {
        int totalCalories = 0;
        for (Ingredients ingredient : i) {
            totalCalories += ingredient.getCalories();
        }
        return totalCalories;
    }
    
    private double getIngredientVolume(Ingredients ingredient) {
        if (ingredient instanceof Fruits || ingredient instanceof Milk) {
            return ((IngredientColor) ingredient).getVolume();
        }
        return 0;
    }
    
     private double getTotalVolume() { 
        double totalVolume = 0;
        for (Ingredients ingredient : i) {
            totalVolume += getIngredientVolume(ingredient);
        }
        return totalVolume;
    }

    //we pour Cocktails into cups 
    public void pour(Cup cup) throws BlenderEmptyException {
        if ( cup.getVolume() <= this.volume){
                this.volume -= cup.getVolume();
            System.out.println("Pouring into The Cup");
            System.out.println("Total Calories In The Cup :"+(getTotalCalories() - cup.getVolume()));
        }
        else {
            throw new BlenderEmptyException();
        }
    }
   
     public void add_Ingredient(Ingredients in) throws BlenderOverflowException
    {      
        if(this.capacity >= this.volume){
            this.capacity -= volume;
                 i.add(in);   }
     else {
            throw new BlenderOverflowException();
        }               
    }
    
    public void remove_Ingredient(int indx)
    {
        i.remove(indx);
    }
    
    public int getIngredientCount()
    {
      return i.size();
    }
    
    public void print_Ingredients()
    {
        for(int j = 0 ; j <i.size() ; j++)
        {
            System.out.println("Name: " + i.get(j).getName()+", Caloreis: "+ i.get(j).getCalories());
        }
    }
    
    public void disply_details(){
        for ( int e = 0 ; e < i.size(); e++){
            if( i.get(e) instanceof Fruits )
                ((Fruits)i.get(e)).disply_details();
            if( i.get(e) instanceof Milk )
                ((Milk)i.get(e)).disply_details();
            if( i.get(e) instanceof Nuts )
                ((Nuts)i.get(e)).disply_details();
            if( i.get(e) instanceof Syrup )
                ((Syrup)i.get(e)).disply_details();
            if( i.get(e) instanceof Sugar )
                ((Sugar)i.get(e)).disply_details();
        }
    }
   
   public String getInfo(){
       return "Blender Volume : "+ this.getVolume() + ", Blender Capacity: "+this.getCapacity();
    }
   
   
}
    




