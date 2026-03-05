import java.util.Scanner;
import java.lang.StringBuilder;

public class T2908 {
    public static void main(String[] args){
        // 입력을 받아와야 하기 때문에 Scanner 객체를 생성함
        Scanner sc = new Scanner(System.in);
        

        //일단 3자리수 정수를 2개 입력받아야 한다.
        String A = sc.next();
        String B = sc.next();

        // A를 StringBuilder에 넣고, 뒤집은 다음, String으로 변환하여 C에 저장
        StringBuilder sb1 = new StringBuilder(A);
        String C = sb1.reverse().toString();

        // B를 StringBuilder에 넣고, 뒤집은 다음, String으로 변환하여 D에 저장
        StringBuilder sb2 = new StringBuilder(B);
        String D = sb2.reverse().toString();

        //if 문을 사용하기 위해
        //java.lang.Integer에서 parseInt()메서드를 사용하여 문자열을 정수로 변환함
        int E = Integer.parseInt(C);
        int F = Integer.parseInt(D);


        // E변수와 F변수 둘다 정수형 integer로 변환하였기 때문에 if문 조건문에 사용이 가능하다.
        if(E > F){
            System.out.println(E);
        }
        else {
            System.out.println(F);
        }

    }
}
