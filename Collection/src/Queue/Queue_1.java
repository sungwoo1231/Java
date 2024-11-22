package Queue;

// 큐(Queue) 인터페이스
// 선입선출 FIFO ( First In First Out)
// 주로 키입력등의 이벤트 처리에 사용됨
// 먼저 들어온 객체정보를 먼저 사용함
// 구현체로는 LinkedList 또는 PriorityQueue를 많이 사용
// PriorityQueue는 들어온 순서가 아니라 그 일의 우선 순위에 따라 처리하는 방식
// LinkedList의 노드연결 방식이 큐의 특징인 잦은 삽입과 삭제의 처리에 적합하기 때문!!

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {
        // 예외처리 없는 메서드 (안전장치가 없으므로 조심해서 사용)
        Queue<Integer> q1 = new PriorityQueue<>();
        // 1-1. add 추가 (큐의 사이즈가 다 차서 더 이상 추가할 수 없으면 에러발생)
        q1.add(3);
        q1.add(4);
        q1.add(5);
        // 1-2. element() 가장 상위에 있는 원솟값 읽기 (삭제X)
        System.out.println(q1.element()); // 3
        // 1-3. E remove() 가장 상위에 있는 원솟값 삭제 (꺼내면서 삭제)
        System.out.println(q1.remove()); // 3
        System.out.println(q1.remove()); // 4
        System.out.println(q1.remove()); // 5
        //System.out.println(q1.remove()); // 오류 (큐가 비어있음)
        System.out.println(q1); // []

        // 예외처리 있는 메서드 (안전장치)
        Queue<Integer> q2 = new LinkedList<>();
        System.out.println(q1.peek()); // null
        // 2-1. offer() 매개변수를 Q에 추가 (Q의 크기가 다 차도 에러가 발생하지 않고 추가 안함)
        q2.offer(3);
        q2.offer(4);
        q2.offer(5);
        // 2-2. peek() // 가장 상위에 있는 원솟값 읽기 (삭제X)
        System.out.println(q2.peek()); // 3
        // 2-3. poll() 가장 상위에 있는 원솟값 삭제 (꺼내면서 삭제)
        System.out.println(q2.poll()); // 3
        System.out.println(q2.poll()); // 4
        System.out.println(q2.poll()); // 5
        System.out.println(q2.poll()); // null (에러발생안함)
    }
}
