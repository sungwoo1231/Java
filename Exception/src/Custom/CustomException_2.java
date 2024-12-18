package Custom;

/* 예외 전가를 구현할 때 MyException과 MyRTException의 구현성 차이점 있음
1) MyRTException의 경우,
예외 처리(catch)를 하지 않고 call 메서드가 throws 하지 않아도 JVM이 예외 처리를 해줌
(JVM의 예외 처리는 catch문과는 다름)
==> 자바 컴파일러가 RuntimeException 계열의 경우, 예외 처리를 강제하지 않도록
설계 되어 있다고 함!!
2) MyException의 경우,
예외 처리(catch)를 하지 않고, call 메서드가 throws 하지 않으면 컴파일 에러 발생
반드시!! 콜스택내의 모든 메서드들이 throws 해야함 (main()도 thorws 가능)
*/
class C{
    void setAge(int age) throws MyRTException{
        if (age >= 0){
            System.out.println("정상동작");
        }else {

            throw new MyRTException("나이가 음수입니다");
        }

    }
    void callSetAge(int age){
        setAge(age);
        }
    }

class D{
    void setAge(int age) throws MyException{
        if (age >= 0){
            System.out.println("정상동작");
        }else {

            throw new MyException("나이가 음수입니다");
        }

    }
    void callSetAge(int age) throws MyException{
        setAge(age);
    }
}

public class CustomException_2 {
    public static void main(String[] args) throws MyException {
//        C c = new C();
//        c.callSetAge(-1);
        D d = new D();
        d.callSetAge(-1);
    }
}
