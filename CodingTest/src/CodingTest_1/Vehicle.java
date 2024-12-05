package CodingTest_1;

abstract public class Vehicle {
    String modelName ;
    int MaxSpeed ;

    public Vehicle(String modelName, int maxSpeed) {
        this.modelName = modelName;
        MaxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    abstract void drive ();
    final void displayInfo(){
        System.out.println("Model : " +modelName+ "," + " MaxSpeed : " +MaxSpeed);

    }
}
