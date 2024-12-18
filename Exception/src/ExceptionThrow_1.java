// 예외전가
class A{
    void abc(){
        bcd();
    }
    void bcd(){
        try {
            System.out.println(3/0);
        }catch (ArithmeticException e){
            System.out.println("클래스 A 예외발생");
            System.out.println(e.getMessage());
        }
    }
}
class B{
    void abc() {
        try {
            bcd();
        }catch (ArithmeticException e){
            System.out.println("클래스 B 예외발생");
            System.out.println(e.getMessage());
        }
    }
    void bcd() throws ArithmeticException {
        System.out.println(3/0); // 예외발생하나 예외전가처리
    }
}
public class ExceptionThrow_1 {
    public static void main(String[] args) {
    A a = new A(); // 일반 예외처리 try~catch문
    a.abc();

    B b = new B(); // 예외전가 (실제 예외처리는 호출한 메서드가 함)
    b.abc();
    }
}
