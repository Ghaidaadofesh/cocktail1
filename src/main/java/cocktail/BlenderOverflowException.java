package cocktail;


public class BlenderOverflowException extends Exception{

 
    @Override
     public String getMessage(){
         return "Blender OverFlow , You Cannot add Ingredients "; //Will Be Printed If Blender overflow
     }
}
