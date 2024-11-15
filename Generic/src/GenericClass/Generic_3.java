package GenericClass;
// Generic 문법의 등장
// <T>는 MyClass 안에 T라는 Generic 타입이 사용되었음을 알리는 표시
// 보통 필드나 메서드의 배개변수에 T타입을 명시해서 사용함
// 반드시 T이어야 하는 것은 아니고 어떤 문자던 상관없음(대신 클래스 내 동일한 동일문자가 사용되어야함)
// 일반적으로 사용되는 문자
// T(Type), E(Element), K(Key), V(Value), N(Number) 등등
 class MyClass<T> {
     private T t;

     public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
public class Generic_3 {
    public static void main(String[] args) {
        // Generic 타입 T는 객체 생성시점에 결정되어야함
        MyClass<String> mc1 = new MyClass<>();
        mc1.setT("Hello"); // 문자열 저장
        System.out.println(mc1.getT());
        MyClass<Integer> mc2 = new MyClass<>();
        mc2.setT(100);// 정수 저장
        System.out.println(mc2.getT());

        // mc2.setT("Hello"); // 컴파일 에러 발생
        // Generic 타입은 강한 타입체크를 수행하므로 타입을 잘못 사용하면 즉시에러 !!
    }
}
