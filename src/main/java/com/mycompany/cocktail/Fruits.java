package com.mycompany.cocktail;

public class Fruits extends Ingredients implements Display , IngredientColor  {

    private double volume;
    private Colors color;

    public Fruits(String name, double calories) {
        super(name, calories);
    }
 
    public Fruits(String name, double calories,double volume, Colors color) {
        super(name, calories);
        this.volume = volume;
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
    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+", Volume of Fruits: "+this.getVolume()+" gm ";
    }
    @Override
     public void disply_details(){
         System.out.println("Fruit Added ");
         System.out.println(getInfo());
     }
     
    
}
