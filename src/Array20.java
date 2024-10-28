import java.util.Arrays;

public class Array20 {
    public static void main(String[] args) {
        //2차원 배열의 선언
        int [][] array1 = new int[3][4];
        int[][] array2;
        array2= new int[3][4];

        //int array3[][]  ; // 다른 선언 방법 잘 안씀
        //int[] array4[]; // 다른 선언 방법 잘 안씀

        // 2차원 배열의 값 대입
        int[][] array3 = new int[2][3];
        array3[0][0] =1;
        array3[0][1] = 2;
        array3[0][2] =3;
        array3[1][0] =4;
        array3[1][1] =5;
        array3[1][2] =6;
        // 리터럴 생성
        int[][] array4= {{1,2,3,},{4,5,6}};

        //2차원 배열 출력 (deepToString 메서드 사용)
        System.out.println(Arrays.deepToString(array3));
        System.out.println(Arrays.deepToString(array4));
        System.out.println(array3.length);
        System.out.println(array3[0].length);
        System.out.println(array3[1].length);
        for (int i=0; i<array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j]+" ");

            }

        }
        System.out.println();
    }
}
