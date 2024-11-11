package Abstract.pack;

class Animal{
    void crt(){
    }
}
class Cat extends Animal{}
class Dog extends Animal{}

// 일반 클래스의 상속
// 1.부모 클래스인 Aniaml의 인스턴스화 가능
// 2.자식 클래스인 Cat , Dog이 cry 메서드 오버라이드 안 해도 아무 문제 없음
public class abstract_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
    }
}
