package cocktail;

  public class Colors  {
    private int red;
    private int green;
    private int blue;
    private int alpha; //Transparency (0 = fully transparent, 10 = full opacity)

    //default constructor not initialize
    public Colors() {
        
    }

    //constructor
    public Colors(int red, int green, int blue,int alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    //setters and getters
    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    
     
}
