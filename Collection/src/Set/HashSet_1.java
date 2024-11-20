package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_1 {
    public static void main(String[] args) {
        Set<String> hSet1 = new HashSet<>();
        // 1. add(E element)
        hSet1.add("A");
        hSet1.add("B");
        hSet1.add("C");
        hSet1.add("A");// 중복저장 안됨!
        // hSet1.add(1,"D"); 인덱스가 없기 때문에 중간삽입 안됨
        System.out.println(hSet1); // [A, B, C] 이 출력 순서가 고정X 랜덤
        // 2. addAll
        Set<String> hSet2 = new HashSet<>();
        hSet2.add("C");
        hSet2.add("D");
        hSet2.addAll(hSet1);
        System.out.println(hSet2); // [A, B, C, D] 이 출력 순서가 고정X 랜덤,중복저장 X
        // 3. remove
        hSet2.remove("B");
        System.out.println(hSet2); // [A, C, D] 이 출력 순서가 고정X 랜덤
        // 4. clear
        hSet2.clear();
        System.out.println(hSet2); // []
        // 5. isEmpty
        System.out.println(hSet2.isEmpty()); // true
        // 6. contains
        Set<String> hSet3 = new HashSet<>();
        hSet3.add("A");
        hSet3.add("B");
        hSet3.add("C");
        System.out.println(hSet3.contains("B")); // true
        System.out.println(hSet3.contains("D")); // false
        // 7. size
        System.out.println(hSet3.size()); // 3
        // 8. iterator
        Iterator<String> iterator = hSet3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " "); // A , B , C
        }
        System.out.println();
        // 9. toArray
        Object[] objects = hSet3.toArray();
        System.out.println(Arrays.toString(objects)); // [A, B, C]
        // 10.
       String[] strings = hSet3.toArray(new String[0]);
        System.out.println(Arrays.toString(strings)); // [A, B, C]
    }
}
