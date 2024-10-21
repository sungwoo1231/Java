public class Example2 {
    public static void main(String[] args) {
        //다양한 method 만들어보기
        String str = "hello";
        int length = str.length();
        System.out.println(length);
        //문자열의 길이를 반환하는 method
        //아래 코드가 작동하도록 method를 만드시오.
        System.out.println(getLength("gg gg"));
        System.out.println(getLength("sswdqdwqwd"));
        System.out.println(getLength("qiwdjawidj"));

    }
        public static int getLength (String str) {
        return str.length();
        }
    }
