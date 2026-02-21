//StringBuilder클래스를 활용하여
// append()함수로 결과값을 저장함

import java.util.Scanner;

public class T9086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // 테스트 케이스를 입력 받는데
        // int형으로 몇번 반복할지 정수형으로 입력 받는다.
        int T = sc.nextInt();
        int count = 0;
        int B = 0;


        // System.in이 필요 없음 왜냐하면 키보드에서 입력받을게 아니기 때문
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스를 T번 반복하여 입력 받는다.
        while(count < T){

            String A = sc.next();

            // 첫번재 알파벳은 인덱스 '0'으로 찾을 수 있지만
            // 마지막 인덱스를 알기 위해서 인덱스의 길이를 구해야 함
            B = A.length();
            
            sb.append(A.charAt(0));
            sb.append(A.charAt(B-1));
            sb.append("\n");
            
            count++;
        }

        System.out.print(sb);
        //메모리 누수 및 중복 실행 방지
        sc.close();

        // 테스트 케이스중 첫번재와 마지막 인덱스를 출력한다.
    }
}




