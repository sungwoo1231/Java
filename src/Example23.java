public class Example23 {
    public static void main(String[] args) {
        //배열속에서 찾고자 하는 데이터를 찾아 해당 인덱스를
        //리턴하는 메서드
        String[] colors = {"black", "white", "red", "green", "blue"};
        System.out.println(findColor(colors, "white"));
        System.out.println(findColor(colors, "yellow"));
        System.out.println(findColor(colors, "blue"));
    }

    public static int findColor(String[] colors, String str) {

        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(str)) {
                return i;

            }
        }
        return -1;
    }
}