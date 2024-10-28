public class Example22 {
    public static void main(String[] args) {
        //중복된 숫자의 갯수를 리턴하는 메서드
        int[] numbers = {1, 3, 7, 2, 4, 3, 9, 8, 4, 3};
        System.out.println(countNumber(numbers, 3));
        System.out.println(countNumber(numbers, 4));
        System.out.println(countNumber(numbers, 10));

    }

    public static int countNumber(int[] numbers, int target) {

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                count = count + 1;
            }
        }
        if (count > 0) {
            return count;
        } else {
            return -1;
        }
    }
}

