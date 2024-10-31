package P1031;

public class Constructor1 {
    public static void main(String[] args) {
        A a = new A() ;
        a.work();
        B b = new B();
        b.work();
        //C c = new C();//클래스 C는 기본성생자를 사용할 수 없음
        C c = new C(100);
        c.work();

    }
}

class A {
    int m;
    void work() {
        System.out.println(m);
    }
    //기본 생성자를 만들지 않으면 자바가 자동으로 기본생성자를 생성
}

class B {
    int m;
    void work(){
        System.out.println(m);//0
    }
    B(){ //기본생성자
        System.out.println("B의 기본생성자");
        //기본 생성자를 만들면 만들어져 있는 생성자를 사용
    }

}
class C {
    int m;
    void work() {
        System.out.println(m);
    }
    C(int a){ //기본생성자가 아닌 매개변수가 있는 생성자만 만듦
        m = a;
    } //중요 클래스내에 생성자가 없으면 기본생성자 자동생성
     // 생성자가 있으면 (어떤 것이든 상관없이) 기본생성자 자동 생성 안됨!
    // ==생성자를 만들었으면 그 생성자를 사용해야함
}
