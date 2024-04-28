package cocktail;


public class Milk extends Ingredients implements Display , Volumes{
    private double volume;
    private Colors color = new Colors(255,255,255,5); 

    //overloading constructor
    public Milk(String name, double calories) {
        super(name, calories);
    }

    //Milk constructor
    public Milk(String name,double calories,double volume, Colors color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    //setters
    public void setVolume(double volume) {
        this.volume = volume;
    } 
    
    public void setColor(Colors color) {
        this.color = color;
    }

    //override from super calss Ingredients()
    @Override
    public  String getInfo(){
        return super.getInfo()+", Volume of the Milk: "+this.getVolume()+" ml";
    } 

    //getVolume() is override from Volumes interface (common design)
    @Override
    public double getVolume() {
        return volume;
    }
    
    //override from Display interface(common design)
    @Override
     public void disply_details()
     {
         System.out.println("Milk Added ");
         System.out.println(getInfo());
     }
}
