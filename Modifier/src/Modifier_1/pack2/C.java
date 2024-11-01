package Modifier_1.pack2;

import Modifier_1.pack1.A;

public class C {
    public void print(){
        A a = new A();
        System.out.print(a.a+" ");
//        System.out.print(a.b+" "); //protected 외부 패키지 접근 불가(read/write 불가)
//        System.out.print(a.c+" "); //default 외부 패키지 접근 불가(read/write 불가)
//        System.out.print(a.d+" "); //private 외부 클래스 접근 불가(read/write 불가)
        System.out.println();
    }

}
