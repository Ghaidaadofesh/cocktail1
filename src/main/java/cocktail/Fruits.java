package cocktail;



public class Fruits extends Ingredients implements Display , Volumes  {

    private double volume;
    private Colors color;

    //overloaded constructor
    public Fruits(String name, double calories) {
        super(name, calories);
    }
 
    //Fruits constructor
    public Fruits(String name, double calories,double volume, Colors color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    //getVolume() is override from Volumes interface (common design)
    @Override
     public double getVolume() { 
        return volume;
    }

     //normal setters
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    //override from super calss Ingredients()
    @Override
    public String getInfo(){
        return super.getInfo()+", Volume of Fruits: "+this.getVolume()+" gm ";
    }
    
    //override from Display interface(common design)
    @Override
     public void disply_details(){
         System.out.println("Fruit Added ");
         System.out.println(getInfo());
     }
     
    
}
