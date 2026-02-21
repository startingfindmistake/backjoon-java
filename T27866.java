import java.util.Scanner;


public class T27866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // 1. 문자열을 입력 받음
        String S = sc.next();

        // 2. 몇번째 알파벳을 의미하는 정수를 입력받음
        int i = sc.nextInt();

        System.out.print(S.charAt(i - 1));



        /*자바 문자열이 잘 출력이 되는지 확인
        System.out.print(S);
        */
    }
}
