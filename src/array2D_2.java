import java.util.Arrays;

public class array2D_2 {
    public static void main(String[] args) {
        // 가변 길이 2차원 배열
        // 비정방행렬 배열
        int[][] array1 = new int[2][]; //부모 배열은 반드시 고정배열 자식은 가변
       // array1[0][0]= 1; // 에러 자식 배열은 아직 초기화(생성)하지 않았기 때문
        array1[0] = new int[2]; //부모 배열의 첫번째 데이터[0] 생성
        array1[1] = new int[3];//부모 배열의 두번재 데이터[1] 생성
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[1][0] = 3;
        array1[1][1] = 4;
        array1[1][2] = 5;

        System.out.println(Arrays.deepToString(array1));

        //리터럴
        int [][] array2 = {{1,2},{3,4,5}};

        //for문
        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array1[i].length; j++){
                System.out.print(array1[i][j]+" ");
            }
        }
    }

}
