package CodingTest_1;

public class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String modelName, int maxSpeed, int seatingCapacity, int batteryCapacity) {
        super(modelName, maxSpeed, seatingCapacity);
        this.batteryCapacity = batteryCapacity;
    }
    void charge() {
        System.out.println("배터리를 충전 중입니다.");
    }
}
