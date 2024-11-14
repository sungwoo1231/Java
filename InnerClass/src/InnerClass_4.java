 class A4{
    int a = 3;
    void abc(){
        int b = 5;
        class B4{ // 지역 이너클래스 = 메서드안에 정의된 클래스
            void bcd() {
                System.out.println(a);
                System.out.println(b);
            }
        }
        // 지역 이너클래스는 거의 대부분 선언부 바로 아래에서 인스턴스화 함
        B4 bb = new B4();
        bb.bcd();
    }
 }



public class InnerClass_4 {
    public static void main(String[] args) {
        A4 a = new A4();
        a.abc();
        // 지역 이너클래스는 메서드의 지역범위내에서만 접근 가능하며
        // 메서드가 실행될 때 정의되고 메서드가 종료되면 해당 범위를 벗어나므로
        // 외부에서 직접 사용할 수 없음
        // 즉,메서드 외부에서는 지역 이너클래스의 존재 자체를 알 수 없고
        // 당연히 객체 생성도 불가능함
    }
}
