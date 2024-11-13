package Interface;

 interface S{
     static void abc(){
         System.out.println("S 인터페이스의 정적(static) 메서드");
     }
 }
 // static 메서드는 default 메서드처럼 기존 인터페이스에 추가하더라도
 // 구현 클래스들에 영향을 미치지 않는 점은 동일함
 // 차이점 1.static 메서드는 오버라이드 불가!!
// 차이점 2.인스턴스화 없이 공용 기능을 제공!!
public class Interface_6 {
    public static void main(String[] args) {
      S.abc(); // 정적메서드이므로 인스턴스 만들 필요없이 사용가능
    }
}