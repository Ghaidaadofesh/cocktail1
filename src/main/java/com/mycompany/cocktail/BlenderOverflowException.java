package com.mycompany.cocktail;

public class BlenderOverflowException extends Exception{

    /**
     *
     * @return
     */
    @Override
     public String getMessage(){
         return "Blender OverFlow , You Cannot add Ingredients ";
     }
}
