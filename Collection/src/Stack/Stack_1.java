package Stack;

import java.util.Stack;

// 스택 (Stack) 클래스
// 후입선출 LIFO ( Last In First Out )
// 카드의 덱(deck)이 먼저 놓여진 카드가 나중에 선택되는 것과 같이
// 나중에 저장된 일이 먼저 실행되는 방식
// 주로 수행작업의 히스토리 저장 (브라우저의 페이지) 또는 재귀함수 처리 등에 사용됨
public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        // 1. push() 매개변수를 Stack에 추가
        s1.push(2);
        s1.push(5);
        s1.push(3);
        s1.push(7);
        System.out.println(s1); // [2, 5, 3, 7]
        // 2. peek() 가장 상위에 있는 원소값 읽기
        System.out.println(s1.peek()); // 7
        System.out.println(s1.size()); // 4
        // 3. search(Object o) 탐색 및 확인(대기번호 확인) Stack 원소의 위칫값을 리턴(맨 위의 값이1,아래로 내려갈수록 1씩증가)
        System.out.println(s1.search(7)); // 1
        System.out.println(s1.search(3)); // 2
        System.out.println(s1.search(5)); // 3
        System.out.println(s1.search(2)); // 4
        System.out.println(s1.search(9)); // -1 Stack 원소값에 없는 경우
        // 4. pop() 최상위 데이터 꺼내기 (꺼내면서 삭제)
        System.out.println(s1.pop()); // 7
        System.out.println(s1.pop()); // 3
        System.out.println(s1.pop()); // 5
        System.out.println(s1.pop()); // 2
        //System.out.println(s1.pop()); // 에러
        // 5. boolean empty() Stack 객체가 비어있는지 여부를 리턴 비어있으면 true 있으면 false 리턴
        System.out.println(s1.empty()); // true

    }
}
