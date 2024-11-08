package Modifier;

 class A1{
      int a =3;
      final int b = 5; // final을 필드의 적용 가능. 선언과 함께 값을 대입했을 때 즉시 초기화
      A1(){

      }
 }
 class A2{
     int a;
     final int b; // 선언 따로 값의 대입을 따로 했을 때 초기화 가능
     A2(){
         a =3;
         b = 5; // final은 초기화 하지 않으면 에러
     }
 }
 class A3{
     int a = 3;
     final int b = 5;
     A3(){
         a = 5;
         // b = 9; // final은 생성자에서도 값을 변경할 수 없음
     }
 }
 class B{
     void bcd(){ // 메서드의 지역변수
         int a= 3;
         final int b =5; // flnal은 지역변수에도 사용 가능
         a = 7;
     }
 }

public class Final_1 {
    public static void main(String[] args) {
    A1 a1 = new A1();
    A2 a2 = new A2();
    a2.a=5;
    //a2.b = 9;
        a1.a=7;
        //a1.b =9;
        System.out.println(a1.a);
        System.out.println(a2.a);

    }
}
