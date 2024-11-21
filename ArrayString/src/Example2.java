public class Example2 {
    public static void main(String[] args) {
        // 주어진 배열의 평균값을 계산하는 메서드
        int[] numbers = {10,20,30,40,50};
        System.out.println(calculateAverage(numbers)); // 30
    }
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i]; // 배열의 데이터를 더함(arr[i])
        }
        double average = (double)sum / arr.length;
        return average;
    }
}