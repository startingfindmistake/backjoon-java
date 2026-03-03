import java.util.Scanner;


public class T2675 {
    public static void main(String[] args){
        // 입력을 받기 위해 스캐너 클래스 선언
        Scanner sc = new Scanner(System.in);

        // 나중에 배열을 한 번에 출력하기 위해서
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 입력 받기
        int T = sc.nextInt();

        
        for(int i = 0; i < T; i++){
            // 문자열 R번 반복 입력횟수를 입력받는다.
            int R = sc.nextInt();
            // 문자열을 입력 받는다.
            String B = sc.next();

            // 문자열를 반복한다.
            // 그런데 문자열에서 각 문자를 추출해서 반복해야 한다.
            // 문자열에서 각 문자를 추출하기 위해 반복문으로 문자를 하나씩 읽어 들여 반복한다.
            for(int j = 0; j < B.length(); j++){
                char C = B.charAt(j);

                for(int k = 0; k < R; k++){
                    sb.append(C);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}


//issue: