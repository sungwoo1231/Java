package Vector;

// List 인터페이스의 두 번째 구현클래스 Vector 사용법
// 멀티쓰레드 환경에 적합한 동기화 기능을 지원한다!!
// 멀티쓰레드를 수행하는데 쓰인다면 Vector를 사용해야함

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Vector_1 {
    public static void main(String[] args) {
        List<Integer> vector1 = new Vector<>();

        // 1. add 뒤에 추가
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        System.out.println(vector1); // [3, 4, 5]
        // 2. add 중간 삽입
        vector1.add(1,6);
        System.out.println(vector1); // [3, 6, 4, 5]
        // 3. addAll 뒤에 리스트 추가
        List<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);
        vector2.addAll(vector1);
        System.out.println(vector2); // [1, 2, 3, 6, 4, 5]
        // 4. addAll (특정위치에 리스트 추가)
        List<Integer> vector3 = new Vector<>();
        vector3.add(1);
        vector3.add(2);
        vector3.addAll(1,vector3);
        System.out.println(vector3); // [1, 1, 2, 2]
        // 5. set 수정
        vector3.set(1,5);
        vector3.set(3,6);
        System.out.println(vector3); // [1, 5, 2, 6]
        // 6. remove(int index) 해당 인덱스의 요소 삭제
        vector3.remove(1);
        System.out.println(vector3); // [1, 2, 6]
        // 7. remove(Object o) 해당 요소를 찾아서 삭제
        vector3.remove(Integer.valueOf(2));
        System.out.println(vector3); // [1, 6]
        // 8. clear (모두 삭제)
        vector3.clear();
        System.out.println(vector3); // []
        // 9. isEmpty (요소가 있는지 없는지 확인할 때 사용 비었으면 true 리턴)
        System.out.println(vector3.isEmpty()); // true
        // 10.size (List의 요소 갯수를 리턴)
        System.out.println(vector3.size()); // 0
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        System.out.println(vector3); // [1, 2, 3]
        System.out.println(vector3.size()); // 3
        // 11. get (List의 요소를 읽음)
        // <주의> List를 배열처럼 인덱스[i]로 읽으면 안됨 !
       // System.out.println(vector3[0]); // 오류
        System.out.println("0번째:" + vector3.get(0)); // 0번째:1
        System.out.println("1번째:" + vector3.get(1)); // 1번째:2
        System.out.println("2번째:" + vector3.get(2)); // 2번째:3
        for (int i = 0; i < vector3.size(); i++)
            System.out.println(i + "번째: "+ vector3.get(i)); // 0번째: 1 , 1번째: 2 , 2번째: 3
        // 12. toArray (List를 배열로 타입변환)
        // toArray는 오브젝트의 배열을 리턴하므로 오브젝트의 배열 타입으로 받아야함
        Object[] object = vector3.toArray();
        System.out.println(Arrays.toString(object)); // [1, 2, 3]
        // 13. toArray (Integer의 배열로 받으려면 별도의 명시를 해줘야함)
        Integer[] integers = vector3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers)); // [1, 2, 3]

    }
}
