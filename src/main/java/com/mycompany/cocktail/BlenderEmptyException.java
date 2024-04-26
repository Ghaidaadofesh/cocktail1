package com.mycompany.cocktail;

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

