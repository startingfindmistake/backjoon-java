import java.util.Scanner;

public class T9086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // 테스트 케이스를 입력 받는데
        // int형으로 몇번 반복할지 정수형으로 입력 받는다.
        int T = sc.nextInt();
        int count = 0;
        int B = 0;

        // 테스트 케이스를 T번 반복하여 입력 받는다.
        while(count < T){

            String A = sc.next();

            // 첫번재 알파벳은 인덱스 '0'으로 찾을 수 있지만
            // 마지막 인덱스를 알기 위해서 인덱스의 길이를 구해야 함
            B = A.length();
            
            System.out.print(""+A.charAt(0) + A.charAt(B-1));
            
            count++;
        }
        //메모리 누수 및 중복 실행 방지
        sc.close();

        // 테스트 케이스중 첫번재와 마지막 인덱스를 출력한다.
    }
}
