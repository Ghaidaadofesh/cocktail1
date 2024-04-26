package com.mycompany.cocktail;

public class Sugar extends Ingredients implements Display {
    
    
    public Sugar(String name, double calories) {
        super(name, calories);
    }
    
    @Override
    public String getInfo(){
        return super.getInfo();
    }
    @Override
     public void disply_details(){
         System.out.println("Sugar Added ");
         System.out.println(super.getInfo());
     }
}
