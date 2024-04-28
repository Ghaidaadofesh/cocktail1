package cocktail;


public class Cup {
    private double capacity;
    private int volume = 90;

    //cup constructor
    public Cup(double capacity) {
        this.capacity = capacity;
        this.volume = 0; 
    }

    //setters and getters
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
   
    //return cup state
    public String getInfo(){
        return"Cup Capacity = "+this.capacity + "Cup Volume = "+ this.capacity;
    }
    
}
   



