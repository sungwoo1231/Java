import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //#0. 자바코드로 진법 변환
        int data =13;
        System.out.println(Integer.toBinaryString(data)); //1101
        System.out.println(Integer.toOctalString(data)); //15
        System.out.println(Integer.toHexString(data)); //d
        System.out.println();
        System.out.println(Integer.parseInt("1101",2
        ));//13
        System.out.println(Integer.parseInt("15",8));
        System.out.println(Integer.parseInt("0d",16));
        System.out.println(13);
        System.out.println(0b1101);
        System.out.println(015);
        System.out.println(0xd);
        //비트 연산자
        //@AND 비트 연산자
        System.out.println(3&10);
        System.out.println(12&9);
        // | 비트연산자
        System.out.println(3|10);
        //^XOR 비트연산자
        System.out.println(3^10);
        //~Not 비트연산자
        System.out.println(~3);
    
    }

}





