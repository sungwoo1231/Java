public class Static_Method {
    public static void main(String[] args) {
        // 인스턴스 메서드는 객체생성(인스턴스화)후에만 사용 가능
        A a1 = new A();
        a1.abc(); // 10 20

        // 정적 메서드 사용
        // 1
        A.bcd(); // 20
        // 2
        A a2 = new A();
        a2.bcd(); // 20 인스턴스 메서드처럼 사용가능 (권장X)
    }
}

class A{
    int a;
    static int b;
    void abc() {
        a = 10;
        b = 20;
        System.out.println(a+" "+b);
    }
    static void bcd(){ //정적(static) 메서드
        // 중요! 정적 메서드에서는 인스턴스 필드 또는 인스턴스 메서드를 참조X(사용X)
       // a = 10;
        b = 20;
        System.out.println(b);
    }
}

