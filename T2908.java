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


        int E = Integer.parseInt(C);
        int F = Integer.parseInt(D);


        // 그리고 그 문자열를 각자 뒤집어야 한다.
        if(){

        }

        // 뒤집은 정수를 다른 변수에 다시 저장한다. C, D

        // 뒤집은 정수를 비교해보자(if문을 사용한다.)

    }
}
