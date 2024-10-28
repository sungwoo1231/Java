import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {
        // 5 문자열 수정
        // 대소문자 변경 toLowerCase -> 대문자를 소문자로 변경 toUpperCase-> 소문자를 대문자로 변경하는 메서드
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        // replace 문자열 교체
        System.out.println(str1.replace("Study","공부"));
        System.out.println(str1.replace("Java","코딩"));
        // substring -> 시작 문자는 포함 끝 문자는 미포함
        System.out.println(str1.substring(0,5));
        String text = "2024-10-28";
        String year = text.substring(0,4);
        String month = text.substring(5,7);
        String day = text.substring(8);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        String filename = "document.pdf";
        String extension = filename.substring(filename.lastIndexOf(".")+1);
        System.out.println(extension);
        // split 쪼개기 나누기
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));
        // 정규 표현식(regex = regular expression)
        // 특정패턴을 가진 문자열을 찾거나 조직하기 위한 문자열
        // 주로 문자열 검색, 추출 , 치환과 같은 작업에 사용됨
        // 정규표현식을 통해 특정 패턴을 효율적으로 찾고 원하는 부분을 추출 변경 가능함

        //trim 공백제거(단어의 앞뒤에 있는 공백)
        System.out.println("     abc      ".trim());

        // 6 문자열의 내용 비교 equals equalsIgnoreCase
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

    }




}
