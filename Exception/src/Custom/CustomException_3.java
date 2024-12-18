package Custom;

class MinusException extends RuntimeException{
    MinusException(){
    }
    MinusException(String message){
        super(message);
    }
}
class OverException extends RuntimeException{
    OverException(){
    }
    OverException(String message){
        super(message);
    }
}
class AA{
    // 여러 개의 발생 가능한 예외를 함께 던질 수 있음
    void checkScore(int score) throws MinusException,OverException{
        if (score < 0){
            throw new MinusException("예외 발생: 음숫값 입력");
        }else if (score > 100) {
            throw new OverException("예외 발생: 100점 초과");
        }else {
            System.out.println("정상적인 값입니다:" + score);
        }
    }
    void caller1(int score){
        caller2(score);
    }
    void caller2(int score){
        checkScore(score);
    }
}
public class CustomException_3 {
    public static void main(String[] args) {
        AA a = new AA();
        try{
            a.caller1(85);
            a.caller1(150);
            a.caller1(-1);
        }catch (MinusException | OverException e){
            System.out.println(e.getMessage());
           for (StackTraceElement element : e.getStackTrace()){
               System.out.println(element);
           }
        }
    }
}
