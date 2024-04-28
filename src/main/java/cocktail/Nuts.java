package cocktail;


public class Nuts extends Ingredients implements Display ,Volumes {
    
    private double volume;

    //constructor
    public Nuts(double volume, String name, double calories) {
        super(name, calories);
        this.volume = volume;
    }
    
    //setter
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    //getVolume() is override from Volumes interface (common design)
    @Override
     public double getVolume() {
        return volume;
    }

    //override from super calss Ingredients()
    @Override
    public String getInfo(){
       return super.getName()+", Volume Of Nuts : "+this.getVolume()+" gm"+", Nuts Calories "+this.getCalories();
   }
    
    //override from Display interface(common design)
    @Override
    public void disply_details()
    {
       System.out.println("Nuts Added ");
       System.out.println(getInfo());
     }
    
}
