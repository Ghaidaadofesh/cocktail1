/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktail;

/**
 *
 * @author user
 */

public class Syrup extends Ingredients implements Display {

    public Syrup(String name, double calories) {
        super(name, calories);
    }
 
    @Override
    public String getInfo(){
        return super.getInfo();
    }
    @Override
     public void disply_details(){
         System.out.println("Syrup Added ");
         System.out.println(super.getInfo());
     }
}
