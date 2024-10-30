import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        // 사용자로부터 입력받은 문자열을 거꾸로 출력하는 메서드
        // 예) hello 를 입력하면 olleh 를 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요.");
        String str = scanner.nextLine();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str) {

    char[] A=str.toCharArray();        //char[] chArray = str.toCharArray();
    char[] B=new char[A.length];      //char[] newArray = new char[chArray.length];
    for (int i=0; i< A.length; i++) {   //int j = chArray.length -1;
        for (int j = 0; j < A.length; j++) {   //for (int i=0; i<chArray.length; i++ {
            if (i + j == A.length - 1) {       //newArray[j] = chArray[i];
                B[i] = A[j];              //j=j -1;
            }

        }
    }
        return new String(B); // return String.valueOf(newArray);
    }
}