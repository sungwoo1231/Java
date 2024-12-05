package CodingTest_1;

abstract public class Vehicle {
    String modelName ;
    int MaxSpeed ;

    public Vehicle(String modelName, int maxSpeed) {
        this.modelName = modelName;
        MaxSpeed = maxSpeed;
    }
    abstract void drive ();
    final void displayInfo(){
        System.out.println("Model : " +modelName+ "," + " MaxSpeed : " +MaxSpeed);

    }
}
