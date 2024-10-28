import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        //1 문자열 길이 length
        String str1 = "Hello java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();
        //2. 문자열 검색 charAt()<- 숫자를 넣어 그 숫자에 있는 글씨 확인 /indexOf()<-문자를 넣어 몇번째에 있는 문자인지 확인/ lastIndexOf()<-같은 문자가 있으면 제일 뒤에 있는 문자로 확인
        System.out.println(str1.charAt(1));
        System.out.println(str2.charAt(1));
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('v'));
        System.out.println(str1.indexOf('a',8));
        System.out.println(str1.lastIndexOf('a',8));
        System.out.println(str1.indexOf("java"));
        System.out.println(str1.indexOf("Java")); // 대소문자 구별하기

        //3 문자열의 변환 및 연결 valueOf() concat() <- 문자열 2개를 합치는 (더하는) 메서드

        String str3 = String.valueOf(2.3); //double -> String 변환
        String str4 = String.valueOf(false); // boolean-> String 변환
        System.out.println(str3);
        System.out.println(str4);

        String str5 =str3.concat(str4);
        System.out.println(str5);
        String str6 ="안녕"+3;
        String str7 ="안녕".concat(String.valueOf(3));
        System.out.println(str6);

        //4 문자열-> byte[] 또는 문자열을 char[]
        // byte array =UTF-8 문자를 담는데 이용됨 한글은 최소 2바이트가 필요
        // 1바이트에 한글이 담기지 않기 때문에 음수로 보이게 됨

        String str8 = "Hello Java!";
        String str9 = "안녕하세요";
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        // toCharArray()
        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));

    }

}
