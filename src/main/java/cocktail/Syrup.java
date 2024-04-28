package cocktail;



public class Syrup extends Ingredients implements Display {

    //constructor
    public Syrup(String name, double calories) {
        super(name, calories);
    }
 
    //override from super calss Ingredients()
    @Override
    public String getInfo(){
        return super.getInfo();
    }
    
    //override from Display interface(common design)
    @Override
     public void disply_details(){
         System.out.println("Syrup Added ");
         System.out.println(super.getInfo());
     }
}
