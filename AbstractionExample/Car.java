package AbstractionExample;

public abstract class Car {
    float height;
    float width;
    int numOfDoors;

   /* next step (non-abstract methods) */
    void setHeight(float height) {
        this.height = height;
    }
    void setWidth(float width) {
        this.width = width;
    }
    void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    /*main methods (abstract methods) */
    abstract void autoPilot();
    abstract void steering();
    abstract void parkingSensor();

    abstract double calculatePrice();
}
