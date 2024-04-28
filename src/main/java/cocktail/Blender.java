package cocktail;

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
    
    //Blend All The Ingredients
    public void blend(  ){
       System.out.println("Cocktail Is Blended using these Ingredients ");
        disply_details();
    }
    
    //Mix Fruit And Milk Colors
    public static Color blendColor( Colors color1, Colors color2 ) {
        int blendedRed = (color1.getRed() + color2.getRed()) / 2;
        int blendedGreen = (color1.getGreen() + color2.getGreen()) / 2;
        int blendedBlue = (color1.getBlue() + color2.getBlue()) / 2;
        int blendedAlpha = (color1.getAlpha() + color2.getAlpha()) / 2;

        return new Color(blendedRed, blendedGreen, blendedBlue, blendedAlpha); 
    }
    
    //Calculate Total Calories for all the ingredients
    public double getTotalCalories() {
        int totalCalories = 0;
        for (Ingredients ingredient : i) {
            totalCalories += ingredient.getCalories();
        }
        return totalCalories;
    }
    
    //Use within this class Only
    private double getIngredientVolume(Ingredients ingredient) {
        if (ingredient instanceof Fruits || ingredient instanceof Milk || ingredient instanceof Nuts) {
            return ((Volumes) ingredient).getVolume(); //(Volumes) it's The Interface
    } 
        return 0; //It will return Zero if volumes is not for the right type
    }
    
    //Calculate all Ingredients Volume using [getIngredientVolume()] Method
     public double getTotalVolume() { 
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
            System.out.println("Pouring into The Cup ..");
            System.out.println("Total Calories In The Cup :"+(getTotalCalories() - cup.getVolume()));
        }
        else {
            throw new BlenderEmptyException(); //Exception If The Blender Is Empty
        }
    }
   
    //Add Ingredients to The blender
     public void add_Ingredient(Ingredients in) throws BlenderOverflowException
    {      
        if(this.capacity >= this.volume){
            this.capacity -= volume;
                 i.add(in);   }
     else {
            throw new BlenderOverflowException(); //Exception If Blender Capacity Exceed
        }               
    }
    
    //Remove Ingredients by it's index
    public void remove_Ingredient(int indx)
    {
        i.remove(indx);
    }
    
    //Return how many Ingredients are Added
    public int getIngredientCount()
    {
      return i.size();
    }
    
    //print Added Ingredients
    public void print_Ingredients()
    {
        for(int j = 0 ; j <i.size() ; j++)
        {
            System.out.println("Name: " + i.get(j).getName()+", Caloreis: "+ i.get(j).getCalories());
        }
    }
    
    //Display interface to check the type of The Ingredients then Display The Details of The Ingredient
    public void disply_details(){
        for ( int e = 0 ; e < i.size(); e++){
            if( i.get(e) instanceof Fruits )
                ((Fruits)i.get(e)).disply_details();
            if ( i.get(e) instanceof Milk )
                ((Milk)i.get(e)).disply_details();
            if ( i.get(e) instanceof Nuts )
                ((Nuts)i.get(e)).disply_details();
            if( i.get(e) instanceof Syrup )
                ((Syrup)i.get(e)).disply_details();
            if( i.get(e) instanceof Sugar )
                ((Sugar)i.get(e)).disply_details();
        }
    }
   
   //return Blender state
   public String getInfo(){ 
       return "Blender capacity = "+this.capacity+", Blender volume = "+this.volume;
    }
  
   
}
    




