package com.mycompany.cocktail;

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
