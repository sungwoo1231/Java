package Generic_Method_1;

 // 일반 클래스 안에도 제너릭 메서드 사용 가능!
class MyClass{
 // Generic 선언<T>의 위치 주의
public <T> T method1(T t){
    return t;
}
public <T> boolean method2(T t1,T t2) {
    return t1.equals(t2);
}
public <K,V> void method3(K k , V v){
    System.out.println(k + ":" + v);
}
}

public class GenericMethod_1 {
    public static void main(String[] args) {
    MyClass a = new MyClass();
    String str1 = a.<String>method1("안녕");
    String str2 = a.method1("안녕"); // <String>(Generic타입)은 Generic 타입을 유추할 수 있을 때 주로 생략
        // <String> 생략해도 주어진 정보만으로 컴파일 오류여부를 컴파일러가 판단 가능함
        System.out.println(str1);
        System.out.println(str2);

        boolean bool1 = a.<Double>method2(2.5,2.5);
        boolean bool2 = a.method2(2.5,2.5);
        System.out.println(bool1);
        System.out.println(bool2);

        a.<String, Integer>method3("국어",80);
        a.method3("국어",2.5);
    }
}
