import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int a = 2;
        if (a==1){
            System.out.println("A");
        }else if(a==2){
            System.out.println("B");
        }else if (a==3){
            System.out.println("c");
        }else {
            System.out.println("D");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("요일을 입력해주세요");
        String day= scanner.nextLine();

        if (day=="월"){
            System.out.println("오늘은 월요일입니다.");
        }else if (day=="화"){
            System.out.println("오늘은 화요일입니다.");
        }else if (day=="수"){
            System.out.println("");
        }
    }

}
