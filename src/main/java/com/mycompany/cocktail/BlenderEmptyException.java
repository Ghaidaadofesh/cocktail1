/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktail;

/**
 *
 * @author user
 */


public class BlenderEmptyException extends Exception {
    
    /**
     *
     * @return
     */
    @Override
   public String getMessage(){
       return " Blender is Empty , Cannot pour";
   }
}

