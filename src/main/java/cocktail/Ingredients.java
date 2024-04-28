package cocktail;



public class Ingredients  {
    private String name;
    private double calories;
 
    //Ingredients constructor
    public Ingredients(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }
    
    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
    
    //Return All The Informations
    public  String getInfo(){
        return "Ingredient Name: "+ this.getName()+", Ingredient Calories: "+this.getCalories();
    }
    

    
}
