// Device 추상클래스
abstract class Device {
    String brand;
    String model;
    public Device() {
    }

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void powerOn() {
        System.out.println(brand + " " + model + " 전원 켜짐 ");
    }
    public void powerOff() {
        System.out.println(brand + " " + model + " 전원 꺼짐 ");
    }
    public abstract void doFunction(); // 추상 메서드
}
 // 전자장치 추상클래스
interface WiFi{
    void connectToWiFi(); // 추상 메서드
}
interface Bluetooth{
    void connectToBluetooth();
}
 // 휴대폰
 class Phone extends Device implements WiFi,Bluetooth{
     public Phone(String brand, String model) {
         super(brand, model);
     }

     @Override
     public void doFunction() {
         System.out.println("휴대폰으로 전화를 겁니다");
     }

     @Override
     public void connectToBluetooth() {
         System.out.println("휴대폰으로 와이파이에 연결합니다");
     }

     @Override
     public void connectToWiFi() {
         System.out.println("휴대폰으로 블루투스에 연결합니다");
     }
 }
 // 노트북
class Laptop extends Device implements WiFi{
     public Laptop(String brand, String model) {
         super(brand, model);
     }

     @Override
     public void doFunction() {
         System.out.println("노트북이 프로그램을 실행합니다");
     }

     @Override
     public void connectToWiFi() {
         System.out.println("노트북으로 와이파이에 연결합니다");
     }
 }

public class Example1 {
    public static void main(String[] args) {
        Device phone = new Phone("삼성","갤럭시 S24");
        Device laptop = new Laptop("Apple","MacBook Pro");
        // 휴대폰
        phone.powerOn(); // 삼성 갤럭시 S24 전원 켜짐
        phone.doFunction(); // 휴대폰으로 전화를 겁니다
        // 동적바인딩이 부모클래스인 Device로 되어있으므로
        // connectToWiFi를 호출하기 위해 타입변환이 필요함
        ((WiFi)phone).connectToWiFi(); // 휴대폰으로 블루투스에 연결합니다
        ((Bluetooth)phone).connectToBluetooth(); // 휴대폰으로 와이파이에 연결합니다
        phone.powerOff(); // 삼성 갤럭시 S24 전원 꺼짐

        // 노트북
        laptop.powerOn(); // Apple MacBook Pro 전원 켜짐
        laptop.doFunction(); // 노트북이 프로그램을 실행합니다
        ((WiFi)laptop).connectToWiFi(); // 노트북으로 와이파이에 연결합니다
        laptop.powerOff(); // Apple MacBook Pro 전원 꺼짐


    }
}
