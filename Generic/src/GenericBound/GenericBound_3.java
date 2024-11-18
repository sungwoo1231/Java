package GenericBound;

class A3{}
class B3 extends A3{}
class C3 extends B3{}
class D3 extends C3{}

class Goods<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class Test{
    void method1(Goods<A3> g){}
    void method2(Goods<?> g){}
    void method3(Goods<? extends B3> g){}
    void method4(Goods<? super B3>g){}
}
public class GenericBound_3 {
    public static void main(String[] args) {
    Test t = new Test();
    // 1. method1
    t.method1(new Goods<A3>());
    //t.method1(new Goods<B3>()); // Goods<A3> 타입만 가능 (지정해줬기 때문)

    // 2. method2
        // 와일드카드 ?는 어떤 타입이던 그 자리에 올 수 있다는 뜻이므로
        // 모든 객체타입을 쓸 수 있음
        t.method2(new Goods<A3>());
    t.method2(new Goods<B3>());
    t.method2(new Goods<C3>());
    t.method2(new Goods<D3>());

    // 3. method3
        // 상한제한 extends
        // B3와 B3의 자식클래스만 사용가능
        //t.method3(new Goods<A3>()); // 오류
    t.method3(new Goods<B3>());
    t.method3(new Goods<C3>());
    t.method3(new Goods<D3>());

    // 4. method4
        // 하한제한 super
        // B3와 B3의 부모클래스만 사용 가능
    t.method4(new Goods<A3>());
    t.method4(new Goods<B3>());
    //t.method4(new Goods<C3>()); // 오류
    //t.method4(new Goods<D3>()); // 오류

    }
}
