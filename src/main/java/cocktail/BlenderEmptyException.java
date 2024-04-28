package cocktail;


public class BlenderEmptyException extends Exception {
    
    
    @Override
   public String getMessage(){
       return " Blender is Empty , Cannot pour"; // Will Be Printed If Blender Is Empty
   }
}

