import java.sql.SQLOutput;

public class Shfit {
    public static void main(String[] args) {
        //시프트연산자
        System.out.println(3<<1);//6
        System.out.println(-3<<1);//-6
        System.out.println(3<<2);//12
        System.out.println(3<<2);//12
        System.out.println(-3<<2);//-12
        System.out.println();

        System.out.println(5>>1);//2
        System.out.println(-5>>1);//-3
        System.out.println(5>>2);//1
        System.out.println(-5>>2);//-2
        System.out.println(5>>3);//0
        System.out.println(-5>>3);//-1
        System.out.println();
    }
}
