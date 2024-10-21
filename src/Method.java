import java.sql.SQLOutput;

public class Method {
    public static void main(String[] args) {
        //메서드 없이 홀짝을 구분하는 코드
        int num = 4;
        String str = (num % 2== 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 5;
        str = (num % 2== 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 6;
        str = (num % 2== 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 7;
        str = (num % 2== 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 8;
        str = (num % 2== 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 9;
        str = (num % 2== 0) ? "짝수":"홀수";
        System.out.println(str);
        num = 10;
        str = (num % 2== 0) ? "짝수":"홀수";
        System.out.println(str);

        // 매서드의 사용 혹은 호출 (call method)
        checkOddEven(4); // 매개변수로 정수 4 사용
        checkOddEven(5);
        checkOddEven(6);
        checkOddEven(7);
        checkOddEven(8);
        checkOddEven(9);
        checkOddEven(10);
        //checkOddEven(int number = 5) : //에러 매개변수는 값만 입력하기


        System.out.println("메서드의 return");
        checkOddEven(100);
        System.out.println(checkOddEven2(100));
    }



    //매서드의 선언 , 정의
    //public static void checkOddEven(number) // 에러 정의는 자료형 필수
    public static void checkOddEven(int number) {
        String str = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
    }
        public static String checkOddEven2(int number) {
            String str = (number % 2== 0) ? "짝수":"홀수";
           return str;





    }

}
