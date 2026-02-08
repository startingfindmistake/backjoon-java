import java.util.Scanner;

public class T10950_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 계속 이어 붙일 수 잇는 가변 문자열 객체
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            // 2. 바로 출력하지 않고, sb에 결과와 줄바꿈을 추가 한다.
            sb.append(A + B).append("\n");
        }

        //3. 반복문이 끝나고 모아둔 결과를 한번에 출력
        System.out.println(sb);
    }
}
